package com.example.yatishsharma.retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.yatishsharma.retrofit.model.Feed;
import com.example.yatishsharma.retrofit.model.children.Children;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private static final String Base_URL = "https://www.reddit.com/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt = (Button)findViewById(R.id.click_button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "\n\n\n\n\n\n\n\nonClick: THE app is running Here \n\n\n\n");


                Retrofit retrofit = new Retrofit.Builder()
                                        .baseUrl(Base_URL)
                                        .addConverterFactory(GsonConverterFactory.create())
                                        .build();

                RedditAPI redditAPI = retrofit.create(RedditAPI.class);
                Call<Feed> call = redditAPI.getData();

                call.enqueue(new Callback<Feed>() {
                    @Override
                    public void onResponse(Call<Feed> call, Response<Feed> response) {

                        Log.d(TAG, "onResponse: server response is "+response.toString());
                        Log.d(TAG, "onResponse: server responded with "+response.body().toString());

                        ArrayList<Children> children = response.body().getData().getChildren();
                        for(int i = 0;i<children.size();i++)
                        {
                            Log.d(TAG, "\n\n\n\n\nonResponse:  kind is  "+children.get(i).getKind() +
                                       " \n Domain is  "+children.get(i).getData().getDomain()+
                                        "\n  subreddit is  "+children.get(i).getData().getSubreddit()+
                                        "\n id is "+children.get(i).getData().getId());
                        }

                    }

                    @Override
                    public void onFailure(Call<Feed> call, Throwable t) {

                        Log.e(TAG, "onFailure: This has failed like u did " + t.getMessage());

                        Toast.makeText(MainActivity.this, "Here it failed ", Toast.LENGTH_SHORT).show();

                    }
                });

            }
        });
    }
}
