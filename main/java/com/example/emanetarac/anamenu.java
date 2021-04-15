package com.example.emanetarac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class anamenu extends AppCompatActivity {

    Button destek;
    Button mailBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anamenu);
        tanimla();
        cagriYap();
        mail();

    }
    public void tanimla(){
        destek=findViewById(R.id.btnDestek);

    }
    public void cagriYap(){
        destek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tel="05417607685";
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+tel));
                startActivity(intent);
            }
        });
    }
    public void mail(){
     mailBtn.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             try{
                 Intent intent = new Intent(anamenu.this,mailgonder.class);//getApplicationContext
                 startActivity(intent);
             }catch(Exception e){
                 Toast.makeText(getApplicationContext(), " "+e,Toast.LENGTH_LONG).show();
             }

         }
     });
    }

}