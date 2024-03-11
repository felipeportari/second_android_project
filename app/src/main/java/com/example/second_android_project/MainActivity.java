package com.example.second_android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText nome;

    private EditText sexo;

    private EditText idade;

    private EditText automovel;

    private TextView value;

    private AutoCompleteTextView editSex;

    private String[] sexList;

    private ArrayAdapter<String> sexAdapter;

    private Spinner sexSpinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("OnCreate", "Entrou no método Oncreate");
        setContentView(R.layout.activity_main);
        nome = (EditText) findViewById(R.id.textTexto1);

        idade = (EditText) findViewById(R.id.textNumber2);

        automovel = (EditText) findViewById(R.id.textNumber1);

        value = (TextView) findViewById(R.id.textShow);

        editSex = (AutoCompleteTextView) findViewById(R.id.textSex1);

        sexList = getResources().getStringArray(R.array.sex_array);

        sexAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, sexList);
        editSex.setAdapter(sexAdapter);

        sexSpinner = (Spinner) findViewById(R.id.sexSpinner);
        sexSpinner.setAdapter(sexAdapter);

    }



    public void buttonCopiarClick(View view){
        Apolice apolice = new Apolice(nome.getText().toString(), Integer.parseInt(idade.getText().toString()), editSex.getText().toString().trim().charAt(0), Double.valueOf(automovel.getText().toString()));
        double valorApolice = apolice.PolicyValue(apolice.getSex(), apolice.getAge(), apolice.getCarValue());
        value.setText(String.valueOf(valorApolice));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("OnStart", "Entrou no método OnStart");
    }

    @Override
    protected void onResume() {
        Log.i("OnResume", "Entrou no método OnResume");
        super.onResume();
    }


}