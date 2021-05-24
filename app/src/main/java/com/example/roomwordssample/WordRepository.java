package com.example.roomwordssample;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

public class WordRepository {

    private WordDao mWordDao;
    private LiveData<List<Word>> mAllWords;

    /**
     * Constructor
     * @param application
     */
    WordRepository(Application application) {
        WordRoomDatabase db = WordRoomDatabase.getDatabase(application);
        mWordDao = db.wordDao();
        mAllWords = mWordDao.getAllWords();
    }//fin del constructor

    /**
     * Ejecuta las consultas
     * LiveData notificará al usaurio cuando los datos cambien
     * @return
     */
    LiveData<List<Word>> getAllWords() {
        return mAllWords;
    }//fin del LiveData

    /**
     * método insert
     * @param word
     */
    public void insert (Word word) {
        new insertAsyncTask(mWordDao).execute(word);
    }//fin del método insert

    /**
     * Clae insertAsyncTask
     */
    private static class insertAsyncTask extends AsyncTask<Word, Void, Void> {
        //declaración de campos
        private WordDao mAsyncTaskDao;

        /**
         * Método insertAsyncTask
         * @param dao
         */
        insertAsyncTask(WordDao dao) {
            mAsyncTaskDao = dao;
        }//fin del método insertAsyncTask

        /**
         * Método doInBackground
         * @param params
         * @return
         */
        @Override
        protected Void doInBackground(final Word... params) {
            mAsyncTaskDao.insert(params[0]);
            return null;
        }//fin del método doInBackground
        
    }//fin de la clase insertAsyncTask

}//fin de la clase WordRepository
