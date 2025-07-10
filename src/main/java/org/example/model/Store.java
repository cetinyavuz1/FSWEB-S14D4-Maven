package org.example.model;

public class Store {
    public static void main(String[] args) {

        //listProducts();
        ProductForSale[] products = {new Chocolate("Sütlü", 10, "Enfes"),
                                    new Coke("Zero", 20, "Şekersiz"),
                                    new Bread("Tam Buğday", 2, "Kepek")};
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(int i = 0; i < products.length; i++){
            products[i].showDetails();
        }
    }
}