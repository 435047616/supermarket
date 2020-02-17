package com.smbms.service.bill;

import com.smbms.pojo.Bill;
import com.smbms.pojo.MyResponseBody;
import com.smbms.pojo.Page;
import com.smbms.pojo.PageBean;

import java.util.List;
import java.util.Map;

public interface BillService {
	List<Bill> findAddBill();
	Bill findBillById(int id);
	boolean billAdd(Bill b);
	boolean billModify(Bill b);
	String billDel(int id);
	List<Bill> findByNameIdAndIsPayment(String productCode,Integer isPayment,Integer userId,Page page);
    /**
     * 乐荐 远程接口添加订单
     * @param bills
     * @return
     */
    MyResponseBody billAddFromLejian(String bills);

	/**
	 * 查询所有订单信息，并进行分页展示
	 * @param params
	 * @param page
	 * @return
	 */
	PageBean findAllBillsByOrders(Map<String, Object> params,  Page page);
}
