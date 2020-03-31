package com.ibm.marvel.characters;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ibm.marvel.model.characters.Characters;
import com.ibm.marvel.network.Repository;

public class CharactersModel {

    public static class CharactersViewModel extends ViewModel {

        private MutableLiveData<Characters> mutableLiveData;
        private Repository repository;

        public void init() {
            if (mutableLiveData != null) {
                return;
            }

            repository = Repository.getInstance();
            mutableLiveData = repository.getCharacters();
        }

        public LiveData<Characters> getMutableLiveData() {
            return mutableLiveData;
        }
    }

    protected static class CharactersResponse {

    }

    protected static class CharactersRequest {

    }
}