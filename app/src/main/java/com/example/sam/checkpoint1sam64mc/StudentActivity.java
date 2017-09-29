package com.example.sam.checkpoint1sam64mc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class StudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        StudentModel studentModel = getIntent().getExtras().getParcelable("les4");

        String nom = studentModel.getNom();
        String prenom = studentModel.getPrenom();
        String ecole = studentModel.getEcole();
        String langage = studentModel.getLangage();

        EditText nom1 = (EditText) findViewById(R.id.nom1);
        EditText prenom1 = (EditText) findViewById(R.id.prenom1);
        EditText ecole1 = (EditText) findViewById(R.id.ecole1);
        EditText langage1 = (EditText) findViewById(R.id.langage1);


        //sets the text for TripResultModel name and TripResultModel description from the current TripResultModel object

        nom1.setText(nom);
        prenom1.setText(prenom);
        ecole1.setText(ecole);
        langage1.setText(ecole);


    }
}
