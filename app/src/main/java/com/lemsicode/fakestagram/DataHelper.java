package com.lemsicode.fakestagram;

import java.util.ArrayList;
import java.util.Collections;

public class DataHelper {
    public ArrayList<Post> initializeData() {
        String[] usernames = {"Wonderer", "JustMe", "TravelingNomad", "WelcomeToMyLife"};
        int[] userImages = {R.drawable.person1, R.drawable.person2, R.drawable.person3, R.drawable.person4};

        ArrayList<Post> data = new ArrayList<>();
        data.add(new Post(
                R.drawable.buildings,
                "February 14, 2021",
                "that's a tall boi",
                "New York, NY, USA",
                false,
                usernames[0],
                userImages[0]));
        data.add(new Post(
                R.drawable.food,
                "December 25, 2020",
                "just made lunch! ready to dig in #food #burgers #coke",
                null,
                true,
                usernames[0],
                userImages[0]));
        data.add(new Post(
                R.drawable.fruits,
                "January 01, 2019",
                "breakfast for today",
                null,
                false,
                usernames[1],
                userImages[1]));
        data.add(new Post(
                R.drawable.furniture,
                "May 10, 2020",
                "just arrived at our Airbnb\nVacation time starts now!\n.\n.\n.\n.\n#insta #traveler #vacation",
                "Secret location",
                true,
                usernames[1],
                userImages[1]));
        data.add(new Post(
                R.drawable.race_car,
                "March 12, 2021",
                null,
                "Slovakia",
                false,
                usernames[2],
                userImages[2]));
        data.add(new Post(
                R.drawable.waterfall,
                "October 29, 2020",
                "after walking 274839173 many km, finally arrived. well worth the wait!!!",
                "Skógafoss, Iceland",
                false,
                usernames[2],
                userImages[2]));
        data.add(new Post(
                R.drawable.work_desk,
                "June 20, 2019",
                "#worklifebalance",
                null,
                true,
                usernames[3],
                userImages[3]));
        Collections.shuffle(data);

        return data;
    }
}

