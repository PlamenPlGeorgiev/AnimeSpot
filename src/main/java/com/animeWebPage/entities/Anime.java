package com.animeWebPage.entities;

import com.animeWebPage.entities.enums.AnimeType;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "animes")
public class Anime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "main_title")
    private String mainTitle;

    @Column(name = "official_title")
    private String officialTitle;

    @Column(name = "number_of_episodes")
    private int numberOfEpisodes;

    @Column(name = "release_date")
    private Date releaseDate;

    @Column(name = "finished_date")
    private Date finishedDate;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(name = "image_URL")
    private String imageURL;

    @Enumerated(EnumType.STRING)
    private AnimeType animeType;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "animes_tags",
            joinColumns = @JoinColumn(name = "anime_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id"))
    private Set<Tag> tags;

    @OneToMany(mappedBy = "anime")
    private Set<Item> items;

    public Anime() {
        this.setTags(new HashSet<>());
        this.setItems(new HashSet<>());
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(int numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMainTitle() {
        return mainTitle;
    }

    public void setMainTitle(String mainTitle) {
        this.mainTitle = mainTitle;
    }

    public String getOfficialTitle() {
        return officialTitle;
    }

    public void setOfficialTitle(String officialTitle) {
        this.officialTitle = officialTitle;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Date getFinishedDate() {
        return finishedDate;
    }

    public void setFinishedDate(Date finishedDate) {
        this.finishedDate = finishedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public AnimeType getAnimeType() {
        return animeType;
    }

    public void setAnimeType(AnimeType animeType) {
        this.animeType = animeType;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }


}
