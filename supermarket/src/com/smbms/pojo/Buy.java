package com.smbms.pojo;

import java.util.Date;

public class Buy {
    private Integer id;
    private String buyCode;              //购进产品code
    private String productDesc;          //购进产品描述
    private String productUnit;          //购进产品单位
    private String productStandard;      //购进产品规格 5支/盒
    private String productUnitPrice;     //购进产品单价 ---不含保险200/含保险450
    private int productCount;           //购进产品数量
    private double totalPrice;          //购进产品金额
    private String createBy;               //购进人
    private Date creationDate;          //购进日期
    private int isPayment;              //是否付款
    private int providerId;             //供应商ID
    private Provider provider;         //供应商
    private int disable;              //人工删除标识
    private Integer productId;     //商品分类id

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBuyCode() {
        return buyCode;
    }

    public void setBuyCode(String buyCode) {
        this.buyCode = buyCode;
    }


    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    public String getProductStandard() {
        return productStandard;
    }

    public void setProductStandard(String productStandard) {
        this.productStandard = productStandard;
    }

    public String getProductUnitPrice() {
        return productUnitPrice;
    }

    public void setProductUnitPrice(String productUnitPrice) {
        this.productUnitPrice = productUnitPrice;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public int getIsPayment() {
        return isPayment;
    }

    public void setIsPayment(int isPayment) {
        this.isPayment = isPayment;
    }

    public int getProviderId() {
        return providerId;
    }

    public void setProviderId(int providerId) {
        this.providerId = providerId;
    }

    public int getDisable() {
        return disable;
    }

    public void setDisable(int disable) {
        this.disable = disable;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    @Override
    public String toString() {
        return "Buy{" +
                "id=" + id +
                ", buyCode='" + buyCode + '\'' +
                ", productDesc='" + productDesc + '\'' +
                ", productUnit='" + productUnit + '\'' +
                ", productStandard='" + productStandard + '\'' +
                ", productUnitPrice='" + productUnitPrice + '\'' +
                ", productCount=" + productCount +
                ", totalPrice=" + totalPrice +
                ", createBy='" + createBy + '\'' +
                ", creationDate=" + creationDate +
                ", isPayment=" + isPayment +
                ", providerId=" + providerId +
                ", provider=" + provider +
                ", disable=" + disable +
                '}';
    }
}
