package com.lemsicode.fakestagram;

public class Post {
    private final int imageId;
    private final int userImageId;
    private final String caption;
    private final String location;
    private final String username;
    private final String datePosted;
    private boolean liked;

    public Post(int imageId, String datePosted, String caption, String location, boolean liked, String username, int userImageId) {
        this.imageId = imageId;
        this.datePosted = datePosted;
        this.caption = caption;
        this.location = location;
        this.liked = liked;
        this.username = username;
        this.userImageId = userImageId;
    }

    public int getImageId() {
        return imageId;
    }

    public String getDatePosted() {
        return datePosted;
    }

    public String getCaption() {
        return caption;
    }

    public int getUserImageId() {
        return userImageId;
    }

    public String getUsername() {
        return username;
    }

    public String getLocation() {
        return location;
    }

    public boolean getLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }
}
