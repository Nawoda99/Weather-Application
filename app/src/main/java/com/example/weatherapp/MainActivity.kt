package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var homeRl :RelativeLayout;
    private lateinit var loadingPB : ProgressBar;
    private lateinit var cityName : TextView;
    private lateinit var cityEdit : TextInputEditText;
    private lateinit var backIV : ImageView;
    private lateinit var iconIV : ImageView;
    private lateinit var search: ImageView;
    private lateinit var temp : TextView;
    private lateinit var conditionTV : TextView;
    private lateinit var weatherRv : RecyclerView;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setContentView(R.layout.activity_main);
        homeRl = findViewById(R.id.idRLHome);
        loadingPB = findViewById(R.id.idPBLoading);
        cityName = findViewById(R.id.idTVCityName);
        cityEdit = findViewById(R.id.idEdtCity);
        backIV = findViewById(R.id.idTVCondition);
        iconIV = findViewById(R.id.idRvWeather);
        temp = findViewById(R.id.idTVTemperature);
        conditionTV = findViewById(R.id.idRLHome);
        weatherRv = findViewById(R.id.idRLHome);




    }
}