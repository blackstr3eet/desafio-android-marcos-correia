package com.ibm.marvel.characters;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.MenuItem;
import com.ibm.marvel.R;
import com.ibm.marvel.model.characters.Result;
import java.util.List;

interface CharactersActivityInput {
    void displayCharactersData(CharactersViewModel viewModel);
}

public class CharactersActivity extends AppCompatActivity implements CharactersActivityInput {

    protected CharactersInteractor interactor;
    protected CharactersRouter router;

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_characters);
        actionBarCustomSettings();
        bindViews();
        CharactersConfigurator.INSTANCE.configure(this);
        interactor.fetchCharactersMetaData();
    }

    @Override
    public void displayCharactersData(CharactersViewModel viewModel) {
        viewModel = ViewModelProviders.of(this).get(CharactersViewModel.class);
        viewModel.init();
        viewModel.getMutableLiveData().observe(this, response -> {
            List<Result> data = response.getData().getResults();
            CharactersAdapter adapter = new CharactersAdapter(data);
            adapter.setOnItemClickListener(position -> {
                router.callScreen(data.get(position).getId());
            });

            RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setAdapter(adapter);
            recyclerView.setHasFixedSize(true);
            recyclerView.setItemViewCacheSize(20);
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        onBackPressed();
        return true;
    }

    private void actionBarCustomSettings() {
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.custom_title_characters);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back);
    }

    private void bindViews() {
        recyclerView = findViewById(R.id.listCharacters);
    }
}