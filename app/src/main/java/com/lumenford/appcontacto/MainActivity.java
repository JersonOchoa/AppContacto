package com.lumenford.appcontacto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void enviarDatos(View v)
    {
        TextView varNombre = (TextView) findViewById(R.id.txtNombre);
        DatePicker varPicker = (DatePicker) findViewById(R.id.txtFecha);
        TextView varTelefono = (TextView) findViewById(R.id.txtTelefono);
        TextView varEmail = (TextView) findViewById(R.id.txtEmail);
        TextView varDescripcion = (TextView) findViewById(R.id.txtDescripcion);

        if (varNombre.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Debe ingresar nombre de usuario", Toast.LENGTH_SHORT).show();
            findViewById(R.id.txtNombre).requestFocus();
            return;
        }

        if (varTelefono.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Debe ingresar telefono de usuario", Toast.LENGTH_SHORT).show();
            findViewById(R.id.txtTelefono).requestFocus();
            return;
        }

        if (varEmail.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Debe ingresar email de usuario", Toast.LENGTH_SHORT).show();
            findViewById(R.id.txtEmail).requestFocus();
            return;
        }

        varNombre.requestFocus();
        String varFecha = varPicker.getDayOfMonth() + "/" + (varPicker.getMonth() + 1) + "/" + varPicker.getYear();

        Intent intent = new Intent(MainActivity.this, DetalleContacto.class);
        intent.putExtra("Nombre", varNombre.getText().toString());
        intent.putExtra("Fecha", varFecha);
        intent.putExtra("Telefono", varTelefono.getText().toString());
        intent.putExtra("Email", varEmail.getText().toString());
        intent.putExtra("Descripcion", varDescripcion.getText().toString());
        startActivity(intent);
    }
}