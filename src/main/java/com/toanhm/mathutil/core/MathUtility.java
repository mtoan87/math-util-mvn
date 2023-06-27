/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toanhm.mathutil.core;

/**
 *
 * @author ASUS
 */
// viet class nay clone giong class java.util.Math
// chua cac ham static Math.sqrt() Math.sin() Math.random()
public class MathUtility {
    public static final double PI = 3.1414;
    
    //ham getF() la ham tinh n! = 1,2,3,,n
    //thiet ke ham nhu sau:
    //0! = 1! =1
    //ko co giai thua so am. Neu dua -5! -> Chui; ném ra Exception
    //vì giai thừa tăng rất nhanh, 21! long ko chứa nổi(long  18 số 0)
    //20! thì vừa đủ cho long 
    //21! 22! 23! -> CHỬI, ném ra exception
    //
//    public static long getFactorial(int n){
//        if(n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid n. n must be between 0..20, plz");
//        if(n == 0 || n == 1)
//        return 1;
//        
//        long product =1; // bien lưu dồn các tích
//        for (int i = 2; i <= n; i++) 
//            product *= i;
//        
//        return product;
//        
//    }
    public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20, plz");
        if(n == 0 || n == 1)
        return 1;
        
        return n * getFactorial(n-1);
    }
}
// tinh 5! = 
