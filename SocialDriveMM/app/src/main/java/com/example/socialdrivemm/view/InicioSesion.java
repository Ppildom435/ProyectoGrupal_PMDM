package com.example.socialdrivemm.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.socialdrivemm.R;

public class InicioSesion extends AppCompatActivity implements View.OnClickListener {

    private Button siguiente;

    private EditText usuario;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_sesion);

        //Instanciamos el botón acceder
        siguiente = findViewById(R.id.acceder);
        siguiente.setOnClickListener(this);

        usuario = findViewById(R.id.usuario);
        password = findViewById(R.id.password);



    }

    @Override
    public void onClick(View view) {
        Intent acceder = new Intent(this, MainActivity.class);

        if (usuario.equals("") && password.equals("")){
            Toast.makeText(this, "Necesitas introducir datos para acceder", Toast.LENGTH_LONG).show();
        }else{
            startActivity(acceder);
        }

    }
}
