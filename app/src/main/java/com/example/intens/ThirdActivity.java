package com.example.intens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener
{
    Button btnPindahKeActivity1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        btnPindahKeActivity1=findViewById(R.id.btn_pindah_ke_activity_1);

        btnPindahKeActivity1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.btn_pindah_ke_activity_1:
                pindahKeActivity1();
                break;

            default:
                break;
        }
    }

    private void pindahKeActivity1()
    {
        Intent moveIntent = new Intent( ThirdActivity.this, MainActivity.class);
        startActivity(moveIntent);
    }
}