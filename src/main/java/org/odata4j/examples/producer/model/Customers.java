package org.odata4j.examples.producer.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Customers")
public class Customers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CustomerID")
    private String CustomerID;
    @Basic(optional = false)
    @Column(name = "CompanyName")
    private String CompanyName;
    @Column(name = "ContactName")
    private String ContactName;
    @Column(name = "ContactTitle")
    private String ContactTitle;
    @Column(name = "Address")
    private String Address;
    @Column(name = "City")
    private String City;
    @Column(name = "Region")
    private String Region;
    @Column(name = "PostalCode")
    private String PostalCode;
    @Column(name = "Country")
    private String Country;
    @Column(name = "Phone")
    private String Phone;
    @Column(name = "Fax")
    private String Fax;
    @JoinColumn(name = "CustomerID", referencedColumnName = "CustomerID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Orders Order;

    public Customers() {
    }

    public Customers(String customerID) {
        this.CustomerID = customerID;
    }

    public Customers(String customerID, String companyName) {
        this.CustomerID = customerID;
        this.CompanyName = companyName;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String customerID) {
        this.CustomerID = customerID;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        this.CompanyName = companyName;
    }

    public String getContactName() {
        return ContactName;
    }

    public void setContactName(String contactName) {
        this.ContactName = contactName;
    }

    public String getContactTitle() {
        return ContactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.ContactTitle = contactTitle;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        this.City = city;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        this.Region = region;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        this.PostalCode = postalCode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        this.Country = country;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        this.Phone = phone;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        this.Fax = fax;
    }

    public Orders getOrders() {
        return Order;
    }

    public void setOrders(Orders orders) {
        this.Order = orders;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (CustomerID != null ? CustomerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customers)) {
            return false;
        }
        Customers other = (Customers) object;
        if ((this.CustomerID == null && other.CustomerID != null) || (this.CustomerID != null && !this.CustomerID.equals(other.CustomerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.odata4j.examples.producer.model.Customers[customerID=" + CustomerID + "]";
    }

}
