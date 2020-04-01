package com.ibm.marvel.details;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ibm.marvel.R;
import com.ibm.marvel.model.details.Result;
import com.ibm.marvel.util.ImageDownloadTask;

interface DetailsActivityInput {
    void displayDetailsData(DetailsViewModel viewModel);
}

public class DetailsActivity extends AppCompatActivity implements DetailsActivityInput {

    protected DetailsInteractor interactor;
    protected DetailsRouter router;

    private TextView name;
    private TextView description;
    private TextView more;
    private ImageView avatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        actionBarCustomSettings();
        bindViews();
        DetailsConfigurator.INSTANCE.configure(this);
        interactor.fetchDetailsMetaData();
    }

    @Override
    public void displayDetailsData(DetailsViewModel viewModel) {
        viewModel = ViewModelProviders.of(this).get(DetailsViewModel.class);
        viewModel.init(getIntent().getLongExtra("id", 0));
        viewModel.getMutableLiveData().observe(this, response -> {
            Result data = response.getData().getResults().stream().findFirst().get();
            name.setText(data.getName());
            description.setText(data.getDescription());
            more.setOnClickListener( view -> router.callScreen(data.getId()));
            new ImageDownloadTask(avatar).execute(data.getThumbnail().getPath(), data.getThumbnail().getExtension());
        });
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
        name = findViewById(R.id.name);
        description = findViewById(R.id.description);
        more = findViewById(R.id.more);
        avatar = findViewById(R.id.avatar);
    }
}