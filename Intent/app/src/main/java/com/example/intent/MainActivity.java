package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText editPhone;
    Button btnPhone;
    public Button btnActivity;
    Button btnBrowser;
    Button btnWifi;
    Button btnApps;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPhone = findViewById(R.id.editPhone);
        btnPhone = findViewById(R.id.btnPhone);
        btnActivity = findViewById(R.id.btnActivity);
        btnBrowser = findViewById(R.id.btnBrowser);
        btnWifi = findViewById(R.id.btnWifi);
        btnApps = findViewById(R.id.btnApps);

        btnActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent( view.getContext() ,OtherActivity.class );
                startActivity(intent);
            }
        });

        btnWifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Settings.ACTION_WIFI_SETTINGS);
                if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
                }
            }
        })
        ;
        btnBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
         public void onClick(View view) {
         Intent intent = new Intent(Intent.ACTION_VIEW);
         intent.setData(Uri.parse("https://www.google.com/"));
         startActivity(intent);
}
}
        );

        btnPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + editPhone));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);

            }
        };

    })





        ;}

}