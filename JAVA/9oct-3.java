
import java.util.*;
public class FactorialGCD{ 
      
static int factorial(int x) 
{ 
    if (x <= 1) 
        return 1; 
    int res = 2; 
    for (int i = 3; i <= x; i++) 
        res = res * i; 
    return res; 
} 
  
static int gcdOfFactorial(int m, int n) 
{ 
    int min = m < n ? m : n; 
    return factorial(min); 
} 
  

    public static void main (String[] args) 
    { 
       
        Scanner s=new Scanner(System.in);
       int a=s.nextInt();
       int b=s.nextInt();  
        System.out.println(gcdOfFactorial(a, b)); 
    } 
} 
  
