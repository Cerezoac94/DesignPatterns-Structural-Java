package org.midominio.structural.composite2.paqueteria;

public class Product implements IComponent{
    String nameProduct;
    private double price;

    public Product(String nameProduct, double price){
        this.nameProduct = nameProduct;
        this.price = price;
    }
    @Override
    public void getNameProduct() {
        System.out.println(this.nameProduct);
    }

    @Override
    public double getPriceProduct() {
        return this.price;
    }
}
