package com.example.user.qcoftermalconductvity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity_QC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__qc);
    }

    public void measure(View view) {
        //TODO : jika ada data dari setting, maka defaultnya ganti data dari setting
        Intent measureIntent = new Intent(getApplicationContext(),MeasureActivity.class);
        measureIntent.putExtra("countMeasure","60");

        startActivity(measureIntent);
    }

    public void exit(View view) {
        super.finish();
    }
}
