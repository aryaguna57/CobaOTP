package com.cobacoba.cobaotp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "MainActivity";
    private Button verify;
    private EditText userPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        verify = (Button) findViewById(R.id.button_phonenumber);
        userPhone = (EditText) findViewById(R.id.edittext_phonenumber);

        CitcallResponse citcallResponse = new CitcallResponse("","","","","","","","","");
        Log.d(TAG, "onCreate: " + citcallResponse.getResult());
    }

    private boolean confirmPhone() {
        String phonenumberInput = userPhone.getText().toString().trim();
        if (phonenumberInput.isEmpty()) {
            userPhone.setError("Field can not be empty");
            return false;
        } else {
            userPhone.setError(null);
            return true;
        }
    }

    public void verfiyPhonemumber(View v) {
        if (!confirmPhone()){
            return;
        }

        postNumber();
        Bundle bundle = new Bundle();
        bundle.putString("phone",userPhone.getText().toString());
        Intent intent = new Intent(this, InstructionActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    private void postNumber() {

        CitcallModel model = new CitcallModel(userPhone.getText().toString(), 0);

        ConectionManager.postcitCall(model, new SingleDataConnectionListener() {
            @Override
            public void onSuccess(Object data, String message) {
                Toast.makeText(MainActivity.this, "Berhasil", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String message) {
                Toast.makeText(MainActivity.this, "Gagal", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
