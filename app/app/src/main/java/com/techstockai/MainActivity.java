package com.techstockai;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView tv = new TextView(this);
        tv.setText("🚀 Tech Stock AI is Running Successfully!");
        tv.setTextSize(22);
        tv.setPadding(50, 200, 50, 200);

        setContentView(tv);
    }
}
