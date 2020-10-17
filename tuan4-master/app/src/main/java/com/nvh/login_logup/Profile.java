package com.nvh.login_logup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Profile extends AppCompatActivity {
    private CardView Txt;
    private Button btback,btfoward;
    private TextView btlogout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Txt=(CardView) findViewById(R.id.follow);
        Txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten= new Intent(Profile.this, CustListView.class);
                startActivity(inten);
            }
        });
        btback = (Button) findViewById(R.id.btback);
        btfoward= (Button) findViewById(R.id.btfoward);
        btlogout=(TextView) findViewById(R.id.btlogout);
        btback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(Profile.this,Regiter.class);
                startActivity(intent);
            }
        });
        btfoward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this,CustListView.class);
                startActivity(intent);
            }
        });
        btlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}