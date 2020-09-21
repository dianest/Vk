package ru.netology.domain;

public class Post {
    private String shortBody;
    private String longBody;
    private String nameOfThePost;
    private String authorName;
    private String urlAuthorLogo;
    private String copyright;
    private String type;//post_type
    private String geoCoordinates;
    private String geoTypeOfThePlace;
    private String wherePostPublished;

    private int authorId; //from_id
    private int id;
    private int ownerId;
    private int adminId; // created_by
    private int date;
    private int time;
    private int replyOwnerId;
    private int replyPostId;
    private int commentsCount;
    private int repostCount;
    private int viewsCount;
    private int likesCount;
    private int mediaInThePostCount;
    private int attachmentsInThePOstCount;
    private int signerId;
    private int postPonedId;

    public String getShortBody() {
        return shortBody;
    }

    public void setShortBody(String shortBody) {
        this.shortBody = shortBody;
    }

    public String getLongBody() {
        return longBody;
    }

    public void setLongBody(String longBody) {
        this.longBody = longBody;
    }

    public String getNameOfThePost() {
        return nameOfThePost;
    }

    public void setNameOfThePost(String nameOfThePost) {
        this.nameOfThePost = nameOfThePost;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getUrlAuthorLogo() {
        return urlAuthorLogo;
    }

    public void setUrlAuthorLogo(String urlAuthorLogo) {
        this.urlAuthorLogo = urlAuthorLogo;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGeoCoordinates() {
        return geoCoordinates;
    }

    public void setGeoCoordinates(String geoCoordinates) {
        this.geoCoordinates = geoCoordinates;
    }

    public String getGeoTypeOfThePlace() {
        return geoTypeOfThePlace;
    }

    public void setGeoTypeOfThePlace(String geoTypeOfThePlace) {
        this.geoTypeOfThePlace = geoTypeOfThePlace;
    }

    public String getWherePostPublished() {
        return wherePostPublished;
    }

    public void setWherePostPublished(String wherePostPublished) {
        this.wherePostPublished = wherePostPublished;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(int commentsCount) {
        this.commentsCount = commentsCount;
    }

    public int getRepostCount() {
        return repostCount;
    }

    public void setRepostCount(int repostCount) {
        this.repostCount = repostCount;
    }

    public int getViewsCount() {
        return viewsCount;
    }

    public void setViewsCount(int viewsCount) {
        this.viewsCount = viewsCount;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public int getMediaInThePostCount() {
        return mediaInThePostCount;
    }

    public void setMediaInThePostCount(int mediaInThePostCount) {
        this.mediaInThePostCount = mediaInThePostCount;
    }

    public int getAttachmentsInThePOstCount() {
        return attachmentsInThePOstCount;
    }

    public void setAttachmentsInThePOstCount(int attachmentsInThePOstCount) {
        this.attachmentsInThePOstCount = attachmentsInThePOstCount;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public int getPostPonedId() {
        return postPonedId;
    }

    public void setPostPonedId(int postPonedId) {
        this.postPonedId = postPonedId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public boolean isRepostOfThePost() {
        return isRepostOfThePost;
    }

    public void setRepostOfThePost(boolean repostOfThePost) {
        isRepostOfThePost = repostOfThePost;
    }

    public boolean isClosedPost() {
        return isClosedPost;
    }

    public void setClosedPost(boolean closedPost) {
        isClosedPost = closedPost;
    }

    public boolean isPined() {
        return isPined;
    }

    public void setPined(boolean pined) {
        isPined = pined;
    }

    public boolean isCommentsClosed() {
        return isCommentsClosed;
    }

    public void setCommentsClosed(boolean commentsClosed) {
        isCommentsClosed = commentsClosed;
    }

    public boolean isCanRepost() {
        return canRepost;
    }

    public void setCanRepost(boolean canRepost) {
        this.canRepost = canRepost;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isRepostByCurrentUser() {
        return isRepostByCurrentUser;
    }

    public void setRepostByCurrentUser(boolean repostByCurrentUser) {
        isRepostByCurrentUser = repostByCurrentUser;
    }

    public boolean isLikedByCurrentUser() {
        return isLikedByCurrentUser;
    }

    public void setLikedByCurrentUser(boolean likedByCurrentUser) {
        isLikedByCurrentUser = likedByCurrentUser;
    }

    public boolean isCanBeDeletedByCurrentUser() {
        return canBeDeletedByCurrentUser;
    }

    public void setCanBeDeletedByCurrentUser(boolean canBeDeletedByCurrentUser) {
        this.canBeDeletedByCurrentUser = canBeDeletedByCurrentUser;
    }

    public boolean isCanBeEditedByCurrentUser() {
        return canBeEditedByCurrentUser;
    }

    public void setCanBeEditedByCurrentUser(boolean canBeEditedByCurrentUser) {
        this.canBeEditedByCurrentUser = canBeEditedByCurrentUser;
    }

    public boolean isAds() {
        return isAds;
    }

    public void setAds(boolean ads) {
        isAds = ads;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public GeoPlace[] getGeoPlaces() {
        return geoPlaces;
    }

    public void setGeoPlaces(GeoPlace[] geoPlaces) {
        this.geoPlaces = geoPlaces;
    }

    public SourceOfThePost[] getSourceOfThePosts() {
        return sourceOfThePosts;
    }

    public void setSourceOfThePosts(SourceOfThePost[] sourceOfThePosts) {
        this.sourceOfThePosts = sourceOfThePosts;
    }

    public Like[] getLikes() {
        return likes;
    }

    public void setLikes(Like[] likes) {
        this.likes = likes;
    }

    public Comment[] getComments() {
        return comments;
    }

    public void setComments(Comment[] comments) {
        this.comments = comments;
    }

    public String[] getUrlMediaInThePost() {
        return urlMediaInThePost;
    }

    public void setUrlMediaInThePost(String[] urlMediaInThePost) {
        this.urlMediaInThePost = urlMediaInThePost;
    }

    public String[] getAttachmentInThePost() {
        return attachmentInThePost;
    }

    public void setAttachmentInThePost(String[] attachmentInThePost) {
        this.attachmentInThePost = attachmentInThePost;
    }

    private int friendsOnly;

    private boolean isRepostOfThePost;
    private boolean isClosedPost;
    private boolean isPined;
    private boolean isCommentsClosed;
    private boolean canRepost;
    private boolean canPin;
    private boolean isRepostByCurrentUser;
    private boolean isLikedByCurrentUser;
    private boolean canBeDeletedByCurrentUser;
    private boolean canBeEditedByCurrentUser;
    private boolean isAds;
    private boolean isFavorite;

    private GeoPlace[] geoPlaces;
    private SourceOfThePost[] sourceOfThePosts;
    private Like[] likes;
    private Comment[] comments;
    private String[] urlMediaInThePost;
    private String[] attachmentInThePost;
}

