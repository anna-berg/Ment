package com.berg.homework1212.homework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Helper {

    public static List<Product> readNameAndDescription(Path filePath) throws IOException {
        try (Stream<String> lines = Files.lines(filePath, UTF_8)) {
            return lines.map(s -> s.split(","))
                    .skip(1)
                    .filter(strings -> strings.length > 1)
                    .map(strings -> new Product(Integer.parseInt(strings[0]), strings[1], strings[2]))
                    .collect(Collectors.toList());
        }
    }

    public static Map<Integer, Double> readPrice(Path filePath) throws IOException {
        try (Stream<String> lines = Files.lines(filePath, UTF_8)) {
            return lines.map(s -> s.split(","))
                    .skip(1)
                    .collect(Collectors.toMap(e -> Integer.parseInt(e[0]), e -> Double.valueOf(e[1])));
        }
    }

    public static void writeToFile(Path filePath, List<Product> productList) throws IOException {
        Path errorPath = Path.of("/home/anuta/Ment/src/com/berg/homework1212/homework/resources/errors.csv");

        List<String> resultProducts = new ArrayList<>();
        List<String> errors = new ArrayList<>();
        String headers = "ID,NAME,PRICE";
        resultProducts.add(headers);
        for (Product product : productList) {
            if (product.isInformationFull()) {
                resultProducts.add(String.join(",",
                        String.valueOf(product.getId()),
                        product.getName(),
                        String.valueOf(product.getPrice())));
            } else {
                errors.add(String.valueOf(product.getId()));
            }
        }
        Files.write(filePath, resultProducts);
        Files.write(errorPath, errors);
    }

    public static List<Product> addPriceToProduct(List<Product> productList, Map<Integer, Double> priceMap) {
        for (Product product : productList) {
            for (Map.Entry<Integer, Double> entry : priceMap.entrySet()) {
                if (entry.getKey() == product.getId()) {
                    product.setPrice(entry.getValue());
                }
            }
        }
        return productList;
    }
}
