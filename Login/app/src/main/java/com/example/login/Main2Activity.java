package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
EditText etCad;
Spinner spUsd;
TextView etresult;
//Button btnConvert;
    List<Double> rates = new ArrayList<Double>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        etCad = findViewById(R.id.editText3);
        spUsd = findViewById(R.id.spinner2);
        etresult = findViewById(R.id.textView4);
       // btnConvert = findViewById(R.id.button);

        List<String> currency = new ArrayList<>();
        currency.add("United Staes of America(USD)");
        currency.add("Europe(EUR)");
        currency.add("Australia(AUD)");
        currency.add("British Pound(GBP)");
        currency.add("Indian Rupee(INR)");
        currency.add("Belize(BZD)");
        currency.add("Bahamian(BSD)");
        currency.add("Afghan(AFN)");

        rates.add(0.75);
        rates.add(0.68);
        rates.add(1.10);
        rates.add(0.58);
        rates.add(53.34);
        rates.add(0.54);
        rates.add(0.74);
        rates.add(0.78);

        spUsd=findViewById(R.id.spinner2);

        //create an adapter and fill it from the list
        ArrayAdapter<String> jobAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,currency);
        //make the drop down style
        jobAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        //fill the spinner with the adapter items
        spUsd.setAdapter(jobAdapter);
        spUsd.setOnItemSelectedListener(this);
        etCad = findViewById(R.id.editText3);

       // btnConvert.setOnClickListener(this);
    }

  //  @Override
   // public void onClick(View view)
   // {
   //     if(etCad.getText().toString().equals(""))
      // {
     //       Toast.makeText(getApplicationContext(), "Enter the amount in CAD", Toast.LENGTH_SHORT).show();
     //  }
      //  else
      // {
      //      double cad = Double.parseDouble(etCad.getText().toString());

      // }
 //  }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View v, int i, long l)
    {

        if(etCad.getText().toString().trim().equals(""))
        {
            Toast.makeText(getApplicationContext(), "Enter the amount in CAD", Toast.LENGTH_SHORT).show();
        }
        else {
            double cad = Double.parseDouble(etCad.getText().toString());
            double result = cad * rates.get(i);
            Double Amt = new Double(result);
            etresult.setText(Amt.toString());
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView)
    {

    }


}
