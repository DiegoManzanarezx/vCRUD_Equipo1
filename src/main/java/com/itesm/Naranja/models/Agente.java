package com.itesm.Naranja.models;

public class Agente {
    private String agentID;
    private String agentRole;
    private String agentName;
    private String agentEmail;
    private String agentPassword;
    private int agentEmployeeNum;
    private int agentNumCalls;
    private int agentUnsuccessfulTickets;
    private int agentSuccessfulTickets;

    public Agente(String agentID, String agentRole, String agentName, String agentEmail, String agentPassword, int agentEmployeeNum, int agentNumCalls, int agentUnsuccessfulTickets, int agentSuccessfulTickets) {
        this.agentID = agentID;
        this.agentRole = agentRole;
        this.agentName = agentName;
        this.agentEmail = agentEmail;
        this.agentPassword = agentPassword;
        this.agentEmployeeNum = agentEmployeeNum;
        this.agentNumCalls = agentNumCalls;
        this.agentUnsuccessfulTickets = agentUnsuccessfulTickets;
        this.agentSuccessfulTickets = agentSuccessfulTickets;
    }

    public Agente() {

    }

    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }

    public String getAgentRole() {
        return agentRole;
    }

    public void setAgentRole(String agentRole) {
        this.agentRole = agentRole;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getAgentEmail() {
        return agentEmail;
    }

    public void setAgentEmail(String agentEmail) {
        this.agentEmail = agentEmail;
    }

    public String getAgentPassword() {
        return agentPassword;
    }

    public void setAgentPassword(String agentPassword) {
        this.agentPassword = agentPassword;
    }

    public int getAgentEmployeeNum() {
        return agentEmployeeNum;
    }

    public void setAgentEmployeeNum(int agentEmployeeNum) {
        this.agentEmployeeNum = agentEmployeeNum;
    }

    public int getAgentNumCalls() {
        return agentNumCalls;
    }

    public void setAgentNumCalls(int agentNumCalls) {
        this.agentNumCalls = agentNumCalls;
    }

    public int getAgentUnsuccessfulTickets() {
        return agentUnsuccessfulTickets;
    }

    public void setAgentUnsuccessfulTickets(int agentUnsuccessfulTickets) {
        this.agentUnsuccessfulTickets = agentUnsuccessfulTickets;
    }

    public int getAgentSuccessfulTickets() {
        return agentSuccessfulTickets;
    }

    public void setAgentSuccessfulTickets(int agentSuccessfulTickets) {
        this.agentSuccessfulTickets = agentSuccessfulTickets;
    }
}
