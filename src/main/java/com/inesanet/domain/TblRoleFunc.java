package com.inesanet.domain;

import java.util.Date;

public class TblRoleFunc {
    private Long id;

    private Integer actionId;

    private Long addOperatorId;

    private Date addTime;

    private Integer funcId;

    private Integer roleId;

    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getActionId() {
        return actionId;
    }

    public void setActionId(Integer actionId) {
        this.actionId = actionId;
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

    public Integer getFuncId() {
        return funcId;
    }

    public void setFuncId(Integer funcId) {
        this.funcId = funcId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}