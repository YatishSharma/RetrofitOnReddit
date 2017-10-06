package com.example.yatishsharma.retrofit.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.example.yatishsharma.retrofit.model.children.Children;
import java.util.ArrayList;

/**
 * Created by yatishsharma on 06/10/17.
 */

public class Data {

    @SerializedName("modhash")
    @Expose
    private String modhash;

    @SerializedName("whitelist_status")
    @Expose
    private String whitelist_status;

    @SerializedName("children")
    @Expose
    private ArrayList<Children> children;

    public String getModhash() {
        return modhash;
    }

    public void setModhash(String modhash) {
        this.modhash = modhash;
    }

    public String getWhitelist_status() {
        return whitelist_status;
    }

    public void setWhitelist_status(String whitelist_status) {
        this.whitelist_status = whitelist_status;
    }

    public ArrayList<Children> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Children> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Data{" +
                "modhash='" + modhash + '\'' +
                ", whitelist_status='" + whitelist_status + '\'' +
                ", children=" + children +
                '}';
    }
}
