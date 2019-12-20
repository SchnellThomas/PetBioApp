package com.example.petbioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView dogView;
    private ImageView catView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dogView = (ImageView) findViewById(R.id.dogId);
        catView = (ImageView) findViewById(R.id.catId);

        dogView.setOnClickListener(this);
        catView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.dogId:
                //go to second dog activity
                Intent dogIntent = new Intent(this, BioActivity.class);
                dogIntent.putExtra("name", "Jade");
                dogIntent.putExtra("bio", "German Shepherd Puppy! Loves people, to play with balls, and sleeping.");
                startActivity(dogIntent);
                //Toast.makeText(this, "Dog", Toast.LENGTH_LONG).show();
                break;

            case R.id.catId:
                //go to second cat activity
                Intent catIntent = new Intent(this, BioActivity.class);
                catIntent.putExtra("name", "Sherman");
                catIntent.putExtra("bio", "Kitty that dislikes humans and does not get along with other cats.");
                startActivity(catIntent);
                //Toast.makeText(this, "Cat", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
