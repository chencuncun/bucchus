/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author chencuncun
 */
@Entity
@Table(name = "shop")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Shop.findAll", query = "SELECT s FROM Shop s"),
    @NamedQuery(name = "Shop.findByShopId", query = "SELECT s FROM Shop s WHERE s.shopId = :shopId"),
    @NamedQuery(name = "Shop.findByShopName", query = "SELECT s FROM Shop s WHERE s.shopName = :shopName"),
    @NamedQuery(name = "Shop.findByShopPrefecture", query = "SELECT s FROM Shop s WHERE s.shopPrefecture = :shopPrefecture"),
    @NamedQuery(name = "Shop.findByShopCity", query = "SELECT s FROM Shop s WHERE s.shopCity = :shopCity"),
    @NamedQuery(name = "Shop.findByBuildingName", query = "SELECT s FROM Shop s WHERE s.buildingName = :buildingName"),
    @NamedQuery(name = "Shop.findByNearestStation", query = "SELECT s FROM Shop s WHERE s.nearestStation = :nearestStation"),
    @NamedQuery(name = "Shop.findByShopPhoneNumber", query = "SELECT s FROM Shop s WHERE s.shopPhoneNumber = :shopPhoneNumber"),
    @NamedQuery(name = "Shop.findByShopUrl", query = "SELECT s FROM Shop s WHERE s.shopUrl = :shopUrl"),
    @NamedQuery(name = "Shop.findByCommandCount", query = "SELECT s FROM Shop s WHERE s.commandCount = :commandCount")})
public class Shop implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "shop_id")
    private Integer shopId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "shop_name")
    private String shopName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "shop_prefecture")
    private String shopPrefecture;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "shop_city")
    private String shopCity;
    @Size(max = 50)
    @Column(name = "building_name")
    private String buildingName;
    @Size(max = 50)
    @Column(name = "nearest_station")
    private String nearestStation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "shop_phone_number")
    private String shopPhoneNumber;
    @Column(name = "shop_url")
    private Serializable shopUrl;
    @Column(name = "command_count")
    private Integer commandCount;

    public Shop() {
    }

    public Shop(Integer shopId) {
        this.shopId = shopId;
    }

    public Shop(Integer shopId, String shopName, String shopPrefecture, String shopCity, String shopPhoneNumber) {
        this.shopId = shopId;
        this.shopName = shopName;
        this.shopPrefecture = shopPrefecture;
        this.shopCity = shopCity;
        this.shopPhoneNumber = shopPhoneNumber;
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

    public String getShopPrefecture() {
        return shopPrefecture;
    }

    public void setShopPrefecture(String shopPrefecture) {
        this.shopPrefecture = shopPrefecture;
    }

    public String getShopCity() {
        return shopCity;
    }

    public void setShopCity(String shopCity) {
        this.shopCity = shopCity;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getNearestStation() {
        return nearestStation;
    }

    public void setNearestStation(String nearestStation) {
        this.nearestStation = nearestStation;
    }

    public String getShopPhoneNumber() {
        return shopPhoneNumber;
    }

    public void setShopPhoneNumber(String shopPhoneNumber) {
        this.shopPhoneNumber = shopPhoneNumber;
    }

    public Serializable getShopUrl() {
        return shopUrl;
    }

    public void setShopUrl(Serializable shopUrl) {
        this.shopUrl = shopUrl;
    }

    public Integer getCommandCount() {
        return commandCount;
    }

    public void setCommandCount(Integer commandCount) {
        this.commandCount = commandCount;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shopId != null ? shopId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Shop)) {
            return false;
        }
        Shop other = (Shop) object;
        if ((this.shopId == null && other.shopId != null) || (this.shopId != null && !this.shopId.equals(other.shopId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "shop.entity.Shop[ shopId=" + shopId + " ]";
    }
    
}
