package org.odata4j.examples.producer.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Products")
public class Products implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ProductID")
    private Integer ProductID;
    @Basic(optional = false)
    @Column(name = "ProductName")
    private String ProductName;
    @Column(name = "QuantityPerUnit")
    private String QuantityPerUnit;
    @Column(name = "UnitPrice")
    private BigDecimal UnitPrice;
    @Column(name = "UnitsInStock")
    private Short UnitsInStock;
    @Column(name = "UnitsOnOrder")
    private Short UnitsOnOrder;
    @Column(name = "ReorderLevel")
    private Short ReorderLevel;
    @Basic(optional = false)
    @Column(name = "Discontinued")
    private short Discontinued;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Product")
    private Collection<Order_Details> OrderDetails;
    @JoinColumn(name = "SupplierID", referencedColumnName = "SupplierID")
    @ManyToOne
    private Suppliers SupplierID;
    @JoinColumn(name = "CategoryID", referencedColumnName = "CategoryID")
    @ManyToOne
    private Categories CategoryID;

    public Products() {
    }

    public Products(Integer productID) {
        this.ProductID = productID;
    }

    public Products(Integer productID, String productName, short discontinued) {
        this.ProductID = productID;
        this.ProductName = productName;
        this.Discontinued = discontinued;
    }

    public Integer getProductID() {
        return ProductID;
    }

    public void setProductID(Integer productID) {
        this.ProductID = productID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        this.ProductName = productName;
    }

    public String getQuantityPerUnit() {
        return QuantityPerUnit;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        this.QuantityPerUnit = quantityPerUnit;
    }

    public BigDecimal getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.UnitPrice = unitPrice;
    }

    public Short getUnitsInStock() {
        return UnitsInStock;
    }

    public void setUnitsInStock(Short unitsInStock) {
        this.UnitsInStock = unitsInStock;
    }

    public Short getUnitsOnOrder() {
        return UnitsOnOrder;
    }

    public void setUnitsOnOrder(Short unitsOnOrder) {
        this.UnitsOnOrder = unitsOnOrder;
    }

    public Short getReorderLevel() {
        return ReorderLevel;
    }

    public void setReorderLevel(Short reorderLevel) {
        this.ReorderLevel = reorderLevel;
    }

    public short getDiscontinued() {
        return Discontinued;
    }

    public void setDiscontinued(short discontinued) {
        this.Discontinued = discontinued;
    }

    public Collection<Order_Details> getOrderDetailsCollection() {
        return OrderDetails;
    }

    public void setOrderDetailsCollection(Collection<Order_Details> orderDetailsCollection) {
        this.OrderDetails = orderDetailsCollection;
    }

    public Suppliers getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(Suppliers supplierID) {
        this.SupplierID = supplierID;
    }

    public Categories getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(Categories categoryID) {
        this.CategoryID = categoryID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ProductID != null ? ProductID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Products)) {
            return false;
        }
        Products other = (Products) object;
        if ((this.ProductID == null && other.ProductID != null) || (this.ProductID != null && !this.ProductID.equals(other.ProductID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.odata4j.examples.producer.model.Products[productID=" + ProductID + "]";
    }

}
