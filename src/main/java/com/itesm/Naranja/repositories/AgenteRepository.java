package com.itesm.Naranja.repositories;

import com.itesm.Naranja.models.Agente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AgenteRepository {
    public List<Agente> findAllAgents(){
        Agente agente1= new Agente();
        agente1.setAgentID("123ABC");
        agente1.setAgentEmail("luis@tec.mx");
        agente1.setAgentName("Luis Orozco");
        agente1.setAgentPassword("x1T.rZ");
        agente1.setAgentRole("agent");
        agente1.setAgentSuccessfulTickets(500);
        agente1.setAgentUnsuccessfulTickets(19000);
        agente1.setAgentEmployeeNum(99);

        List<Agente> agentes= new ArrayList<>();
        agentes.add(agente1);
        return agentes;
    }
}
