/**
 * Created by Zoltán on 2016.12.14..
 */
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

public class Workshop03 {
    public static void main(String[] args) throws SQLException {
        String databaseUrl = "jdbc:mysql://127.0.0.1:3306/workshop03?user=root&password=admin1&serverTimezone=UTC&useSSL=false";

        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);

        TableUtils.createTableIfNotExists(connectionSource, Address.class);
        TableUtils.createTableIfNotExists(connectionSource, Account.class);

        Dao<Account, String> accountDao = DaoManager.createDao(connectionSource, Account.class);
        Dao<Address,String > addressDao = DaoManager.createDao(connectionSource, Address.class);

        Address address0 = new Address("1", "malacka utca", "micimacko city", "WC19EN", "Szazholdas Pagony");
        createAddressIfNotExists(addressDao, address0);

        Account account0 = new Account("Captain Amerika", "6ygfce45yn33", address0);
        createAccountIfNotExists(accountDao, account0);

        Address address1 = new Address("2", "maligod", "cenarius", "SE145PP", "Malganis");
        createAddressIfNotExists(addressDao, address1);

        Account account1 = new Account("Hulk", "5t6gr4t5", address1);
        createAccountIfNotExists(accountDao, account1);

        Address address2 = new Address("3", "Sajtorta", "eleffe", "SE134PP", "Galamv");
        createAddressIfNotExists(addressDao, address2);

        Account account2 = new Account("Cpt. Marvel", "erbebet5", address2);
        createAccountIfNotExists(accountDao, account2);

        account0 = accountDao.queryForId("1");
        System.out.println("Account: " + account0.toString());
    }

    private static void createAccountIfNotExists(Dao<Account, String> accountDao, Account acc) throws SQLException {
        if(accountDao.queryForId(acc.getName()) == null) {
            accountDao.create(acc);
        }
    }
    private static void createAddressIfNotExists(Dao<Address, String> accountDao, Address acc) throws SQLException {
        if(accountDao.queryForId(acc.getAddressID()) == null) {
            accountDao.create(acc);
        }
    }
}