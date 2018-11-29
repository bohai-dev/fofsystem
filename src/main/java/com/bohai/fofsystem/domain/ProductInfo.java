package com.bohai.fofsystem.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.Date;

public class ProductInfo {
    private String productId;
    //公司编号
    @NotBlank(message = "companyId不能为空")
    private String companyId;

    //产品名称
    @NotBlank(message = "产品名称不能为空")
    private String fullName;
    //产品简称
    private String simpleName;
    //协会备案编号
    private String recordNo;
    //协会备案日期
    private String recordDate;
    //产品成立日期
    private String buildTime;
    //产品结束日期
    private String finishTime;
    //投资策略分类
    private String strategyType;
    //存续规模
    private BigDecimal survivalScale;
    //状态
    private String productStatus;
    //结构形式
    private String structureType;
    //开放日
    private String openDate;
    //封闭期
    private String closeDate;
    //投资经理
    private String investmentManager;
    //投资顾问
    private String investmentAdviser;
    //发行机构
    private String publishUnit;
    //托管机构
    private String hostingUnit;
    //证券经纪
    private String financialIntendant;
    //行政服务机构
    private String serviceUnit;
    //管理费率
    private BigDecimal adminRate;
    //托管费率
    private BigDecimal hostingRate;
    //认购费率
    private BigDecimal buyRate;
    //赎回费率
    private BigDecimal ransomRate;
    //业绩报酬
    private BigDecimal achievement;
    //净值披露频率
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

    public BigDecimal getSurvivalScale() {
        return survivalScale;
    }

    public void setSurvivalScale(BigDecimal survivalScale) {
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

    public BigDecimal getAdminRate() {
        return adminRate;
    }

    public void setAdminRate(BigDecimal adminRate) {
        this.adminRate = adminRate;
    }

    public BigDecimal getHostingRate() {
        return hostingRate;
    }

    public void setHostingRate(BigDecimal hostingRate) {
        this.hostingRate = hostingRate;
    }

    public BigDecimal getBuyRate() {
        return buyRate;
    }

    public void setBuyRate(BigDecimal buyRate) {
        this.buyRate = buyRate;
    }

    public BigDecimal getRansomRate() {
        return ransomRate;
    }

    public void setRansomRate(BigDecimal ransomRate) {
        this.ransomRate = ransomRate;
    }

    public BigDecimal getAchievement() {
        return achievement;
    }

    public void setAchievement(BigDecimal achievement) {
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

    @Override
    public String toString() {
        return "ProductInfo{" +
                "productId='" + productId + '\'' +
                ", companyId='" + companyId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", simpleName='" + simpleName + '\'' +
                ", recordNo='" + recordNo + '\'' +
                ", recordDate='" + recordDate + '\'' +
                ", buildTime='" + buildTime + '\'' +
                ", finishTime='" + finishTime + '\'' +
                ", strategyType='" + strategyType + '\'' +
                ", survivalScale=" + survivalScale +
                ", productStatus='" + productStatus + '\'' +
                ", structureType='" + structureType + '\'' +
                ", openDate='" + openDate + '\'' +
                ", closeDate='" + closeDate + '\'' +
                ", investmentManager='" + investmentManager + '\'' +
                ", investmentAdviser='" + investmentAdviser + '\'' +
                ", publishUnit='" + publishUnit + '\'' +
                ", hostingUnit='" + hostingUnit + '\'' +
                ", financialIntendant='" + financialIntendant + '\'' +
                ", serviceUnit='" + serviceUnit + '\'' +
                ", adminRate=" + adminRate +
                ", hostingRate=" + hostingRate +
                ", buyRate=" + buyRate +
                ", ransomRate=" + ransomRate +
                ", achievement=" + achievement +
                ", netWotthRate='" + netWotthRate + '\'' +
                ", backColumn1='" + backColumn1 + '\'' +
                ", backColumn2='" + backColumn2 + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", isDelete='" + isDelete + '\'' +
                '}';
    }
}