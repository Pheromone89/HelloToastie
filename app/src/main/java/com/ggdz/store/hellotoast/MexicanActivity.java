package com.ggdz.store.hellotoast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MexicanActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mexican);

        TextView headerView = (TextView) findViewById(R.id.mexican_header);
        TextView contentView = (TextView) findViewById(R.id.mexican_content);

        Intent i = getIntent();
        String header =  i.getStringExtra(MainActivity.ARTICLE_HEADER);
        String content = i.getStringExtra(MainActivity.ARTICLE_CONTENT);

        headerView.setText(header);
        contentView.setText(content);
    }
}
