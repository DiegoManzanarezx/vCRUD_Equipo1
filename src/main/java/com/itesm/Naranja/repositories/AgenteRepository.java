package com.itesm.Naranja.repositories;

import com.itesm.Naranja.models.Agente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AgenteRepository {

    public static List<Agente> agentList = new ArrayList<>();

    public void createAgents() {
/*        Agente agente1 = new Agente();
        agente1.setAgentID("123ABC");
        agente1.setAgentEmail("luis@tec.mx");
        agente1.setAgentName("Luis Orozco");
        agente1.setAgentPassword("x1T.rZ");
        agente1.setAgentRole("agent");
        agente1.setAgentSuccessfulTickets(500);
        agente1.setAgentUnsuccessfulTickets(19000);
        agente1.setAgentEmployeeNum(99);
        agentList.add(agente1);
 */
    }


    public List<Agente> findAllAgents(){
        //createAgents();
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
