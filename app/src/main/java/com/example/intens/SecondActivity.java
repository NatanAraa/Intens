package com.example.intens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener
{
    TextView tvNama, tvInstitusi;
    Button btnPindahActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvNama= findViewById(R.id.tv_nama);
        tvInstitusi = findViewById(R.id.tv_institusi);

        btnPindahActivity=findViewById(R.id.btn_pindah_activity);

        btnPindahActivity.setOnClickListener(this);

        String Nama = getIntent().getStringExtra(MainActivity.EXTRA_NAMA);
        String Institusi = getIntent().getStringExtra(MainActivity.EXTRA_INSTITUSI);

        if(TextUtils.isEmpty(Nama))
        {
            tvNama.setText("Nama : ");
        }
        else
        {
            tvNama.setText("Nama : "+ Nama);
        }

        if (TextUtils.isEmpty(Institusi))
        {
            tvInstitusi.setText("Asal Institusi : ");
        }
        else
        {
            tvInstitusi.setText("Asal Istitusi : " + Institusi);
        }
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.btn_pindah_activity:
                pindahActivity();
                break;

            default:
                break;
        }
    }

    private void pindahActivity()
    {
        Intent moveIntent = new Intent( SecondActivity.this, ThirdActivity.class);
        startActivity(moveIntent);
    }
}