package com.lumenford.appcontacto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DetalleContacto extends AppCompatActivity {

    private TextView lblNombre;
    private TextView lblFecha;
    private TextView lblTelefono;
    private TextView lblEmail;
    private TextView lblDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_contacto);

        Bundle parametros = getIntent().getExtras();
        String varNombre = parametros.getString("Nombre");
        String varFecha = parametros.getString("Fecha");
        String varTelefono = parametros.getString("Telefono");
        String varEmail = parametros.getString("Email");
        String varDescripcion = parametros.getString("Descripcion");

        lblNombre = findViewById(R.id.lblNombre);
        lblFecha = findViewById(R.id.lblFecha);
        lblTelefono = findViewById(R.id.lblTelefono);
        lblEmail = findViewById(R.id.lblEmail);
        lblDescripcion = findViewById(R.id.lblDescripcion);

        lblNombre.setText(varNombre);
        lblFecha.setText(varFecha);
        lblTelefono.setText(varTelefono);
        lblEmail.setText(varEmail);
        lblDescripcion.setText(varDescripcion);

    }

    public void Editar(View view)
    {
        finish();
    }
}