package com.example.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    int counter =3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button btn1=findViewById(R.id.button1);
        Button btn2=findViewById(R.id.button2);
        TextView txt1=findViewById(R.id.textView3);
        EditText edt1 = findViewById(R.id.editTextText1);
        EditText edt2 = findViewById(R.id.editTextText2);
        txt1.setVisibility(View.GONE);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (edt1.getText().toString().equals("admin") && edt2.getText().toString().equals("admin")){
                    startActivity(new Intent(LoginActivity.this,GalleryActivity.class));
                }
                else{
                    txt1.setVisibility(View.VISIBLE);
                    txt1.setBackgroundColor(Color.RED);
                    counter--;
                    txt1.setText(Integer.toString(counter));
                    if(counter==0){
                        btn1.setEnabled(false);
                    }
                }
            }});
    }
}