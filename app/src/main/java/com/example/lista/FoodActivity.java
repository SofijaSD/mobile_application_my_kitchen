package com.example.lista;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lista.api.ApiActivity;

public class FoodActivity extends AppCompatActivity implements View.OnClickListener {

    Button button2;
    Button buttonViewMore;

    private TextView mFoodTitle;
    private TextView mFoodDescription;
    private TextView mDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);

        buttonViewMore=findViewById(R.id.buttonViewMore);
        buttonViewMore.setOnClickListener(this);

        mFoodTitle = (TextView)findViewById(R.id.titleLabel);
        mFoodDescription = (TextView)findViewById(R.id.labelDescription);
        mDescription = (TextView)findViewById(R.id.description);

        Intent intent = getIntent();
        String Title = intent.getExtras().getString("FoodTitle");
        String DescriptionTitle = intent.getExtras().getString("FoodDescription");
        String Description = intent.getExtras().getString("Description");

        mFoodTitle.setText(Title);
        mFoodDescription.setText(DescriptionTitle);
        mDescription.setText(Description);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:
                this.dobutton2();
                break;
            case R.id.buttonViewMore:
                startActivity(new Intent(this, ApiActivity.class));
                break;

    }
}

    private void dobutton2() {
        startActivity(new Intent(this,FoodListActivity.class));
    }
    }

