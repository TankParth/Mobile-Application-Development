package com.appstone.news21;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.appstone.news21.adapter.DashAdapter;
import com.appstone.news21.model.MenuModel;

import java.util.ArrayList;

public class DashboardActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        RecyclerView mRvDashboard = findViewById(R.id.rv_dashboard);
        mRvDashboard.setHasFixedSize(true);
        mRvDashboard.setLayoutManager(new GridLayoutManager(this,2));
        ArrayList<MenuModel> menuList = new ArrayList<>();

//        MenuModel _model1 = new MenuModel();
//        _model1.setCategory("Sports");
//        _model1.setIcons(R.drawable.sports);
//
//        menuList.add(_model1);
//        menuList.add(new MenuModel());
//        menuList.add(new MenuModel());
//        menuList.add(new MenuModel());

        menuList.add(new MenuModel("Sports",R.drawable.sports));
        menuList.add(new MenuModel("Health",R.drawable.enter));
        menuList.add(new MenuModel("Entertainment",R.drawable.enter));
        menuList.add(new MenuModel("Technology",R.drawable.enter));

        DashAdapter adapter = new DashAdapter(this, menuList);
        mRvDashboard.setAdapter(adapter);
    }
}
