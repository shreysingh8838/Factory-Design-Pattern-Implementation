package com.assingment.assingment.factoryDesignPattern;

public class CreatorImpl1 implements CreatorInterface{
    @Override
    public ProductInterface createProduct(){
        return new ProductImpl1();
    }
}
