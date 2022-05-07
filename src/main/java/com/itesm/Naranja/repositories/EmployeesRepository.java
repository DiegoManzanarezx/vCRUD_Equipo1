package com.itesm.Naranja.repositories;

import com.itesm.Naranja.models.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbEnhancedClient;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbTable;
import software.amazon.awssdk.enhanced.dynamodb.Key;
import software.amazon.awssdk.enhanced.dynamodb.TableSchema;
import software.amazon.awssdk.enhanced.dynamodb.model.DeleteItemEnhancedRequest;
import software.amazon.awssdk.enhanced.dynamodb.model.QueryConditional;

@Repository
public class EmployeesRepository {

    @Autowired
    private DynamoDbEnhancedClient dynamoDbEnhancedClient;

    public EmployeesRepository(){
        super();
    }

    public void save(final Employees employee) {
        DynamoDbTable<Employees> employeesDynamoDbTable = getTable();
        employeesDynamoDbTable.putItem(employee);
    }

    private DynamoDbTable<Employees> getTable() {
        DynamoDbTable<Employees> employeesDynamoDbTable = dynamoDbEnhancedClient.table("Employees", TableSchema.fromBean(Employees.class));
        return employeesDynamoDbTable;
    }
    public Iterable<Employees> findAll() {
        DynamoDbTable<Employees> employeesDynamoDbTable = getTable();
        return employeesDynamoDbTable.scan().items();
    }

    public Iterable<Employees> findEmployee(final String employee_role) {
        DynamoDbTable<Employees> employeesDynamoDbTable = getTable();


        // Create a QueryConditional object that is used in the query operation
        QueryConditional queryConditional = QueryConditional
                .keyEqualTo(Key.builder().partitionValue(employee_role)
                        .build());

        Iterable<Employees> result = employeesDynamoDbTable.query(r -> r.queryConditional(queryConditional)).items();
        return result;
    }


    public Employees findById(final String employee_role, final String employee_id) {
        DynamoDbTable<Employees> videoDynamoDbTable = getTable();
        Key key = Key.builder().partitionValue(employee_role).sortValue(employee_id).build();

        Employees result = videoDynamoDbTable.getItem(key);
        return result;
    }


    public Employees update(final Employees employee){
        DynamoDbTable<Employees> employeesDynamoDbTable = getTable();
        Key key = Key.builder().partitionValue(employee.getEmployee_role()).sortValue(employee.getEmployee_id()).build();
        Employees updatedEmployee = employeesDynamoDbTable.getItem(r->r.key(key));
        updatedEmployee.setEmployee_role(employee.getEmployee_role());
        updatedEmployee.setEmployee_id(employee.getEmployee_id());
        updatedEmployee.setEmployee_name(employee.getEmployee_name());
        updatedEmployee.setEmployee_email(employee.getEmployee_email());
        updatedEmployee.setEmployee_password(employee.getEmployee_password());
        updatedEmployee.setEmployee_num(employee.getEmployee_num());
        updatedEmployee.setAgent_num_calls(employee.getAgent_num_calls());
        updatedEmployee.setAgent_successful_tickets(employee.getAgent_successful_tickets());
        updatedEmployee.setAgent_unsuccessful_tickets(employee.getAgent_unsuccessful_tickets());
        updatedEmployee.setSupervisor_assigned_agents(employee.getSupervisor_assigned_agents());
        updatedEmployee.setManager_employees_list(employee.getManager_employees_list());
        employeesDynamoDbTable.updateItem(updatedEmployee);
        return employee;
    }


    public void deleteById(final String employee_role, final String employee_id) {
        DynamoDbTable<Employees> employeesDynamoDbTable = getTable();

        Key key = Key.builder().partitionValue(employee_role).sortValue(employee_id).build();

        DeleteItemEnhancedRequest deleteRequest = DeleteItemEnhancedRequest
                .builder()
                .key(key)
                .build();

        employeesDynamoDbTable.deleteItem(deleteRequest);
    }

}
