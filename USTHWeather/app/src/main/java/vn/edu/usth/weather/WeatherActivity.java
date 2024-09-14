package vn.edu.usth.weather;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.ComponentActivity;

public class WeatherActivity extends ComponentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the user interface layout for this Activity
        // The layout file is defined in the project res/layout/main_activity.xml fi
        setContentView(R.layout.main);

        // Initialize member TextView so we can manipulate it later
        TextView mTextView = (TextView) findViewById(R.id.text_message);
        mTextView.setText("Welcome hehe!!!")
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onPause() {
        super.onPause();

        if (mCamera != null) {
            mCamera.release();
            mCamera = null;
        }
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
