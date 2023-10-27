package com.graheed.FooExample.configs;

import com.graheed.FooExample.services.Foo;
import com.graheed.FooExample.services.FooImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FooConfiguration {

    @Bean
    public Foo foo() {
        return new FooImpl(10);
    }

    @Bean
    public FooImpl fooImpl2() {
        return new FooImpl(3);
    }
}
