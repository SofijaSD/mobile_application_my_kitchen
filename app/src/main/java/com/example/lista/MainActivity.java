package com.example.lista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonLoginHome = findViewById(R.id.buttonLoginHome);
        buttonLoginHome.setOnClickListener(this);

        Button buttonRegister = findViewById(R.id.buttonRegister);
        buttonRegister.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonLoginHome:
                this.doLoginHome();
                break;
            case R.id.buttonRegister:
                this.doRegister();
                break;
        }

    }

    private void doRegister() {
        Intent i = new Intent(this,RegisterActivity.class);
        startActivity(i);
    }

    private void doLoginHome() {
        Intent i = new Intent(this,LoginActivity.class);
        startActivity(i);

    }

}


