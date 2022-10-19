package com.example.Demo2.model;

public class Series {
    private String year;

    private String name;

    private String availability;

    private String category;

    public Series() {

    }

    public Series(String year, String name, String availability, String category) {
        this.year = year;
        this.name = name;
        this.availability = availability;
        this.category = category;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "ClassPojo [year = " + year + ", name = " + name + ", availability = " + availability + ", category = " + category + "]";
    }

}
