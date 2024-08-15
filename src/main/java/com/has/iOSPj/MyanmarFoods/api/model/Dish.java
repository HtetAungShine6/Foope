package com.has.iOSPj.MyanmarFoods.api.model;

import javax.annotation.processing.Generated;
import java.util.UUID;

public class Dish {


    private final UUID id;
    private String dishName;
    private String dishPhoto;
    private String backgroundInformation;
    private int duration;
    private int serving;
    private int calories;
    private String ingredients;
    private String instructions;

    public Dish(String dishName, String dishPhoto, String backgroundInformation, int duration, int serving, int calories, String ingredients, String instructions) {
        this.id = UUID.randomUUID();  // Generate a unique UUID
        this.dishName = dishName;
        this.dishPhoto = dishPhoto;
        this.backgroundInformation = backgroundInformation;
        this.duration = duration;
        this.serving = serving;
        this.calories = calories;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    // Getters
    public UUID getId() {
        return id;
    }
    public String getDishName() {
        return dishName;
    }

    public String getDishPhoto() {
        return dishPhoto;
    }

    public String getBackgroundInformation() {
        return backgroundInformation;
    }

    public int getDuration() {
        return duration;
    }

    public int getServing() {
        return serving;
    }
    public int getCalories() {
        return calories;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    // Setters
    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public void setDishPhoto(String dishPhoto) {
        this.dishPhoto = dishPhoto;
    }

    public void setBackgroundInformation(String backgroundInformation) {
        this.backgroundInformation = backgroundInformation;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setServing(int serving) {
        this.serving = serving;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}
