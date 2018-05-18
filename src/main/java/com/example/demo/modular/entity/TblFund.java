package com.example.demo.modular.entity;

import java.util.Date;

public class TblFund {
    private String id;

    private String fundName;

    private String fundFullname;

    private String fundCategory;

    private String fundType;

    private Byte fundState;

    private String treeType;

    private Double fundScale;

    private Date establishTime;

    private String investmentPeriod;

    private String exitPeriod;

    private Date exitTime;

    private String createUserId;

    private Date createTime;

    private String updateUserId;

    private Date updateTime;

    private Byte deleteStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName == null ? null : fundName.trim();
    }

    public String getFundFullname() {
        return fundFullname;
    }

    public void setFundFullname(String fundFullname) {
        this.fundFullname = fundFullname == null ? null : fundFullname.trim();
    }

    public String getFundCategory() {
        return fundCategory;
    }

    public void setFundCategory(String fundCategory) {
        this.fundCategory = fundCategory == null ? null : fundCategory.trim();
    }

    public String getFundType() {
        return fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType == null ? null : fundType.trim();
    }

    public Byte getFundState() {
        return fundState;
    }

    public void setFundState(Byte fundState) {
        this.fundState = fundState;
    }

    public String getTreeType() {
        return treeType;
    }

    public void setTreeType(String treeType) {
        this.treeType = treeType == null ? null : treeType.trim();
    }

    public Double getFundScale() {
        return fundScale;
    }

    public void setFundScale(Double fundScale) {
        this.fundScale = fundScale;
    }

    public Date getEstablishTime() {
        return establishTime;
    }

    public void setEstablishTime(Date establishTime) {
        this.establishTime = establishTime;
    }

    public String getInvestmentPeriod() {
        return investmentPeriod;
    }

    public void setInvestmentPeriod(String investmentPeriod) {
        this.investmentPeriod = investmentPeriod == null ? null : investmentPeriod.trim();
    }

    public String getExitPeriod() {
        return exitPeriod;
    }

    public void setExitPeriod(String exitPeriod) {
        this.exitPeriod = exitPeriod == null ? null : exitPeriod.trim();
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId == null ? null : updateUserId.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Byte deleteStatus) {
        this.deleteStatus = deleteStatus;
    }
}