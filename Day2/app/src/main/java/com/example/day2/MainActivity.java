package com.example.day2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etFirstnumber = findViewById(R.id.editTextTextViewFirstNumber);
        EditText etSecondnumber = findViewById(R.id.editTextTextSecondNumber);
        TextView textResult = findViewById(R.id.textViewResult);
        Button plus = findViewById(R.id.buttonplus);
        Button minus = findViewById(R.id.buttonminus);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textA =  etFirstnumber.getText().toString();
                int x = Integer.parseInt(textA);

                String textB =  etSecondnumber.getText().toString();
                int y = Integer.parseInt(textB);

                int z = sum(x , y);

                textResult.setText(String.valueOf(z));

            }



        });


        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textA =  etFirstnumber.getText().toString();
                int x = Integer.parseInt(textA);

                String textB =  etSecondnumber.getText().toString();
                int y = Integer.parseInt(textB);

                int z = minus(x , y);

                textResult.setText(String.valueOf(z));

            }



        });

    }




    public int sum(int x, int y){
        int a = x + y;
        return a;
    }
    public int minus(int x, int y) {
        int b = x - y;
        return b;
    }









}

