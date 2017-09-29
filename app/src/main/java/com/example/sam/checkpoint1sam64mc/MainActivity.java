package com.example.sam.checkpoint1sam64mc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nom = (EditText) findViewById(R.id.nom);
        final EditText prenom = (EditText) findViewById(R.id.prenom);
        final EditText ecole = (EditText) findViewById(R.id.ecole);
        final EditText langage = (EditText) findViewById(R.id.langage);


        final Button boutonEnvoyer = (Button) findViewById(R.id.boutonEnvoyer);

        boutonEnvoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nom.getText().toString().isEmpty() || prenom.getText().toString().isEmpty() || ecole.getText().toString().isEmpty() || langage.getText().toString().isEmpty() ){
                    Toast.makeText(MainActivity.this,"Merci de renseigner tous les champs du formulaire",Toast.LENGTH_LONG).show();
                }else {
                    //Implémente le passage de données entre SearchItineraryActivity et ViewSearchItineraryResultsListActivity.

                    Intent intent = new Intent(MainActivity.this, StudentActivity.class);
                    StudentModel studentModel  = new StudentModel(nom.getText().toString(),prenom.getText().toString(),ecole.getText().toString(),langage.getText().toString());
                    intent.putExtra("les4",studentModel);
                    startActivity(intent);

                }

            }
        });
    }
}
