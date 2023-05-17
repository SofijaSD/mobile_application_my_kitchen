package com.example.lista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity<buttonExit> extends AppCompatActivity implements View.OnClickListener {

    EditText username2, password2;
    Button buttonLogin, buttonExit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button buttonLogin = findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(this);

        Button buttonExit = findViewById(R.id.buttonExit);
        buttonExit.setOnClickListener(this);

        TextView txtRegister = findViewById(R.id.txtRegister);
        txtRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonLogin:
                this.doLogin();
                break;
            case R.id.txtRegister:
                this.dotxtRegister();
                break;
            case R.id.buttonExit:
                this.dobuttonExit();
                break;


    }
}

    private void dobuttonExit() { startActivity(new Intent(this, MainActivity.class));
    }

    private void dotxtRegister() {
        startActivity(new Intent(this, RegisterActivity.class));
    }

    private void doLogin() {
        String username2 = ((EditText) findViewById(R.id.username2)).getText().toString();
        String password2 = ((EditText) findViewById(R.id.password2)).getText().toString();


        if (username2.isEmpty() ||  password2.isEmpty() ) {
            ((TextView) findViewById(R.id.labelMessage2)).setText("You didn't enter all informations!");
        } else {

            if (username2.matches("^(?=.{8,20}$)(?![_.])(?!.*[_.]{2})[a-zA-Z0-9._]+(?<![_.])$") && password2.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$") ) {
                    startActivity(new Intent(this, FoodListActivity.class));
                } else {
                    ((TextView) findViewById(R.id.labelMessage2)).setText("Informations aren't in correct format!");
                }

        }
    }
}
