package com.example.vladislav.painterdemo;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Locale locale = new Locale("fr");
        Configuration config = getBaseContext().getResources().getConfiguration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());




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
        }
        return super.onOptionsItemSelected(item);
    }
}
