package com.progmobile.golfcompetition.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class CompeticaoJogadores {
    @PrimaryKey(autoGenerate = true)
    private int Id;

    public int IdCompeticao;
    
    public int IdJogador;
}
