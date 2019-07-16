package com.example.inputentry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    string name, email;
    int Fnum;

    EditText nameInput;
    EditText emailInput;
    EditText FnumInput;

    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameInput = (EditText) findViewById(R.id.nameInput);
        emailInput = (EditText) findViewById(R.id.emailInput);
        FnumInput = (EditText) findViewById(R.id.FnumInput);

        submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener (new View.OnClickListener(){
           @Override
            public void onClick(view v) {
               name = nameInput.getText().toString();
               email = nameInput.getText().toString();
               Fnum = Integer.valueof(FnumInput.getText().toString());

               showToast(name);
               showToast(email);
               showToast(Sting.valueOf(Fnum));
           }
        });
    }
}
