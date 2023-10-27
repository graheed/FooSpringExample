package com.graheed.FooExample.controllers;

import com.graheed.FooExample.services.Foo;
import com.graheed.FooExample.services.FooImpl;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class FooController {
    private final Foo foo;
    private final FooImpl fooImpl;

    public FooController(Foo foo, FooImpl fooImpl) {
        this.foo = foo;
        this.fooImpl = fooImpl;
    }

    public int getFooValue() {
        return foo.getValue() + fooImpl.getValue();
    }



}
