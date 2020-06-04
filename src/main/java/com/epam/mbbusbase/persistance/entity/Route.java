package com.epam.mbbusbase.persistance.entity;

import java.util.List;

public class Route {
    public List<Bus> getAssignedBuses() {
        return assignedBuses;
    }

    public void setAssignedBuses(List<Bus> assignedBuses) {
        this.assignedBuses = assignedBuses;
    }

    private List<Bus> assignedBuses;
}
