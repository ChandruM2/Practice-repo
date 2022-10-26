package com.chandru.demo3.model;


import javax.persistence.criteria.CriteriaBuilder;

public class ReviewBody  {

    private String createdDate;

    private String modifiedDate;

    private String createdBy;

    private Integer score;

    private Integer seriesId;

    public ReviewBody() {

    }

    public ReviewBody(String createdDate, String modifiedDate, String createdBy, Integer score, Integer seriesId) {
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.createdBy = createdBy;
        this.score = score;
        this.seriesId = seriesId;
    }

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

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
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

    @Override
    public String toString() {
        return "ReviewBody{" +
                "createdDate='" + createdDate + '\'' +
                ", modifiedDate='" + modifiedDate + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", score=" + score +
                ", seriesId=" + seriesId +
                '}';
    }
}
