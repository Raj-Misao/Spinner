package com.rajgmail.r_spinner;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.app.Activity;


public class MainActivity extends Activity implements OnItemSelectedListener {
    String values[]={"Select One","January", "July", "June", "Ravi", "Ravinder", "Abhishek", "Abhinav", "Harkishore", "Hardev"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner lv=(Spinner)findViewById(R.id.spinner1);
        ArrayAdapter<?> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, values);
//you can left the below one line because it is merging two layout
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        lv.setAdapter(adapter);
        lv.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> a, View v, int pos,long id)
    {

        Toast.makeText(getApplicationContext(),a.getItemAtPosition(pos)+"Selected", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }
}