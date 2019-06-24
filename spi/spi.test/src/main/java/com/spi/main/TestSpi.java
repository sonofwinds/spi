package com.spi.main;

import com.spi.contract.IAnimal;

import java.util.ServiceLoader;

public class TestSpi {
    public static void main(String[] args) {
        ServiceLoader<IAnimal> animals = ServiceLoader.load(IAnimal.class);
        for(IAnimal animal : animals){
           String name =  animal.callName();
           System.out.println(name);
        }
    }
}
