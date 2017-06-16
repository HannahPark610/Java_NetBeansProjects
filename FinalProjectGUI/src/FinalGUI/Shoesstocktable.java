/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalGUI;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author hyunyoungpark
 */
@Entity
@Table(name = "SHOESSTOCKTABLE", catalog = "", schema = "HANNAH")
@NamedQueries({
    @NamedQuery(name = "Shoesstocktable.findAll", query = "SELECT s FROM Shoesstocktable s")
    , @NamedQuery(name = "Shoesstocktable.findByTypeofshoes", query = "SELECT s FROM Shoesstocktable s WHERE s.typeofshoes = :typeofshoes")
    , @NamedQuery(name = "Shoesstocktable.findByColor", query = "SELECT s FROM Shoesstocktable s WHERE s.color = :color")
    , @NamedQuery(name = "Shoesstocktable.findBySize", query = "SELECT s FROM Shoesstocktable s WHERE s.size = :size")
    , @NamedQuery(name = "Shoesstocktable.findByStock", query = "SELECT s FROM Shoesstocktable s WHERE s.stock = :stock")
    , @NamedQuery(name = "Shoesstocktable.findByShoeid", query = "SELECT s FROM Shoesstocktable s WHERE s.shoeid = :shoeid")})
public class Shoesstocktable implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "TYPEOFSHOES")
    private String typeofshoes;
    @Basic(optional = false)
    @Column(name = "COLOR")
    private String color;
    @Basic(optional = false)
    @Column(name = "SIZE")
    private double size;
    @Basic(optional = false)
    @Column(name = "STOCK")
    private int stock;
    @Id
    @Basic(optional = false)
    @Column(name = "SHOEID")
    private Integer shoeid;

    public Shoesstocktable() {
    }

    public Shoesstocktable(Integer shoeid) {
        this.shoeid = shoeid;
    }

    public Shoesstocktable(Integer shoeid, String typeofshoes, String color, double size, int stock) {
        this.shoeid = shoeid;
        this.typeofshoes = typeofshoes;
        this.color = color;
        this.size = size;
        this.stock = stock;
    }

    public String getTypeofshoes() {
        return typeofshoes;
    }

    public void setTypeofshoes(String typeofshoes) {
        String oldTypeofshoes = this.typeofshoes;
        this.typeofshoes = typeofshoes;
        changeSupport.firePropertyChange("typeofshoes", oldTypeofshoes, typeofshoes);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String oldColor = this.color;
        this.color = color;
        changeSupport.firePropertyChange("color", oldColor, color);
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        double oldSize = this.size;
        this.size = size;
        changeSupport.firePropertyChange("size", oldSize, size);
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        int oldStock = this.stock;
        this.stock = stock;
        changeSupport.firePropertyChange("stock", oldStock, stock);
    }

    public Integer getShoeid() {
        return shoeid;
    }

    public void setShoeid(Integer shoeid) {
        Integer oldShoeid = this.shoeid;
        this.shoeid = shoeid;
        changeSupport.firePropertyChange("shoeid", oldShoeid, shoeid);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shoeid != null ? shoeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Shoesstocktable)) {
            return false;
        }
        Shoesstocktable other = (Shoesstocktable) object;
        if ((this.shoeid == null && other.shoeid != null) || (this.shoeid != null && !this.shoeid.equals(other.shoeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FinalGUI.Shoesstocktable[ shoeid=" + shoeid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
