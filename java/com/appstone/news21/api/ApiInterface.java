package com.appstone.news21.api;

import com.appstone.news21.model.NewsModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("top-headlines?sources=espn-cric-info&apiKey=a492a9b514a94df191acb76a2eefa81e")
    Call<NewsModel> getSportNews();

    @GET("top-headlines?sources=hacker-news&apiKey=a492a9b514a94df191acb76a2eefa81e")
    Call<NewsModel> getTechNews();

    @GET("top-headlines?country=in&category=health&apiKey=a492a9b514a94df191acb76a2eefa81e")
    Call<NewsModel> getFinanceNews();

    @GET("top-headlines?sources=buzzfeed&apiKey=a492a9b514a94df191acb76a2eefa81e")
    Call<NewsModel> getEntertentmentNews();
}
