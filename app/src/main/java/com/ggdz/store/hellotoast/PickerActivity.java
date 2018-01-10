package com.ggdz.store.hellotoast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PickerActivity extends AppCompatActivity {

    public static final String PICKED = "com.ggdz.store.hellotoast.extra.PICKEDGROCERIES";
    public static final String CURRENT_PICKED = "com.ggdz.store.hellotoast.extra.CURRENTPICKED";

    Button picker1;
    Button picker2;
    Button picker3;
    Button picker4;
    Button picker5;
    Button picker6;
    Button picker7;
    Button picker8;
    Button picker9;
    String currentPickedString;
    int currentPicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picker);

        Intent i = getIntent();

        picker1 = (Button) findViewById(R.id.buttonPicker1);
        picker2 = (Button) findViewById(R.id.buttonPicker2);
        picker3 = (Button) findViewById(R.id.buttonPicker3);
        picker4 = (Button) findViewById(R.id.buttonPicker4);
        picker5 = (Button) findViewById(R.id.buttonPicker5);
        picker6 = (Button) findViewById(R.id.buttonPicker6);
        picker7 = (Button) findViewById(R.id.buttonPicker7);
        picker8 = (Button) findViewById(R.id.buttonPicker8);
        picker9 = (Button) findViewById(R.id.buttonPicker9);
        currentPickedString = i.getStringExtra(MexicanShopperActivity.CURRENT_SLOT);
        currentPicked = Integer.parseInt("" + currentPickedString);

        picker1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PickerActivity.this, MexicanShopperActivity.class);
                Button b = (Button) view;
                String contentGrocery = b.getText().toString();
                i.putExtra(PICKED, contentGrocery);
                i.putExtra(CURRENT_PICKED, "" + currentPicked);
                startActivity(i);
            }
        });
        picker2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PickerActivity.this, MexicanShopperActivity.class);
                Button b = (Button) view;
                String contentGrocery = b.getText().toString();
                i.putExtra(PICKED, contentGrocery);
                i.putExtra(CURRENT_PICKED, "" + currentPicked);
                startActivity(i);
            }
        });
        picker3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PickerActivity.this, MexicanShopperActivity.class);
                Button b = (Button) view;
                String contentGrocery = b.getText().toString();
                i.putExtra(PICKED, contentGrocery);
                i.putExtra(CURRENT_PICKED, "" + currentPicked);
                startActivity(i);
            }
        });
        picker4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PickerActivity.this, MexicanShopperActivity.class);
                Button b = (Button) view;
                String contentGrocery = b.getText().toString();
                i.putExtra(PICKED, contentGrocery);
                i.putExtra(CURRENT_PICKED, "" + currentPicked);
                startActivity(i);
            }
        });
        picker5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PickerActivity.this, MexicanShopperActivity.class);
                Button b = (Button) view;
                String contentGrocery = b.getText().toString();
                i.putExtra(PICKED, contentGrocery);
                i.putExtra(CURRENT_PICKED, "" + currentPicked);
                startActivity(i);
            }
        });
        picker6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PickerActivity.this, MexicanShopperActivity.class);
                Button b = (Button) view;
                String contentGrocery = b.getText().toString();
                i.putExtra(PICKED, contentGrocery);
                i.putExtra(CURRENT_PICKED, "" + currentPicked);
                startActivity(i);
            }
        });
        picker7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PickerActivity.this, MexicanShopperActivity.class);
                Button b = (Button) view;
                String contentGrocery = b.getText().toString();
                i.putExtra(PICKED, contentGrocery);
                i.putExtra(CURRENT_PICKED, "" + currentPicked);
                startActivity(i);
            }
        });
        picker8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PickerActivity.this, MexicanShopperActivity.class);
                Button b = (Button) view;
                String contentGrocery = b.getText().toString();
                i.putExtra(PICKED, contentGrocery);
                i.putExtra(CURRENT_PICKED, "" + currentPicked);
                startActivity(i);
            }
        });
        picker9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PickerActivity.this, MexicanShopperActivity.class);
                Button b = (Button) view;
                String contentGrocery = b.getText().toString();
                i.putExtra(PICKED, contentGrocery);
                i.putExtra(CURRENT_PICKED, "" + currentPicked);
                startActivity(i);
            }
        });
    }
}
