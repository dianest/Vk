package ru.netology.domain;

public class SourceOfThePost {
    private String typeSource;
    private String whereSourceFrom;
    private String urlSource;

    public String getTypeSource() {
        return typeSource;
    }

    public void setTypeSource(String typeSource) {
        this.typeSource = typeSource;
    }

    public String getWhereSourceFrom() {
        return whereSourceFrom;
    }

    public void setWhereSourceFrom(String whereSourceFrom) {
        this.whereSourceFrom = whereSourceFrom;
    }

    public String getUrlSource() {
        return urlSource;
    }

    public void setUrlSource(String urlSource) {
        this.urlSource = urlSource;
    }

    public int getDateSource() {
        return dateSource;
    }

    public void setDateSource(int dateSource) {
        this.dateSource = dateSource;
    }

    public int getTimeSource() {
        return timeSource;
    }

    public void setTimeSource(int timeSource) {
        this.timeSource = timeSource;
    }

    private int dateSource;
    private int timeSource;
}
