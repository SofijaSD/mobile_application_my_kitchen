package com.example.lista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    EditText username, email, password, confirmPassword;
    Button buttonRegisterRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = (EditText) findViewById(R.id.username2);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        confirmPassword = (EditText) findViewById(R.id.confirmPassword);

        Button buttonRegisterRegister = findViewById(R.id.buttonRegisterRegister);
        buttonRegisterRegister.setOnClickListener(this);

        TextView txtBacktoLogin = findViewById(R.id.txtBacktoLogin);
        txtBacktoLogin.setOnClickListener(this);


        }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.buttonRegisterRegister:
                this.doRegisterRegister();
                break;
            case R.id.txtBacktoLogin:
                this.dotxtBacktoLogin();
                break;
        }

    }

    private void dotxtBacktoLogin() {
        startActivity(new Intent(this, LoginActivity.class));
    }

    private void doRegisterRegister() {
        String username = ((EditText) findViewById(R.id.username)).getText().toString();
        String email = ((EditText) findViewById(R.id.email)).getText().toString();
        String password = ((EditText) findViewById(R.id.password)).getText().toString();
        String confirmPassword = ((EditText) findViewById(R.id.confirmPassword)).getText().toString();

        if (username.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            ((TextView) findViewById(R.id.labelMessage1)).setText("You didn't enter all informations!");
        } else {

            if (username.matches("^(?=.{8,20}$)(?![_.])(?!.*[_.]{2})[a-zA-Z0-9._]+(?<![_.])$") && email.matches("[a-z0-9.]+@[a-z]+\\.+[a-z]+") && password.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$") && confirmPassword.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$")) {
                if (password.equals(confirmPassword) && confirmPassword.equals(password)) {
                    Intent intent = new Intent(this, ConfirmActivity.class);

                    Bundle extra = new Bundle();
                    extra.putString("username", ((EditText)findViewById(R.id.username)).getText().toString());
                    extra.putString("email", ((EditText)findViewById(R.id.email)).getText().toString());
                    extra.putString("password", ((EditText) findViewById(R.id.password)).getText().toString());
                    extra.putString("confirmPassword", ((EditText)findViewById(R.id.confirmPassword)).getText().toString());

                    intent.putExtras(extra);
                    startActivity(intent);

                } else {
                    ((TextView) findViewById(R.id.labelMessage1)).setText("Password don't match");
                }




            } else {
                ((TextView) findViewById(R.id.labelMessage1)).setText("Informations aren't in correct format!");
            }
        }
    }
    }




