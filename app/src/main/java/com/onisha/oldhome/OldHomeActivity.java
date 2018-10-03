package com.onisha.oldhome;

import android.app.ProgressDialog;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class OldHomeActivity extends AppCompatActivity {
    private List<OldHome> oldHomeList = new ArrayList<>();
    private RecyclerView recyclerView;
    private OldHomeAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_old_home);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new OldHomeAdapter(oldHomeList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(mAdapter);

        prepareOldHomeData();
    }

    private void getOldhomeData(){
        final ProgressDialog loading = ProgressDialog.show(this, "Fetching Data", "Please wait...", false, false);
        OldHomeService oldHomeService = ApiUtils.createService(OldHomeService.class);
        Call<OldHome> call = oldHomeService.getOldhome();
        call.enqueue(new Callback<OldHome>() {
            @Override
            public void onResponse(Call<OldHome> call, Response<OldHome> response) {

            }

            @Override
            public void onFailure(Call<OldHome> call, Throwable t) {

            }
        });
    }

    private void prepareOldHomeData() {
        OldHome oldHome = new OldHome("Home1", "Dhaka", 2015);
        oldHomeList.add(oldHome);

        oldHome = new OldHome("Home2", "Khulna", 200);
        oldHomeList.add(oldHome);

        oldHome = new OldHome("Home3", "Bogra", 210);
        oldHomeList.add(oldHome);

        oldHome = new OldHome("Home4", "Khushtia", 300);
        oldHomeList.add(oldHome);

        oldHome = new OldHome("Home5", "Chittagong", 320);
        oldHomeList.add(oldHome);

        oldHome = new OldHome("Home6", "Mymensing", 330);
        oldHomeList.add(oldHome);

        oldHome = new OldHome("Home7", "Jamalpur", 2009);
        oldHomeList.add(oldHome);

        oldHome = new OldHome("Home8", "Tarakandi", 550);
        oldHomeList.add(oldHome);

        oldHome = new OldHome("Home9", "Haluaghat", 303);
        oldHomeList.add(oldHome);

        oldHome = new OldHome("Home10", "CoxsBazar", 345);
        oldHomeList.add(oldHome);

        oldHome = new OldHome("Home11", "Chittagong", 320);
        oldHomeList.add(oldHome);

        oldHome = new OldHome("Home12", "Mymensing", 330);
        oldHomeList.add(oldHome);

        oldHome = new OldHome("Home13", "Jamalpur", 2009);
        oldHomeList.add(oldHome);

        oldHome = new OldHome("Home14", "Tarakandi", 550);
        oldHomeList.add(oldHome);

        oldHome = new OldHome("Home15", "Haluaghat", 303);
        oldHomeList.add(oldHome);

        oldHome = new OldHome("Home2", "Khulna", 200);
        oldHomeList.add(oldHome);

        oldHome = new OldHome("Home3", "Bogra", 210);
        oldHomeList.add(oldHome);

        oldHome = new OldHome("Home4", "Khushtia", 300);
        oldHomeList.add(oldHome);

        oldHome = new OldHome("Home5", "Chittagong", 320);
        oldHomeList.add(oldHome);

        oldHome = new OldHome("Home6", "Mymensing", 330);
        oldHomeList.add(oldHome);

        oldHome = new OldHome("Home7", "Jamalpur", 2009);
        oldHomeList.add(oldHome);

        oldHome = new OldHome("Home8", "Tarakandi", 550);
        oldHomeList.add(oldHome);

        oldHome = new OldHome("Home9", "Haluaghat", 303);
        oldHomeList.add(oldHome);

        oldHome = new OldHome("Home10", "CoxsBazar", 345);
        oldHomeList.add(oldHome);

        oldHome = new OldHome("Home11", "Chittagong", 320);
        oldHomeList.add(oldHome);

        oldHome = new OldHome("Home12", "Mymensing", 330);
        oldHomeList.add(oldHome);

        oldHome = new OldHome("Home13", "Jamalpur", 2009);
        oldHomeList.add(oldHome);

        oldHome = new OldHome("Home14", "Tarakandi", 550);
        oldHomeList.add(oldHome);

        oldHome = new OldHome("Home15", "Haluaghat", 303);
        oldHomeList.add(oldHome);


        mAdapter.notifyDataSetChanged();
    }
}