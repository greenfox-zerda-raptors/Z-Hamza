package com.greenfox.Controllers;

import com.greenfox.Modules.Meal;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;


/**
 * Created by Zoltán on 2016.12.29..
 */
@Component
public class DataHandler {

    private Connection connection;
    private Properties propertiesSQL;
    private Statement statementSQL;

    public DataHandler() throws SQLException{
        propertiesSQL = new Properties();
        propertiesSQL.setProperty("user", "root");
        propertiesSQL.setProperty("password", "******");
        propertiesSQL.setProperty("useSSL", "false");
        propertiesSQL.setProperty("autoReconnect", "true");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/calorieapp", propertiesSQL);
        statementSQL = connection.createStatement();
    }

    @Bean
    public DataHandler SQLHandlerBean() throws SQLException{
        return new DataHandler();
    }

    public ArrayList<Meal> returnMeals() throws SQLException {

        ArrayList<Meal> mealList = new ArrayList<>();
        String querySQL = "SELECT * FROM MEALS ORDER BY id ASC";
        ResultSet rowFromSQLData = statementSQL.executeQuery(querySQL);
        while (rowFromSQLData.next()) {
            mealList.add(new Meal(rowFromSQLData.getInt("id"),  rowFromSQLData.getString("occasion"), rowFromSQLData.getString("description"), rowFromSQLData.getInt("calories")));
        }
        return mealList;
    }

    public void addMeal() throws SQLException {
        int primarykey = getNextViableId();
        String querySQL = "INSERT INTO meals VALUES (" +primarykey+", 255, 'risotto', 'elefant' )";
        statementSQL.executeUpdate(querySQL);
    }

    public void deleteMeal(int id) throws SQLException {
        String querySQL = "DELETE FROM MEALS WHERE ID = "+ id;
        statementSQL.executeUpdate(querySQL);

    }

    public int calculateTotalCalories() throws SQLException {
        String querySQL = "SELECT SUM(CALORIES) FROM MEALS";
        ResultSet caloriesSum = statementSQL.executeQuery(querySQL);
        caloriesSum.next();
        return caloriesSum.getInt(1);
    }

    private int getNextViableId() throws SQLException {
        ArrayList<Meal> MealList =  returnMeals();
        int[] idStorage = new int[MealList.size()];
        for(int i = 0; i < MealList.size(); i++){
            idStorage[i] = MealList.get(i).getId();
        }
        int j = 0;
        int k = 1;
        while(idStorage[j] == k){
            j++;
            k++;
            if(idStorage.length <= j){

                break;
            }
        }
        return k;
    }
}