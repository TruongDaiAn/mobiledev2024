package vn.edu.usth.weather;

public class fragment_forecast extends ForecastFragment{
    public View onCreateView(LayoutInflater inflater, ViewGroup container,...) {
        return inflater.inflate(R.layout.fragment_layout, container, false);
    }
}


<LinearLayout
xmlns:android="http://schemas.android.com/apk/res/android"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:orientation="horizontal">


android:layout_width="match_parent"
android:layout_height="0dp"
android:layout_weight="1"
android:background="@android:color/holo_blue_light"
android:padding="16dp">


android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Forecast"
android:textColor="@android:color/white"
android:textSize="18sp"/>
    </LinearLayout>

    <!-- Other content or UI elements below the forecast area -->
    <TextView
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Additional information here"/>

</LinearLayout>





















