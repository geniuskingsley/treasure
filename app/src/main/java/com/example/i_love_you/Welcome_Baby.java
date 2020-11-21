package com.example.i_love_you;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

public class Welcome_Baby extends AppCompatActivity {

    TextView lovetext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome__baby);

        lovetext = findViewById(R.id.lovetext);

        lovetext.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        lovetext.setSelected(true);

    }
}