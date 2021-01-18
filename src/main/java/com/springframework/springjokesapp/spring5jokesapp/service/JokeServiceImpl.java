package com.springframework.springjokesapp.spring5jokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService{

    private final ChuckNorrisQuotes chukNorrisQuotes;

    public JokeServiceImpl() {
        this.chukNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chukNorrisQuotes.getRandomQuote();
    }
}
