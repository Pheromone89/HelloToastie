package com.ggdz.store.hellotoast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ArticleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);

        Button moveButton = (Button) findViewById(R.id.moves_button);

        moveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ArticleActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
        Bundle extra = getIntent().getExtras();
        String buttontLabel = extra.getString("STRING_NAME");
        moveButton.setText(buttontLabel);
    }

}
