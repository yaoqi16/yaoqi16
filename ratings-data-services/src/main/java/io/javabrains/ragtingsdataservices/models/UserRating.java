package io.javabrains.ragtingsdataservices.models;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="UserRating")
public class UserRating {
    @Id
    private String Id;
    @ElementCollection
    private List<Rating> userRatings = new ArrayList<Rating>();

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public UserRating(){}

    public List<Rating> getUserRating() {
        return userRatings;
    }

    public void setUserRating(List<Rating> userRating) {
        this.userRatings = userRating;
    }

}
