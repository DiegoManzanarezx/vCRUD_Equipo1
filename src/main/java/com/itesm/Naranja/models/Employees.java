package com.itesm.Naranja.models;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbSortKey;

import java.util.Set;

@DynamoDbBean
public class Employees {
    private String employee_role;
    private String employee_id;
    private String employee_name;
    private String employee_email;
    private String employee_password;
    private int employee_num;
    private int agent_num_calls;
    private int agent_successful_tickets;
    private int agent_unsuccessful_tickets;
    private Set<String> supervisor_assigned_agents;
    private Set<String> manager_employees_list;

    @DynamoDbPartitionKey
    @DynamoDbAttribute("employee_role")
    public String getEmployee_role() {
        return employee_role;
    }

    public void setEmployee_role(String employee_role) {
        this.employee_role = employee_role;
    }

    @DynamoDbSortKey
    @DynamoDbAttribute("employee_id")
    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_email() {
        return employee_email;
    }

    public void setEmployee_email(String employee_email) {
        this.employee_email = employee_email;
    }

    public String getEmployee_password() {
        return employee_password;
    }

    public void setEmployee_password(String employee_password) {
        this.employee_password = employee_password;
    }

    public int getEmployee_num() {
        return employee_num;
    }

    public void setEmployee_num(int employee_num) {
        this.employee_num = employee_num;
    }

    public int getAgent_num_calls() {
        return agent_num_calls;
    }

    public void setAgent_num_calls(int agent_num_calls) {
        this.agent_num_calls = agent_num_calls;
    }

    public int getAgent_successful_tickets() {
        return agent_successful_tickets;
    }

    public void setAgent_successful_tickets(int agent_successful_tickets) {
        this.agent_successful_tickets = agent_successful_tickets;
    }

    public int getAgent_unsuccessful_tickets() {
        return agent_unsuccessful_tickets;
    }

    public void setAgent_unsuccessful_tickets(int agent_unsuccessful_tickets) {
        this.agent_unsuccessful_tickets = agent_unsuccessful_tickets;
    }

    public Set<String> getSupervisor_assigned_agents() {
        return supervisor_assigned_agents;
    }

    public void setSupervisor_assigned_agents(Set<String> supervisor_assigned_agents) {
        this.supervisor_assigned_agents = supervisor_assigned_agents;
    }

    public Set<String> getManager_employees_list() {
        return manager_employees_list;
    }

    public void setManager_employees_list(Set<String> manager_employees_list) {
        this.manager_employees_list = manager_employees_list;
    }
}
