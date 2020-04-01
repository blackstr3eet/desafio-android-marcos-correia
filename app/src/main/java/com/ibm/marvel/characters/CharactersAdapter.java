package com.ibm.marvel.characters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.ibm.marvel.R;
import com.ibm.marvel.model.characters.Result;
import com.ibm.marvel.util.ImageDownloadTask;
import java.util.List;

interface ItemClickListener {
    void onItemClick(int position);
}

public class CharactersAdapter extends RecyclerView.Adapter<CharactersAdapter.ViewHolder> {

    private ItemClickListener itemClickListener;
    private List<Result> characters;
    private ImageView photo;
    private TextView name;

    public CharactersAdapter(List<Result> characters) {
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
        new ImageDownloadTask(photo).execute(
                characters.get(position).getThumbnail().getPath(),
                characters.get(position).getThumbnail().getExtension());

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

    public void setOnItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ViewHolder(@NonNull View view) {
            super(view);
            photo = view.findViewById(R.id.photo);
            name = view.findViewById(R.id.name);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if(itemClickListener != null) {
                itemClickListener.onItemClick(getAdapterPosition());
            }
        }
    }
}