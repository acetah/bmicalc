/*
 * Copyright (c) 2023. Atiqah Izzati
 */

package putri.android.assignment1_putri;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnBMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBMI = (Button) findViewById(R.id.btnbmicalc);

    }

    public void openBtnBMI(View view){
        Intent intent = new Intent(this, bmical.class);
        startActivity(intent);
    }
}