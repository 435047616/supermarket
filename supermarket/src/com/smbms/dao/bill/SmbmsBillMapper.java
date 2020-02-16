package com.smbms.dao.bill;

import com.smbms.pojo.Bill;
import com.smbms.pojo.BillExample;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SmbmsBillMapper {
    int countByExample(BillExample example);

    int deleteByExample(BillExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Bill record);

    int insertSelective(Bill record);

    List<Bill> selectByExample(BillExample example);

    Bill selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Bill record, @Param("example") BillExample example);

    int updateByExample(@Param("record") Bill record, @Param("example") BillExample example);

    int updateByPrimaryKeySelective(Bill record);

    int updateByPrimaryKey(Bill record);

    List<Bill> findAllBill();//获取全部订单，未使用
    Bill findBillById(int id);//根据id查询订单
    int billAdd(Bill b);//添加订单
    int billModify(Bill b);//修改订单信息
    int billDel(int id);//删除单个订单

    //获取订单列表
    List<Bill> findByNameIdAndIsPayment(@Param("productName") String productName, @Param("isPayment") Integer isPayment);
    //根据条件进行财务统计
    List<HashMap<String, Object>> financeReportByOrders(Map<String, Object> orders);

    /**
     * 根据条件进行订单统计报表
     * @param orders
     * @return
     */
    List<HashMap<String, Object>> orderReportByOrders(Map<String, Object> orders);
    /**
     * 根据条件进行购买统计汇总
     * @param orders
     * @return
     */
    List<HashMap<String, Object>> financeBuyReportByOrders(Map<String, Object> orders);
    /**
     * 根据条件进行购买销售汇总
     * @param orders
     * @return
     */
    List<HashMap<String, Object>> financeSaleReportByOrders(Map<String, Object> orders);

    /**
     * 根据条件进行销售统计汇总
     * @param orders
     * @return
     */
    List<HashMap<String, Object>> saleReportByOrders(Map<String, Object> orders);
}