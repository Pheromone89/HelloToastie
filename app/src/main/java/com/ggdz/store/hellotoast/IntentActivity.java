package com.ggdz.store.hellotoast;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class IntentActivity extends AppCompatActivity {

    EditText webInput;
    EditText textInput;
    EditText locInput;
    Button webButton;
    Button textButton;
    Button locButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        webInput = (EditText) findViewById(R.id.web_input);
        textInput = (EditText) findViewById(R.id.text_input);
        locInput = (EditText) findViewById(R.id.loc_input);
        webButton = (Button) findViewById(R.id.web_button);
        textButton = (Button) findViewById(R.id.text_button);
        locButton = (Button) findViewById(R.id.loc_button);

        webInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webInput.setText("");
            }
        });
        textInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textInput.setText("");
            }
        });
        locInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                locInput.setText("");
            }
        });
        webButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = webInput.getText().toString();
                Uri webpage = Uri.parse(url);
                Intent i = new Intent(Intent.ACTION_VIEW, webpage);
                if (i.resolveActivity(getPackageManager()) != null) {
                    startActivity(i);
                } else {
                    Toast.makeText(IntentActivity.this, "No app", Toast.LENGTH_SHORT).show();
                }
            }
        });
        locButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String locString = locInput.getText().toString();
                Uri addresUri = Uri.parse("geo:0,0?q=" + locString);
                Intent i = new Intent(Intent.ACTION_VIEW, addresUri);
                if (i.resolveActivity(getPackageManager()) != null) {
                    startActivity(i);
                } else {
                    Toast.makeText(IntentActivity.this, "No loc app", Toast.LENGTH_SHORT).show();
                }
            }
        });
        textButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt = textInput.getText().toString();
                String mimeType = "text/plain";
                ShareCompat.IntentBuilder
                        .from(IntentActivity.this)
                        .setType(mimeType)
                        .setChooserTitle("Bagikeun sareng:  ")
                        .setText(txt)
                        .startChooser();
            }
        });
    }
}
