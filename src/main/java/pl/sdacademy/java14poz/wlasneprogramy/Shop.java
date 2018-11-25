package pl.sdacademy.java14poz.wlasneprogramy;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Product> listOfShopProducts;

    public Shop() {
        this.listOfShopProducts = new ArrayList<Product>();
        Product product1 = new Product("Christmas tree - live", 49.90,
                "This product does not need any description. A must have in every house.\n" +
                        "Bring the incredible smell of the live Christmas tree inside your house.\n" +
                        "Gather your family around the tree and sing together! Oh, you can't sing?\n" +
                        "No problem at all. Just buy a CD \"Best of Christmas\" from our shop for only 35.50!");
        Product product2 = new Product("Christmas tree - artificial", 109.00,
                "Not a fan of a live tree in your house? You can still enjoy a magnificent,\n" +
                        "artificial version of it. It looks great and lasts for years.");
        Product product3 = new Product("CD - \"Best of Christmas\"", 35.50,
                "The best Christmas songs and carols by the best artists. Voices of Bing Crosby,\n" +
                        "Mahalia Jackson, Dean Martin, and many more.");
        Product product4 = new Product("Christmas bauble - single", 7.29,
                "A beautiful handmade glass bauble. Each bauble is a piece of art. Put it on\n" +
                        "the Christmas tree or hang it on the ceiling. Available also in a box of six.");
        Product product5 = new Product("Christmas bauble - box", 34.90,
                "A box of six baubles. Each bauble is a handmade glass piece of art.");
        Product product6 = new Product("Scented candle", 19.99,
                "Enjoy the smell of cinnamon and orange all around your house. This is what truly\n" +
                        "makes Christmas so special.");
        Product product7 = new Product("\"A Christmas Carol\"", 29.00,
                "A classic Christmas story by Charles Dickens. A tale of an elderly miser,\n" +
                        "Ebenezer Scrooge, who is visited by the spirits of Christmas Past, Present\n" +
                        "and Yet to Come, as well as the ghost of his former business partner. Those\n" +
                        "visits transform Scrooge into a kinder, gentler man.");
        Product product8 = new Product("Christmas lights", 33.20,
                "Transform your house for Christmas! With this set of colourful lights,\n" +
                        "every house will glow. Tell your neighbours that this is a house of joy!");
        Product product9 = new Product("Gingerbread cookies - box", 27.50,
                "A favourite Christmas treat of children and adults. Just don't eat them all\n" +
                        "at once! Or... you'd better buy three boxes right away!");
        Product product10 = new Product("Wrapping paper", 4.99,
                "Make your presents look fantastic. Wrap them in our paper and let your family\n" +
                        "and friends tear it up while they unpack gifts from you.");

        this.listOfShopProducts.add(product1);
        this.listOfShopProducts.add(product2);
        this.listOfShopProducts.add(product3);
        this.listOfShopProducts.add(product4);
        this.listOfShopProducts.add(product5);
        this.listOfShopProducts.add(product6);
        this.listOfShopProducts.add(product7);
        this.listOfShopProducts.add(product8);
        this.listOfShopProducts.add(product9);
        this.listOfShopProducts.add(product10);
    }

    public void showShopProducts() {
        System.out.println(">>  LIST OF AVAILABLE PRODUCTS  <<");
        for (int i = 0; i < listOfShopProducts.size(); i++) {
            System.out.println("\t" + (i + 1) + "\t" + listOfShopProducts.get(i).toString());
        }
    }

    public List<Product> getListOfShopProducts() {
        return listOfShopProducts;
    }
}
