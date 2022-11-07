package com.example.a02botones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tit_nombre, tit_edad, sexo, tit_profesion, tit_hobbies, resultado;
    EditText nombre, edad;
    RadioButton opcionFemenino, opcionMasculino;
    Spinner lista_profesiones;
    CheckBox opcion1, opcion2, opcion3;
    Button boton_enviar, boton_limpiar;










    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opcion1= findViewById(R.id.opcion1);
        opcion2= findViewById(R.id.opcion2);
        opcion3= findViewById(R.id.opcion3);
        boton_limpiar= findViewById(R.id.boton_limpiar);
        boton_enviar = findViewById(R.id.boton_enviar);
        opcionFemenino = findViewById(R.id.opcionFemenino);
        opcionMasculino = findViewById(R.id.opcionMasculino);




        nombre.setOnEditorActionListener(new TextView.OnEditorActionListener() {
           public boolean onEditorAction(TextView textview, int actionID, KeyEvent keyEvent){
               if(actionID == EditorInfo.IME_ACTION_GO){
                    resultado.setText(nombre.getText());

                    InputMethodManager imm =(InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(nombre.getWindowToken(), 0);
                    return true;

               }
                return false;

           }



        });

        edad.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public boolean onEditorAction(TextView textview, int actionID, KeyEvent keyEvent){
                if(actionID == EditorInfo.IME_ACTION_GO){
                    resultado.setText(edad.getText());

                    InputMethodManager imm =(InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(edad.getWindowToken(), 0);
                    return true;

                }
                return false;

            }



        });

        boton_enviar.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                boton_enviar.setText(" Enviado ");
            }
        });

        boton_limpiar.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                boton_limpiar.setText(" rellene de nuevo los campos ");
            }
        });




        opcion1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isChecked = ((CheckBox)view).isChecked();

                if(isChecked){
                    opcion1.setText("opcion 1 marcado");
                }
                else{
                    opcion1.setText("opcion 1 no marcado");

                }
            }
        });


        opcion2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isChecked = ((CheckBox)view).isChecked();

                if(isChecked){
                    opcion2.setText("opcion 2 marcado");
                }
                else{
                    opcion2.setText("opcion 2 no marcado");

                }
            }
        });


        opcion3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isChecked = ((CheckBox)view).isChecked();

                if(isChecked){
                    opcion3.setText("opcion 3 marcado");
                }
                else{
                    opcion3.setText("opcion 3 no marcado");

                }
            }
        });

        View.OnClickListener list = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String opcion = "";
                switch(view.getId()){
                    case R.id.opcionFemenino:
                        opcion = "opcion 1";
                        break;
                    case R.id.opcionMasculino:
                        opcion = "opcion 2";
                        break;
                }
                resultado.setText("ID opcion seleccionada: " + opcion);

            }
        };
        opcionFemenino.setOnClickListener(list);
        opcionMasculino.setOnClickListener(list);


        };







    }




