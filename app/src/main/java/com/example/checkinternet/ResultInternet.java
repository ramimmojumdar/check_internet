package com.example.checkinternet;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.airbnb.lottie.LottieAnimationView;

public class ResultInternet extends AppCompatActivity {

    LottieAnimationView animationView, animationView2;
    TextView text;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_internet);

        animationView = findViewById(R.id.animationView);
        animationView2 = findViewById(R.id.animationView2);
        text = findViewById(R.id.text);

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        if (networkInfo!=null && networkInfo.isConnected()){
            animationView2.setVisibility(View.VISIBLE);
            text.setText("Internet is Connected");
        }else {
            animationView.setVisibility(View.VISIBLE);
            text.setText("Internet is not Connected");
        }

    }
}