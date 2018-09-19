package com.example.user.qcoftermalconductvity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MeasureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_measure);

        String countMeasure = getIntent().getStringExtra("countMeasure");
        Log.d("MeasureActivity = ", countMeasure);

        TextView tvCount = findViewById(R.id.tv_Count);
        tvCount.setText(countMeasure);


    }
}
