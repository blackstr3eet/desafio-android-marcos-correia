package com.ibm.marvel.network;

import com.ibm.marvel.model.comics.Comics;
import com.ibm.marvel.model.details.Details;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface API {

    @GET("characters/{characterId}")
    Call<Details> getDetails(
            @Path("characterId") long identifier,
            @Query("ts") int timestamp,
            @Query("apikey") String key,
            @Query("hash") String hash
    );

    @GET("characters/{characterId}/comics")
    Call<Comics> getComics(
            @Path("characterId") long identifier,
            @Query("ts") int timestamp,
            @Query("apikey") String key,
            @Query("hash") String hash
    );
}