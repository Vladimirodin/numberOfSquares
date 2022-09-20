package ru.netology.sqr.numberOfSquares.services;

public class SQRService {

    public int numberOfSquares(int beginningRange, int endRange) {
        int quantity = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= beginningRange && i * i <= endRange) {
                quantity++;
            }
        }
        return quantity;
    }
}
