package com.chandru.demo4.model;

import javax.persistence.*;

@Entity
@Table(name = "SERIES_INFO")
public class SeriesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long SerId;

    @Column(name = "title")
    private String name;

    @Column(name = "yor")
    private String series_year;

    @Column(name = "category")
    private String category;

    @Column(name = "availability")
    private Boolean availability;

    public SeriesEntity() {
    }

    public SeriesEntity(String title, String yor, String category, Boolean availability) {
        this.name = title;
        this.series_year = yor;
        this.category = category;
        this.availability = availability;
    }


    public Long getSerId() {
        return SerId;
    }

    public void setSerId(Long serId) {
        SerId = serId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeries_year() {
        return series_year;
    }

    public void setSeries_year(String series_year) {
        this.series_year = series_year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "SeriesEntity{" +
                "SerId=" + SerId +
                ", title='" + name + '\'' +
                ", yor='" + series_year + '\'' +
                ", category='" + category + '\'' +
                ", availability=" + availability +
                '}';
    }
}
