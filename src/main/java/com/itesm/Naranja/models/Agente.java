package com.itesm.Naranja.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Setter
@Getter
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
}
