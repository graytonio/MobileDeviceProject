package edu.floridapoly.mobiledeviceapps.sping20.cameronbrantley.recipebyingredients;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onButtonClicked(View view){

        Button accountButton = (Button) findViewById(R.id.bAccount);
        Button loginButton = (Button) findViewById(R.id.bLogin);

        if(accountButton.isPressed()){
            Toast.makeText(LoginActivity.this, "New account is stored locally. Created a new account and user can login", Toast.LENGTH_LONG).show();
        } else if(loginButton.isPressed()) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}
