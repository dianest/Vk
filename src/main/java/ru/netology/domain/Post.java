package ru.netology.domain;

public class Post {
    private String shortBody;
    private String longBody;
    private String nameOfThePost;
    private String authorName;
    private String urlAuthorLogo;
    private String copyright;
    private String type;
    private String geoCoordinates;
    private String geoTypeOfThePlace;
    private String wherePostPublished;

    private int authorId;
    private int id;
    private int ownerId;
    private int adminId;
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

