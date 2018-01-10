package com.ggdz.store.hellotoast;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class JokoActivity extends AppCompatActivity {

    public static final String JOKO_MESSAGE = "com.ggdz.store.hellotoast.extra.JOKOMESSAGE";
    public static final String BODO_MESSAGE = "com.ggdz.store.hellotoast.extra.BODOMESSAGE";
    String messageToSend;
    EditText editMessage;
    TextView jokoMessageView;
    TextView bodoMessageView;
    Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joko);

        editMessage = (EditText) findViewById(R.id.edit_message);
        sendButton = (Button) findViewById(R.id.send_button);
        jokoMessageView = (TextView) findViewById(R.id.joko_message);
        bodoMessageView = (TextView) findViewById(R.id.bodo_message);

        Intent intent = getIntent();
        jokoMessageView.setText(intent.getStringExtra(BodoActivity.JOKO_MESSAGE1));
        bodoMessageView.setText(intent.getStringExtra(BodoActivity.BODO_MESSAGE1));

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(JokoActivity.this, BodoActivity.class);
                messageToSend = editMessage.getText().toString();
                i.putExtra(JOKO_MESSAGE, "Joko said: "+messageToSend);
                i.putExtra(BODO_MESSAGE, "");
                startActivity(i);
            }
        });


    }
}
