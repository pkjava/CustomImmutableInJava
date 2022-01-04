package com.philips.immutable;

public final class Employee {

    private final String name;
    private final int ids;
    private final Address address;

    public Employee(String name, int ids,Address address) {
        super();
        this.name = name;
        this.ids = ids;
        Address adclone = new Address();
        adclone.setAddressDetails(address.getAddressDetails());
        adclone.setPincode(address.getPincode());
        adclone.setStreetNo(address.getStreetNo());
        this.address = adclone;
    }

    public String getName() {
        return name;
    }

    public int getIds() {
        return ids;
    }

    public Address getAddress() {
        Address adclone = new Address();
        adclone.setAddressDetails(this.address.getAddressDetails());
        adclone.setPincode(this.address.getPincode());
        adclone.setStreetNo(address.getStreetNo());
        return adclone;
    }
    



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ids;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
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
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (ids != other.ids)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", ids=" + ids + ", address=" + address + "]";
    }  
    
    public void testm(int m) {
        int i =10;
        System.out.println(i);
    }
}
