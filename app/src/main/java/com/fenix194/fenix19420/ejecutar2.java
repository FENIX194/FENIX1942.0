package com.fenix194.fenix19420;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ejecutar2 extends AppCompatActivity {

    private Button BA;
    private EditText Escribe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejecutar2);

        BA = findViewById(R.id.BA);
        Escribe = findViewById(R.id.Escribe);
        BA.setEnabled(false);

        Escribe.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                //Toast.makeText(MainActivity.this, "Texto : " +Escribe.getText(), Toast.LENGTH_SHORT).show();
                if(Escribe.getText().toString().length() < 1){
                    Escribe.setError("Escribe algo");
                    BA.setEnabled(false);
                }else{
                    BA.setEnabled(true);
                }
                return false;
            }
        });
    }
    public void Saludar(View view){
        Toast.makeText(this, "Guardado perro", Toast.LENGTH_LONG).show();
    }
}