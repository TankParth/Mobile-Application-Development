package com.appstone.news21.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NewsModel {

    @SerializedName("status")
    String status;

    @SerializedName("articles")
    List<Articles> articles;

    public class Articles{

        @SerializedName("author")
        String author;

        @SerializedName("title")
        String title;

        @SerializedName("url")
        String url;

        @SerializedName("urlToImage")
        String urlToImage;

        @SerializedName("publishedAt")
        String date;

        @SerializedName("content")
        String content;

        public String getAuthor() {
            return author;
        }

        public Articles(String author, String title, String url, String urlToImage, String date, String content){
            this.author = author;
            this.title = title;
            this.url = url;
            this.urlToImage = urlToImage;
            this.date = date;
            this.content = content;
        }

        public String getTitle() {
            return title;
        }

        public String getUrl() {
            return url;
        }

        public String getUrlToImage() {
            return urlToImage;
        }

        public String getDate() {
            return date;
        }

        public String getContent() {
            return content;
        }
    }

    public NewsModel(String status, List<Articles> articles){
        this.status = status;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public List<Articles> getArticles() {
        return articles;
    }
}
