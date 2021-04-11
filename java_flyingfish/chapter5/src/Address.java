public class Address {
    String city;
    String street;
    String zipcode;
    public Address(){}
    public Address(String city, String street, String zipcode){
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
    public boolean equals(Object a){
        if (a== null || !(a instanceof Address)) return false;
        if (this == a)return true;
        Address dizhi = (Address)a;
        if (this.city.equals(dizhi.city) && this.zipcode.equals(dizhi.zipcode) && this.street.equals(dizhi.street))
            return true;
        return false;
    }
}
