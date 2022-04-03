package com.itesm.Naranja.repositories;

import com.itesm.Naranja.models.Agente;
import com.itesm.Naranja.models.Supervisor;
import com.itesm.Naranja.models.Manager;

import java.util.ArrayList;
import java.util.List;

public class ManagerRepository {
    public static List<Supervisor> managerSupervisors = new ArrayList<>();
    public static List<Agente> managerAgents = new ArrayList<>();

    public List<Manager> createManagers() {
        List<Manager> managerList = new ArrayList<>();
        Manager manager1 = Manager.builder()
                .managerName("Alex Flores")
                .managerEmail("aflores@outlook.com")
                .managerID("AE1123")
                .managerRole("Supervisor")
                .managerPassword("Diego123")
                .managerEmployeeNum(123456789)
                .managerAgentList(managerAgents)
                .managerSupervisorsList(managerSupervisors)
                .build();
        Manager manager2 = Manager.builder()
                .managerName("Javier Hernandez")
                .managerEmail("javh@gmail.com")
                .managerID("3245RZSX")
                .managerRole("Supervisor")
                .managerPassword("JVM32")
                .managerEmployeeNum(987654321)
                .managerAgentList(managerAgents)
                .managerSupervisorsList(managerSupervisors)
                .build();
        managerList.add(manager1);
        managerList.add(manager2);

        return managerList;
    }

    public List<Manager> managerList = createManagers();

    public List<Manager> findAllManagers(){
        return managerList;
    }

    public Manager findManagerByID(String managerID){
        for(int i = 0; i < managerList.size(); ++i){
            if(managerList.get(i).getManagerID().equalsIgnoreCase(managerID)){
                return managerList.get(i);
            }
        }
        return null;
    }

    public Manager updateManagerName(String managerID, String newName){
        for(int i = 0; i < managerList.size(); ++i) {
            if (managerList.get(i).getManagerID().equalsIgnoreCase(managerID)) {
                managerList.get(i).setManagerName(newName);
                return managerList.get(i);
            }
        }
        return null;
    }

    public void deleteManager(String agentID){
        for(int i = 0; i < managerList.size(); ++i) {
            if (managerList.get(i).getManagerID().equalsIgnoreCase(agentID)) {
                managerList.remove(managerList.get(i));
            }
        }
    }

    public Manager insertManager(Manager manager){
        managerList.add(manager);
        return manager;
    }
}

