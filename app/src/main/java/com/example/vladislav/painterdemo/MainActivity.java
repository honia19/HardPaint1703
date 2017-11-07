package com.example.vladislav.painterdemo;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_new_tab:
                Toast.makeText(getApplicationContext(),"Stub new tab",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_save_file:
                Toast.makeText(getApplicationContext(),"Stub save file",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_open_file:
                Toast.makeText(getApplicationContext(),"Stub open file",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_close:
                Toast.makeText(getApplicationContext(),"Stub close",Toast.LENGTH_SHORT).show();
                break;
            case android.R.id.home:
                Intent intent = new Intent(MainActivity.this,Preferences.class);
                startActivity(intent);
                return true;

        }
        return super.onOptionsItemSelected(item);
    }
}
