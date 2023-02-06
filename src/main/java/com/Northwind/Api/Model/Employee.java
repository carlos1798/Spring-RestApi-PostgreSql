package com.Northwind.Api.Model;

import java.util.Arrays;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;

@Entity(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employee_id;

    @Column
    private String last_name;
    @Column
    private String first_name;
    @Column
    private String title;
    @Column
    private String title_of_court;
    @Column
    private Date birth_date;
    @Column
    private Date hire_date;
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
    private String home_phone;
    @Column
    private String extension;
    @Lob
    @Column
    private byte[] photo;
    @Column
    private String notes;
    @Column
    private String photo_path;
    @ManyToOne
    @JoinColumn(name = "reports_to")
    private Employee manager;



    
    public Employee() {
    }

    public Employee(int employee_id, String last_name, String first_name, String title, String title_of_court,
            Date birth_date, Date hire_date, String address, String city, String region, String postal_code,
            String country, String home_phone, String extension, byte[] photo, String notes, String photo_path,
            Employee manager) {
        this.employee_id = employee_id;
        this.last_name = last_name;
        this.first_name = first_name;
        this.title = title;
        this.title_of_court = title_of_court;
        this.birth_date = birth_date;
        this.hire_date = hire_date;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postal_code = postal_code;
        this.country = country;
        this.home_phone = home_phone;
        this.extension = extension;
        this.photo = photo;
        this.notes = notes;
        this.photo_path = photo_path;
        this.manager = manager;
    }
    public int getEmployee_id() {
        return employee_id;
    }
    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle_of_court() {
        return title_of_court;
    }
    public void setTitle_of_court(String title_of_court) {
        this.title_of_court = title_of_court;
    }
    public Date getBirth_date() {
        return birth_date;
    }
    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }
    public Date getHire_date() {
        return hire_date;
    }
    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
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
    public String getHome_phone() {
        return home_phone;
    }
    public void setHome_phone(String home_phone) {
        this.home_phone = home_phone;
    }
    public String getExtension() {
        return extension;
    }
    public void setExtension(String extension) {
        this.extension = extension;
    }
    public byte[] getPhoto() {
        return photo;
    }
    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }
    public String getPhoto_path() {
        return photo_path;
    }
    public void setPhoto_path(String photo_path) {
        this.photo_path = photo_path;
    }
    public Employee getManager() {
        return manager;
    }
    public void setManager(Employee manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Employee [employee_id=" + employee_id + ", last_name=" + last_name + ", first_name=" + first_name
                + ", title=" + title + ", title_of_court=" + title_of_court + ", birth_date=" + birth_date
                + ", hire_date=" + hire_date + ", address=" + address + ", city=" + city + ", region=" + region
                + ", postal_code=" + postal_code + ", country=" + country + ", home_phone=" + home_phone
                + ", extension=" + extension + ", photo=" + Arrays.toString(photo) + ", notes=" + notes
                + ", photo_path=" + photo_path + ", manager=" + manager + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + employee_id;
        result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
        result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((title_of_court == null) ? 0 : title_of_court.hashCode());
        result = prime * result + ((birth_date == null) ? 0 : birth_date.hashCode());
        result = prime * result + ((hire_date == null) ? 0 : hire_date.hashCode());
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((city == null) ? 0 : city.hashCode());
        result = prime * result + ((region == null) ? 0 : region.hashCode());
        result = prime * result + ((postal_code == null) ? 0 : postal_code.hashCode());
        result = prime * result + ((country == null) ? 0 : country.hashCode());
        result = prime * result + ((home_phone == null) ? 0 : home_phone.hashCode());
        result = prime * result + ((extension == null) ? 0 : extension.hashCode());
        result = prime * result + Arrays.hashCode(photo);
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
        result = prime * result + ((photo_path == null) ? 0 : photo_path.hashCode());
        result = prime * result + ((manager == null) ? 0 : manager.hashCode());
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
        Employee other = (Employee) obj;
        if (employee_id != other.employee_id)
            return false;
        if (last_name == null) {
            if (other.last_name != null)
                return false;
        } else if (!last_name.equals(other.last_name))
            return false;
        if (first_name == null) {
            if (other.first_name != null)
                return false;
        } else if (!first_name.equals(other.first_name))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (title_of_court == null) {
            if (other.title_of_court != null)
                return false;
        } else if (!title_of_court.equals(other.title_of_court))
            return false;
        if (birth_date == null) {
            if (other.birth_date != null)
                return false;
        } else if (!birth_date.equals(other.birth_date))
            return false;
        if (hire_date == null) {
            if (other.hire_date != null)
                return false;
        } else if (!hire_date.equals(other.hire_date))
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
        if (home_phone == null) {
            if (other.home_phone != null)
                return false;
        } else if (!home_phone.equals(other.home_phone))
            return false;
        if (extension == null) {
            if (other.extension != null)
                return false;
        } else if (!extension.equals(other.extension))
            return false;
        if (!Arrays.equals(photo, other.photo))
            return false;
        if (notes == null) {
            if (other.notes != null)
                return false;
        } else if (!notes.equals(other.notes))
            return false;
        if (photo_path == null) {
            if (other.photo_path != null)
                return false;
        } else if (!photo_path.equals(other.photo_path))
            return false;
        if (manager == null) {
            if (other.manager != null)
                return false;
        } else if (!manager.equals(other.manager))
            return false;
        return true;
    }


    
}
