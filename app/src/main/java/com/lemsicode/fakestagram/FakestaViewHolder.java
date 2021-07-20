package com.lemsicode.fakestagram;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class FakestaViewHolder extends RecyclerView.ViewHolder {

    private final ImageView userImage;
    private final TextView usernameAbove;
    private final TextView usernameBelow;
    private final TextView location;
    private final ImageButton imageId;
    private final TextView datePosted;
    private final TextView caption;
    private final ImageButton btnReact;
    private final ImageView heartAnimation;
    private boolean isLiked;

    public FakestaViewHolder(@NonNull @NotNull View itemView) {
        super(itemView);

        this.userImage = itemView.findViewById(R.id.iv_user_image);
        this.usernameAbove = itemView.findViewById(R.id.tv_username_above);
        this.usernameBelow = itemView.findViewById(R.id.tv_username_below);
        this.imageId = itemView.findViewById(R.id.ib_image);
        this.datePosted = itemView.findViewById(R.id.tv_date_posted);
        this.caption = itemView.findViewById(R.id.tv_caption);
        this.location = itemView.findViewById(R.id.tv_location);
        this.btnReact = itemView.findViewById(R.id.ib_react);
        this.heartAnimation = itemView.findViewById(R.id.iv_heart_animation);
        this.isLiked = false; // initial
    }

    public void setHeartAnimation (int heart) {
        this.heartAnimation.setImageResource(heart);
    }

    public void setUserImage(int userImage) {
        this.userImage.setImageResource(userImage);
    }

    public void setUsername(String username) {
        this.usernameAbove.setText(username);
        this.usernameBelow.setText(username);
    }

    public void setLocation(String location) {
        this.location.setText(location);
    }

    public void setImageId(int imageId) {
        this.imageId.setImageResource(imageId);
    }

    public void setDatePosted(String datePosted) {
        this.datePosted.setText(datePosted);
    }

    public void setCaption(String caption) {
        this.caption.setText(caption);
    }

    public void setLiked(boolean isLiked) {
        this.isLiked = isLiked;
        if(this.isLiked) {
            this.btnReact.setImageResource(R.drawable.heart_on);
            this.btnReact.setColorFilter(itemView.getResources().getColor(R.color.red_react));
        } else {
            this.btnReact.setImageResource(R.drawable.heart_off);
            this.btnReact.setColorFilter(itemView.getResources().getColor(R.color.black));
        }
    }

    public void setOnClickListener(View.OnClickListener clickListener) {
        this.btnReact.setOnClickListener(clickListener);
    }

    public void setOnDoubleClick(DoubleClickListener clickListener) {
        this.imageId.setOnClickListener(clickListener);
    }

    public TextView getLocation() {
        return location;
    }

    public ImageView getHeartAnimation() {
        return heartAnimation;
    }

    public boolean isLiked() {
        return isLiked;
    }
}
