package com.progmobile.golfcompetition.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.progmobile.golfcompetition.enums.BracoForte;

@Entity
public class Jogador {
    @PrimaryKey(autoGenerate = true)
    private int Id;

    public String HandCap;

    public BracoForte BracoForte;

    public String NomeClube;

    public int IdUsuario;

}
