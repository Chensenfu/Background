package com.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


public class Shopping {
    private Integer shopId;
    private String shopName;
    private Double price;
    private Integer typeId;
    private Integer imgId;
    @JsonFormat(pattern="yyyy-MM-dd HH-mm-ss",timezone = "GMT+8")//后台到前台时间格式转换
    @DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")//前台到后台时间格式转换
    private Date creatdate;
    private Img img;
    private ShoppingTyp shoppingTyp;

    public Img getImg() {
        return img;
    }

    public void setImg(Img img) {
        this.img = img;
    }

    public ShoppingTyp getShoppingTyp() {
        return shoppingTyp;
    }

    public void setShoppingTyp(ShoppingTyp shoppingTyp) {
        this.shoppingTyp = shoppingTyp;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public Date getCreatdate() {
        return creatdate;
    }

    public void setCreatdate(Date creatdate) {
        this.creatdate = creatdate;
    }
}
