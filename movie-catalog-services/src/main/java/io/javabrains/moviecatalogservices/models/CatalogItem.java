package io.javabrains.moviecatalogservices.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CatalogItem")
public class CatalogItem {
    @Id
    private String name;
    private String itemdesc;
    private int rating;

    public CatalogItem() {
    }

    public CatalogItem(String name, String desc, int rating) {
        this.name = name;
        this.itemdesc = desc;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return itemdesc;
    }

    public void setDesc(String desc) {
        this.itemdesc = desc;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
