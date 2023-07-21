/*
 * Copyright (c) 2023. Atiqah Izzati
 */

package putri.android.assignment1_putri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class bmical extends AppCompatActivity {

    private EditText weight;
    private EditText height;
    private Button btncalc;
    private TextView result;
    String resultBMI, display, healthRisk;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmical);

        weight = (EditText) findViewById(R.id.weight);
        height = (EditText) findViewById(R.id.height);
        btncalc = (Button) findViewById(R.id.btnCalc);
        result = (TextView) findViewById(R.id.result);

        btncalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateBMI();
            }
        });
    }

    public void calculateBMI(){
        if (weight.getText().toString().equals("")){
            Toast.makeText(this, "Please insert weight!", Toast.LENGTH_SHORT).show();
        } else if (height.getText().toString().equals("")) {
            Toast.makeText(this, "Please insert height!", Toast.LENGTH_SHORT).show();
        }
        else{
            float valueWeight = Float.parseFloat(weight.getText().toString());
            float valueHeight = Float.parseFloat(height.getText().toString());
            float countBMI = Float.parseFloat(df.format(valueWeight / (valueHeight * valueHeight)));

            if(countBMI < 18.4){
                resultBMI = "Underweight";
                healthRisk = "Malnutrition Risk";
            }
            else if(countBMI >= 18.5 && countBMI <= 24.9 ){
                resultBMI = "Normal";
                healthRisk = "Low Risk";
            }
            else if (countBMI >= 25 && countBMI <= 29.9) {
                resultBMI = "Overweight";
                healthRisk = "Enhanced Risk";
            }
            else if (countBMI >= 30 && countBMI <= 34.9) {
                resultBMI = "Moderately Obese";
                healthRisk = "Medium Risk";
            }
            else if (countBMI >= 35 && countBMI <= 39.9) {
                resultBMI = "Severely Obese";
                healthRisk = "High Risk";
            } else{
                resultBMI = "Very severely Obese";
                healthRisk = "Very High Risk";
            }

            display = countBMI + "\n" + resultBMI + "\n" + healthRisk;
            result.setText(display);
        }

    }
    public void openBtnBack(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}