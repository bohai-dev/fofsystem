package com.bohai.fofsystem.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotBlank;
import java.util.Date;

public class ProductScore {
    //id,主键
    private String scoreId;
    //产品id
    @NotBlank(message = "productId不能为空")
    private String productId;
    //录入人
    private String entryPerson;
    //录入时间(创建时间)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date entryTime;
    //公司编号
    @NotBlank(message = "companyId不能为空")
    private String companyId;
    //尽调编号
    private String jdNo;
    //投资策略分类
    private String strategyType;
    //净值日期
    private String netWorthDate;
    //产品成立日期
    private String productBuildTime;
    //最新单位净值
    private Double netWorthLatest;
    //复权累计净值
    private Double cumulativeWorth;
    //年化收益率
    private Double yearProfitTate;
    //最大连续回撤
    private Double lageRevoke;
    //夏普比率
    private Double xiapuTate;
    //信息比率
    private Double xinxiRate;
    //卡马比率
    private Double kamaRate;
    //索提诺比率
    private Double suotinuoRate;
    // D-Ratio
    private Double dRatio1;
    // D-Ratio_
    private Double dRatio2;
    //综合评价
    private Double totalScore;
    //更新时间
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
    //备用字段1
    private String backupColumn1;
    //备用字段2
    private String isDelete;
    
    //最新单位净值
    private Double netWorthLatestDown;
    //复权累计净值
    private Double cumulativeWorthDown;
    //年化收益率
    private Double yearProfitTateDown;
    //最大连续回撤
    private Double lageRevokeDown;
    //夏普比率
    private Double xiapuTateDown;
    //信息比率
    private Double xinxiRateDown;
    //卡马比率
    private Double kamaRateDown;
    //索提诺比率
    private Double suotinuoRateDown;
    // D-Ratio
    private Double dRatio1Down;
    // D-Ratio_
    private Double dRatio2Down;
    //综合评价
    private Double totalScoreDown;
        //最新单位净值
    private Double netWorthLatestUp;
    //复权累计净值
    private Double cumulativeWorthUp;
    //年化收益率
    private Double yearProfitTateUp;
    //最大连续回撤
    private Double lageRevokeUp;
    //夏普比率
    private Double xiapuTateUp;
    //信息比率
    private Double xinxiRateUp;
    //卡马比率
    private Double kamaRateUp;
    //索提诺比率
    private Double suotinuoRateUp;
    // D-Ratio
    private Double dRatio1Up;
    // D-Ratio_
    private Double dRatio2Up;
    //综合评价
    private Double totalScoreUp;
    

    public Double getNetWorthLatestDown() {
        return netWorthLatestDown;
    }

    public void setNetWorthLatestDown(Double netWorthLatestDown) {
        this.netWorthLatestDown = netWorthLatestDown;
    }

    public Double getCumulativeWorthDown() {
        return cumulativeWorthDown;
    }

    public void setCumulativeWorthDown(Double cumulativeWorthDown) {
        this.cumulativeWorthDown = cumulativeWorthDown;
    }

    public Double getYearProfitTateDown() {
        return yearProfitTateDown;
    }

    public void setYearProfitTateDown(Double yearProfitTateDown) {
        this.yearProfitTateDown = yearProfitTateDown;
    }

    public Double getLageRevokeDown() {
        return lageRevokeDown;
    }

    public void setLageRevokeDown(Double lageRevokeDown) {
        this.lageRevokeDown = lageRevokeDown;
    }

    public Double getXiapuTateDown() {
        return xiapuTateDown;
    }

    public void setXiapuTateDown(Double xiapuTateDown) {
        this.xiapuTateDown = xiapuTateDown;
    }

    public Double getXinxiRateDown() {
        return xinxiRateDown;
    }

    public void setXinxiRateDown(Double xinxiRateDown) {
        this.xinxiRateDown = xinxiRateDown;
    }

    public Double getKamaRateDown() {
        return kamaRateDown;
    }

    public void setKamaRateDown(Double kamaRateDown) {
        this.kamaRateDown = kamaRateDown;
    }

    public Double getSuotinuoRateDown() {
        return suotinuoRateDown;
    }

    public void setSuotinuoRateDown(Double suotinuoRateDown) {
        this.suotinuoRateDown = suotinuoRateDown;
    }

    public Double getdRatio1Down() {
        return dRatio1Down;
    }

    public void setdRatio1Down(Double dRatio1Down) {
        this.dRatio1Down = dRatio1Down;
    }

    public Double getdRatio2Down() {
        return dRatio2Down;
    }

    public void setdRatio2Down(Double dRatio2Down) {
        this.dRatio2Down = dRatio2Down;
    }

    public Double getTotalScoreDown() {
        return totalScoreDown;
    }

    public void setTotalScoreDown(Double totalScoreDown) {
        this.totalScoreDown = totalScoreDown;
    }

    public Double getNetWorthLatestUp() {
        return netWorthLatestUp;
    }

    public void setNetWorthLatestUp(Double netWorthLatestUp) {
        this.netWorthLatestUp = netWorthLatestUp;
    }

    public Double getCumulativeWorthUp() {
        return cumulativeWorthUp;
    }

    public void setCumulativeWorthUp(Double cumulativeWorthUp) {
        this.cumulativeWorthUp = cumulativeWorthUp;
    }

    public Double getYearProfitTateUp() {
        return yearProfitTateUp;
    }

    public void setYearProfitTateUp(Double yearProfitTateUp) {
        this.yearProfitTateUp = yearProfitTateUp;
    }

    public Double getLageRevokeUp() {
        return lageRevokeUp;
    }

