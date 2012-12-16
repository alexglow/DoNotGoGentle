package com.alexglow.DoNotGoGentle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class DoNotGoGentle extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void showSteps(View view) {
    	System.out.println("Button pushed!");
    	Intent intent = new Intent(this, FindDisplaySteps.class);
        startActivity(intent);
    }

}
