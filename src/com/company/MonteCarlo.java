package com.company;
import java.util.Random;
/**
 * Created by tommy on 11/30/2016.
 */
public class MonteCarlo {
    public double radius;
    public double width;
    public double height;
    private double x;
    private double y;
    Random rndm = new Random();
   public MonteCarlo(double h, double k, double r){
       height = k;
       width = h;
       radius = r;
   }
  public double nextRainDrop_x() {
      x = rndm.nextDouble() * width * 2;
      return x;
  }
  public double nextRainDrop_y(){
      y = rndm.nextDouble() * height * 2;
      return y;
  }
  public boolean insideCircle(double x1, double y1){
      x = x1;
      y = y1;
      if(Math.pow(x - width, 2) + Math.pow(y - height, 2) <= Math.pow(radius,2)){
          return true;
      }else{
          return false;
      }
  }
}
