package com.example.yatishsharma.retrofit;

import com.example.yatishsharma.retrofit.model.Feed;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * Created by yatishsharma on 06/10/17.
 */

public interface RedditAPI {

    String BASE_URL="https://www.reddit.com/";

    @Headers("Content-Type: application/json")
    @GET(".json")
    Call<Feed> getData();

}
