package com.inesanet.domain;

public class TblOperLogWithBLOBs extends TblOperLog {
    private String funcMat;

    private String log;

    public String getFuncMat() {
        return funcMat;
    }

    public void setFuncMat(String funcMat) {
        this.funcMat = funcMat == null ? null : funcMat.trim();
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log == null ? null : log.trim();
    }
}