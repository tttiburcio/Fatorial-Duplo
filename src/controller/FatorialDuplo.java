package controller;

public class FatorialDuplo {

    public int calcFatorialDuplo (int n){
        if (n == 1){
            return 1;
        }else{
            return n * calcFatorialDuplo(n - 2);
        }
    }

}
