package com.animeWebPage.entities;


import com.animeWebPage.entities.enums.ItemType;
import org.hibernate.service.spi.InjectService;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    private ItemType itemType;

    @Basic
    private double price;

    @Column(name = "is_limited_edition")
    private boolean isLimitedEdition;

    @Column(name = "quantity_in_stock")
    private int quantityInStock;

    @Column(name = "image_URL")
    private String imageURL;

    @ManyToOne
    @JoinColumn(name="anime_id")
    private Anime anime;

    public Item() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isLimitedEdition() {
        return isLimitedEdition;
    }

    public void setLimitedEdition(boolean limitedEdition) {
        isLimitedEdition = limitedEdition;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
