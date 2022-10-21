package com.chandru.demo3.model;
import javax.persistence.*;

@Entity
@Table(name = "SeriesInfo")
public class SeriesInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long seriesId;


    @Column(name="`year`")
    private String year;
    @Column(name="`category`")
    private String category;
    @Column(name="`availability`")
    private String availability;

    public long getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(long seriesId) {
        this.seriesId = seriesId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "SeriesInfo{" +
                "seriesId=" + seriesId +
                ", year='" + year + '\'' +
                ", category='" + category + '\'' +
                ", availability='" + availability + '\'' +
                '}';
    }
}
