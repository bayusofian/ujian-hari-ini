package com.stmikpnk.registeractivity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.service.autofill.SavedDatasetsInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signup extends AppCompatActivity {
    EditText username,password,email;
    Button Simpan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        username = (EditText) findViewById(R.id.username2);
        password = (EditText) findViewById(R.id.password2);
        email =(EditText) findViewById(R.id.email1);
        Simpan= (Button) findViewById(R.id.register2);
        Simpan.setOnClickListener(new View.OnClickListener() {
            private void Save(String username, String password, String email){
            }
            public void onClick(View view) {
                String usernameRegister=username.getText().toString();
                String passwordRegister=password.getText().toString();
                String email1Register=email.getText().toString();
                SavedDatasetsInfo email,password,username;
                Toast.makeText(signup.this, "your username is "+usernameRegister,Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(signup.this,MainActivity.class);
                signup.this.startActivity(intent);
            }
        });

    }
}
