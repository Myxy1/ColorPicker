package com.example.miki_proba.szinkeszites;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private int red = 0;
    private int blue = 0;
    private int green = 0;
    private FrameLayout hatter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hatter = (FrameLayout)findViewById(R.id.hatter);
        seekbar();
        hatter.setBackgroundColor(Color.rgb(red, green, blue));

    }



    public void seekbar() {

        final SeekBar seek_bar = (SeekBar) findViewById(R.id.seekBar);
        final SeekBar seek_bar2 = (SeekBar) findViewById(R.id.seekBar2);
        final SeekBar seek_bar3 = (SeekBar) findViewById(R.id.seekBar3);
        final TextView text_view = (TextView) findViewById(R.id.textView);
        final TextView text_view2 = (TextView) findViewById(R.id.textView2);
        final TextView text_view3 = (TextView) findViewById(R.id.textView3);
        final FrameLayout hatter = (FrameLayout)findViewById(R.id.hatter);
        text_view.setText("Red : " + seek_bar.getProgress());
        text_view2.setText("Green : " + seek_bar2.getProgress());
        text_view3.setText("Blue : " + seek_bar3.getProgress());


        seek_bar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    int progress_value;

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                        progress_value = progress;
                        red = progress_value;
                        text_view.setText("Red : " + red);
                        hatter.setBackgroundColor(Color.rgb(red,green,blue));
                        //Toast.makeText(MainActivity.this, "SeekBar in progress", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        hatter.setBackgroundColor(Color.rgb(red,green,blue));
                        //Toast.makeText(MainActivity.this, "SeekBar in StartTracking", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        text_view.setText("Red : " + red);
                        hatter.setBackgroundColor(Color.rgb(red,green,blue));
                        //Toast.makeText(MainActivity.this, "SeekBar in StopTracking", Toast.LENGTH_LONG).show();
                    }
                }
        );

        seek_bar2.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    int progress_value;

                    @Override
                    public void onProgressChanged(SeekBar seekBar2, int progress, boolean b) {
                        progress_value = progress;
                        green = progress_value;
                        text_view2.setText("Green : " + green);
                        hatter.setBackgroundColor(Color.rgb(red,green,blue));
                        //Toast.makeText(MainActivity.this, "SeekBar in progress", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar2) {
                        hatter.setBackgroundColor(Color.rgb(red,green,blue));
                        //Toast.makeText(MainActivity.this, "SeekBar in StartTracking", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar2) {
                        text_view2.setText("Green : " + green);
                        hatter.setBackgroundColor(Color.rgb(red,green,blue));
                        //Toast.makeText(MainActivity.this, "SeekBar in StopTracking", Toast.LENGTH_LONG).show();
                    }
                }
        );



        seek_bar3.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    int progress_value;

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                        progress_value = progress;
                        blue = progress_value;
                        text_view3.setText("Blue : " + blue);
                        hatter.setBackgroundColor(Color.rgb(red,green,blue));
                        //Toast.makeText(MainActivity.this, "SeekBar in progress", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        hatter.setBackgroundColor(Color.rgb(red,green,blue));
                        //Toast.makeText(MainActivity.this, "SeekBar in StartTracking", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        text_view3.setText("Blue : " + blue);
                        hatter.setBackgroundColor(Color.rgb(red,green,blue));
                        //Toast.makeText(MainActivity.this, "SeekBar in StopTracking", Toast.LENGTH_LONG).show();
                    }
                }
        );



    }
}

