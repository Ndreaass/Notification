package com.id.ac.budiluhur.notification;

import androidx.appcompat.app.AppCompatActivity;

import android.app.NotificationChannel;
import android.os.Build;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    final String CHANNEL_ID = "contoh chanel";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createNotificationChannel();
    }

    private void createNotificationChannel(){
        //create Notification channel hanya di versi 26+
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            CharSequence name = "Contoh Channel";
            String description = "Deskripsi Channel";

            NotificationChannel channel = new NotificationChannel(CHANNEL_ID,)
        }
    }
}