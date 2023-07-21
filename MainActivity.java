/*
 * Copyright (c) 2023. Atiqah Izzati
 */

package putri.android.assignment1_putri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
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

        TextView linked = (TextView) findViewById(R.id.link_git);
        linked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://github.com/acetah/bmicalc.git";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }

    public void openBtnBMI(View view){
        Intent intent = new Intent(this, bmical.class);
        startActivity(intent);
    }
}