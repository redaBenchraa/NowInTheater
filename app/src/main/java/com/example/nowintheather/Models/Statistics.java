package com.example.nowintheather.Models;

import java.io.Serializable;

public class Statistics  implements Serializable {
    private String pressRating;

    private String pressReviewCount;

    private String userRatingCount;

    private String editorialRatingCount;

    private String userRating;

    private String userReviewCount;

    public String getPressRating ()
    {
        return pressRating;
    }

    public void setPressRating (String pressRating)
    {
        this.pressRating = pressRating;
    }

    public String getPressReviewCount ()
    {
        return pressReviewCount;
    }

    public void setPressReviewCount (String pressReviewCount)
    {
        this.pressReviewCount = pressReviewCount;
    }

    public String getUserRatingCount ()
    {
        return userRatingCount;
    }

    public void setUserRatingCount (String userRatingCount)
    {
        this.userRatingCount = userRatingCount;
    }

    public String getEditorialRatingCount ()
    {
        return editorialRatingCount;
    }

    public void setEditorialRatingCount (String editorialRatingCount)
    {
        this.editorialRatingCount = editorialRatingCount;
    }

    public String getUserRating ()
    {
        return userRating;
    }

    public void setUserRating (String userRating)
    {
        this.userRating = userRating;
    }

    public String getUserReviewCount ()
    {
        return userReviewCount;
    }

    public void setUserReviewCount (String userReviewCount)
    {
        this.userReviewCount = userReviewCount;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [pressRating = "+pressRating+", pressReviewCount = "+pressReviewCount+", userRatingCount = "+userRatingCount+", editorialRatingCount = "+editorialRatingCount+", userRating = "+userRating+", userReviewCount = "+userReviewCount+"]";
    }
}
