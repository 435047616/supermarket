package com.smbms.service.reportform;

import com.smbms.pojo.Page;
import com.smbms.pojo.PageBean;

/**
 * 财务统计接口
 */
public interface FinanceReportService {

    /**
     * 通过条件进行财务统计
     * @return
     */
    PageBean financeReportByOrders(String startTime, String endTime, String productInsurance, Page page);

    /**
     * 订单统计报表
     * @param id
     * @param creationDate
     * @param seliverDate
     * @param isFreeShip
     * @param seliverStatus
     * @param isPayCheck
     * @param page
     * @return
     */
    PageBean orderReport(String id, String creationDate, String seliverDate, String isFreeShip, String seliverStatus, String isPayCheck, Page page);
    /**
     * 根据条件对销售数据进行统计分页展示
     * @param startTime
     * @param endTime
     * @param productInsurance
     * @param salePeople
     * @param page
     * @return
     */
    PageBean saleReportByOrders(String startTime, String endTime, String productInsurance, String salePeople, Page page);
}
