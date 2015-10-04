package com.example.maria.appcitas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Informacion extends Activity implements View.OnClickListener
{

    TextView tvCargo;
    TextView tvNombre;
    TextView tvCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.informacion);

        tvNombre = (TextView) findViewById(R.id.nombre);
        tvCorreo = (TextView) findViewById(R.id.tvCorreo);
        tvCargo = (TextView) findViewById(R.id.tvCargo);

        String opcion;
        opcion = getIntent().getStringExtra("opcion");

        if (opcion.equals("1"))
        {
            tvNombre.setText("JORGE ELIÉCER CAMARGO MENDOZA, PhD.");
            tvCargo.setText("DECANO");
            tvCorreo.setText("decano.sistemas@uan.edu.co");
        }

        if (opcion.equals("2"))
        {
            tvNombre.setText("María Nury Escobar, MSc.");
            tvCargo.setText("COORDINADOR ACADÉMICO");
            tvCorreo.setText("coordinador.sistemas2@uan.edu.co");
        }

        if (opcion.equals("3"))
        {
            tvNombre.setText("Alexandra María Silva Monsalve, MSc.");
            tvCargo.setText("COORDINADOR ACREDITACIÓN Y AUTOEVALUACIÓN");
            tvCorreo.setText("acreditacion.sistemas@uan.edu.co");
        }


        if (opcion.equals("4"))
        {
            tvNombre.setText("Fredy Peréz Morales, MSc.");
            tvCargo.setText("COORDINADOR  EXTENSIÓN");
            tvCorreo.setText("extension.sistemas@uan.edu.co");
        }

        if (opcion.equals("5"))
        {
            tvNombre.setText("Fredy Peréz Morales, MSc.");
            tvCargo.setText("COORDINADOR ESPECIALIZACIÓN");
            tvCorreo.setText(" coordinador.ies@uan.edu.co");
        }

        if (opcion.equals("6"))
        {
            tvNombre.setText("María Alejandra García Jaramillo, PhD.");
            tvCargo.setText("DIRECTOR UDCI");
            tvCorreo.setText("directorudci.sistemas@uan.edu.co");
        }

    }

    @Override
    public void onClick(View v)
    {

    }
}