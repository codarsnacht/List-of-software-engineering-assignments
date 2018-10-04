/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enterprise.web_jpa_war.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Joseph
 */
@Entity
@Table(name = "MyOnlineWatchShop")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MyOnlineWatchShop.findAll", query = "SELECT m FROM MyOnlineWatchShop m")
    , @NamedQuery(name = "MyOnlineWatchShop.findByMake", query = "SELECT m FROM MyOnlineWatchShop m WHERE m.make = :make")
    , @NamedQuery(name = "MyOnlineWatchShop.findByWeight", query = "SELECT m FROM MyOnlineWatchShop m WHERE m.weight = :weight")
    , @NamedQuery(name = "MyOnlineWatchShop.findByPrice", query = "SELECT m FROM MyOnlineWatchShop m WHERE m.price = :price")
    , @NamedQuery(name = "MyOnlineWatchShop.findByBatteryLife", query = "SELECT m FROM MyOnlineWatchShop m WHERE m.batteryLife = :batteryLife")
    , @NamedQuery(name = "MyOnlineWatchShop.findByQuantity", query = "SELECT m FROM MyOnlineWatchShop m WHERE m.quantity = :quantity")})
public class MyOnlineWatchShop implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "Make")
    private String make;
    @Size(max = 256)
    @Column(name = "Weight")
    private String weight;
    @Size(max = 256)
    @Column(name = "Price")
    private String price;
    @Size(max = 256)
    @Column(name = "BatteryLife")
    private String batteryLife;
    @Column(name = "Quantity")
    private Integer quantity;

    public MyOnlineWatchShop() {
    }

    public MyOnlineWatchShop(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(String batteryLife) {
        this.batteryLife = batteryLife;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (make != null ? make.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MyOnlineWatchShop)) {
            return false;
        }
        MyOnlineWatchShop other = (MyOnlineWatchShop) object;
        if ((this.make == null && other.make != null) || (this.make != null && !this.make.equals(other.make))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "enterprise.web_jpa_war.entity.MyOnlineWatchShop[ make=" + make + " ]";
    }
    
}
