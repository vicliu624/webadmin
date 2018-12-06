package com.inesanet.domain;

import java.util.Date;

public class TblOperLog {
    private Long id;

    private String exeResult;

    private Date exeTime;

    private Integer funcId;

    private String ip;

    private Long operatorId;

    private Long parentId;

    private Date recCrtTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExeResult() {
        return exeResult;
    }

    public void setExeResult(String exeResult) {
        this.exeResult = exeResult == null ? null : exeResult.trim();
    }

    public Date getExeTime() {
        return exeTime;
    }

    public void setExeTime(Date exeTime) {
        this.exeTime = exeTime;
    }

    public Integer getFuncId() {
        return funcId;
    }

    public void setFuncId(Integer funcId) {
        this.funcId = funcId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Date getRecCrtTime() {
        return recCrtTime;
    }

    public void setRecCrtTime(Date recCrtTime) {
        this.recCrtTime = recCrtTime;
    }
}