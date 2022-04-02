package com.itesm.Naranja.models;

import java.util.List;

public class Manager {
    private String manager_id;
    private String manager_role;
    private String manager_name;
    private String manager_email;
    private String manager_password;
    private int manager_employee_num;
    private List<Supervisor> manager_supervisors_list;
    private List<Agente> manager_agents_list;

    public Manager(String manager_id, String manager_role, String manager_name, String manager_email, String manager_password, int manager_employee_num, List<Supervisor> manager_supervisors_list, List<Agente> manager_agents_list) {
        this.manager_id = manager_id;
        this.manager_role = manager_role;
        this.manager_name = manager_name;
        this.manager_email = manager_email;
        this.manager_password = manager_password;
        this.manager_employee_num = manager_employee_num;
        this.manager_supervisors_list = manager_supervisors_list;
        this.manager_agents_list = manager_agents_list;
    }

    public String getManager_id() {
        return manager_id;
    }

    public void setManager_id(String manager_id) {
        this.manager_id = manager_id;
    }

    public String getManager_role() {
        return manager_role;
    }

    public void setManager_role(String manager_role) {
        this.manager_role = manager_role;
    }

    public String getManager_name() {
        return manager_name;
    }

    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }

    public String getManager_email() {
        return manager_email;
    }

    public void setManager_email(String manager_email) {
        this.manager_email = manager_email;
    }

    public String getManager_password() {
        return manager_password;
    }

    public void setManager_password(String manager_password) {
        this.manager_password = manager_password;
    }

    public int getManager_employee_num() {
        return manager_employee_num;
    }

    public void setManager_employee_num(int manager_employee_num) {
        this.manager_employee_num = manager_employee_num;
    }

    public List<Supervisor> getManager_supervisors_list() {
        return manager_supervisors_list;
    }

    public void setManager_supervisors_list(List<Supervisor> manager_supervisors_list) {
        this.manager_supervisors_list = manager_supervisors_list;
    }

    public List<Agente> getManager_agents_list() {
        return manager_agents_list;
    }

    public void setManager_agents_list(List<Agente> manager_agents_list) {
        this.manager_agents_list = manager_agents_list;
    }
}
