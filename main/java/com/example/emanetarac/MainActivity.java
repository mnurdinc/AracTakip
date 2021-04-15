package com.example.emanetarac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button girisBtn;
    EditText kadi;
    EditText sifre;
    String kullaniciAdi,kullaniciSifre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        giris();

    }
    public void tanimla(){
        girisBtn=findViewById(R.id.girisBtn);
    }
    public void degerAl(){
        kullaniciAdi=kadi.getText().toString();
        kullaniciSifre=sifre.getText().toString();
       // Log.i("degerler",kullaniciAdi+""+kullaniciSifre);
    }
    public void giris(){
        girisBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


               // if(kullaniciAdi.equals("admin") && kullaniciSifre.equals("malatya")){
                    Intent intent = new Intent(MainActivity.this,anamenu.class);//getApplicationContext
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(),"Giriş Başarılı",Toast.LENGTH_LONG).show();
              /*  }
               else
                    Toast.makeText(getApplicationContext(),"Giriş Başarısız", Toast.LENGTH_LONG).show();*/
                
            }
        });
    }



}