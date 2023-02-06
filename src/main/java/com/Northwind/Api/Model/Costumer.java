package com.Northwind.Api.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "costumers")
public class Costumer {

    @Id @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private String customer_id;
    @Column
    private String company_name;
    @Column
    private String contact_name;
    @Column
    private String contact_title;
    @Column
    private String address;
    @Column 
    private String city;
    @Column 
    private String region;
    @Column
    private String postal_code;
    @Column
    private String country;
    @Column
    private String phone;
    @Column
    private String fax;


    
    public Costumer() {
    }
    
    public Costumer(String customer_id, String company_name, String contact_name, String contact_title, String address,
            String city, String region, String postal_code, String country, String phone, String fax) {
        this.customer_id = customer_id;
        this.company_name = company_name;
        this.contact_name = contact_name;
        this.contact_title = contact_title;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postal_code = postal_code;
        this.country = country;
        this.phone = phone;
        this.fax = fax;
    }
    public String getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }
    public String getCompany_name() {
        return company_name;
    }
    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }
    public String getContact_name() {
        return contact_name;
    }
    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }
    public String getContact_title() {
        return contact_title;
    }
    public void setContact_title(String contact_title) {
        this.contact_title = contact_title;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public String getPostal_code() {
        return postal_code;
    }
    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getFax() {
        return fax;
    }
    public void setFax(String fax) {
        this.fax = fax;
    }

    @Override
    public String toString() {
        return "Costumer [customer_id=" + customer_id + ", company_name=" + company_name + ", contact_name="
                + contact_name + ", contact_title=" + contact_title + ", address=" + address + ", city=" + city
                + ", region=" + region + ", postal_code=" + postal_code + ", country=" + country + ", phone=" + phone
                + ", fax=" + fax + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((customer_id == null) ? 0 : customer_id.hashCode());
        result = prime * result + ((company_name == null) ? 0 : company_name.hashCode());
        result = prime * result + ((contact_name == null) ? 0 : contact_name.hashCode());
        result = prime * result + ((contact_title == null) ? 0 : contact_title.hashCode());
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((city == null) ? 0 : city.hashCode());
        result = prime * result + ((region == null) ? 0 : region.hashCode());
        result = prime * result + ((postal_code == null) ? 0 : postal_code.hashCode());
        result = prime * result + ((country == null) ? 0 : country.hashCode());
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        result = prime * result + ((fax == null) ? 0 : fax.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Costumer other = (Costumer) obj;
        if (customer_id == null) {
            if (other.customer_id != null)
                return false;
        } else if (!customer_id.equals(other.customer_id))
            return false;
        if (company_name == null) {
            if (other.company_name != null)
                return false;
        } else if (!company_name.equals(other.company_name))
            return false;
        if (contact_name == null) {
            if (other.contact_name != null)
                return false;
        } else if (!contact_name.equals(other.contact_name))
            return false;
        if (contact_title == null) {
            if (other.contact_title != null)
                return false;
        } else if (!contact_title.equals(other.contact_title))
            return false;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (city == null) {
            if (other.city != null)
                return false;
        } else if (!city.equals(other.city))
            return false;
        if (region == null) {
            if (other.region != null)
                return false;
        } else if (!region.equals(other.region))
            return false;
        if (postal_code == null) {
            if (other.postal_code != null)
                return false;
        } else if (!postal_code.equals(other.postal_code))
            return false;
        if (country == null) {
            if (other.country != null)
                return false;
        } else if (!country.equals(other.country))
            return false;
        if (phone == null) {
            if (other.phone != null)
                return false;
        } else if (!phone.equals(other.phone))
            return false;
        if (fax == null) {
            if (other.fax != null)
                return false;
        } else if (!fax.equals(other.fax))
            return false;
        return true;
    }

   

}
