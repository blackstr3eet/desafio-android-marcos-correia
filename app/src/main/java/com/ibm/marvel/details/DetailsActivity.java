package com.ibm.marvel.details;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
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

        DetailsConfigurator.INSTANCE.configure(this);
    }

    @Override
    public void displayDetailsData(DetailsViewModel viewModel) {

    }
}