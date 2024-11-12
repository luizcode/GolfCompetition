package com.progmobile.golfcompetition.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.progmobile.golfcompetition.enums.SitCampeonato;

import java.util.Date;

@Entity
public class Competicao {
    @PrimaryKey(autoGenerate = true)
    private int Id;

    public String Nome;

    public SitCampeonato SitCampeonato;

    public Date DataRealizacao;

    public int IdResponsavel;

    public int QtdVagas;
}
