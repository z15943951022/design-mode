package com.design.cn.flyweigth;

import java.util.HashMap;
import java.util.Map;

public class WebSiteFactory {

    private Map<String,WebSite> webSiteMap=new HashMap();


    public WebSite getWeb(String type){
        if (!webSiteMap.containsKey(type)){
            webSiteMap.put(type,new ConcreteWebSite(type));
        }
        return webSiteMap.get(type);
    }

    public Integer webCount(){
        return webSiteMap.size();
    }
}
