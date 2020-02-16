package com.smbms.service.buy;

import com.smbms.pojo.Buy;

import java.util.List;

public interface BuyService {
    List<Buy> findAddBuy();
    Buy findBuyById(int id);
    boolean buyAdd(Buy b);
    boolean buyModify(Buy b);
    String buyDel(int id);
    List<Buy> findByNameIdAndIsPayment(String productName,Integer providerId,Integer isPayment);
}
