package com.ibm.marvel.characters;

import android.content.Intent;
import com.ibm.marvel.details.DetailsActivity;
import java.lang.ref.WeakReference;

interface CharactersRouterInput {
    void callScreen(long id);
}

public class CharactersRouter implements CharactersRouterInput {

    protected WeakReference<CharactersActivity> activity;

    @Override
    public void callScreen(long id) {
        activity.get().startActivity(includePutExtras(id));
    }

    private Intent includePutExtras(long id) {
        Intent intent = new Intent(activity.get(), DetailsActivity.class);
        intent.putExtra("id", id);
        return intent;
    }
}