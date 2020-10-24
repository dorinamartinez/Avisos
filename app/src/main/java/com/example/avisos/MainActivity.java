package com.example.avisos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        //Agregar TAG para invocarlo en estados de la app
        private static final String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //vincula al boton del archivo activity_main.xml con el MainActivity.java
        Button btnMA = findViewById(R.id.btnMA);

        btnMA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ira2 = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(ira2);
            }
        });

        //en el registro de ejecucion se mostrara la accion realizada
        Log.i(TAG, "onCreate");
        //Toast.makeText(this,"La aplicacion se ha creado",Toast.LENGTH_LONG).show();

        Context context = getApplicationContext();
        CharSequence text = "La aplicacion se ha creado";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context,text,duration);
        toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.TOP,0,0);
        toast.show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
       // Toast.makeText(this, "La aplicacion ha iniciado", Toast.LENGTH_SHORT).show();

        Context context = getApplicationContext();
        CharSequence text = "La aplicacion se ha iniciado";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context,text,duration);
        toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.TOP,0,0);
        toast.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume");
        //Toast.makeText(this, "La aplicacion se ha retomado", Toast.LENGTH_SHORT).show();

        /*Context context = getApplicationContext();
        CharSequence text = "La aplicacion se ha retomado";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context,text,duration);
        toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
        toast.show();*/

        //Agregar Toast personalizado
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_perdsonalizado_onresume,(ViewGroup) findViewById(R.id.toast_on_resume));
        TextView texto_Toast = (TextView) layout.findViewById(R.id.texto_Toast);
        texto_Toast.setText("la aplicacion se ha recuperado");

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.TOP,0,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause");
        //Toast.makeText(this, "La aplicacion se encuentra pausada", Toast.LENGTH_SHORT).show();

        Context context = getApplicationContext();
        CharSequence text = "La aplicacion se encuentra pausada";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context,text,duration);
        toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.TOP,0,0);
        toast.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop");
        //Toast.makeText(this, "La aplicacion se ha detenido", Toast.LENGTH_SHORT).show();

        Context context = getApplicationContext();
        CharSequence text = "La aplicacion se ha detenido";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context,text,duration);
        toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.TOP,0,0);
        toast.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy");
        //Toast.makeText(this, "La aplicacion se ha finalizado", Toast.LENGTH_SHORT).show();

        Context context = getApplicationContext();
        CharSequence text = "La aplicacion se ha finalizado";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context,text,duration);
        toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.RIGHT,0,0);
        toast.show();
    }

}