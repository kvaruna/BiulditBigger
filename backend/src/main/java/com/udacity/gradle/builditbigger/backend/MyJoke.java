package com.udacity.gradle.builditbigger.backend;

import com.varun.jokesource.Joke;

/** The object model for the data we are sending through endpoints */
public class MyJoke {
    private Joke joke;

    public MyJoke() {
        joke = new Joke();
    }

    public String getJokes() {
        return joke.getJoke();
    }

}