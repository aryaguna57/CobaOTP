package com.cobacoba.cobaotp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class OTPActivity extends AppCompatActivity  {

    private TextView textView;
    private Button verifyOTP;
    private EditText userOTP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        verifyOTP = findViewById(R.id.button_otp);
        userOTP = findViewById(R.id.edittext_otp);

        Bundle data = getIntent().getExtras();
        String phoneNumber = data.getString("phone");

        textView = findViewById(R.id.at_phonenumber);
        textView.setText("We will misscall you at" + phoneNumber);

        verifyOTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String OTP = userOTP.getText().toString();
                if(!TextUtils.isEmpty(OTP)){
                    if(OTP.equals("1234")){
                        Toast.makeText(OTPActivity.this,"CORRECT",Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(OTPActivity.this,"INCORRECT",Toast.LENGTH_SHORT).show();
                    }
                } else {
                    userOTP.setError("Field can not be empty");
                }
            }
        });

    }

}
