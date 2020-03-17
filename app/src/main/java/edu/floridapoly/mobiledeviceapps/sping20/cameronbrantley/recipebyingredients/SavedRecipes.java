package edu.floridapoly.mobiledeviceapps.sping20.cameronbrantley.recipebyingredients;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SavedRecipes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_recipes);
    }

    public void onButtonClick(View view){
        Button searchButton = (Button) findViewById(R.id.searchButton);
        Button savedRecipiesButton = (Button) findViewById(R.id.savedRecipesButton);
        Button ingredientsButton = (Button) findViewById(R.id.ingredientsButton);

        if(searchButton.isPressed()){
            Intent searchI = new Intent(this, SearchActivity.class);
            startActivity(searchI);

        }
        else if(savedRecipiesButton.isPressed()){
            Toast.makeText(SavedRecipes.this, "Recipes loaded on the screen for user to view more.", Toast.LENGTH_LONG).show();
        }
        else{
            Intent ingredientsI = new Intent(this, IngredientsActivity.class);
            startActivity(ingredientsI);
        }

    }
}
