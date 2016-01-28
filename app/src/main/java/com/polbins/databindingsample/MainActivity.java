package com.polbins.databindingsample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.polbins.databindingsample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private User mUser;

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mUser.setPoints(mUser.getPoints() + 1);
            // That's it, no need to manually update Views
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_main);
        mUser = new User("Gorgonio", "Magalpoc", 0);
        binding.setUser(mUser);
        binding.setHandler(mOnClickListener);
    }

}


