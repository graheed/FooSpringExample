package com.graheed.FooExample.services;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class FooImpl implements Foo{
    private final int value;

    public FooImpl(@Value("${foo.value}") int value) {
        this.value = value;
    }
    @Override
    public int getValue() {
        return value;
    }
}
