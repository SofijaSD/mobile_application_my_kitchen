package com.example.lista.api;

import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Api {
        public static void getJSON(String url, final ReadDataHandler rdh){
            AsyncTask<String,Void,String> task = new AsyncTask<String, Void, String>() {
                @Override
                protected String doInBackground(String... strings) {
                    String odgovor="";
                    try{
                        URL link= new URL(strings[0]);
                        HttpURLConnection con=(HttpURLConnection)link.openConnection();
                        BufferedReader br= new BufferedReader(new InputStreamReader(con.getInputStream()));
                        String red;
                        while((red = br.readLine()) != null){
                            odgovor += red + "\n";
                        }
                        br.close();
                        con.disconnect();
                    }catch (Exception e ){
                    }
                    return odgovor;
                }
                @Override
                protected void onPostExecute(String odgovor) {
                    rdh.setJson(odgovor);
                    rdh.sendEmptyMessage(0);
                }
            };
            task.execute(url);
        }
    }
