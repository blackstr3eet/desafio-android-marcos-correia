package com.ibm.marvel.comics;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import com.ibm.marvel.R;
import com.ibm.marvel.comics.ComicsModel.ComicsViewModel;

interface ComicsActivityInput {
    void displayComicsData(ComicsViewModel viewModel);
}

public class ComicsActivity extends AppCompatActivity implements ComicsActivityInput {

    protected ComicsInteractor interactor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comics);
        actionBarCustomSettings();
        bindViews();
        ComicsConfigurator.INSTANCE.configure(this);
    }

    @Override
    public void displayComicsData(ComicsViewModel viewModel) {

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        onBackPressed();
        return true;
    }

    private void actionBarCustomSettings() {
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.custom_title_comics);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back);
    }

    private void bindViews() {

    }
}