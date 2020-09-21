package ru.netology.domain;

public class Comment {
        private String body;
        private String authorName;
        private String urlMediaInTheComment;

        private int date;
        private int time;
        private int authorId;

        private boolean canCommentTheComment;
        private boolean isLikedComment;
        private boolean canBePostedByCurrentUser;
        private boolean canOpenedByCurrentUser;
        private boolean canClosedByCurrentUser;

        public String getBody() {
                return body;
        }

        public void setBody(String body) {
                this.body = body;
        }

        public String getAuthorName() {
                return authorName;
        }

        public void setAuthorName(String authorName) {
                this.authorName = authorName;
        }

        public String getUrlMediaInTheComment() {
                return urlMediaInTheComment;
        }

        public void setUrlMediaInTheComment(String urlMediaInTheComment) {
                this.urlMediaInTheComment = urlMediaInTheComment;
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

        public int getAuthorId() {
                return authorId;
        }

        public void setAuthorId(int authorId) {
                this.authorId = authorId;
        }

        public boolean isCanCommentTheComment() {
                return canCommentTheComment;
        }

        public void setCanCommentTheComment(boolean canCommentTheComment) {
                this.canCommentTheComment = canCommentTheComment;
        }

        public boolean isLikedComment() {
                return isLikedComment;
        }

        public void setLikedComment(boolean likedComment) {
                isLikedComment = likedComment;
        }

        public boolean isCanBePostedByCurrentUser() {
                return canBePostedByCurrentUser;
        }

        public void setCanBePostedByCurrentUser(boolean canBePostedByCurrentUser) {
                this.canBePostedByCurrentUser = canBePostedByCurrentUser;
        }

        public boolean isCanOpenedByCurrentUser() {
                return canOpenedByCurrentUser;
        }

        public void setCanOpenedByCurrentUser(boolean canOpenedByCurrentUser) {
                this.canOpenedByCurrentUser = canOpenedByCurrentUser;
        }

        public boolean isCanClosedByCurrentUser() {
                return canClosedByCurrentUser;
        }

        public void setCanClosedByCurrentUser(boolean canClosedByCurrentUser) {
                this.canClosedByCurrentUser = canClosedByCurrentUser;
        }

        public boolean isCanPostByGroup() {
                return canPostByGroup;
        }

        public void setCanPostByGroup(boolean canPostByGroup) {
                this.canPostByGroup = canPostByGroup;
        }

        private boolean canPostByGroup;


    }

