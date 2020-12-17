package com.example.evaluation.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.evaluation.Constants;
import com.example.evaluation.R;

public class HomeActivity extends AppCompatActivity {
    ListView listTables;
    String[] tablesNumber ={Constants.TABLES_FENETRES,Constants.TABLES_MUR,Constants.TABLES_TERRASSE};
    int[] tablesImage = {R.drawable.tables_window,R.drawable.tables_wall,R.drawable.tables_terrasse};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        listTables =findViewById(R.id.list_tables);
        TableAdapter tableAdapter = new TableAdapter(this,tablesNumber,tablesImage);
        listTables.setAdapter(tableAdapter);
        listTables.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View view, int position, long id) {
                if (position == 0){
                    Intent intentWindow = new Intent(listView.getContext(), DetailsWindow.class);
                    startActivity(intentWindow);
                }
else if (position == 1 ) {
                    Intent intentTerrasse = new Intent(listView.getContext(), DetailsTerrasse.class);
                    startActivity(intentTerrasse);
                }
else {
                    Intent intentWall = new Intent(listView.getContext(), DetailsWalll.class);
                    startActivity(intentWall);
                }

            }
        });

    }
}