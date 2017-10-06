package com.example.yatishsharma.retrofit.model.children;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by yatishsharma on 06/10/17.
 */

public class Data {

    @SerializedName("domain")
    @Expose
    private String domain;

    @SerializedName("subreddit")
    @Expose
    private String subreddit;

    @SerializedName("id")
    @Expose
    private String id;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getSubreddit() {
        return subreddit;
    }

    public void setSubreddit(String subreddit) {
        this.subreddit = subreddit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Data{" +
                "domain='" + domain + '\'' +
                ", subreddit='" + subreddit + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
