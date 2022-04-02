package com.itesm.Naranja.repositories;

import com.itesm.Naranja.models.Agente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AgenteRepository {

    public static List<Agente> agentList = new ArrayList<>();

    public void createAgents() {
        Agente agente1 = new Agente();
        agente1.setAgentID("123ABC");
        agente1.setAgentEmail("luis@tec.mx");
        agente1.setAgentName("Luis Orozco");
        agente1.setAgentPassword("x1T.rZ");
        agente1.setAgentRole("agent");
        agente1.setAgentSuccessfulTickets(500);
        agente1.setAgentUnsuccessfulTickets(19000);
        agente1.setAgentEmployeeNum(99);
        agentList.add(agente1);
        Agente agente2 = new Agente();
        agente2.setAgentID("33ZCX");
        agente2.setAgentEmail("Diego@tec.mx");
        agente2.setAgentName("Diego Manzanarez");
        agente2.setAgentPassword("bntF2432");
        agente2.setAgentRole("agent");
        agente2.setAgentSuccessfulTickets(3);
        agente2.setAgentUnsuccessfulTickets(9);
        agente2.setAgentEmployeeNum(96);
        agentList.add(agente2);

    }


    public List<Agente> findAllAgents(){
        createAgents();
        return agentList;
    }

    public Agente findAgentByID(String agentID){
        createAgents();
        for(int i = 0; i < agentList.size(); ++i){
            if(agentList.get(i).getAgentID().equalsIgnoreCase(agentID)){
                return agentList.get(i);
            }
        }

        return null;
    }

    public Agente updateAgentName(String agentID, String newName){
        createAgents();
        for(int i = 0; i < agentList.size(); ++i) {
            if (agentList.get(i).getAgentID().equalsIgnoreCase(agentID)) {
                agentList.get(i).setAgentName(newName);
                return agentList.get(i);
            }
        }

        return null;
    }

    public void deleteAgent(String agentID){
        createAgents();
        for(int i = 0; i < agentList.size(); ++i) {
            if (agentList.get(i).getAgentID().equalsIgnoreCase(agentID)) {
                agentList.remove(agentList.get(i));
            }
        }
    }




}
