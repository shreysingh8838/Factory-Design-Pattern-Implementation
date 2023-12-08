package com.assingment.assingment.factoryDesignPattern;

public class CreatorImpl2 implements CreatorInterface{
    @Override
    public ProductInterface createProduct(){
        return new ProductImpl2();
    }
}
