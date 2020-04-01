package com.ibm.marvel.comics;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import com.ibm.marvel.R;
import com.ibm.marvel.model.comics.Result;
import com.ibm.marvel.util.ImageDownloadTask;

interface ComicsActivityInput {
    void displayComicsData(ComicsViewModel viewModel);
}

public class ComicsActivity extends AppCompatActivity implements ComicsActivityInput {

    protected ComicsInteractor interactor;

    private ImageView photo;
    private TextView description;
    private TextView title;
    private TextView price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comics);
        actionBarCustomSettings();
        bindViews();
        ComicsConfigurator.INSTANCE.configure(this);
        interactor.fetchComicsMetaData();
    }

    @Override
    public void displayComicsData(ComicsViewModel viewModel) {
        viewModel = ViewModelProviders.of(this).get(ComicsViewModel.class);
        viewModel.init(getIntent().getLongExtra("id", 0));
        viewModel.getMutableLiveData().observe(this, response -> {
            // use streams here
            Result result = response.getData().getResults().stream().findFirst().get();
            new ImageDownloadTask(photo).execute(result.getThumbnail().getPath(), result.getThumbnail().getExtension());
            description.setText(result.getDescription());
            title.setText(result.getTitle());
            price.setText(String.format("$%.2f", result.getPrices().stream().findFirst().get().getPrice()));
        });
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
        photo = findViewById(R.id.photo);
        description = findViewById(R.id.description);
        title = findViewById(R.id.title);
        price = findViewById(R.id.price);
    }
}