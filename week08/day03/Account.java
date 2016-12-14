import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Zoltán on 2016.12.14..
 */
@DatabaseTable(tableName = "Accounts")
public class Account {

    @DatabaseField (id = true)
    private String name;
    @DatabaseField
    private String password;
    @DatabaseField(foreign = true)
    private Address address;


    public Account(){

    }

    public Account(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Account(String name, String password, Address address) {
        this.name = name;
        this.password = password;
        this.address = address;
    }

    public void addAddress(int addressID){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", address=" + address.toString() +
                '}';
    }
}
