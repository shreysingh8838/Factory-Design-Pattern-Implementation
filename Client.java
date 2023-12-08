package com.assingment.assingment.factoryDesignPattern;

public class Client {

    public static void getProduct(){
        CreatorInterface creatorInterface = new CreatorImpl2();
//        ProductInterface p = creatorInterface.createProduct();
//        p.renderProduct();
        creatorInterface.createProduct().renderProduct();
    }

    public static void main(String args[]){
        Client.getProduct();
    }
}
