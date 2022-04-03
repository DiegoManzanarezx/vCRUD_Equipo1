package com.itesm.Naranja.repositories;

import com.itesm.Naranja.models.Agente;
import com.itesm.Naranja.models.Supervisor;
import com.itesm.Naranja.models.Manager;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ManagerRepository {
    public static List<Supervisor> managerSupervisors = new ArrayList<>();
    public static List<Agente> managerAgents = new ArrayList<>();

    public List<Manager> createManagers() {
        List<Manager> managerList = new ArrayList<>();
        Manager manager1 = Manager.builder()
                .managerName("Alex Flores")
                .managerEmail("aflores@outlook.com")
                .managerID("x1")
                .managerRole("Manager")
                .managerPassword("xMx")
                .managerEmployeeNum(1)
                .build();
        Manager manager2 = Manager.builder()
                .managerName("Andrea Jimenez")
                .managerEmail("jandrea@gmail.com")
                .managerID("3C5")
                .managerRole("Manager")
                .managerPassword("x9zserty")
                .managerEmployeeNum(987654321)
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

    public Manager deleteManager(String managerID){
        for(int i = 0; i < managerList.size(); ++i) {
            if (managerList.get(i).getManagerID().equalsIgnoreCase(managerID)) {
                managerList.remove(managerList.get(i));
            }
        }

        return null;
    }

    public Manager insertManager(Manager manager){
        managerList.add(manager);
        return manager;
    }
}

