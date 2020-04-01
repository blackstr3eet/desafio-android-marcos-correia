package com.ibm.marvel.details;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ibm.marvel.model.details.Details;
import com.ibm.marvel.network.Repository;

public class DetailsViewModel extends ViewModel {

    private MutableLiveData<Details> mutableLiveData;
    private Repository repository;

    public void init(long id) {
        if (mutableLiveData != null) {
            return;
        }

        repository = Repository.getInstance();
        mutableLiveData = repository.getDetails(id);
    }

    public LiveData<Details> getMutableLiveData() {
        return mutableLiveData;
    }
}