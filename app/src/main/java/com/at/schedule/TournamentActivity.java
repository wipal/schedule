package com.at.schedule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.at.schedule.com.at.schedule.adapter.ItemMatchAdapter;

public class TournamentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tournament);

        RecyclerView recycler_view = findViewById(R.id.tournament_recycler_view);

        String[] list = {"","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
        ItemMatchAdapter adapter = new  ItemMatchAdapter(list);
        recycler_view.setAdapter(adapter);
        recycler_view.setLayoutManager(new LinearLayoutManager(this));

    }
}
