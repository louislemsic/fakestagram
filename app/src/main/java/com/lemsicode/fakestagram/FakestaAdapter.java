package com.lemsicode.fakestagram;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class FakestaAdapter extends RecyclerView.Adapter<FakestaViewHolder> {

    private final ArrayList<Post> posts;
    private AnimatedVectorDrawable avd;
    private AnimatedVectorDrawableCompat avdc;

    public FakestaAdapter (ArrayList<Post> posts) {
        this.posts = posts;
    }

    @NonNull
    @NotNull
    @Override
    public FakestaViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.posts_template, parent, false);

        return new FakestaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull FakestaViewHolder holder, int position) {

        holder.setCaption(posts.get(position).getCaption());
        holder.setDatePosted(posts.get(position).getDatePosted());
        holder.setImageId(posts.get(position).getImageId());
        holder.setLiked(posts.get(position).getLiked());
        holder.setLocation(posts.get(position).getLocation());
        holder.setUserImage(posts.get(position).getUserImageId());
        holder.setUsername(posts.get(position).getUsername());
        holder.setHeartAnimation(R.drawable.avd_instagram_like);

        holder.setOnClickListener(v -> {
            posts.get(position).setLiked(!posts.get(position).getLiked());
            holder.setLiked(posts.get(position).getLiked());
        });

        final Drawable drawable = holder.getHeartAnimation().getDrawable();

        holder.setOnDoubleClick(new DoubleClickListener() {
            @Override
            public void onDoubleClick() {
                posts.get(position).setLiked(!posts.get(position).getLiked());
                holder.setLiked(posts.get(position).getLiked());

                if(holder.isLiked()) {
                    holder.getHeartAnimation().setAlpha(0.70f);
                    if(drawable instanceof AnimatedVectorDrawableCompat) {
                        avdc = (AnimatedVectorDrawableCompat) drawable;
                        avdc.start();
                    } else if (drawable instanceof  AnimatedVectorDrawable) {
                        avd = (AnimatedVectorDrawable) drawable;
                        avd.start();
                    }
                }
            }
        });

        if(holder.getLocation().getText().toString().isEmpty())
            holder.getLocation().setVisibility(View.GONE);

    }

    @Override
    public int getItemCount() {
        return this.posts.size();
    }
}

