package com.polbins.databindingsample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.polbins.databindingsample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "Clicked.", Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("Gorgonio", "Magalpoc");
        binding.setUser(user);
        binding.setHandler(mOnClickListener);
    }

}


