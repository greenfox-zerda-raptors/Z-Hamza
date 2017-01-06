package com.greenfox.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLException;

/**
 * Created by Zoltán on 2016.12.29..
 */

@Controller
@RequestMapping(value = "/calorie")
public class CalorieController {

    public DataHandler dataHandler;


    @Autowired
    public void setDataHandler(DataHandler dataHandler){
        this.dataHandler = dataHandler;
    }

    @RequestMapping(value = "/test")
    public String mainPage(Model model) throws SQLException {

        model.addAttribute("mealList", dataHandler.returnMeals());
        model.addAttribute("caloriesSum", dataHandler.calculateTotalCalories());
        return "hello";
    }
    @RequestMapping(value = "/add")
    public String addingMeals(Model model) throws SQLException {
        dataHandler.addMeal();
        model.addAttribute("mealList", dataHandler.returnMeals());
        model.addAttribute("caloriesSum", dataHandler.calculateTotalCalories());
        return "hello";
    }
    @RequestMapping(value = "/delete")
    public String deleteMeals(@RequestParam(required = true) int id, Model model) throws SQLException {
        dataHandler.deleteMeal(id);
        model.addAttribute("mealList", dataHandler.returnMeals());
        model.addAttribute("caloriesSum", dataHandler.calculateTotalCalories());
        return "hello";
    }
}
