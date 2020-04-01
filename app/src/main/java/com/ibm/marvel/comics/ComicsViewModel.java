package com.ibm.marvel.comics;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ibm.marvel.model.comics.Comics;
import com.ibm.marvel.network.Repository;

public class ComicsViewModel extends ViewModel {

    private MutableLiveData<Comics> mutableLiveData;
    private Repository repository;

    public void init(long id) {
        if (mutableLiveData != null) {
            return;
        }

        repository = Repository.getInstance();
        mutableLiveData = repository.getComics(id);
    }

    public LiveData<Comics> getMutableLiveData() {
        return mutableLiveData;
    }
}