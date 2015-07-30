/**
 * File generated by Magnet rest2mobile 1.1 - Jul 30, 2015 2:10:20 PM
 * @see {@link http://developer.magnet.com}
 */

package com.ashokslsk.movielist.model.beans;

import java.util.List;

/**
 * Generated from json example
{
  "title" : "DawnofthePlanetoftheApes",
  "image" : "http://api.androidhive.info/json/movies/1.jpg",
  "rating" : 8.3,
  "releaseYear" : 2014,
  "genre" : [ "Action", "Drama", "Sci-Fi" ]
}

 */

public class MoviesResult {

  
  private List<java.lang.String> genre;

  
  private String image;

  
  private Double rating;

  
  private Integer releaseYear;

  
  private String title;

  public List<java.lang.String> getGenre() {
    return genre;
  }
  public String getImage() {
    return image;
  }
  public Double getRating() {
    return rating;
  }
  public Integer getReleaseYear() {
    return releaseYear;
  }
  public String getTitle() {
    return title;
  }

  /**
  * Builder for MoviesResult
  **/
  public static class MoviesResultBuilder {
    private MoviesResult toBuild = new MoviesResult();

    public MoviesResultBuilder() {
    }

    public MoviesResult build() {
      return toBuild;
    }

    public MoviesResultBuilder genre(List<java.lang.String> value) {
      toBuild.genre = value;
      return this;
    }
    public MoviesResultBuilder image(String value) {
      toBuild.image = value;
      return this;
    }
    public MoviesResultBuilder rating(Double value) {
      toBuild.rating = value;
      return this;
    }
    public MoviesResultBuilder releaseYear(Integer value) {
      toBuild.releaseYear = value;
      return this;
    }
    public MoviesResultBuilder title(String value) {
      toBuild.title = value;
      return this;
    }
  }
}
