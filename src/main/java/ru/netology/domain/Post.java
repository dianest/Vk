package ru.netology.domain;

public class Post {
    private String shortBody;
    private String longBody;
    private String nameOfThePost;
    private String authorName;
    private String urlAuthorLogo;
    private String geoCoordinates;
    private String geoNameOfThePlace;
    private String wherePostPublished;

    private int authorId;
    private int id;
    private int date;
    private int time;
    private int commentsCount;
    private int repostCount;
    private int viewsCount;
    private int likesCount;
    private int mediaInThePostCount;
    private int attachmentsInThePOstCount;

    private boolean isRepostOfThePost;
    private boolean isClosedPost;
    private boolean isPined;
    private boolean isCommentsClosed;
    private boolean canRepost;
    private boolean canPin;
    private boolean isRepostByMe;
    private boolean isLikedByMe;

    private Like[] likes;
    private Comment[] comments;
    private String[] urlMediaInThePost;
    private String[] attachmentInThePost;
}

