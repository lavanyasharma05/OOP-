import java.util.*;
public class QuadraticEquation{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter value of a:");
        double a= sc.nextDouble();
        System.out.println("enter value of b:");
        double b= sc.nextDouble();
        System.out.println("enter value of c:");
        double c= sc.nextDouble();
        double D= b*b-4*a*c;
        
    
    if(a==0){
        System.out.println("not a quadretic equation");
    }
    else if(D>0){
        double root1=(-b+Math.sqrt(D)/(2*a));
        double root2=(-b-Math.sqrt(D)/(2*a));
        System.out.println("two real and distinct solution:");
        System.out.println("Root1="+root1);
        System.out.println("Root2="+root2);
    }
    else if(D==0){
        double root= -b/(2*a);
        System.out.println("one real and repeated solution:");
        System.out.println("Root="+root);
    }
    else{
        System.out.println("no real solution");
    }
}}
