package com.spi.contract.impl;

import com.spi.contract.IAnimal;

public class Dog implements IAnimal {

    @Override
    public String callName() {
        return "my name is dog";
    }
}
