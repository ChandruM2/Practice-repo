package com.example.Demo2.model;

public class Review {

    private String score;

    private String createdDate;

    private String createdBy;

    private String modifiedDate;

    private String seriesId;

    public String getScore ()
    {
        return score;
    }

    public void setScore (String score)
    {
        this.score = score;
    }

    public String getCreatedDate ()
    {
        return createdDate;
    }

    public void setCreatedDate (String createdDate)
    {
        this.createdDate = createdDate;
    }

    public String getCreatedBy ()
    {
        return createdBy;
    }

    public void setCreatedBy (String createdBy)
    {
        this.createdBy = createdBy;
    }

    public String getModifiedDate ()
    {
        return modifiedDate;
    }

    public void setModifiedDate (String modifiedDate)
    {
        this.modifiedDate = modifiedDate;
    }

    public String getSeriesId ()
    {
        return seriesId;
    }

    public void setSeriesId (String seriesId)
    {
        this.seriesId = seriesId;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [score = "+score+", createdDate = "+createdDate+", createdBy = "+createdBy+", modifiedDate = "+modifiedDate+", seriesId = "+seriesId+"]";
    }
}
