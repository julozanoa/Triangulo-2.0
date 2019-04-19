/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author usuario1
 */
public class Main {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingrese coordenadas en x del punto 1");
        double x1 = s.nextDouble();
        System.out.println("Ingrese coordenadas en y del punto 1");
        double y1 = s.nextDouble();
        
        System.out.println("Ingrese coordenadas en X del punto 2");
        double x2 = s.nextDouble();
        System.out.println("Ingrese coordenadas en y del punto 2");
        double y2 = s.nextDouble();
        
        System.out.println("Ingrese coordenadas en X del punto 3");
        double x3 = s.nextDouble();
        System.out.println("Ingrese coordenadas en y del punto 3");
        double y3 = s.nextDouble();
        
        System.out.println("Ingrese la intensidad en red del relleno");
        int r1 = s.nextInt();
        System.out.println("Ingrese la intensidad en green del relleno");
        int g1 = s.nextInt();
        System.out.println("Ingrese la intensidad en blue del relleno");
        int b1 = s.nextInt();
        
        System.out.println("Ingrese la intensidad en red de linea");
        int r2 = s.nextInt();
        System.out.println("Ingrese la intensidad en green de linea");
        int g2 = s.nextInt();
        System.out.println("Ingrese la intensidad en blue de linea");
        int b2 = s.nextInt();
        
        Punto p1 = new Punto(x1,y1);
        Punto p2 = new Punto(x2,y2);
        Punto p3 = new Punto(x3,y3);
        
        Color relleno = new Color(r1,g1,b1);
        Color linea = new Color(r2,g2,b2);
        
        Triangulo t1 = new Triangulo(p1, p2, p3, relleno, linea); 
        
        
        double Lado1 = t1.lado(x1, y1, x2, y2);
        double Lado2 = t1.lado(x1, y1, x3, y3);
        double Lado3 = t1.lado(x2, y2, x3, y3);
        
        double sP =(t1.perimetro(Lado1, Lado2, Lado3))/2;
        double base = 0;
        
        if(Math.min(y1, Math.min(y2,y3)) == y1){
            if(Math.min(y2, y3) == y2){
                base = Lado1; 
            }else if(Math.min(y2,y3) == y3){
                base = Lado2;
            } 
        }else if(Math.min(y1, Math.min(y2,y3)) == y2){
            if(Math.min(y1, y3) == y1){
                base = Lado1; 
            }else if(Math.min(y1,y3) == y3){
                base = Lado3;
            }
        }else if(Math.min(y1, Math.min(y2,y3)) == y3){
            if(Math.min(y1, y2) == y1){
                base = Lado2; 
            }else if(Math.min(y1,y2) == y2){
                base = Lado3;
            } 
        }
        

        System.out.println("El area de su triangulo es: " + t1.area(Lado1, Lado2, Lado3, sP));
        System.out.println("El perimetro de su triangulo es: " + t1.perimetro(Lado1, Lado2, Lado3));
        System.out.println("La altura del triangulo su triangulo es: " + t1.altura(t1.area(Lado1, Lado2, Lado3, sP), base));
        
        
        System.out.println("Ingrese la nueva intensidad en red del relleno");
        int r1_2 = s.nextInt();
        relleno.setRed(r1_2);
        System.out.println("Ingrese la nueva intensidad en green del relleno");
        int g1_2 = s.nextInt();
        relleno.setGreen(g1_2);
        System.out.println("Ingrese la nueva intensidad en blue del relleno");
        int b1_2 = s.nextInt();
        relleno.setBlue(b1_2);
        
        System.out.println("Ingrese la nueva intensidad en red de linea");
        int r2_2 = s.nextInt();
        linea.setRed(r2_2);
        System.out.println("Ingrese la nueva intensidad en green de linea");
        int g2_2 = s.nextInt();
        linea.setRed(g2_2);
        System.out.println("Ingrese la nueva intensidad en blue de linea");
        int b2_2 = s.nextInt();
        linea.setRed(b2_2);
        
        
       
        
    }
}
