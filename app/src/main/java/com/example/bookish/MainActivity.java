package com.example.bookish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {
    public Button login;
    private Firebase FB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Firebase.setAndroidContext(this);
        FB= new Firebase("https://bookish-d2afb.firebaseio.com/");


        login= findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Firebase FBchild1= FB.child("Location");
                FBchild1.setValue("testLocation");
            }

        }


        );
    }




}
