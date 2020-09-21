package ru.netology.domain;

public class Like {
    private String likeAuthorName;
    private String urlLikeAuthorLogo;

    public String getLikeAuthorName() {
        return likeAuthorName;
    }

    public void setLikeAuthorName(String likeAuthorName) {
        this.likeAuthorName = likeAuthorName;
    }

    public String getUrlLikeAuthorLogo() {
        return urlLikeAuthorLogo;
    }

    public void setUrlLikeAuthorLogo(String urlLikeAuthorLogo) {
        this.urlLikeAuthorLogo = urlLikeAuthorLogo;
    }

    public boolean isCanBeLikedByCurrentUser() {
        return canBeLikedByCurrentUser;
    }

    public void setCanBeLikedByCurrentUser(boolean canBeLikedByCurrentUser) {
        this.canBeLikedByCurrentUser = canBeLikedByCurrentUser;
    }

    public boolean isLikedByCurrentUser() {
        return isLikedByCurrentUser;
    }

    public void setLikedByCurrentUser(boolean likedByCurrentUser) {
        isLikedByCurrentUser = likedByCurrentUser;
    }

    public boolean isCanBePublishedByCurrentUser() {
        return canBePublishedByCurrentUser;
    }

    public void setCanBePublishedByCurrentUser(boolean canBePublishedByCurrentUser) {
        this.canBePublishedByCurrentUser = canBePublishedByCurrentUser;
    }

    private boolean canBeLikedByCurrentUser;
    private boolean isLikedByCurrentUser;
    private boolean canBePublishedByCurrentUser;

}
