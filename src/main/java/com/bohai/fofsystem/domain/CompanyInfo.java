package com.bohai.fofsystem.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotBlank;
import java.util.Date;

public class CompanyInfo {
    private String companyId;

    private String simpleName;
    @NotBlank(message = "公司全称不能为空")
    private String fullName;

    private String buildTime;

    private String recordTime;

    private String simpleIntro;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createdTime;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updatedTime;

    private String isDelete;

    private String backColumn1;

    private String backColumn2;

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName == null ? null : simpleName.trim();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    public String getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(String buildTime) {
        this.buildTime = buildTime == null ? null : buildTime.trim();
    }

    public String getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(String recordTime) {
        this.recordTime = recordTime == null ? null : recordTime.trim();
    }

    public String getSimpleIntro() {
        return simpleIntro;
    }

    public void setSimpleIntro(String simpleIntro) {
        this.simpleIntro = simpleIntro == null ? null : simpleIntro.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

    public String getBackColumn1() {
        return backColumn1;
    }

    public void setBackColumn1(String backColumn1) {
        this.backColumn1 = backColumn1 == null ? null : backColumn1.trim();
    }

    public String getBackColumn2() {
        return backColumn2;
    }

    public void setBackColumn2(String backColumn2) {
        this.backColumn2 = backColumn2 == null ? null : backColumn2.trim();
    }

    @Override
    public String toString() {
        return "CompanyInfo{" +
                "companyId='" + companyId + '\'' +
                ", simpleName='" + simpleName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", buildTime='" + buildTime + '\'' +
                ", recordTime='" + recordTime + '\'' +
                ", simpleIntro='" + simpleIntro + '\'' +
                ", createdTime=" + createdTime +
                ", updatedTime=" + updatedTime +
                ", isDelete='" + isDelete + '\'' +
                ", backColumn1='" + backColumn1 + '\'' +
                ", backColumn2='" + backColumn2 + '\'' +
                '}';
    }
}