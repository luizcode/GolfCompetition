package com.progmobile.golfcompetition.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.progmobile.golfcompetition.enums.TipoUsuarios;

@Entity
public class Usuarios {
    @PrimaryKey(autoGenerate = true)
    private int Id;

    private String Nome;

    private String CPF;

    private String Email;

    private String Telefone;

    public int TipoUsuarios;

}
