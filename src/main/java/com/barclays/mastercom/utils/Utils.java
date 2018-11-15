package com.barclays.mastercom.utils;

import com.mastercard.api.core.model.map.SmartMap;
import java.util.Map;


public class Utils {
    public void out(SmartMap response, String key) {
        System.out.println(key+"-->"+response.get(key));
    }

    public void out(Map<String,Object> map, String key) {
        System.out.println(key+"--->"+map.get(key));
    }

    public void err(String message) {
        System.err.println(message);
    }
}
