package com.smbms.service.buy;


import com.smbms.dao.buy.BuyMapper;
import com.smbms.pojo.Buy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;


@Service
@Transactional
public class BuyServiceImpl implements BuyService {

    @Resource
    BuyMapper bm;

    @Override
    public List<Buy> findAddBuy() {
        return bm.findAllBuys();
    }

    @Override
    public HashMap<String,Object> findBuyById(int id) {
        return bm.findBuysById(id);
    }

    @Override
    public boolean buyAdd(Buy b) {
        if(bm.buyAdd(b)>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean buyModify(Buy b) {
        if(bm.buyModify(b)>0){
            return true;
        }
        return false;
    }

    @Override
    public String buyDel(int id) {
        if(bm.findBuysById(id)!=null){
            if(bm.buyDel(id)>0){
                return "true";
            }else{
                return "false";
            }
        }
        return "notexist";
    }

    @Override
    public List<HashMap<String,Object>> findByNameIdAndIsPayment(String productName, Integer providerId, Integer isPayment) {
        return bm.findByNameIdAndIsPayment(productName, providerId, isPayment);
    }
}
