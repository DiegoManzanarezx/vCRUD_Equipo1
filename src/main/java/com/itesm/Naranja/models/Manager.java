package com.itesm.Naranja.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Singular;

import java.util.List;

@Builder
@Getter
@Setter
public class Manager {
    private String managerID;
    private String managerRole;
    private String managerName;
    private String managerEmail;
    private String managerPassword;
    private int managerEmployeeNum;

}

