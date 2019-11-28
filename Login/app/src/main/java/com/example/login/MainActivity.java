package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
EditText etUsername,etPassword;
Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUsername = findViewById(R.id.editText);
        etPassword = findViewById(R.id.editText2);
        btnLogin = findViewById(R.id.buttonlogin);

        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String user=etUsername.getText().toString();
        String pass=etPassword.getText().toString();
        if(user.equals("admin")&&pass.equals("passworD"))
        {
            Intent act = new Intent(getApplicationContext(),Main2Activity.class);
            startActivity(act);
        }
        else
            Toast.makeText(getApplicationContext(),"Invalid username and password",Toast.LENGTH_SHORT).show();
    }
}
