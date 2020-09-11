package com.example.simplecalculatorapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText a,b;
TextView result;
Button ab,sb,mb,db,modb;
float k=0;
int num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=(EditText)findViewById(R.id.a);
        b=(EditText)findViewById(R.id.b);
        result=(TextView) findViewById(R.id.result);
        ab=(Button) findViewById(R.id.add);
        sb=(Button)findViewById(R.id.sub);
        mb=(Button) findViewById(R.id.mul);
        modb=(Button) findViewById(R.id.mod);
        db=(Button) findViewById(R.id.div);
        if(savedInstanceState!=null && savedInstanceState.containsKey("key_name") ) {
            k=savedInstanceState.getFloat("key_name");
            result.setText(String.valueOf(k));
        }
        ab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(a.getText().toString());
                num2=Integer.parseInt(b.getText().toString());
                k=num1+num2;
                result.setText(String.valueOf(k));
                Toast.makeText( MainActivity.this,"Addition: "+k,Toast.LENGTH_SHORT).show();

            }
        });
        sb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(a.getText().toString());
                num2=Integer.parseInt(b.getText().toString());
                k=num1-num2;
                result.setText(String.valueOf(k));
                Toast.makeText( MainActivity.this,"Subtraction: "+k,Toast.LENGTH_SHORT).show();

            }
        });
        mb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(a.getText().toString());
                num2=Integer.parseInt(b.getText().toString());
                k=num1*num2;
                result.setText(String.valueOf(k));
                Toast.makeText( MainActivity.this,"Multiplication: "+k,Toast.LENGTH_SHORT).show();

            }
        });

        db.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(a.getText().toString());
                num2=Integer.parseInt(b.getText().toString());
                k=num1/num2;
                result.setText(String.valueOf(k));
                Toast.makeText( MainActivity.this,"Division: "+k,Toast.LENGTH_SHORT).show();
            }
        });

        modb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(a.getText().toString());
                num2=Integer.parseInt(b.getText().toString());
                k=num1%num2;
                result.setText(String.valueOf(k));
                Toast.makeText( MainActivity.this,"Mod: "+k,Toast.LENGTH_SHORT).show();
            }
        });


    }
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putFloat("key_name",k);
    }
}