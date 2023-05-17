package com.example.lista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
        //Button CONFIRM and go back
        Button buttonConfirm = findViewById(R.id.buttonConfirm);
        buttonConfirm.setOnClickListener(this);
        TextView textViewGoBack1 = findViewById(R.id.textViewGoBack1);
        textViewGoBack1.setOnClickListener(this);
        //Button CONFIRM and go back
        Bundle extra = getIntent().getExtras();
        String username = extra.getString("username");
        String email = extra.getString("email");
        String password = extra.getString("password");
        String confirmPassword = extra.getString("confirmPassword");


        String message = "IS ENTERED DATA VALID? \n";
        message += "Username: " + username + "\n";
        message += "Email: " + email + "\n";
        message += "Password: " + password + "\n";
        message += "Confirm password: " + confirmPassword + "\n";

        ((TextView)findViewById(R.id.labelMessage)).setText(message);
    }
    //Button CONFIRM and go back
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonConfirm:
                this.doConfirm();
                break;
            case R.id.textViewGoBack1:
                this.doTextViewGoBack1();
                break;
        }
    }

    private void doConfirm(){
        startActivity(new Intent(this, LoginActivity.class));
    }
    private void doTextViewGoBack1() {
        startActivity(new Intent(this, RegisterActivity.class));
    }
    //Button CONFIRM and go back
}