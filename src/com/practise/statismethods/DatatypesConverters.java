package com.practise.statismethods;

public class DatatypesConverters {
	
    public static char[] stringToChar(String str) {
        return str.toCharArray();
    }
    
    public static double floatToDouble(float arg1, float arg2) { 
        return (double)arg1 + arg2;
    }
    
    public static float DoubleTofloat(double arg1, double arg2) { 
        return (float)arg1 + (float)arg2;
    }
    public static void main(String[] args) {
    	
        // Convert string to char[] array
        char[] name = DatatypesConverters.stringToChar("Mahesh");
        System.out.println(name);
        
        // Convert float to double
        double result1 = DatatypesConverters.floatToDouble(3.14f, 2.71f);
        System.out.println(result1);
       
        // Convert double to float
        float result2 = DatatypesConverters.DoubleTofloat(3.14, 2.71);
        System.out.println(result2);
        
       
        
    }
}
