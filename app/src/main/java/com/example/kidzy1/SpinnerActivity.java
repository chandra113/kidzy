package com.example.kidzy1;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class SpinnerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner_activity);

        Spinner spinGender = findViewById(R.id.spinner1);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Spinner_gender, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinGender.setAdapter(adapter);
        spinGender.setOnItemSelectedListener(this);

//        Spinner spinUmur = findViewById(R.id.spinner2);
//        spinUmur.setOnItemSelectedListener(this);

//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
//                this,
//                R.array.Spinner_gender,
//                and
//        );


//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, gender);
//
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinUmur.setAdapter(adapter);

    }
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position,long id) {
        //Toast.makeText(getApplicationContext(), "Selected User: "+gender[position] ,Toast.LENGTH_SHORT).show();
        String text = adapterView.getItemAtPosition(position).toString();
        Toast.makeText(this, adapterView.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
    }



    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        // TODO - Custom Code
    }

}