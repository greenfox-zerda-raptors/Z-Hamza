import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Zoltán on 2016.12.14..
 */
@DatabaseTable(tableName = "Address")
public class Address {

    @DatabaseField(id = true)
    private String addID;
    @DatabaseField
    private String street;
    @DatabaseField
    private String city;
    @DatabaseField
    private String postcode;
    @DatabaseField
    private String country;

    public Address(){

    }
    public Address(String addressID, String street, String city, String postcode, String country) {
        this.addID = addressID;
        this.city = city;
        this.street = street;
        this.postcode = postcode;
        this.country = country;
    }

    public String getAddressID() {
        return addID;
    }

    public void setAddressID(String addressID) {
        this.addID = addressID;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressID=" + addID +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", postcode='" + postcode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
