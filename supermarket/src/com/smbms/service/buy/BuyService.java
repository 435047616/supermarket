package com.smbms.service.buy;

import com.smbms.pojo.Buy;

import java.util.HashMap;
import java.util.List;

public interface BuyService {
    List<Buy> findAddBuy();
    HashMap<String,Object> findBuyById(int id);
    boolean buyAdd(Buy b);
    boolean buyModify(Buy b);
    String buyDel(int id);
    List<HashMap<String,Object>> findByNameIdAndIsPayment(String productName, Integer providerId, Integer isPayment);
}
