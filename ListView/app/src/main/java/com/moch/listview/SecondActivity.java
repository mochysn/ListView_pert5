package com.moch.listview;

import android.app.Activity;

import android.os.Bundle;
import android.widget.EditText;

public class SecondActivity extends Activity {

    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editText = (EditText)findViewById(R.id.editText1);

        // Receiving value into activity using intent.
        String TempHolder = getIntent().getStringExtra("ListViewClickedValue");

        // Setting up received value into EditText.
        editText.setText(TempHolder);

    }
}