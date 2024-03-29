package com.piyushmaheswari.retrofitdemo;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout relativeLayout;
    private LinearLayout linearLayout;

    private TextView ddss;
    private TextView dds;
    private Image iss;
    private TextView ddsh;
    private Image ishs;

    private TextView ds;
    private Image is;

    private TextView dxs;
    private Image isx;


    private TextView d3;
    private Image i2;

    private TextView d;
    private Image i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView=findViewById(R.id.listView);

        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api=retrofit.create(Api.class);

        Call<List<Hero>> call=api.getHeroes();

        call.enqueue(new Callback<List<Hero>>() {
            @Override
            public void onResponse(Call<List<Hero>> call, Response<List<Hero>> response) {
                List<Hero> heroes=response.body();

                String[] heroNames=new String[heroes.size()];

                for(int i=0;i<heroes.size();i++)
                {
                    heroNames[i]=heroes.get(i).getName();
                }

                listView.setAdapter(new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_list_item_1,
                        heroNames
                ));

            }

            @Override
            public void onFailure(Call<List<Hero>> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
