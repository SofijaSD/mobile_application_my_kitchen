package com.example.lista.api;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Message;
import android.widget.TextView;

import com.example.lista.R;

import org.json.JSONArray;

import java.util.LinkedList;

public class ApiActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_api);
            initApiModels();
        }
        @SuppressLint("HandlerLeak")
        private void initApiModels() {
            Api.getJSON("https://jsonkeeper.com/b/2SV1", new ReadDataHandler(){
                @Override
                public void handleMessage(Message msg) {
                    String responses = getJson();
                    try {
                        JSONArray array = new JSONArray(responses);
                        LinkedList<Model> models = Model.parseJSONArray(array);
                        TextView labelJson = findViewById(R.id.labelJson);
                        labelJson.setText("");
                        for (Model model : models) {
                            labelJson.append("|" + model.getName() + "|" +"\n\n"+ model.getIngredients() + "\n\n" + model.getDescription()+ "\n\n");
                        }
                    }catch (Exception e){
                    }
                }
            });
            ((TextView)findViewById(R.id.labelJson)).setText("Wait,data is loading...");

        }
    }
