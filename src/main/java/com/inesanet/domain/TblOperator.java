package com.inesanet.domain;

import java.util.Date;

public class TblOperator {
    private Long operatorId;

    private Long addOperatorId;

    private Date addTime;

    private String email;

    private Short failLogNumber;

    private Date failLogTime;

    private String idCardNo;

    private Date lastChangePsTime;

    private Date lastLoginTime;

    private String loginName;

    private String loginPassword;

    private String outletsId;

    private String phone;

    private String realName;

    private Integer sex;

    private Integer status;

    private Integer userType;

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Short getFailLogNumber() {
        return failLogNumber;
    }

    public void setFailLogNumber(Short failLogNumber) {
        this.failLogNumber = failLogNumber;
    }

    public Date getFailLogTime() {
        return failLogTime;
    }

    public void setFailLogTime(Date failLogTime) {
        this.failLogTime = failLogTime;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo == null ? null : idCardNo.trim();
    }

    public Date getLastChangePsTime() {
        return lastChangePsTime;
    }

    public void setLastChangePsTime(Date lastChangePsTime) {
        this.lastChangePsTime = lastChangePsTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }

    public String getOutletsId() {
        return outletsId;
    }

    public void setOutletsId(String outletsId) {
        this.outletsId = outletsId == null ? null : outletsId.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }
}