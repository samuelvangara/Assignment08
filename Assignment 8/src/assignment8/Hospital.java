/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment8;

import java.util.Objects;

/**
 *
 * @author Foxy
 */
public class Hospital {
    
    private String hospitalName;
    private Doctor doc;
    private Address hospitalAddress;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.hospitalName);
        hash = 29 * hash + Objects.hashCode(this.doc);
        hash = 29 * hash + Objects.hashCode(this.hospitalAddress);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hospital other = (Hospital) obj;
        if (!Objects.equals(this.hospitalName, other.hospitalName)) {
            return false;
        }
        if (!Objects.equals(this.doc, other.doc)) {
            return false;
        }
        if (!Objects.equals(this.hospitalAddress, other.hospitalAddress)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Hospital{" + "hospitalName=" + hospitalName + ", doc=" + doc + ", hospitalAddress=" + hospitalAddress + '}';
    }
    
 

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Doctor getDoc() {
        return doc;
    }

    public void setDoc(Doctor doc) {
        this.doc = doc;
    }

    public Address getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(Address hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }
}
