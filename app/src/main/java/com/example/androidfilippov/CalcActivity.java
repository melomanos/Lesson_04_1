package com.example.androidfilippov;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CalcActivity extends AppCompatActivity {
    
    private TextView resultTViewCalc;
    private Button zeroBtn;
    private Button oneBtn;
    private Button twoBtn;
    private Button threeBtn;
    private Button fourBtn;
    private Button fiveBtn;
    private Button sixBtn;
    private Button sevenBtn;
    private Button eightBtn;
    private Button nineBtn;
    private Button pointBtn;
    private Button changeMode;
    private Button changeModeI;
    private RelativeLayout usualMode;
    private RelativeLayout engineeringMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        initViews();
        usualMode.setVisibility(View.GONE);
        engineeringMode.setVisibility(View.VISIBLE);

        zeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTViewCalc.setText("0");
            }
        });

        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTViewCalc.setText("1");
            }
        });

        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTViewCalc.setText("2");
            }
        });

        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTViewCalc.setText("3");
            }
        });

        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTViewCalc.setText("4");
            }
        });

        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTViewCalc.setText("5");
            }
        });

        sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTViewCalc.setText("6");
            }
        });

        sevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTViewCalc.setText("7");
            }
        });

        eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTViewCalc.setText("8");
            }
        });

        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTViewCalc.setText("9");
            }
        });

        pointBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTViewCalc.setText(".");
            }
        });

        changeModeI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                engineeringMode.setVisibility(View.GONE);
                usualMode.setVisibility(View.VISIBLE);
            }
        });

        changeMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usualMode.setVisibility(View.GONE);
                engineeringMode.setVisibility(View.VISIBLE);
            }
        });
    }

    private void initViews() {
        resultTViewCalc = findViewById(R.id.resultTViewCalc);
        zeroBtn = findViewById(R.id.zeroBtn);
        oneBtn = findViewById(R.id.oneBtn);
        twoBtn = findViewById(R.id.twoBtn);
        threeBtn = findViewById(R.id.threeBtn);
        fourBtn = findViewById(R.id.fourBtn);
        fiveBtn = findViewById(R.id.fiveBtn);
        sixBtn = findViewById(R.id.sixBtn);
        sevenBtn = findViewById(R.id.sevenBtn);
        eightBtn = findViewById(R.id.eightBtn);
        nineBtn = findViewById(R.id.nineBtn);
        pointBtn = findViewById(R.id.pointBtn);
        changeMode = findViewById(R.id.changeMode);
        changeModeI = findViewById(R.id.changeModeI);
        usualMode = findViewById(R.id.usualMode);
        engineeringMode = findViewById(R.id.engineeringMode);
    }
}
