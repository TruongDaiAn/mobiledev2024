package vn.edu.usth.weather;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import vn.edu.usth.weather.databinding.ActivityWeatherActivityyBinding;

public class WeatherActivityy extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityWeatherActivityyBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_weather_activityy);

        View main = findViewById(R.id.main);
        main.set
        // Initialize member TextView so we can manipulate it later
        TextView mTextView = (TextView) findViewById(R.id.text_message);
        mTextView.setText("Welcome hehe!!!")
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Weather", "onStart here");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Weather", "onResume here");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Weather", "onPause here");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Weather", "onStop here");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Weather", "onDestroy here")
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_weather_activityy);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}