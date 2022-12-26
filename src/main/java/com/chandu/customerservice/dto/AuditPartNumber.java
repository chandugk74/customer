package com.chandu.customerservice.dto;


import java.util.Date;

public class AuditPartNumber {

    public Integer id;
    private Integer partNumberId;
    private String position;
    private String actionType;
    private String pallUserId;
    private String fullName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPartNumberId() {
        return partNumberId;
    }

    public void setPartNumberId(Integer partNumberId) {
        this.partNumberId = partNumberId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getPallUserId() {
        return pallUserId;
    }

    public void setPallUserId(String pallUserId) {
        this.pallUserId = pallUserId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    private Date createdAt;
    private String reason;
}
