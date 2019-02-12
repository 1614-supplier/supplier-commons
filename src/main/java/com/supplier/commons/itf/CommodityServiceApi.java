package com.supplier.commons.itf;

/**
 * Created by Hai on 2018/6/19.
 */

import com.supplier.commons.bean.commodity.Goods;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by zhenhai.zheng on 2017/4/6.
 */

//@FeignClient("supplier-commodity")
public interface CommodityServiceApi {

    //要注册得controller方法得url,必须完全相同

//    @RequestMapping(value = "/commodity/addCommodity",method = RequestMethod.GET)
    String addCommodity(String name,double price);

//    @RequestMapping(value = "/commodity/getCommodityInfoByName",method = RequestMethod.GET)
    Goods getCommodityInfoByName(@RequestParam(value = "name") String name);

//    @RequestMapping(value = "/commodity/getAllCommodityInfo",method = RequestMethod.GET)
    List<Goods> getAllCommodityInfo();
}