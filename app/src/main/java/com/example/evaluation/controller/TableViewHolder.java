package com.example.evaluation.controller;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.evaluation.R;

public class TableViewHolder {

ImageView imgTable ;
TextView nbrTable;
TableViewHolder (View v){
imgTable= v.findViewById(R.id.table_nbr);
nbrTable= v.findViewById(R.id.tables_number);


}



}
