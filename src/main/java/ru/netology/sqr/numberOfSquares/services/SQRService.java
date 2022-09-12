package ru.netology.sqr.numberOfSquares.services;

public class SQRService {

    public int numberOfSquares(int beginningRange, int endRange) {
        for (int i = 10; i <= 99; i++) {
            if (i * i >= beginningRange && i * i <= endRange) {
                return i;
            }
        }
        return -1;
    }
}
