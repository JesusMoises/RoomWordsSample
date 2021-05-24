package com.example.roomwordssample;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class WordViewModel extends AndroidViewModel {

    private WordRepository mRepository;
    private LiveData<List<Word>> mAllWords;

    /**
     * constructor
     * @param application
     */
    public WordViewModel(@NonNull Application application) {
        super(application);
        mRepository = new WordRepository(application);
        mAllWords = mRepository.getAllWords();
    }//fin del método WordVewModel

    /**
     * Método LiveData par aobtener las palabras
     * @return
     */
    LiveData<List<Word>> getAllWords() {
        return mAllWords;
    }//fin del LiveData

    /**
     * Método insert
     * @param word
     */
    public void insert(Word word) {
        mRepository.insert(word);
    }//fin del insert
    
}//fin de la clase WordViewModel
