package com.controller;

import com.entity.Img;
import com.entity.Shopping;
import com.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@RequestMapping("shopping")
@Controller
@ResponseBody
public class ShoppingController {
    @Autowired
    private ShoppingService shoppingService;
    @RequestMapping("queryAll")
    public List<Shopping> queryAll(@RequestParam("shopName") String shopName){
        return  shoppingService.queryAll(shopName);
    }

    @RequestMapping("add")
    public Boolean add(Shopping shopping){
        return shoppingService.add(shopping);
    }
    @RequestMapping("addtupian")
    public Boolean addtupian(Img img){
        return shoppingService.addtupian(img);
    }
    @RequestMapping("queryId")
    public Shopping queryshopId(Integer shopId){
        return shoppingService.queryshopId(shopId);
    }
    @RequestMapping("update")
    public Boolean updateshop(Shopping shopping){
        return shoppingService.updateshop(shopping);
    }
    @RequestMapping("del")
    public  Boolean del(Integer shopId){
        return shoppingService.del(shopId);
    }
    @RequestMapping("shopName")
    public List<Shopping> queryshopName(String shopName){return shoppingService.queryshopName(shopName);}
}
