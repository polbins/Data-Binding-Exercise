package com.polbins.databindingsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private User mUser;
    private TextView mFirstNameTextView;
    private TextView mLastNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUser = new User();
        mUser.setFirstName("Gorgonio");
        mUser.setLastName("Magalpoc");

        mFirstNameTextView = (TextView) findViewById(R.id.first_name_text_view);
        mLastNameTextView = (TextView) findViewById(R.id.last_name_text_view);

        mFirstNameTextView.setText(mUser.getFirstName());
        mLastNameTextView.setText(mUser.getLastName());
    }

}
