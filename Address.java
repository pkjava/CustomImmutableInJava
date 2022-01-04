package com.philips.immutable;

public class Address {

    private String addressDetails;
    private int streetNo;
    private int  pincode;

    public String getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(String addressDetails) {
        this.addressDetails = addressDetails;
    }

    public int getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
    
    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((addressDetails == null) ? 0 : addressDetails.hashCode());
        result = prime * result + pincode;
        result = prime * result + streetNo;
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
        Address other = (Address) obj;
        if (addressDetails == null) {
            if (other.addressDetails != null)
                return false;
        } else if (!addressDetails.equals(other.addressDetails))
            return false;
        if (pincode != other.pincode)
            return false;
        if (streetNo != other.streetNo)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Address [addressDetails=" + addressDetails + ", streetNo=" + streetNo + ", pincode=" + pincode + "]";
    }

}
