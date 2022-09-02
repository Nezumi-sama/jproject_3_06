package ru.netology.jproject_3_06.services;

public class SQRService {
    public int countOfSquares(int start, int end){
        int k = 0;

        for (int i = 10; i < 100; i++){
            if ((i * i >= start)&&(i * i <= end)){
                k++;
            }
        }

        return  k;
    }
}
