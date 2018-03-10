package com.example.lenovo.basketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increase_by_three_A(View view)
    {
        TextView quantityTextView = (TextView) findViewById(R.id.scoreA);
        int val  = Integer.parseInt(String.valueOf(quantityTextView.getText()));
        quantityTextView.setText("" + (val+3));
    }

    public void increase_by_two_A(View view)
    {
        TextView quantityTextView = (TextView) findViewById(R.id.scoreA);
        int val  = Integer.parseInt(String.valueOf(quantityTextView.getText()));
        quantityTextView.setText("" + (val+2));
    }

    public void increase_by_free_throw_A(View view)
    {
        TextView quantityTextView = (TextView) findViewById(R.id.scoreA);
        int val  = Integer.parseInt(String.valueOf(quantityTextView.getText()));
        quantityTextView.setText("" + (val+1));
    }
    public void increase_by_three_B(View view)
    {
        TextView quantityTextView = (TextView) findViewById(R.id.scoreB);
        int val  = Integer.parseInt(String.valueOf(quantityTextView.getText()));
        quantityTextView.setText("" + (val+3));
    }

    public void increase_by_two_B(View view)
    {
        TextView quantityTextView = (TextView) findViewById(R.id.scoreB);
        int val  = Integer.parseInt(String.valueOf(quantityTextView.getText()));
        quantityTextView.setText("" + (val+2));
    }

    public void increase_by_free_throw_B(View view)
    {
        TextView quantityTextView = (TextView) findViewById(R.id.scoreB);
        int val  = Integer.parseInt(String.valueOf(quantityTextView.getText()));
        quantityTextView.setText("" + (val+1));
    }

    public void reset(View view)
    {
        TextView quantityTextViewA = (TextView) findViewById(R.id.scoreB);
        TextView quantityTextViewB = (TextView) findViewById(R.id.scoreA);
        quantityTextViewA.setText(""+0);
        quantityTextViewB.setText(""+0);
    }
}
