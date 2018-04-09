package phedev.app.myintentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView textA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //initial views
        textA = findViewById(R.id.tes);

        //check if data intent has extra then bind to views
        if (getIntent().hasExtra("data")){
            String dataIntent;
            dataIntent = getIntent().getStringExtra("data");
            textA.setText(dataIntent);
        }

    }
}
