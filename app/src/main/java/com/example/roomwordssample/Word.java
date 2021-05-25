package com.example.roomwordssample;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "word_table")
public class Word {


    @PrimaryKey(autoGenerate = true)
    private int id;

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
     * Constructor
     * @param word
     */
    @Ignore
    public Word(int id, @NonNull String word) {
        this.id = id;
        this.mWord = word;
    }//fin del constructor


    /**
     * método get para obtener la palabra
     * @return
     */
    public String getWord(){
        return this.mWord;
    }//fin del método getWord

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

}//fin de la clase Word
