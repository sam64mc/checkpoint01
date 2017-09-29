package com.example.sam.checkpoint1sam64mc;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

/**
 * Created by sam on 29/09/17.
 */
 // declaration classe StudentModel

public class StudentModel implements Parcelable {
    //attributs
    private String nom;
    private String prenom;
    private String ecole;
    private String langage;

    //getter

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEcole() {
        return ecole;
    }

    public String getLangage() {
        return langage;
    }

    // constructeur de portee public qui prend comme arguments des Strings

    public StudentModel(String nom, String prenom, String ecole, String langage) {
        this.nom = nom;
        this.prenom = prenom;
        this.ecole = ecole;
        this.langage = langage;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nom);
        dest.writeString(prenom);
        dest.writeString(ecole);
        dest.writeString(langage);
    }

    public StudentModel(Parcel in) {
        nom = in.readString();
        prenom = in.readString();
        ecole = in.readString();
        langage = in.readString();

    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Parcelable.Creator<StudentModel> CREATOR = new Parcelable.Creator<StudentModel>() {
        @Override
        public StudentModel createFromParcel(Parcel source) {
            return new StudentModel(source);
        }

        @Override
        public StudentModel[] newArray(int size) {
            return new StudentModel[size];
        }
    };

}










