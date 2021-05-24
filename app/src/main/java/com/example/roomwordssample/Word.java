package com.example.roomwordssample;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "word_table")
public class Word {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")
    private String mWord;

    /**
     * Constructor
     * @param word
     */
    public Word(@NonNull String word) {
        this.mWord = word;
    }//fin del constructor

    /**
     * método get para obtener la palabra
     * @return
     */
    public String getWord(){
        return this.mWord;

    }//fin del método getWord
}//fin de la clase Word
