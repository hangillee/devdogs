package com.devdogs.devdogs.Retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface SubmitService {
    @GET("post/list")
    Call<List<Submit>> getList();

    @POST("post/submit")
    @FormUrlEncoded
    Call<Void> submit(@Field("title") String title, @Field("content") String content);
}
