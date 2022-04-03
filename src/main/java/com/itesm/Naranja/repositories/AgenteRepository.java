package com.itesm.Naranja.repositories;

import com.itesm.Naranja.models.Agente;
import com.itesm.Naranja.models.Supervisor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AgenteRepository {

    public List<Agente> createAgents() {
        List<Agente> agentList = new ArrayList<>();
        Agente agent1 = Agente.builder()
                .agentID("AG27")
                .agentRole("Agent")
                .agentName("Emilio Rodriguez")
                .agentEmail("emro@amazonconnect.com")
                .agentPassword("A01653042")
                .agentEmployeeNum(327)
                .agentNumCalls(279)
                .agentUnsuccessfulTickets(12)
                .agentSuccessfulTickets(36)
                .build();
        Agente agent2 = Agente.builder()
                .agentID("AG99")
                .agentRole("Agent")
                .agentName("Diana Rosales")
                .agentEmail("diana@amazonconnect.com")
                .agentPassword("x35TrVm0")
                .agentEmployeeNum(72)
                .agentNumCalls(973)
                .agentUnsuccessfulTickets(30)
                .agentSuccessfulTickets(10032)
                .build();
        agentList.add(agent1);
        agentList.add(agent2);

        return agentList;
    }

    public List<Agente> agentList = createAgents();

    public List<Agente> findAllAgents(){
        return agentList;
    }

    public Agente findAgentByID(@PathVariable("agentID") String agentID){
        for(int i = 0; i < agentList.size(); ++i){
            if(agentList.get(i).getAgentID().equalsIgnoreCase(agentID)){
                return agentList.get(i);
            }
        }
        return null;
    }

    public Agente updateAgentName(@PathVariable("agentID") String agentID, @PathVariable("newName") String newName){
        for(int i = 0; i < agentList.size(); ++i) {
            if (agentList.get(i).getAgentID().equalsIgnoreCase(agentID)) {
                agentList.get(i).setAgentName(newName);
                return agentList.get(i);
            }
        }
        return null;
    }

    public Agente deleteAgent(@PathVariable("agentID") String agentID){
        for(int i = 0; i < agentList.size(); ++i) {
            if (agentList.get(i).getAgentID().equalsIgnoreCase(agentID)) {
                agentList.remove(agentList.get(i));
            }
        }
        return null;
    }

    public Agente insertAgent(Agente agent){
        agentList.add(agent);
        return agent;
    }




}
