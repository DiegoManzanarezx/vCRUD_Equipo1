package com.itesm.Naranja.repositories;

import com.itesm.Naranja.models.Agente;
import com.itesm.Naranja.models.Supervisor;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;

@Repository
public class SupervisorRepository {

    public static List<Agente> supervisorAgents = new ArrayList<>();

    public List<Supervisor> createSupervisors() {
        List<Supervisor> supervisorList = new ArrayList<>();
        Supervisor supervisor1 = Supervisor.builder()
                .supervisorName("Diego Manzanarez")
                .supervisorEmail("diegomanz@gmail.com")
                .supervisorID("AE1123")
                .supervisorRole("Supervisor")
                .supervisorPassword("Diego123")
                .supervisorEmployeeNum(123456789)
                .supervisorAssignedAgents(supervisorAgents)
                .build();
        Supervisor supervisor2 = Supervisor.builder()
                .supervisorName("Javier Hernandez")
                .supervisorEmail("javh@gmail.com")
                .supervisorID("3245RZSX")
                .supervisorRole("Supervisor")
                .supervisorPassword("JVM32")
                .supervisorEmployeeNum(987654321)
                .supervisorAssignedAgents(supervisorAgents)
                .build();
        supervisorList.add(supervisor1);
        supervisorList.add(supervisor2);

        return supervisorList;
    }

    public List<Supervisor> supervisorList = createSupervisors();

    public List<Supervisor> findAllSupervisors(){
        return supervisorList;
    }

    public Supervisor findSupervisorByID(String supervisorID){
        for(int i = 0; i < supervisorList.size(); ++i){
            if(supervisorList.get(i).getSupervisorID().equalsIgnoreCase(supervisorID)){
                return supervisorList.get(i);
            }
        }
        return null;
    }

    public Supervisor updateSupervisorName(String supervisorID, String newName){
        for(int i = 0; i < supervisorList.size(); ++i) {
            if (supervisorList.get(i).getSupervisorID().equalsIgnoreCase(supervisorID)) {
                supervisorList.get(i).setSupervisorName(newName);
                return supervisorList.get(i);
            }
        }
        return null;
    }

    public void deleteSupervisor(String agentID){
        for(int i = 0; i < supervisorList.size(); ++i) {
            if (supervisorList.get(i).getSupervisorID().equalsIgnoreCase(agentID)) {
                supervisorList.remove(supervisorList.get(i));
            }
        }
    }
}
