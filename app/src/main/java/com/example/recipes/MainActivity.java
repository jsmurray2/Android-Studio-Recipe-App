// John Murray
// Recipe App
// Platform Based Computing

package com.example.recipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[];
    int images[] = {R.drawable.pasta_carbonara, R.drawable.mac_and_cheese, R.drawable.pizza,
            R.drawable.spaghetti, R.drawable.caesar_salad, R.drawable.steak, R.drawable.turkey,
            R.drawable.mashed_potatoes, R.drawable.brownies, R.drawable.quesedillas};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.recipes);
        s2 = getResources().getStringArray(R.array.description);
        RecipeAdapter recipeAdapter = new RecipeAdapter(this, s1, s2, images);
        recyclerView.setAdapter(recipeAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}