package com.example.finddeviceid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Settings;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView deviceIdView = findViewById(R.id.device_id);

        String device_id = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);

        deviceIdView.setText(device_id);
    }
}
