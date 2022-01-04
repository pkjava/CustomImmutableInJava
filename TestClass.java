package com.philips.immutable;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TestClass {

    public static void main(String[] args) {
      
        Address ad = new Address();
        ad.setAddressDetails("colony1");
        ad.setPincode(123);
        ad.setStreetNo(1);
        Employee e = new Employee("Ram",1,ad);
        System.out.println(e);
        e.getAddress().setStreetNo(5);
        System.out.println(e);
        System.out.println(e.getAddress().getStreetNo());
        int i =20;
        e.testm(i);
       
       final Calendar calendar = Calendar.getInstance();
       calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
      calendar.setTime(new Date());
      
       System.out.println(calendar.getTime());
    }

}
//https://dzone.com/articles/how-to-create-an-immutable-class-in-java