    public void setLageRevokeUp(Double lageRevokeUp) {
        this.lageRevokeUp = lageRevokeUp;
    }

    public Double getXiapuTateUp() {
        return xiapuTateUp;
    }

    public void setXiapuTateUp(Double xiapuTateUp) {
        this.xiapuTateUp = xiapuTateUp;
    }

    public Double getXinxiRateUp() {
        return xinxiRateUp;
    }

    public void setXinxiRateUp(Double xinxiRateUp) {
        this.xinxiRateUp = xinxiRateUp;
    }

    public Double getKamaRateUp() {
        return kamaRateUp;
    }

    public void setKamaRateUp(Double kamaRateUp) {
        this.kamaRateUp = kamaRateUp;
    }

    public Double getSuotinuoRateUp() {
        return suotinuoRateUp;
    }

    public void setSuotinuoRateUp(Double suotinuoRateUp) {
        this.suotinuoRateUp = suotinuoRateUp;
    }

    public Double getdRatio1Up() {
        return dRatio1Up;
    }

    public void setdRatio1Up(Double dRatio1Up) {
        this.dRatio1Up = dRatio1Up;
    }

    public Double getdRatio2Up() {
        return dRatio2Up;
    }

    public void setdRatio2Up(Double dRatio2Up) {
        this.dRatio2Up = dRatio2Up;
    }

    public Double getTotalScoreUp() {
        return totalScoreUp;
    }

    public void setTotalScoreUp(Double totalScoreUp) {
        this.totalScoreUp = totalScoreUp;
    }

    public String getScoreId() {
        return scoreId;
    }

    public void setScoreId(String scoreId) {
        this.scoreId = scoreId == null ? null : scoreId.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
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

    public String getStrategyType() {
        return strategyType;
    }

    public void setStrategyType(String strategyType) {
        this.strategyType = strategyType == null ? null : strategyType.trim();
    }

    public String getNetWorthDate() {
        return netWorthDate;
    }

    public void setNetWorthDate(String netWorthDate) {
        this.netWorthDate = netWorthDate == null ? null : netWorthDate.trim();
    }

    public String getProductBuildTime() {
        return productBuildTime;
    }

    public void setProductBuildTime(String productBuildTime) {
        this.productBuildTime = productBuildTime == null ? null : productBuildTime.trim();
    }

    public Double getNetWorthLatest() {
        return netWorthLatest;
    }

    public void setNetWorthLatest(Double netWorthLatest) {
        this.netWorthLatest = netWorthLatest;
    }

    public Double getCumulativeWorth() {
        return cumulativeWorth;
    }

    public void setCumulativeWorth(Double cumulativeWorth) {
        this.cumulativeWorth = cumulativeWorth;
    }

    public Double getYearProfitTate() {
        return yearProfitTate;
    }

    public void setYearProfitTate(Double yearProfitTate) {
        this.yearProfitTate = yearProfitTate;
    }

    public Double getLageRevoke() {
        return lageRevoke;
    }

    public void setLageRevoke(Double lageRevoke) {
        this.lageRevoke = lageRevoke;
    }

    public Double getXiapuTate() {
        return xiapuTate;
    }

    public void setXiapuTate(Double xiapuTate) {
        this.xiapuTate = xiapuTate;
    }

    public Double getXinxiRate() {
        return xinxiRate;
    }

    public void setXinxiRate(Double xinxiRate) {
        this.xinxiRate = xinxiRate;
    }

    public Double getKamaRate() {
        return kamaRate;
    }

    public void setKamaRate(Double kamaRate) {
        this.kamaRate = kamaRate;
    }

    public Double getSuotinuoRate() {
        return suotinuoRate;
    }

    public void setSuotinuoRate(Double suotinuoRate) {
        this.suotinuoRate = suotinuoRate;
    }

    public Double getdRatio1() {
        return dRatio1;
    }

    public void setdRatio1(Double dRatio1) {
        this.dRatio1 = dRatio1;
    }

    public Double getdRatio2() {
        return dRatio2;
    }

    public void setdRatio2(Double dRatio2) {
        this.dRatio2 = dRatio2;
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

    public String getBackupColumn1() {
        return backupColumn1;
    }

    public void setBackupColumn1(String backupColumn1) {
        this.backupColumn1 = backupColumn1 == null ? null : backupColumn1.trim();
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "ProductScore{" +
                "scoreId='" + scoreId + '\'' +
                ", productId='" + productId + '\'' +
                ", entryPerson='" + entryPerson + '\'' +
                ", entryTime=" + entryTime +
                ", companyId='" + companyId + '\'' +
                ", jdNo='" + jdNo + '\'' +
                ", strategyType='" + strategyType + '\'' +
                ", netWorthDate='" + netWorthDate + '\'' +
                ", productBuildTime='" + productBuildTime + '\'' +
                ", netWorthLatest=" + netWorthLatest +
                ", cumulativeWorth=" + cumulativeWorth +
                ", yearProfitTate=" + yearProfitTate +
                ", lageRevoke=" + lageRevoke +
                ", xiapuTate=" + xiapuTate +
                ", xinxiRate=" + xinxiRate +
                ", kamaRate=" + kamaRate +
                ", suotinuoRate=" + suotinuoRate +
                ", dRatio1=" + dRatio1 +
                ", dRatio2=" + dRatio2 +
                ", totalScore=" + totalScore +
                ", updateTime=" + updateTime +
                ", backupColumn1='" + backupColumn1 + '\'' +
                ", isDelete='" + isDelete + '\'' +
                '}';
    }
}