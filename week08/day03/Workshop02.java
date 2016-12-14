/**
 * Created by Zoltán on 2016.12.14..
 */
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;

public class Workshop02 {
    public static void main(String[] args) throws SQLException {

        String databaseUrl = "jdbc:mysql://127.0.0.1:3306/workshop02?user=root&password=admin1&serverTimezone=UTC&useSSL=false";

        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);

        TableUtils.createTableIfNotExists(connectionSource, Account.class);

        Dao<Account, String> accountDao = DaoManager.createDao(connectionSource, Account.class);

        Account account0 = new Account("Captain America", "uejnsd632**234.");
        createAccountIfNotExists(accountDao, account0);

        Account account1 = new Account("Iron Man", "ud2ce453234");
        createAccountIfNotExists(accountDao, account1);

        Account account2 = new Account("Wolverine", "yt867465hgiu");
        createAccountIfNotExists(accountDao, account2);

        Account account3 = new Account("Hulk", "980vgh5e6vb");
        createAccountIfNotExists(accountDao, account3);


        account0 = accountDao.queryForId("Captain America");
        System.out.println("Account: " + account0.toString());
    }

    private static void createAccountIfNotExists(Dao<Account, String> accountDao, Account acc) throws SQLException {
        if(accountDao.queryForId(acc.getName()) == null) {
            accountDao.create(acc);
        }
    }
}