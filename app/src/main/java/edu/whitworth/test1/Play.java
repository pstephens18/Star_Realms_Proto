package edu.whitworth.test1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class Play extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play);
    }

    public void quit(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
