package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Address {
    private int streetNo;
    private String street;
    private String city;
    private String province;
    private String postalCode;
    private String country;

    /**
     * Checks if postal code is valid
     *
     * @param postalCode the postalCode
     * @return if postal code is valid true, if postal code not valid false
     */
    public static boolean isPostalCodeValid(String postalCode) {
        if (postalCode.length() == 6 || postalCode.length() == 7) {
            return true;
        } else {
            return false;
        }
    }


    public Address(int streetNo, String street, String city, String province, String postalCode, String country) {
        this.streetNo = streetNo;
        this.street = street;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
        this.country = country;
    }
}
