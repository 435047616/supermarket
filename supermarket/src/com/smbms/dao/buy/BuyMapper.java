package com.smbms.dao.buy;

import com.smbms.pojo.Buy;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface BuyMapper {
	List<Buy> findAllBuys();//获取全部购进订单，未使用
    HashMap<String,Object> findBuysById(int id);//根据id查询购进订单
	int buyAdd(Buy b);//添加购进订单
	int buyModify(Buy b);//修改购进订单信息
	int buyDel(int id);//删除单个购进订单
	//获取订单列表
	List<HashMap<String,Object>> findByNameIdAndIsPayment(@Param("buyName") String productName,
														  @Param("providerId") Integer providerId, @Param("isPayment") Integer isPayment);
}
