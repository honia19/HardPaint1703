package com.example.vladislav.painterdemo;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Locale;

public class Preferences extends AppCompatActivity   {

    RadioButton rb_def_theme,
                rb_green_theme,
                rb_def_lang,
                rb_uk_lang,
                rb_ru_lang;
    RadioGroup rg_1,
               rg_2;
    Locale locale = null;
    Configuration config = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);

        rb_def_lang = findViewById(R.id.rb_def_lang);
        rb_uk_lang = findViewById(R.id.rb_uk_lang);
        rb_ru_lang = findViewById(R.id.rb_ru_lang);
        rb_def_theme = findViewById(R.id.rb_def_theme);
        rb_green_theme = findViewById(R.id.rb_green_theme);
        rg_1 = findViewById(R.id.rg_1);
        rg_2 = findViewById(R.id.rg_2);
        rg_1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                switch (checkedId){
                    case R.id.rb_def_theme:
                        Utils.changeToTheme(Utils.THEME_DEFAULT);
                        break;
                    case R.id.rb_green_theme:
                        Utils.changeToTheme(Utils.THEME_GREEN);
                        break;

                }

            }
        });
        rg_2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch (checkedId){
                    case R.id.rb_def_lang:
                        locale = new Locale("en","EN");
                        config = getBaseContext().getResources().getConfiguration();
                        config.locale = locale;
                        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
                        break;
                    case R.id.rb_uk_lang:
                        locale = new Locale("uk","UK");
                        config = getBaseContext().getResources().getConfiguration();
                        config.locale = locale;
                        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
                        break;
                    case R.id.rb_ru_lang:
                        locale = new Locale("ru","RU");
                        config = getBaseContext().getResources().getConfiguration();
                        config.locale = locale;
                        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
                        break;
                }

            }
        });
    }
}
