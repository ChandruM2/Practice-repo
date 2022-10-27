package com.chandru.demo4.model;

public class ReviewBody  {

    private String createdDate;

    private String modifiedDate;

    private String createdBy;

    private Integer score;

    private Long seriesId;

    public ReviewBody() {

    }

    public ReviewBody(String createdDate, String modifiedDate, String createdBy, Integer score, Long seriesId) {
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

    public Long getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Long seriesId) {
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