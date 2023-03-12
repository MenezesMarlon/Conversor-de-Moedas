package com.menezesmarlon.conversordemoedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editValorDolar;
    private EditText editCotacaoDolar;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editValorDolar = findViewById(R.id.valorDolar);
        editCotacaoDolar = findViewById(R.id.cotacaoDolar);
        textResultado = findViewById(R.id.textResultado);

    }

    public void converter(View view) {


        if (editValorDolar.getText().toString().isEmpty()) {
            editValorDolar.setError("Insira um valor em Dólar");
            return;
        }

        if (editCotacaoDolar.getText().toString().isEmpty()) {
            editCotacaoDolar.setError("Insira um valor em Dólar");
            return;
        }


        try {
            Double valorDolar = Double.parseDouble(editValorDolar.getText().toString());
            Double cotacaoDolar = Double.parseDouble(editCotacaoDolar.getText().toString());
            Double resultado = valorDolar * cotacaoDolar;
            textResultado.setText("Valor Convertido em Real: " + resultado);
        } catch (NumberFormatException e) {
            textResultado.setText("Valores inválidos. Por favor, insira números válidos.");
        }

    }
}
