package com.example.antcash;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class ResultActivity extends AppCompatActivity {

    private TextView txtNombreResult, txtMontoResult, txtDescripcionResult, txtFijoResult;
    private Button btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Carga el layout XML del resumen
        setContentView(R.layout.activity_result);

        // Vincular los elementos del layout
        txtNombreResult = findViewById(R.id.txtNombreResult);
        txtMontoResult = findViewById(R.id.txtMontoResult);
        txtDescripcionResult = findViewById(R.id.txtDescripcionResult);
        txtFijoResult = findViewById(R.id.txtFijoResult);
        btnSalir = findViewById(R.id.btnSalir);

        // Recuperar datos enviados desde FormActivity
        Intent intent = getIntent();
        String nombre = intent.getStringExtra("nombre");
        String monto = intent.getStringExtra("monto");
        String descripcion = intent.getStringExtra("descripcion");
        boolean esFijo = intent.getBooleanExtra("fijo", false);

        // Mostrar los datos en los TextViews (evitando que se muestre null)
        txtNombreResult.setText("Nombre: " + (nombre != null ? nombre : ""));
        txtMontoResult.setText("Monto: " + (monto != null ? monto : ""));
        txtDescripcionResult.setText("Descripción: " + (descripcion != null ? descripcion : ""));
        txtFijoResult.setText("Gasto Fijo: " + (esFijo ? "Sí" : "No"));

        // Configurar el botón para salir de la app
        btnSalir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                finishAffinity(); // Cierra todas las actividades y finaliza la aplicación
            }
        });
    }
}
