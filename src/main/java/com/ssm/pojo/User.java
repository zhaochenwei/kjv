package com.ssm.pojo;

public class User extends UserKey {
    private String password;

    private String unitJurisdiction;

    private String phoneNumber;

    private String userUnit;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUnitJurisdiction() {
        return unitJurisdiction;
    }

    public void setUnitJurisdiction(String unitJurisdiction) {
        this.unitJurisdiction = unitJurisdiction == null ? null : unitJurisdiction.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getUserUnit() {
        return userUnit;
    }

    public void setUserUnit(String userUnit) {
        this.userUnit = userUnit == null ? null : userUnit.trim();
    }
}