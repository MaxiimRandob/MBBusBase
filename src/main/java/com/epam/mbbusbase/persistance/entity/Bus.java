package com.epam.mbbusbase.persistance.entity;

public class Bus {
    private int busId;
    private String name;
    private String status;
    private String model;
    private Route assignedRoute;

    public int getBusId() {
        return busId;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public String getModel() {
        return model;
    }

    public Route getAssignedRoute() {
        return assignedRoute;
    }
}
