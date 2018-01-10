package com.ggdz.store.hellotoast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MexicanShopperActivity extends AppCompatActivity {

    public static final String CURRENT_SLOT = "com.ggdz.store.hellotoast.extra.CURRENTSLOT";
    Button pickerMenuButton;
    TextView picked1;
    TextView picked2;
    TextView picked3;
    TextView picked4;
    TextView picked5;
    TextView picked6;
    TextView picked7;
    TextView picked8;
    TextView picked9;
    TextView picked10;
    String currentSlotString;
    int currentSlot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mexican_shopper);

        Intent i = getIntent();

        pickerMenuButton = (Button) findViewById(R.id.pickerButton);
        picked1 = (TextView) findViewById(R.id.cart_1);
        picked2 = (TextView) findViewById(R.id.cart_2);
        picked3 = (TextView) findViewById(R.id.cart_3);
        picked4 = (TextView) findViewById(R.id.cart_4);
        picked5 = (TextView) findViewById(R.id.cart_5);
        picked6 = (TextView) findViewById(R.id.cart_6);
        picked7 = (TextView) findViewById(R.id.cart_7);
        picked8 = (TextView) findViewById(R.id.cart_8);
        picked9 = (TextView) findViewById(R.id.cart_9);
        picked10 = (TextView) findViewById(R.id.cart_10);

        if (currentSlotString == null) {
            currentSlotString = "0";
        } else {
            currentSlotString = i.getStringExtra(PickerActivity.CURRENT_PICKED);
        }

        currentSlot = Integer.parseInt("" + currentSlotString);


        switch (currentSlot) {
            case 1:
                picked1.setText(i.getStringExtra(PickerActivity.PICKED));
                currentSlot++;
                break;
            case 2:
                picked2.setText(i.getStringExtra(PickerActivity.PICKED));
                currentSlot++;
                break;
            case 3:
                picked3.setText(i.getStringExtra(PickerActivity.PICKED));
                currentSlot++;
                break;
            case 4:
                picked4.setText(i.getStringExtra(PickerActivity.PICKED));
                currentSlot++;
                break;
            case 5:
                picked5.setText(i.getStringExtra(PickerActivity.PICKED));
                currentSlot++;
                break;
            case 6:
                picked6.setText(i.getStringExtra(PickerActivity.PICKED));
                currentSlot++;
                break;
            case 7:
                picked7.setText(i.getStringExtra(PickerActivity.PICKED));
                currentSlot++;
                break;
            case 8:
                picked8.setText(i.getStringExtra(PickerActivity.PICKED));
                currentSlot++;
                break;
            case 9:
                picked9.setText(i.getStringExtra(PickerActivity.PICKED));
                currentSlot++;
                break;
            case 10:
                picked10.setText(i.getStringExtra(PickerActivity.PICKED));
                currentSlot++;
                break;
        }

        pickerMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MexicanShopperActivity.this, PickerActivity.class);
                i.putExtra(CURRENT_SLOT, "" + currentSlot);
                startActivity(i);
            }
        });


    }
}
