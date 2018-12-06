package com.inesanet.domain;

import java.util.Date;

public class TblOperRole {
    private Long id;

    private Long addOperatorId;

    private Date addTime;

    private Long operId;

    private Integer roleId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAddOperatorId() {
        return addOperatorId;
    }

    public void setAddOperatorId(Long addOperatorId) {
        this.addOperatorId = addOperatorId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Long getOperId() {
        return operId;
    }

    public void setOperId(Long operId) {
        this.operId = operId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}