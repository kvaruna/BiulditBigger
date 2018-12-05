package com.varun.jokesource;

import java.util.ArrayList;
import java.util.Random;

public class Joke {
    ArrayList<String> jokes;

    public Joke() {
        jokes = new ArrayList<>();
        jokes.add("What type of waves are there in small beaches? -- Microwaves!");
        jokes.add("Can a leopard hide anywhere? -- No, he is always spotted!");
        jokes.add("Which is the place pencils like to go for a vacation? -- Pencil – vania!");

    }

    public String getJoke() {
        Random random = new Random();
        return jokes.get(random.nextInt(jokes.size()));
    }
}
