package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    private TextView _txtDetail;
    private String detailForcast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        _txtDetail = findViewById(R.id.txtDetail);
        // TODO (2) Display the weather forecast that was passed from MainActivity
        Intent intentDetailAct = getIntent();
        if(intentDetailAct!=null)
        if(intentDetailAct.hasExtra(Intent.EXTRA_TEXT))
        {
            detailForcast = intentDetailAct.getStringExtra(Intent.EXTRA_TEXT);
            _txtDetail.setText(detailForcast);
        }
    }
}