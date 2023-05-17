package com.example.lista.api;


import org.json.JSONArray;
import org.json.JSONObject;

import java.util.LinkedList;

public class Model {
    private String name, ingredients,description;
    public Model() {
    }
    public Model(String name, String ingredients, String description) {
        this.name = name;
        this.ingredients = ingredients;
        this.description = description;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }
    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public static Model parseJSONObject(JSONObject object){
        Model model = new Model();
        try {
            if(object.has("name")) {
                model.setName(object.getString("name"));
            }

            if(object.has("ingredients")){
                model.setIngredients(object.getString("ingredients"));
            }

            if(object.has("description")){
                model.setDescription(object.getString("description"));
            }

        }catch (Exception e){
        }
        return model;
    }
    public static LinkedList<Model> parseJSONArray(JSONArray array){
        LinkedList<Model> list = new LinkedList<>();
        try {
            for (int i = 0; i < array.length(); i++) {
                Model model = parseJSONObject(array.getJSONObject(i));
                list.add(model);
            }
        } catch (Exception e) {
        }
        return list;
    }
}