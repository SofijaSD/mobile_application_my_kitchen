package com.example.lista;



public class Food {

    private String FoodTitle;
    private String FoodDescription;
    private String Description;
    private int Image;


    public Food(String foodTitle, String foodDescription,String description, int image){

        FoodTitle = foodTitle;
        FoodDescription = foodDescription;
        Description = description;
        Image = image;

    }


    public  String getFoodTitle(){ return FoodTitle; }


    public String getFoodDescription(){
        return FoodDescription;
    }

    public String getDescription(){
        return Description;
    }

    public int getImage(){
        return Image;
    }

}
