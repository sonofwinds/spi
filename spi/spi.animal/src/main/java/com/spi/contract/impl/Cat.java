package com.spi.contract.impl;

import com.spi.contract.IAnimal;

public class Cat implements IAnimal {

    @Override
    public String callName() {
        return "my name is cat";
    }
}
