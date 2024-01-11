package lesson2.task1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Address {
    private String street;
    private String suite;
    private String city;
    private int zipcode;
    private Geo geo;

    public Address(String street, String suite, String city, int zipcode, String lat,String lng) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.geo = new Geo(lat,lng);
    }
}

