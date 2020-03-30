package com.ibm.marvel.network;

import androidx.lifecycle.MutableLiveData;
import com.ibm.marvel.model.comics.Comics;
import com.ibm.marvel.model.details.Details;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repository {

    private static final int TIMESTAMP = 1;
    private static final String KEY = "65e07d9042f909a55a065d612b896b46";
    private static final String HASH = "9e9279ac60f79c53701828883b4c5298";

    private static Repository repository;

    private API api;

    private Repository() {
        api = Service.createService(API.class);
    }

    public static Repository getInstance() {
        if (repository == null) {
            repository = new Repository();
        }

        return repository;
    }

    public MutableLiveData<Details> getDetails(long identifier) {

        MutableLiveData<Details> data = new MutableLiveData<>();

        api.getDetails(identifier, TIMESTAMP, KEY, HASH).enqueue(new Callback<Details>() {
            @Override
            public void onResponse(Call<Details> call, Response<Details> response) {
                if (response.isSuccessful()){
                    data.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<Details> call, Throwable t) {
                data.setValue(null);
            }
        });

        return data;
    }

    public MutableLiveData<Comics> getComics(long identifier) {

        MutableLiveData<Comics> data = new MutableLiveData<>();

        api.getComics(identifier, TIMESTAMP, KEY, HASH).enqueue(new Callback<Comics>() {
            @Override
            public void onResponse(Call<Comics> call, Response<Comics> response) {
                if (response.isSuccessful()){
                    data.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<Comics> call, Throwable t) {
                data.setValue(null);
            }
        });

        return data;
    }
}