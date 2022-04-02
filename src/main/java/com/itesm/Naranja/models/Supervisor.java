package com.itesm.Naranja.models;

import lombok.Builder;
import lombok.Singular;
import java.util.Set;

import java.util.List;

@Builder
public class Supervisor {
    private String supervisorID;
    private String supervisorRole;
    private String supervisorName;
    private String supervisorEmail;
    private String supervisorPassword;
    private int supervisorEmployeeNum;
    private List<Agente> supervisorAssignedAgents;
}


