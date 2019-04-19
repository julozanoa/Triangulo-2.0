/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario1
 */
public class Triangulo {
    private Punto p1;
    private Punto p2;
    private Punto p3;
    private Color relleno;
    private Color linea;

    public Triangulo(Punto p1, Punto p2, Punto p3, Color relleno, Color linea) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.relleno = relleno;
        this.linea = linea;
    }
    
    public double cuad(double x){
        return x*x;
    }
    
    public double lado(double x1, double y1, double x2, double y2){
        return Math.sqrt((cuad(x2-x1)+(cuad(y2-y1))));
    }
    
    public double perimetro(double lado1, double lado2, double lado3){
        return lado1+lado2+lado3;
    }
    
    public double area(double lado1, double lado2, double lado3, double sP){
        return Math.sqrt(sP*(sP-lado1)*(sP-lado2)*(sP-lado3));
    }
    
    public double altura(double area, double base){
        return (area*2) / base;
    }
    
    public Punto getP1() {
        return p1;
    }

    public Punto getP2() {
        return p2;
    }

    public Punto getP3() {
        return p3;
    }

    public Color getRelleno() {
        return relleno;
    }

    public Color getLinea() {
        return linea;
    }

    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    public void setP2(Punto p2) {
        this.p2 = p2;
    }

    public void setP3(Punto p3) {
        this.p3 = p3;
    }

    public void setRelleno(Color relleno) {
        this.relleno = relleno;
    }

    public void setLinea(Color linea) {
        this.linea = linea;
    }
    
    
}
