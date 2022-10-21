package com.chandru.demo3.model;


import javax.persistence.*;

@Entity
@Table(name = "Review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long reviewId;


    @Column(name = "score")
    private String score;

    @Column(name = "createdDate")
    private String createdDate;


    @Column(name = "createdBy")
    private String createdBy;

    @Column(name = "modifiedDated")
    private String modifiedDate;

    @Column(name = "seriesId")
    private String seriesId;


    public long getReviewId() {
        return reviewId;
    }

    public void setReviewId(long reviewId) {
        this.reviewId = reviewId;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(String seriesId) {
        this.seriesId = seriesId;
    }

    @Override
    public String toString() {
        return "Review{" +
                "reviewId=" + reviewId +
                ", score='" + score + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", modifiedDate='" + modifiedDate + '\'' +
                ", seriesId='" + seriesId + '\'' +
                '}';
    }
}


