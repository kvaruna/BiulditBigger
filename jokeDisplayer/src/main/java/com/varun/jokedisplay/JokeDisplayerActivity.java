package  com.varun.jokedisplay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class JokeDisplayerActivity extends AppCompatActivity {
    public static final String JOKE_KEY = "joke_key";
    private static TextView mJokeTextView;
    private ImageView btnClose;
    private ImageView btnShare;
    private String joke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.varun.jokedisplay.R.layout.joke_activity);

        // FindView
        mJokeTextView = (TextView) findViewById(com.varun.jokedisplay.R.id.tv_joke);
        btnClose = (ImageView) findViewById(com.varun.jokedisplay.R.id.btn_close);
        btnShare = (ImageView) findViewById(com.varun.jokedisplay.R.id.share_joke);

        // Receive Joke and Display it
        Intent intent = getIntent();
        joke = intent.getStringExtra(JOKE_KEY);
        if (joke != null && joke.length() != 0) {
            mJokeTextView.setText(joke);
        }

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = joke;
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, text.toString());
                startActivity(intent.createChooser(intent, "Please choose an App to send it!"));
            }
        });

    }
}
