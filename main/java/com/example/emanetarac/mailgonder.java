package com.example.emanetarac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class mailgonder extends AppCompatActivity {


    Button gonder;
    EditText kime;
    EditText konu;
    EditText mesaj;
    String kimeGonderilecek, konusu, mesajIcerik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mailgonder);
        tanimla();
        bilgiAl();
        mesajGonder();
    }

    public void tanimla() {
        gonder = findViewById(R.id.mailGonder);
        kime = findViewById(R.id.kime);
        konu = findViewById(R.id.konu);
        mesaj = findViewById(R.id.mesaj);

    }

    public void bilgiAl() {
        kimeGonderilecek = kime.getText().toString();
        konusu = konu.getText().toString();
        mesajIcerik = mesaj.getText().toString();
    }

    public void mesajGonder() {
        gonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ıntent = new Intent(Intent.ACTION_SEND);
                ıntent.setType("message/rfc82");
                ıntent.putExtra(ıntent.EXTRA_EMAIL, kimeGonderilecek);
                ıntent.putExtra(ıntent.EXTRA_SUBJECT, konusu);
                ıntent.putExtra(ıntent.EXTRA_TEXT, mesajIcerik);
                startActivity(ıntent);
            }
        });

    }
}