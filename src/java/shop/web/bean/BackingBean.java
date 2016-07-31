/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop.web.bean;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import shop.entity.Shop;

/**
 *
 * @author chencuncun
 */
@Named
@SessionScoped
public class BackingBean implements Serializable{
   private Shop shop = new Shop();
   private List shopList;

    public List getShopList() {
        return shopList;
    }

    public void setShopList(List shopList) {
        this.shopList = shopList;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
//　新店舗登録
    public String register(){
        return null;
    }
//  店舗変更
    public String update(){
        return null;
    }        
//  店舗削除
    public String delete(){
        return null;
    }
//  店舗一覧
    public String show(){
        return null;
    }
}
