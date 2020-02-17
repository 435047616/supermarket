package com.smbms.util;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RequestUtil {
    public  static  Map<String,Object> parseParams(HttpServletRequest request){
       Map<String,String[]> params =request.getParameterMap();
       Map<String,Object> returnParams=new HashMap<>();
        Set<String> keys=params.keySet();
        for (String key:keys
             ) {
            if(params.get(key).length==1){
                request.setAttribute(key,params.get(key)[0]);
                returnParams.put(key,params.get(key)[0]);
            }
        }
        return returnParams;
    }
}
