package com.smbms.pojo;

import java.util.Date;


public class Bill {
	private Integer id;
	private String billCode;
    private String productCode;
	private double productInsurance;
	private String productDesc;
	private String productUnit;
	private int productCount;
	private double totalPrice;

    private String customerName;
    private String customerAddress;
    private String customerTel;
    private String dockPeople;
    private String saleDock;
    private int payWay;
    private String transactionNum;
    private int payNum;
    private int isFreeShip;
    private String myFreight;
    private int seliverStatus;
    private int isPayment;
    private String waybill;
    private Date seliverDate;
    private String remark;

	private int createdBy;
	private Date creationDate;
	private int disable;
    private Provider provider;
    private String lejianBillId;

    public String getLejianBillId() {
        return lejianBillId;
    }

    public void setLejianBillId(String lejianBillId) {
        this.lejianBillId = lejianBillId;
    }

    public int getDisable() {
        return disable;
    }

    public void setDisable(int disable) {
        this.disable = disable;
    }

	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBillCode() {
		return billCode;
	}
	public void setBillCode(String billCode) {
		this.billCode = billCode;
	}
	public String getProductUnit() {
		return productUnit;
	}
	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
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
	public int getIsPayment() {
		return isPayment;
	}
	public void setIsPayment(int isPayment) {
		this.isPayment = isPayment;
	}

    public String getCustomerName() {
        return customerName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getWaybill() {
        return waybill;
    }

    public void setWaybill(String waybill) {
        this.waybill = waybill;
    }

    public Date getSeliverDate() {
        return seliverDate;
    }

    public void setSeliverDate(Date seliverDate) {
        this.seliverDate = seliverDate;
    }

    public double getProductInsurance() {
        return productInsurance;
    }

    public void setProductInsurance(double productInsurance) {
        this.productInsurance = productInsurance;
    }

    public void setProductInsurance(int productInsurance) {
        this.productInsurance = productInsurance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(String customerTel) {
        this.customerTel = customerTel;
    }

    public String getDockPeople() {
        return dockPeople;
    }

    public void setDockPeople(String dockPeople) {
        this.dockPeople = dockPeople;
    }

    public String getSaleDock() {
        return saleDock;
    }

    public void setSaleDock(String saleDock) {
        this.saleDock = saleDock;
    }

    public int getPayWay() {
        return payWay;
    }

    public void setPayWay(int payWay) {
        this.payWay = payWay;
    }

    public String getTransactionNum() {
        return transactionNum;
    }

    public void setTransactionNum(String transactionNum) {
        this.transactionNum = transactionNum;
    }

    public int getPayNum() {
        return payNum;
    }

    public void setPayNum(int payNum) {
        this.payNum = payNum;
    }

    public int getIsFreeShip() {
        return isFreeShip;
    }

    public void setIsFreeShip(int isFreeShip) {
        this.isFreeShip = isFreeShip;
    }

    public String getMyFreight() {
        return myFreight;
    }

    public void setMyFreight(String myFreight) {
        this.myFreight = myFreight;
    }

    public int getSeliverStatus() {
        return seliverStatus;
    }

    public void setSeliverStatus(int seliverStatus) {
        this.seliverStatus = seliverStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", billCode='" + billCode + '\'' +
                ", productCode='" + productCode + '\'' +
                ", productInsurance=" + productInsurance +
                ", productDesc='" + productDesc + '\'' +
                ", productUnit='" + productUnit + '\'' +
                ", productCount=" + productCount +
                ", totalPrice=" + totalPrice +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerTel='" + customerTel + '\'' +
                ", dockPeople='" + dockPeople + '\'' +
                ", saleDock='" + saleDock + '\'' +
                ", payWay=" + payWay +
                ", transactionNum=" + transactionNum +
                ", payNum=" + payNum +
                ", isFreeShip=" + isFreeShip +
                ", myFreight='" + myFreight + '\'' +
                ", seliverStatus=" + seliverStatus +
                ", isPayment=" + isPayment +
                ", waybill='" + waybill + '\'' +
                ", seliverDate=" + seliverDate +
                ", remark='" + remark + '\'' +
                ", createdBy=" + createdBy +
                ", creationDate=" + creationDate +
                ", provider=" + provider +
                ", disable=" + disable +
                '}';
    }
}
