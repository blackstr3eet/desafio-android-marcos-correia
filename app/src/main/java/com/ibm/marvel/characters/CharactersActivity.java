package com.ibm.marvel.characters;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import com.ibm.marvel.R;
import com.ibm.marvel.characters.CharactersModel.CharactersViewModel;

interface CharactersActivityInput {
    void displayCharactersData(CharactersViewModel viewModel);
}

public class CharactersActivity extends AppCompatActivity implements CharactersActivityInput {

    protected CharactersInteractor interactor;
    protected CharactersRouter router;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_characters);
        actionBarCustomSettings();
        bindViews();
        CharactersConfigurator.INSTANCE.configure(this);
    }

    @Override
    public void displayCharactersData(CharactersViewModel viewModel) {

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        onBackPressed();
        return true;
    }

    private void actionBarCustomSettings() {
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.custom_title_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back);
    }

    private void bindViews() {

    }
}