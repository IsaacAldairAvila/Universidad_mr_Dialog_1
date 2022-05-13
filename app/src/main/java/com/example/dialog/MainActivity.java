package com.example.dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvnombre;
    TextView tvpassword;
    Button clickb;
    AlertDialog alerta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvnombre = (TextView) findViewById(R.id.textusuario);
        tvpassword = (TextView) findViewById(R.id.textpassword);
        clickb = (Button) findViewById(R.id.button);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Ingrese datos");

        View view = getLayoutInflater().inflate(R.layout.custom_dialog, null);
        EditText eUser, ePass;
        Button guardardatos = view.findViewById(R.id.guardar);
        eUser = view.findViewById(R.id.etnombre);
        ePass = view.findViewById(R.id.etpassword);
        guardardatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        guardardatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvnombre.setText(eUser.getText().toString());
                tvpassword.setText(ePass.getText().toString());
                alerta.dismiss();

            }
        });

        builder.setView(view);
        alerta = builder.create();

        clickb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alerta.show();
            }
        });
    }
}