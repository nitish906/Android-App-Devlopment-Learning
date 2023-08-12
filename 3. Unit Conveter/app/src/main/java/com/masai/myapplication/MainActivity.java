package com.masai.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editTextNumber;
    private Button button;
    private TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);
        editTextNumber=findViewById(R.id.editTextNumber);
        button=findViewById(R.id.button);
        textView3=findViewById(R.id.textView3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Value Submited", Toast.LENGTH_SHORT).show();

                String s= editTextNumber.getText().toString();

                int kg=Integer.parseInt(s);

                double pound=2.205* kg;

                textView.setText("You Value is:-25 "+pound);


            }
        });

    }
}