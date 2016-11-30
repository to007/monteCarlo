package com.company;

public class Main {

    public static void main(String[] args) {
	MonteCarlo mcObj = new MonteCarlo(5,3,2);
        double x;
        double y;
        int cirCount = 0;
        int sqrCount = 0;
        for(int i = 1; i > 100; i++){
            x = mcObj.nextRainDrop_x();
            y = mcObj.nextRainDrop_y();
            if(mcObj.insideCircle(x,y)){
                cirCount++;
            }
            sqrCount++;
        }
        System.out.println(cirCount * Math.pow( 10 , 2) / (sqrCount * Math.pow(2,2)));
    }
}
