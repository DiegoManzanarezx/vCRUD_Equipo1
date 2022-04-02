package com.itesm.Naranja.models;

import java.util.List;

public class Supervisor {
    private String supervisor_id;
    private String supervisor_role;
    private String supervisor_name;
    private String supervisor_email;
    private String supervisor_password;
    private int supervisor_employee_num;
    private List<Agente> supervisor_assigned_agents;

    public Supervisor(String supervisor_id, String supervisor_role, String supervisor_name, String supervisor_email, String supervisor_password, int supervisor_employee_num, List<Agente> supervisor_assigned_agents) {
        this.supervisor_id = supervisor_id;
        this.supervisor_role = supervisor_role;
        this.supervisor_name = supervisor_name;
        this.supervisor_email = supervisor_email;
        this.supervisor_password = supervisor_password;
        this.supervisor_employee_num = supervisor_employee_num;
        this.supervisor_assigned_agents = supervisor_assigned_agents;
    }

    public String getSupervisor_id() {
        return supervisor_id;
    }

    public void setSupervisor_id(String supervisor_id) {
        this.supervisor_id = supervisor_id;
    }

    public String getSupervisor_role() {
        return supervisor_role;
    }

    public void setSupervisor_role(String supervisor_role) {
        this.supervisor_role = supervisor_role;
    }

    public String getSupervisor_name() {
        return supervisor_name;
    }

    public void setSupervisor_name(String supervisor_name) {
        this.supervisor_name = supervisor_name;
    }

    public String getSupervisor_email() {
        return supervisor_email;
    }

    public void setSupervisor_email(String supervisor_email) {
        this.supervisor_email = supervisor_email;
    }

    public String getSupervisor_password() {
        return supervisor_password;
    }

    public void setSupervisor_password(String supervisor_password) {
        this.supervisor_password = supervisor_password;
    }

    public int getSupervisor_employee_num() {
        return supervisor_employee_num;
    }

    public void setSupervisor_employee_num(int supervisor_employee_num) {
        this.supervisor_employee_num = supervisor_employee_num;
    }

    public List<Agente> getSupervisor_assigned_agents() {
        return supervisor_assigned_agents;
    }

    public void setSupervisor_assigned_agents(List<Agente> supervisor_assigned_agents) {
        this.supervisor_assigned_agents = supervisor_assigned_agents;
    }
}


