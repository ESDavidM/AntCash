package com.example.antcash;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity {

    private EditText edtNombre, edtMonto, edtDescripcion;
    private CheckBox chkFijo;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Carga el layout XML del formulario
        setContentView(R.layout.activity_form);

        // Vincular componentes del layout
        edtNombre = findViewById(R.id.edtNombre);
        edtMonto = findViewById(R.id.edtMonto);
        edtDescripcion = findViewById(R.id.edtDescripcion);
        chkFijo = findViewById(R.id.chkFijo);
        btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(view -> {
            // Recopilar datos del formulario
            String nombre = edtNombre.getText().toString();
            String monto = edtMonto.getText().toString();
            String descripcion = edtDescripcion.getText().toString();
            boolean esFijo = chkFijo.isChecked();

            // Enviar los datos a ResultActivity
            Intent intent = new Intent(FormActivity.this, ResultActivity.class);
            intent.putExtra("nombre", nombre);
            intent.putExtra("monto", monto);
            intent.putExtra("descripcion", descripcion);
            intent.putExtra("fijo", esFijo);
            startActivity(intent);
        });
    }
}
