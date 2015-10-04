package com.example.maria.appcitas;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener {

    TextView tvDecano;
    TextView tvcorAcad;
    TextView tvcorAcreAuto;
    TextView tvCorExt;
    TextView tvCorEsp;
    TextView tvDirUdci;
    TextView tvNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDecano = (TextView) findViewById(R.id.tvdecano);
        tvcorAcad = (TextView) findViewById(R.id.tvcorAca);
        tvcorAcreAuto = (TextView) findViewById(R.id.tvcorAcreAuto);
        tvCorExt = (TextView) findViewById(R.id.tvcorExt);
        tvCorEsp = (TextView) findViewById(R.id.tvcorEspe);
        tvDirUdci = (TextView) findViewById(R.id.tvdirUdci);
        tvNombre = (TextView) findViewById(R.id.nombre);

        tvDecano.setOnClickListener(this);
        tvcorAcad.setOnClickListener(this);
        tvcorAcreAuto.setOnClickListener(this);
        tvCorExt.setOnClickListener(this);
        tvCorEsp.setOnClickListener(this);
        tvDirUdci.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if ( v == tvDecano )
        {
            Toast.makeText(getApplicationContext(), "Decano", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(MainActivity.this, Informacion.class);
            i.putExtra("opcion","1");
            startActivity(i);
            tvDecano.setTextColor(Color.BLUE);
        }

        if ( v == tvcorAcad )
        {
            Toast.makeText(getApplicationContext(), "Coordinadora Académica", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, Informacion.class);
            intent.putExtra("opcion", "2");
            startActivity(intent);
            tvcorAcad.setTextColor(Color.BLUE);
        }

        if ( v == tvcorAcreAuto )
        {
            Toast.makeText(getApplicationContext(), "Coordinadora Acreditación y autoevaluación", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, Informacion.class);
            intent.putExtra("opcion", "3");
            startActivity(intent);
            tvcorAcreAuto.setTextColor(Color.BLUE);
        }

        if ( v == tvCorExt )
        {
            Toast.makeText(getApplicationContext(), "Coordinador Extensión", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, Informacion.class);
            intent.putExtra("opcion", "4");
            startActivity(intent);
            tvCorExt.setTextColor(Color.BLUE);
        }

        if ( v == tvCorEsp )
        {
            Toast.makeText(getApplicationContext(), "Coordinador Especialización", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, Informacion.class);
            intent.putExtra("opcion", "5");
            startActivity(intent);
            tvCorEsp.setTextColor(Color.BLUE);
        }
        if ( v == tvDirUdci )
        {
            Toast.makeText(getApplicationContext(), "Directora UDCI", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, Informacion.class);
            intent.putExtra("opcion", "6");
            startActivity(intent);
            tvDirUdci.setTextColor(Color.BLUE);
        }

    }
}
