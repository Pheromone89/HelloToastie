package com.ggdz.store.hellotoast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String ARTICLE_HEADER = "com.ggdz.store.hellotoast.extra.HEADER";
    public static final String ARTICLE_CONTENT = "com.ggdz.store.hellotoast.extra.CONTENT";
    Button unoButton;
    Button dosButton;
    Button tresButton;
    Button shoppingCartButton;
    Button intentButton;
    Button simpleCalcButton;
    private int count = 0;
    private TextView countView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toastButton = (Button) findViewById(R.id.toast_button);
        Button countButton = (Button) findViewById(R.id.count_button);
        Button moveButton = (Button) findViewById(R.id.move_button);
        Button chatButton = (Button) findViewById(R.id.chat);
        countView = (TextView) findViewById(R.id.text_view);
        unoButton = (Button) findViewById(R.id.uno_button);
        dosButton = (Button) findViewById(R.id.dos_button);
        tresButton = (Button) findViewById(R.id.tres_button);
        shoppingCartButton = (Button) findViewById(R.id.shopping_cart_button);
        intentButton = (Button) findViewById(R.id.intent_button);
        simpleCalcButton = (Button) findViewById(R.id.calc_button);

        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toa = Toast.makeText(MainActivity.this, ""+count, Toast.LENGTH_SHORT);
                toa.show();
            }
        });

        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count ++;
                showCount(count);
            }
        });

        moveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ArticleActivity.class);
                i.putExtra("STRING_NAME", ""+count);
                startActivity(i);
            }
        });

        chatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, JokoActivity.class);
                startActivity(i);
            }
        });

        unoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MexicanActivity.class);
                i.putExtra(ARTICLE_HEADER, getResources().getString(R.string.batman_header));
                i.putExtra(ARTICLE_CONTENT, getResources().getString(R.string.batman_content));
                startActivity(i);
            }
        });
        dosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MexicanActivity.class);
                i.putExtra(ARTICLE_HEADER, getResources().getString(R.string.superman_header));
                i.putExtra(ARTICLE_CONTENT, getResources().getString(R.string.superman_content));
                startActivity(i);
            }
        });
        tresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MexicanActivity.class);
                i.putExtra(ARTICLE_HEADER, getResources().getString(R.string.ww_header));
                i.putExtra(ARTICLE_CONTENT, getResources().getString(R.string.ww_content));
                startActivity(i);
            }
        });
        shoppingCartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MexicanShopperActivity.class);
                startActivity(i);
            }
        });
        intentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, IntentActivity.class);
                startActivity(i);
            }
        });
        simpleCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SimpleCalcActivity.class);
                startActivity(i);
            }
        });
    }
    private void showCount(int name){
        countView.setText(""+name);
    }
}
