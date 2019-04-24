package com.example.takehomeassignment08_seank;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Project> project;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("DIY IS SO EASY");

        initialData();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ProjectAdapter(project,this));
    }

    private void initialData(){
        project = new ArrayList<>();
        project.add(new Project(R.string.phone_stand,R.string.level_intermediate,R.string.time_short, R.string.tool_phone_stand, R.drawable.phonestand, false));
        project.add(new Project(R.string.key_hanger,R.string.level_beginner, R.string.time_very_short,R.string.tool_key_hanger, R.drawable.keyhanger, false));
        project.add(new Project(R.string.cat_bed,R.string.level_advanced,R.string.time_long, R.string.tool_cat_bed,R.drawable.catbed, false));
        project.add(new Project(R.string.tool_hanger,R.string.level_intermediate, R.string.time_short, R.string.tool_tool_hanger,R.drawable.toolhanger, false));
        project.add(new Project(R.string.wire_organizer,R.string.level_beginner, R.string.time_very_short,R.string.tool_wire_organizer, R.drawable.wireorganizer, false));
    }


}