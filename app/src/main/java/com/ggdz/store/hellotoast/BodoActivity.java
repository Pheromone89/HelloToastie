package com.ggdz.store.hellotoast;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BodoActivity extends AppCompatActivity {

    public static final String BODO_MESSAGE1 = "com.ggdz.store.hellotoast.extra.BODOMESSAGE1";
    public static final String JOKO_MESSAGE1 = "com.ggdz.store.hellotoast.extra.JOKOMESSAGE1";
    String messageToSend;
    EditText editMessage;
    TextView jokoMessageView;
    TextView bodoMessageView;
    Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodo);

        jokoMessageView = (TextView) findViewById(R.id.joko_message1);
        bodoMessageView = (TextView) findViewById(R.id.bodo_message1);
        editMessage = (EditText) findViewById(R.id.edit_message1);
        sendButton = (Button) findViewById(R.id.send_button1);

        Intent intent = getIntent();
        jokoMessageView.setText(intent.getStringExtra(JokoActivity.JOKO_MESSAGE));
        bodoMessageView.setText(intent.getStringExtra(JokoActivity.BODO_MESSAGE));

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(BodoActivity.this, JokoActivity.class);
                messageToSend = editMessage.getText().toString();
                i.putExtra(BODO_MESSAGE1, "Bodo said: "+messageToSend);
                i.putExtra(JOKO_MESSAGE1, jokoMessageView.getText().toString());
                startActivity(i);
            }
        });
    }
}
