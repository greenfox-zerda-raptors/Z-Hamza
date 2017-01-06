package com.greenfox.Modules;

import javax.persistence.*;

/**
 * Created by Zoltán on 2016.12.24..
 */

@Entity
@Table(name = "meals")
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String occasion;
    private String description;
    private int calories;

    public Meal() {

    }

    public Meal(int id, String occasion, String description, int calories){
        this.id=id;
        this.occasion=occasion;
        this.description=description;
        this.calories = calories;
    }

    public String createStringQuery(){
        return occasion + " " + description + " " +calories;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOccasion() {
        return occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
