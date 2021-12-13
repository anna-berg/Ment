package com.berg.homework1212.homework;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

public class Runner {

    public static void main(String[] args) throws IOException {
        Path file1 = Path.of("/home/anuta/Ment/src/com/berg/homework1212/homework/resources/items-name.csv");
        Path file2 = Path.of("/home/anuta/Ment/src/com/berg/homework1212/homework/resources/items-price.csv");
        Path file3 = Path.of("/home/anuta/Ment/src/com/berg/homework1212/homework/resources/result.csv");

        List<Product> productList = Helper.readNameAndDescription(file1);
        Map<Integer, Double> priceMap = Helper.readPrice(file2);

        List<Product> products = Helper.addPriceToProduct(productList, priceMap);

        Helper.writeToFile(file3, products);
    }
}
