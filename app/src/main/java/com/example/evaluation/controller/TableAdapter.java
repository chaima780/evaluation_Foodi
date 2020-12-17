package com.example.evaluation.controller;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.evaluation.R;

public class TableAdapter extends ArrayAdapter<String> {
Context context;
int[] imageTable;
String[] tableNumber;


    public TableAdapter(Context context, String[] tableNumber, int[] imageTable) {
        super(context, R.layout.activity_tables, R.id.tables_number, tableNumber);
        this.context=context;
        this.imageTable=imageTable;
        this.tableNumber=tableNumber;

    }
    @Override
    public View getView(int position, View convertView,ViewGroup parent) {
        View tables=convertView;
        TableViewHolder holder = null;
if (tables == null ) {
    LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    tables = layoutInflater.inflate(R.layout.activity_tables,parent,false);
    holder =new TableViewHolder(tables);
    tables.setTag(holder);
}

else {
holder = (TableViewHolder) tables.getTag();
}
holder.imgTable.setImageResource(imageTable[position]);
        holder.nbrTable.setText(tableNumber[position]);


        return tables;
    }
}
