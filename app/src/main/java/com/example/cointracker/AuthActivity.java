package com.example.cointracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;

public class AuthActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_auth);
  }
  public String getJeton() {
    SharedPreferences prefs = getSharedPreferences("UserToken", MODE_PRIVATE);
    // Fait tous les contrôles puis, si c'est bon ...
    // alors il fait le return ci dessous, sinon, il faudrait prévoir un autre return
    return "LeBonJeton";
  }
}
