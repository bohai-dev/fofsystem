package com.bohai.fofsystem.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotBlank;
import java.util.Date;

public class CompanyScore {

    //评分id，主键
    private String scoreId;
    //录入人
    private String entryPerson;
    //录入时间（创建时间）
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date entryTime;
    //公司编号
    @NotBlank(message = "companyId不能为空")
    private String companyId;
    //尽调编号
    private String jdNo;
    //资本实力
    private Double capital;
    //产品发行情况
    private Double publishState;
    //管理规模
    private Double adminScale;
    //投资安排
    private Double investment;
    //管理团队状况
    private Double teamState;
    //合规风控体系
    private Double riskState;
    //产品收益
    private Double productProfit;
    //业内知名度
    private Double reputation;
    //产品推广性
    private Double spreadState;
    //过往合作情况
    private Double cooperation;
    //合计评分
    private Double totalScore;
    //更新时间
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private String backColumn1;

    private String backColumn2;
    //删除标志：0未删除，1已删除
    private String isDelete;

    public String getScoreId() {
        return scoreId;
    }

    public void setScoreId(String scoreId) {
        this.scoreId = scoreId == null ? null : scoreId.trim();
    }

    public String getEntryPerson() {
        return entryPerson;
    }

    public void setEntryPerson(String entryPerson) {
        this.entryPerson = entryPerson == null ? null : entryPerson.trim();
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getJdNo() {
        return jdNo;
    }

    public void setJdNo(String jdNo) {
        this.jdNo = jdNo == null ? null : jdNo.trim();
    }

    public Double getCapital() {
        return capital;
    }

    public void setCapital(Double capital) {
        this.capital = capital;
    }

    public Double getPublishState() {
        return publishState;
    }

    public void setPublishState(Double publishState) {
        this.publishState = publishState;
    }

    public Double getAdminScale() {
        return adminScale;
    }

    public void setAdminScale(Double adminScale) {
        this.adminScale = adminScale;
    }

    public Double getInvestment() {
        return investment;
    }

    public void setInvestment(Double investment) {
        this.investment = investment;
    }

    public Double getTeamState() {
        return teamState;
    }

    public void setTeamState(Double teamState) {
        this.teamState = teamState;
    }

    public Double getRiskState() {
        return riskState;
    }

    public void setRiskState(Double riskState) {
        this.riskState = riskState;
    }

    public Double getProductProfit() {
        return productProfit;
    }

    public void setProductProfit(Double productProfit) {
        this.productProfit = productProfit;
    }

    public Double getReputation() {
        return reputation;
    }

    public void setReputation(Double reputation) {
        this.reputation = reputation;
    }

    public Double getSpreadState() {
        return spreadState;
    }

    public void setSpreadState(Double spreadState) {
        this.spreadState = spreadState;
    }

    public Double getCooperation() {
        return cooperation;
    }

    public void setCooperation(Double cooperation) {
        this.cooperation = cooperation;
    }

    public Double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Double totalScore) {
        this.totalScore = totalScore;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

    @Override
    public String toString() {
        return "CompanyScore{" +
                "scoreId='" + scoreId + '\'' +
                ", entryPerson='" + entryPerson + '\'' +
                ", entryTime=" + entryTime +
                ", companyId='" + companyId + '\'' +
                ", jdNo='" + jdNo + '\'' +
                ", capital=" + capital +
                ", publishState=" + publishState +
                ", adminScale=" + adminScale +
                ", investment=" + investment +
                ", teamState=" + teamState +
                ", riskState=" + riskState +
                ", productProfit=" + productProfit +
                ", reputation=" + reputation +
                ", spreadState=" + spreadState +
                ", cooperation=" + cooperation +
                ", totalScore=" + totalScore +
                ", updateTime=" + updateTime +
                ", backColumn1='" + backColumn1 + '\'' +
                ", backColumn2='" + backColumn2 + '\'' +
                ", isDelete='" + isDelete + '\'' +
                '}';
    }
}