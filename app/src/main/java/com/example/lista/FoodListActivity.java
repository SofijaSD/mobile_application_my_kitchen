package com.example.lista;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lista.api.ApiActivity;

import java.util.ArrayList;
import java.util.List;

public class FoodListActivity extends AppCompatActivity {

    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

    List<Food> food1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);

initComponent();



    }

    private void initComponent() {
        food1 = new ArrayList<>();
        food1.add(new Food("Beef Stew","1 tbsp. vegetable oil" +
                "2 lb. beef chuck stew meat, cubed into 1\" pieces\n" +
                "1 tbsp. extra-virgin olive oil\n" +
                "1 onion, chopped\n" +
                "2 carrots, peeled and cut into rounds\n" +
                "2 stalks celery, chopped\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper\n" +
                "3 cloves garlic, minced\n" +
                "1/4 c. tomato paste\n" +
                "6 c. low-sodium beef broth\n" +
                "1 c. red wine\n" +
                "1 tbsp. Worcestershire sauce\n" +
                "1 tsp. dried or fresh thyme leaves\n" +
                "2 bay leaves\n" +
                "1 lb. baby potatoes, halved\n" +
                "1 c. frozen peas\n" +
                "1/4 c. freshly chopped parsley, for garnish",
                "In a large dutch oven or heavy-bottomed pot over medium heat, heat oil. Add beef and cook until seared on all sides, 10 minutes, working in batches if necessary. Transfer beef to a plate. \n" +
                        "In the same pot, cook onion, carrots, and celery until soft, 5 minutes. Season with salt and pepper. Add garlic and tomato paste and cook until garlic is fragrant and tomato paste has darkened, 2 minutes. \n" +
                        "Add beef back to dutch oven then add broth, wine, Worcestershire sauce, thyme, and bay leaves. \n" +
                        "Bring to a boil then reduce heat to a simmer. Season with salt and pepper. Cover and let simmer until beef is tender, 30 to 45 minutes.\n" +
                        "Add potatoes and simmer, covered, until potatoes are tender, 15 minutes. \n" +
                        "Remove bay leaves. Stir in peas and cook until warmed through, 2 minutes. Season stew to taste with salt and pepper, then ladle into serving bowls and garish with parsley. \n", R.drawable.recipe4));


        food1.add(new Food("Cheez-It Meatloaf","2 lb. ground beef\n" +
                "1 c. Cheez-It crackers, crushed\n" +
                "2 large eggs\n" +
                "1 packet Lipton onion soup mix\n" +
                "1/4 c. shredded sharp Cheddar",
                "Preheat oven to 350°. In a large mixing bowl combine ground beef, crushed Cheez-Its, eggs and onion soup mix. Use your hands to knead together until thoroughly combined.\n" +
                        "Place the beef mixture in a greased loaf pan and bake until the meat has browned and pulled away from the edges of the pan, about 40 minutes. Top with cheese and broil until melted, about 5 minutes.",R.drawable.recipe5));

        food1.add(new Food("Chicken Noodle Soup","1 tsp. extra-virgin olive oil\n" +
                "1 c. diced onion\n" +
                "2 celery stalks, diced\n" +
                "2 carrots, diced\n" +
                "2 cloves garlic, minced\n" +
                "2 tsp. fresh thyme\n" +
                "1 lb. boneless skinless chicken breast, cut into 1/2\" pieces\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper\n" +
                "32 oz. low-sodium chicken stock\n" +
                "1 lb. egg noodles\n" +
                "1/4 c. freshly chopped parsley",
                "In a large pot over medium heat, heat oil. Add onions, celery, and carrots and cook until softened, 6 minutes. Add garlic and thyme and cook until fragrant, 1 minute more.\n" +
                        "Move vegetables to one side of the pot and add chicken. Season with salt and pepper and cook until no pink remains, 6 to 8 minutes. Add stock and 1/2 cup of water and bring to a boil.\n" +
                        "Add noodles and cook according to package instructions. Season to taste with salt and pepper. Add parsley and serve immediately.",R.drawable.recipe6));

        food1.add(new Food("Chicken, Spinach & Artichoke Lasagna","1 lb. lasagna noodles\n" +
                "3 tbsp. butter\n" +
                "2 cloves garlic, minced\n" +
                "3 tbsp. all-purpose flour\n" +
                "3 c. milk (preferably whole or 2%)\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper\n" +
                "1 c. freshly grated Parmesan\n" +
                "2 c. shredded rotisserie chicken\n" +
                "1/2 lb. frozen chopped spinach, thawed and squeezed of excess liquid \n" +
                "1 (15-oz.) can artichoke hearts, drained and chopped\n" +
                "2 (15-oz.) containers part-skim ricotta\n" +
                "4 c. shredded mozzarella\n",
                "Preheat oven to 350°. In a large pot of salted boiling water, cook lasagna noodles according to package directions until al dente. Drain and transfer to a baking sheet to cool.\n" +
                        "Meanwhile, in a large skillet over medium heat, melt butter. Add garlic and cook until fragrant, 1 minute, then add flour and cook 1 minute more. Pour in milk and season with salt and pepper. Bring to a simmer and let thicken, 2 to 4 minutes. Add Parmesan and stir until creamy, then add chicken, spinach, and artichokes and stir until combined.\n" +
                        "Assemble lasagna: Spread a thin layer of chicken mixture in a large baking dish and top with a layer of overlapping noodles. Spread a layer of ricotta over the noodles, add a layer of chicken mixture, and sprinkle with a layer of mozzarella. Repeat for three layers total, ending with mozzarella.\n" +
                        "Tent with foil and bake for 35 minutes. Remove foil and bake until browned and bubbly, 10 minutes more.\n" +
                        "Let cool for 15 minutes before slicing and serving.",R.drawable.recipe7));

        food1.add(new Food("French Onion Soup","Cooking spray\n" +
                "10 lasagna noodles, cooked according to package directions\n" +
                "1 oz. (15-oz.) container ricotta\n" +
                "4 large eggs, divided\n" +
                "2 cloves garlic, minced\n" +
                "Kosher salt\n" +
                "Freshly ground pepper\n" +
                "1 c. shredded mozzarella\n" +
                "1/2 c. all-purpose flour\n" +
                "2 c. Italian bread crumbs\n" +
                "Vegetable oil, for frying\n" +
                "Marinara sauce, warmed, for dipping",
                "In a large pot over medium-high heat, melt butter. Add onions and cook, stirring occasionally, until deeply golden, 25 minutes. Add flour and cook 1 minute until no longer raw. Season with salt and pepper, then add white wine and let simmer until evaporated, 3 minutes. Add chicken and beef stocks and thyme and bring to a boil. Reduce heat to medium and simmer 15 minutes. Season with salt and pepper and remove thyme.\\n\" +\n" +
                        "  \"Preheat broiler to high. Place 2 baguette slices on a large baking sheet and top each slice with 2 tablespoons cheese. Place under broiler until cheese is bubbling and golden brown, 1 minute.\\n\" +\n" +
                        " \"Serve soup in bowls or large mugs with baguette slice on top. Garnish with a thyme spring.",R.drawable.recipe8));

        food1.add(new Food("Fried Lasagna","Kosher salt\n" +
                "Freshly ground black pepper\n" +
                "1/2 c. white wine\n" +
                "2 c. low-sodium chicken stock\n" +
                "4 c. low-sodium beef stock\n" +
                "8 sprigs fresh thyme, plus more for garnish\n" +
                "8 baguette slices\n" +
                "1 c. grated Gruyère",
                "Grease a large baking sheet with cooking spray. Place cooked lasagna noodles in an even layer on top.\n" +
                        "In a medium bowl, stir together ricotta, 1 egg, and garlic and season with salt and pepper. Spread on each lasagna noodle and sprinkle with mozzarella.\n" +
                        "Fold each lasagna noodle three or four times to create a square. Freeze on prepared baking sheet until firm, 30 minutes.\n" +
                        "When ready to cook, put flour, remaining 3 eggs, and bread crumbs in three separate shallow bowls. Whisk eggs until beaten and season bread crumbs with salt and pepper. Working in batches, dredge lasagna squares in flour, then dip in eggs, and finally toss in bread crumbs to coat.\n" +
                        "In a large deep-sided skillet over medium heat, heat 1 1/2 inches oil until shimmering (about 350°). Using tongs, add 3 or 4 lasagna squares and cook until golden, 2 to 3 minutes per side. Drain lasagna squares on a paper towel–lined wire rack. Repeat with remaining lasagna squares.\n" +
                        "Serve with marinara.",R.drawable.recipe9));

        food1.add(new Food("Perfect Chicken Alfredo","Freshly ground black pepper\n" +
                "1 1/2 c. whole milk\n" +
                "1 1/2 c. low-sodium chicken broth\n" +
                "2 cloves garlic, minced\n" +
                "8 oz. fetuccini\n" +
                "1/2 c. heavy cream\n" +
                "1 c. freshly grated Parmesan\n" +
                "Freshly chopped parsley, for garnish",
                "In a large skillet over medium-high heat, heat oil. Add chicken and season with salt and pepper. Cook until golden and cooked through, 8 minutes per side. Let rest 10 minutes, then slice. \n" +
                        "Add milk, broth, and garlic to skillet. Season with salt and pepper and bring to a simmer. Add fettuccine, stirring frequently for about 3 minutes. Let cook until al dente, 8 minutes more. \n" +
                        "Stir in heavy cream and Parmesan until combined. Simmer until sauce thickens. \n" +
                        "Remove from heat and stir in sliced chicken. Garnish with parsley. \n",R.drawable.recipe10));

        food1.add(new Food("Slow-Cooker Corned Beef Hash","1 lb. corned beef, chopped\n" +
                "1 lb. russet potatoes, chopped\n" +
                "1 onion, chopped\n" +
                "2 tbsp. extra-virgin olive oil\n" +
                "2 tbsp. Worcestershire sauce\n" +
                "1 tsp. garlic powder\n" +
                "1 tsp. dried oregano\n" +
                "1 tbsp. chopped parsley, plus more for garnish\n" +
                "Fried eggs, for serving\n",
                "Line a slow cooker with foil and spray with cooking spray.\n" +
                        "In the slow cooker, combine corned beef, potatoes, onion, olive oil, Worcestershire sauce, garlic powder, oregano and parsley and toss. Cover and cook on high until potatoes are tender, 4 to 5 hours.\n" +
                        "Garnish with more parsley and serve warm with eggs.",R.drawable.recipe11));


        food1.add(new Food("Tater Tot Casserole","1 tbsp. extra-virgin olive oil\n" +
                "1 c. medium yellow onion, diced\n" +
                "2 cloves garlic, minced\n" +
                "2 lb. ground beef\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper\n" +
                "1/2 tsp. cayenne\n" +
                "2 tbsp. all-purpose flour\n" +
                "1 c. low-sodium chicken broth\n" +
                "2 c. grated cheddar, divided\n" +
                "1 1/2 c. frozen peas\n" +
                "1 1/2 c. frozen corn\n" +
                "1 lb. frozen tater tots\n" +
                "3 slices cooked bacon, cut into 1/2\" strips\n" +
                "Thinly sliced scallions, for garnish",
                "Preheat oven to 425º. In a large cast-iron skillet over medium-high heat, heat oil. Add onions and cook until softened, 3 minutes, then add garlic and cook until fragrant, 1 minute more. Season with salt and pepper. \n" +
                        "Add ground beef and break up with a wooden spoon. Cook until no pink remains, 6 minutes. Drain fat from skillet and return to heat.\n" +
                        "Add cayenne and flour and stir for 1 minute. Pour in broth, then bring to a boil and simmer for 2 minutes. Fold in 1 cup cheese, peas, and corn.\n" +
                        "Transfer meat mixture to a 9\"-x-13\" baking dish. Top with remaining 1 cup cheese and scatter tater tots and bacon in a single layer over the beef filling. Bake until cheese is melted and tots are golden, 27 to 30 minutes.\n" +
                        "Let rest for 2 to 3 minutes and garnish with scallions before serving.\n",R.drawable.recipe12));

        food1.add(new Food("Best-Ever Beef Stroganoff","1 (12-oz.) package egg noodles\n" +
                "2 tbsp. butter\n" +
                "1 tbsp. vegetable oil\n" +
                "1 lb. sirloin, cut into 1\" pieces\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper\n" +
                "2 tbsp. extra-virgin olive oil, divided\n" +
                "1 lb. baby Bella mushrooms, thinly sliced\n" +
                "1/2 large onion, chopped\n" +
                "2 cloves garlic, minced\n" +
                "2 tsp. fresh thyme leaves\n" +
                "1 tbsp. tomato paste\n" +
                "4 c. low-sodium beef or chicken broth\n" +
                "2 tsp. dijon mustard\n" +
                "1 tsp. Worcestershire sauce\n" +
                "2 tbsp. cornstarch\n" +
                "2 tbsp. sour cream, plus more for serving\n" +
                "2 tbsp. freshly chopped parsley",
                "Cook egg noodles: Prepare egg noodles according to package instructions and toss with butter while still hot.\n" +
                        "Cook beef: In a large skillet over medium-high heat, heat vegetable oil. Working in batches if necessary, add beef and sear 8 to 10 minutes, until golden on all sides, and season with salt and pepper. Remove beef and place in a large bowl.\n" +
                        "Lower heat to medium and add one tablespoon olive oil. Add mushrooms and cook until golden and tender, 8 to 10 minutes. Remove from skillet and place in bowl with beef.\n" +
                        "Add remaining olive oil and add onion. Cook until tender, 6 minutes. Add garlic, thyme, and tomato paste and cook until fragrant, 2 minutes more. Stir in broth, mustard, and Worcestershire sauce and bring to a simmer. \n" +
                        "Make cornstarch slurry: In a small bowl, whisk some of the hot broth mixture into your cornstarch. \n" +
                        "Pour cornstarch slurry into skillet and continue to simmer until thickened by about half, 10 to 12 minutes. Remove from heat and stir in mushrooms, beef, and sour cream. Season with salt and pepper.\n" +
                        "Spoon beef mixture over prepared egg noodles and garnish with a dollop of sour cream and parsley before serving. ",R.drawable.recipe13));

        food1.add(new Food("Braised Short Rib and Sweet Potato Chili","1 tbsp. canola oil\n" +
                "1 lb. boneless short ribs\n" +
                "2 tsp. ground cumin\n" +
                "1 tbsp. plus 1 tsp. chili powder\n" +
                "2 tsp. dried oregano\n" +
                "kosher salt\n" +
                "1 large onion, diced\n" +
                "1 jalapeño, chopped\n" +
                "1 tsp. garlic powder\n" +
                "2 tbsp. tomato paste\n" +
                "1 15-oz. can diced tomatoes\n" +
                "4 c. low-sodium chicken broth\n" +
                "1 12-oz. bottle lager (such as Negro Modelo)\n" +
                "3 large sweet potatoes, chopped\n" +
                "Shredded cheddar, for garnish\n" +
                "Sliced jalapeño, for garnish",
                "In a large pot or Dutch oven over medium-high heat, heat oil. Rub short ribs with cumin, 1 tablespoon chili powder, and oregano and season with salt. Add to pot and sear 5 minutes per side, then transfer to a plate.\n" +
                        "To pot, add onion, jalapeño, garlic powder, and remaining teaspoon chili powder and cook until tender, 6 minutes. Add tomato paste and stir, 1 minute, then add diced tomatoes, chicken broth, beer, and sweet potatoes and bring to a boil. Reduce heat and simmer.\n" +
                        "Slice short ribs into small pieces and add to pot. Let cook until beef is cooked through and chili has thickened, about 1 hour.\n" +
                        "Serve chili with cheddar and jalapeños.",R.drawable.recipe14));

        food1.add(new Food("Cheese Manicotti","1 (8-oz.) package manicotti\n" +
                "1 tbsp. extra-virgin olive oil\n" +
                "1/2 yellow onion, chopped\n" +
                "2 cloves garlic, minced\n" +
                "2 tbsp. tomato paste\n" +
                "1 (28-oz.) can crushed tomatoes\n" +
                "2 1/2 c. ricotta cheese\n" +
                "1 c. shredded mozzarella\n" +
                "1/2 c. freshly grated Parmesan\n" +
                "1/4 c. freshly chopped basil, plus more for garnish\n" +
                "Zest of 1/2 lemon \n" +
                "Kosher salt\n" +
                "Freshly ground black pepper",
                "Preheat oven to 375°. In a large pot of salted boiling water, cook manicotti until al dente, 5 minutes. Drain.\n" +
                        "In a large skillet over medium heat, heat oil. Add onion and cook until soft, 6 minutes. Add garlic and tomato paste and cook 2 minutes more, until garlic is fragrant and tomato paste has darkened in color.\n" +
                        "Add crushed tomatoes (with juices) and reduce heat to medium low. Simmer 10 minutes.\n" +
                        "Meanwhile, make ricotta filling: in a large bowl, stir together ricotta, 1/2 cup mozzarella, 1/4 cup Parmesan, basil, and lemon zest. Season with salt and pepper.\n" +
                        "Into the bottom of a large baking dish, ladle a couple scoops of sauce. Smooth into an even layer. Spoon ricotta mixture into prepared manicotti and place side by side into baking dish, repeating until all ricotta mixture has been used. Top with remaining tomato sauce, mozzarella, and Parmesan. Bake until cheese is melted and bubbly, 15 to 20 minutes. Garnish with basil and serve immediately.",R.drawable.recipe15));


        food1.add(new Food("Classic Lasagna","3/4 lb. lasagna noodles\n" +
                "1 tsp. extra-virgin olive oil, plus more for drizzling\n" +
                "2 lb. ground beef\n" +
                "4 cloves garlic, minced\n" +
                "2 tsp. dried oregano\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper\n" +
                "2 (32-0z.) jars marinara\n" +
                "16 oz. whole milk ricotta\n" +
                "1/2 c. freshly grated Parmesan, divided\n" +
                "1/4 c. chopped parsley, plus more for garnish\n" +
                "1 large egg\n" +
                "2 lb. sliced mozzarella\n",
                "Preheat oven to 375º. In a large pot of salted boiling water, cook pasta according to package directions until al dente, less 2 minutes. Drain and drizzle a bit of olive oil to prevent noodles from sticking together.\n" +
                        "Meanwhile, in a large pot over medium-high heat, heat oil. Cook ground beef until no longer pink, breaking up with a wooden spoon. Remove from heat and drain fat. Return beef to skillet and add garlic and oregano and cook, stirring, for 1 minute. Season with salt and pepper, then add marinara and stir until warmed through. \n" +
                        "Combine ricotta, 1/4 cup Parmesan, parsley, and egg in a large mixing bowl and season with salt and pepper. Set aside.\n" +
                        "In a large casserole dish, evenly spread a quarter of the meat sauce across the bottom of the dish, then top with a single layer of lasagna noodles, a layer of ricotta mixture, a single layer of mozzarella, and a layer of meat sauce. Repeat layers, topping the last layer of noodles with meat sauce, Parmesan, and mozzarella.\n" +
                        "Cover with foil and bake for 15 minutes, then increase temperature to 400º and bake uncovered for 18 to 20 minutes.\n" +
                        "Garnish with parsley before serving.",R.drawable.recipe16));


        food1.add(new Food("Crock-Pot Chicken Noodle Will Warm Up Your Whole Crew","1 1/2 lb. boneless skinless chicken breasts\n" +
                "1 large onion, chopped\n" +
                "3 carrots, peeled and sliced into coins\n" +
                "2 stalks celery, sliced\n" +
                "4 tsp. sprigs fresh thyme\n" +
                "4 tsp. sprigs fresh rosemary \n" +
                "3 cloves garlic, minced\n" +
                "1 bay leaf\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper\n" +
                "10 c. low-sodium chicken broth\n" +
                "8 oz. egg noodles",
                "In a slow cooker, combine chicken, onion, carrots, celery, thyme, rosemary, garlic, and bay leaf and season generously with salt and pepper. Pour in broth. \n" +
                        "Cover and cook on low, 6 to 8 hours. Remove chicken from slow cooker and shred with two forks. Discard herbs and bay leaf. Return chicken to slow cooker and add egg noodles. \n" +
                        "Cook on low, covered, until al dente, 20 to 30 minutes.",R.drawable.recipe17));

        food1.add(new Food("Instant Pot Pot Roast & Potatoes","3 lb. chuck roast \n" +
                "Kosher salt \n" +
                "Freshly ground black pepper\n" +
                "1 tbsp. extra-virgin olive oil\n" +
                "1 onion, chopped\n" +
                "3 cloves garlic, minced\n" +
                "2 tsp. chopped rosemary\n" +
                "1 tsp. chopped thyme \n" +
                "3 tbsp. tomato paste \n" +
                "2 tbsp. all-purpose flour\n" +
                "1/2 c. red wine\n" +
                "3 c. low-sodium beef broth \n" +
                "1 tbsp. Worcestershire sauce\n" +
                "1 lb. baby potatoes, halved\n" +
                "4 medium carrots, peeled and sliced on the bias into thick chunks",
                "Season chuck roast generously with salt and pepper. Turn Instant Pot to Sauté setting, set for 15 minutes, and heat oil. When oil is shimmering, add beef and cook until seared on both sides, about 5 minutes per side. Remove beef then add onion. Cook, stirring occasionally, until starting to soften, about 5 minutes. Stir in garlic, herbs, and tomato paste and cook until fragrant, about 1 minute. Stir in flour, then whisk in wine until combined. Bring to boil and cook until slightly thickened, about 2 minutes. \n" +
                        "Add broth, Worcestershire sauce, potatoes, and carrots and 1 tablespoon salt and a bunch of freshly ground black pepper. Place beef on top of mixture. Lock lid and set to pressure cook on high for 1 hour. \n" +
                        "Follow manufacturer’s guide for quick release, making sure to wait until cycle is complete before unlocking and removing lid. Let beef rest in sauce for at 10 minutes. \n" +
                        "Slice roast against grain.",R.drawable.recipe18));

        food1.add(new Food("Pizza Pot Pie","2 tbsp. extra-virgin olive oil, plus more for crust\n" +
                "2 c. broccoli florets, roughly chopped\n" +
                "2 bell peppers, diced\n" +
                "8 oz. sliced mushrooms\n" +
                "1 lb. Italian sausage (sweet or spicy), casings removed\n" +
                "1/4 c. all-purpose flour, plus more for rolling dough\n" +
                "2 cloves garlic, minced\n" +
                "1 tsp. dried oregano\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper\n" +
                "2 c. pizza sauce\n" +
                "1/2 lb. refrigerated pizza dough\n" +
                "2 c. shredded mozzarella\n" +
                "1/4 c. sliced pepperoni\n" +
                "Freshly grated Parmesan, for garnish\n" +
                "Freshly chopped parsley, for garnish",
                "Preheat oven to 400°. In a 10- or 12-inch oven-safe skillet over medium heat, heat oil. Add broccoli and bell peppers and cook, stirring often, until slightly soft, 5 minutes. Add mushrooms and cook, stirring, until soft, 4 minutes more. \n" +
                        "Add sausage and cook, breaking it up with a wooden spoon, until seared and no longer pink, about 4 minutes. Add flour and stir until vegetables and sausage are well coated, then add garlic and oregano and season with salt and pepper. Stir in pizza sauce and remove from heat. Let cool 10 minutes. \n" +
                        "On a lightly floured surface, roll out pizza dough into a large circle a couple inches bigger than your skillet. Top sausage mixture with mozzarella, then place dough round over skillet and carefully crimp edges. Brush with oil and top with pepperoni. \n" +
                        "Bake until crust is golden, about 40 minutes. \n" +
                        "Let cool 10 minutes, then sprinkle with Parmesan and parsley before serving.",R.drawable.recipe19));




        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this,food1);

        myrecyclerView.setLayoutManager(new GridLayoutManager(this,1));

        myrecyclerView.setAdapter(myAdapter);


    }

}
