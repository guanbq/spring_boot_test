package com.gbq.my_autoconfig.service;

import com.gbq.my_autoconfig.config.HelloPorperties;

public class HelloService {

    private HelloPorperties helloPorperties;

    public HelloPorperties getHelloPorperties() {
        return helloPorperties;
    }

    public void setHelloPorperties(HelloPorperties helloPorperties) {
        this.helloPorperties = helloPorperties;
    }

    public String say(String word) {
        return helloPorperties.getBefore()+word+helloPorperties.getAfter();
    }
}
