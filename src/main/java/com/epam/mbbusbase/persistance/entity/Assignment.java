package com.epam.mbbusbase.persistance.entity;

import java.sql.Date;

public class Assignment {
   private int assingmentId;
    private String status;
    private String type;
    private Date date;
    private int adminId;
    private int driverId;

    public int getAssingmentId() {
        return assingmentId;
    }

    public void setAssingmentId(int assingmentId) {
        this.assingmentId = assingmentId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }
}
