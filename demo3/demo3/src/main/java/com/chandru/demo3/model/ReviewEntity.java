package com.chandru.demo3.model;


import javax.persistence.*;

@Entity
@Table(name = "Review_Entity")
public class ReviewEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long reviewId;

    private String createdDate;

    private String modifiedDate;

    private Integer score;

    private Integer seriesId;

    private Integer userId;

    public ReviewEntity() {

    }

    public ReviewEntity(Long reviewId, String createdDate, String modifiedDate, Integer score, Integer seriesId, Integer userId) {
        this.reviewId = reviewId;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.score = score;
        this.seriesId = seriesId;
        this.userId = userId;
    }

    public Long getReviewId() {
        return reviewId;
    }

//    public void setReviewId(Long reviewId) {
//        this.reviewId = reviewId;
//    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "ReviewEntity{" +
                "reviewId=" + reviewId +
                ", createdDate='" + createdDate + '\'' +
                ", modifiedDate='" + modifiedDate + '\'' +
                ", score=" + score +
                ", seriesId=" + seriesId +
                ", userId=" + userId +
                '}';
    }
}
