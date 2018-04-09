package phedev.app.myintentapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnPindahActivity, btnPindahDenganData,c, btnDial,e;
    TextView textHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initial views
        btnPindahActivity = findViewById(R.id.a);
        btnPindahDenganData = findViewById(R.id.b);
        c = findViewById(R.id.c);
        btnDial = findViewById(R.id.d);
        e = findViewById(R.id.e);

        textHasil = findViewById(R.id.text);


        btnPindahActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(
                        MainActivity.this,
                        SecondActivity.class));
            }
        });

        btnPindahDenganData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentData = new Intent(
                        MainActivity.this,
                        SecondActivity.class);
                intentData.putExtra("data", "data dari b");
                startActivity(intentData);
            }
        });

        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneNumber = "081210841382";
                Intent dialPhoneIntent = new Intent(
                        Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
            }
        });

    }
}
