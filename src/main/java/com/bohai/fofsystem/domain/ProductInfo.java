package com.bohai.fofsystem.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotBlank;
import java.util.Date;

public class ProductInfo {
    private String productId;

    private String companyId;

    @NotBlank(message = "产品名称不能为空")
    private String fullName;

    private String simpleName;

    private String recordNo;

    private String recordDate;

    private String buildTime;

    private String finishTime;

    private String strategyType;

    private Short survivalScale;

    private String productStatus;

    private String structureType;

    private String openDate;

    private String closeDate;

    private String investmentManager;

    private String investmentAdviser;

    private String publishUnit;

    private String hostingUnit;

    private String financialIntendant;

    private String serviceUnit;

    private Short adminRate;

    private Short hostingRate;

    private Short buyRate;

    private Short ransomRate;

    private Short achievement;

    private String netWotthRate;

    private String backColumn1;

    private String backColumn2;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private String isDelete;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName == null ? null : simpleName.trim();
    }

    public String getRecordNo() {
        return recordNo;
    }

    public void setRecordNo(String recordNo) {
        this.recordNo = recordNo == null ? null : recordNo.trim();
    }

    public String getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate == null ? null : recordDate.trim();
    }

    public String getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(String buildTime) {
        this.buildTime = buildTime == null ? null : buildTime.trim();
    }

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime == null ? null : finishTime.trim();
    }

    public String getStrategyType() {
        return strategyType;
    }

    public void setStrategyType(String strategyType) {
        this.strategyType = strategyType == null ? null : strategyType.trim();
    }

    public Short getSurvivalScale() {
        return survivalScale;
    }

    public void setSurvivalScale(Short survivalScale) {
        this.survivalScale = survivalScale;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus == null ? null : productStatus.trim();
    }

    public String getStructureType() {
        return structureType;
    }

    public void setStructureType(String structureType) {
        this.structureType = structureType == null ? null : structureType.trim();
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate == null ? null : openDate.trim();
    }

    public String getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(String closeDate) {
        this.closeDate = closeDate == null ? null : closeDate.trim();
    }

    public String getInvestmentManager() {
        return investmentManager;
    }

    public void setInvestmentManager(String investmentManager) {
        this.investmentManager = investmentManager == null ? null : investmentManager.trim();
    }

    public String getInvestmentAdviser() {
        return investmentAdviser;
    }

    public void setInvestmentAdviser(String investmentAdviser) {
        this.investmentAdviser = investmentAdviser == null ? null : investmentAdviser.trim();
    }

    public String getPublishUnit() {
        return publishUnit;
    }

    public void setPublishUnit(String publishUnit) {
        this.publishUnit = publishUnit == null ? null : publishUnit.trim();
    }

    public String getHostingUnit() {
        return hostingUnit;
    }

    public void setHostingUnit(String hostingUnit) {
        this.hostingUnit = hostingUnit == null ? null : hostingUnit.trim();
    }

    public String getFinancialIntendant() {
        return financialIntendant;
    }

    public void setFinancialIntendant(String financialIntendant) {
        this.financialIntendant = financialIntendant == null ? null : financialIntendant.trim();
    }

    public String getServiceUnit() {
        return serviceUnit;
    }

    public void setServiceUnit(String serviceUnit) {
        this.serviceUnit = serviceUnit == null ? null : serviceUnit.trim();
    }

    public Short getAdminRate() {
        return adminRate;
    }

    public void setAdminRate(Short adminRate) {
        this.adminRate = adminRate;
    }

    public Short getHostingRate() {
        return hostingRate;
    }

    public void setHostingRate(Short hostingRate) {
        this.hostingRate = hostingRate;
    }

    public Short getBuyRate() {
        return buyRate;
    }

    public void setBuyRate(Short buyRate) {
        this.buyRate = buyRate;
    }

    public Short getRansomRate() {
        return ransomRate;
    }

    public void setRansomRate(Short ransomRate) {
        this.ransomRate = ransomRate;
    }

    public Short getAchievement() {
        return achievement;
    }

    public void setAchievement(Short achievement) {
        this.achievement = achievement;
    }

    public String getNetWotthRate() {
        return netWotthRate;
    }

    public void setNetWotthRate(String netWotthRate) {
        this.netWotthRate = netWotthRate == null ? null : netWotthRate.trim();
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }
}