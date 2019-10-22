package com.cobacoba.cobaotp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class InstructionActivity extends AppCompatActivity {

    //private final String TAG = "InstructionActivity";
    private Button misscall;
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruction);
        misscall = findViewById(R.id.button_misscall);
        back = findViewById(R.id.button_instructionBack);

        misscall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle1 = getIntent().getExtras();
                Intent next = new Intent(InstructionActivity.this, OTPActivity.class);
                next.putExtras(bundle1);
                startActivity(next);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(InstructionActivity.this, MainActivity.class);
                startActivity(back);
            }
        });
    }
}
