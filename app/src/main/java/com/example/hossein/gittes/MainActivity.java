package com.example.hossein.gittes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  private static final String TAG = "MainActivity";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Log.i(TAG, "onCreate: ");
    Log.i(TAG, "onCreate: ");
    TextView textView = (TextView) findViewById(R.id.txt_test);
    //
  }
}
