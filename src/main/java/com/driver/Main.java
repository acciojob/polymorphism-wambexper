package com.driver;

public class Main {
    public static class Product{


        public static int product(int x, int y) {
        return x*y;
        }
        public static int product(int x, int y, int z){
            return x*y*z;
        }
        public static double product(double x, double y){

            return x*y;
        }
        }
        public static void main(int[] args){
            Product p = new Product();
           int ans = p.product(2,4);
           int ans2 = p.product(5,6,7);
            double ans3 = p.product(1.2,2.5);
            System.out.println(ans + " " + ans2 + " " + ans3);
        }
    }

