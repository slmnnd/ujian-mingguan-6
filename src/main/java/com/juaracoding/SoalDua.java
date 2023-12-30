package com.juaracoding;

public class SoalDua {
    public static void main(String[] args) {
        int k = 1;
        for (int i = 9; i >=1; i--){
            for (int j = k; j<= i; j++){
                if(j%2==0){
                    System.out.print("_");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
            k = k + 1;
        }
    }
}
