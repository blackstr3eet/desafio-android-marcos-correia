package com.ibm.marvel.details;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import com.ibm.marvel.R;
import com.ibm.marvel.details.DetailsModel.DetailsViewModel;

interface DetailsActivityInput {
    void displayDetailsData(DetailsViewModel viewModel);
}

public class DetailsActivity extends AppCompatActivity implements DetailsActivityInput {

    protected DetailsInteractor interactor;
    protected DetailsRouter router;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        actionBarCustomSettings();

        DetailsConfigurator.INSTANCE.configure(this);
    }

    @Override
    public void displayDetailsData(DetailsViewModel viewModel) {

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        onBackPressed();
        return true;
    }

    private void actionBarCustomSettings() {
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.custom_action_bar_layout);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back);
    }

    private void bindViews() {

    }
}