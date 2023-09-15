package com.mirzausmanbaig.i190465;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        /*Spinner spinnerDropdownCountry = findViewById(R.id.Country);
        Spinner spinnerDropdownCity = findViewById(R.id.City);

        String[] countries = {
                "Select your Country",
                "Pakistan"
        };

        String[] city1 = {
                "Select your City",
                "Islamabad",
                "Lahore",
                "Faisalabad"
        };

        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, R.layout.spinner_item, countries);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, R.layout.spinner_item, city1);

        spinnerDropdownCountry.setAdapter(adapter1);
        spinnerDropdownCity.setAdapter(adapter2);*/
    }
}