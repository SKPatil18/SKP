package com.example.signup_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity implements View.OnClickListener {
    EditText l_user,l_pass;
    Button btnlogin;
    String user,pass;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        l_user=(EditText) findViewById(R.id.l_user);
        l_pass=(EditText) findViewById(R.id.l_pass);
        btnlogin=(Button) findViewById(R.id.l_btn);
        btnlogin.setOnClickListener(this);
        Bundle bundle = getIntent().getBundleExtra("data");
        user = bundle.getString("User");
        pass = bundle.getString("Pass");

    }

    @Override
    public void onClick(View view) {
        String user1 = l_user.getText().toString();
        String pass1 = l_pass.getText().toString();
        if(user.equals(user1) && pass.equals(pass1)){
            Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show();
        }else{
            count++;
            if(count==3){
                btnlogin.setEnabled(false);
                Toast.makeText(this, "Failed Login attempts", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
            }
        }

    }
}
