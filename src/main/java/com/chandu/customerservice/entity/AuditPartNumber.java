package com.chandu.customerservice.entity;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "audit_part_number")
public class AuditPartNumber implements java.io.Serializable {
    private static final long serialVersionUID = -6073205013402547718L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer id; //11
    @Column(name = "part_Number_Id")
    private Integer partNumberId; //11
    @Column(name = "Position")
    private String position;//varchar8
    @Column(name = "Action_Type")
    private String actionType;//varchar40
    @Column(name = "Pall_User_Id")
    private String pallUserId;//varchar64
    @Column(name = "Full_Name")
    private String fullName;  //fullName = UserDetails.FirstName + UserDetails.LastName varchar128
    @Column(name = "Created_At")
    private Date createdAt; // TimeStamp 19
    @Column(name = "Reason")
    private String reason;//varchar 255


    public Integer getPartNumberId() {
        return partNumberId;
    }

    public void setPartNumberId(Integer partNumberId) {
        this.partNumberId = partNumberId;
    }


    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
