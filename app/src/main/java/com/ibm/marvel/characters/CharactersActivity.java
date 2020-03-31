package com.ibm.marvel.characters;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.ibm.marvel.R;
import com.ibm.marvel.characters.CharactersModel.CharactersViewModel;
import com.ibm.marvel.model.characters.Result;
import com.ibm.marvel.util.ImageDownloadTask;
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

        CharactersViewModel viewModel = ViewModelProviders.of(this).get(CharactersViewModel.class);
        viewModel.init();
        viewModel.getMutableLiveData().observe(this, response -> {
            RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setAdapter(new Adapter(response.getData().getResults()));
            recyclerView.setHasFixedSize(true);
            recyclerView.setItemViewCacheSize(20);
        });
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
        getSupportActionBar().setCustomView(R.layout.custom_title_characters);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back);
    }

    private void bindViews() {
        recyclerView = findViewById(R.id.listCharacters);
    }

    private static class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

        private final List<Result> characters;

        private ImageView photo;
        private TextView name;

        public Adapter(List<Result> characters) {
            this.characters = characters;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_items_characters, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            String path = characters.get(position).getThumbnail().getPath();
            String extension = characters.get(position).getThumbnail().getExtension();

            new ImageDownloadTask(photo).execute(path, extension);
            name.setText(characters.get(position).getName());
        }

        @Override
        public int getItemCount() {
            return characters.size();
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public int getItemViewType(int position) {
            return position;
        }

        private class ViewHolder extends RecyclerView.ViewHolder {

            public ViewHolder(@NonNull View view) {
                super(view);
                photo = view.findViewById(R.id.photo);
                name = view.findViewById(R.id.name);
            }
        }
    }
}