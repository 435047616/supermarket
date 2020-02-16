package com.smbms.service.bill;

import java.util.List;

import com.smbms.pojo.Bill;
import com.smbms.pojo.MyResponseBody;
import com.smbms.pojo.Page;
import com.smbms.pojo.User;

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
}
