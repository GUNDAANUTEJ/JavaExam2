/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

/**
 *
 * @author Gunda Sai Naga Anu Teja
 */
public class Triangle extends GeometricObject {
        private double Sidea;
        private double Sideb;
        private double Sidec;

    public Triangle(boolean isFilled, String color, double side01, double side02, double side03) {
        super(isFilled, color);
        this.Sidea = side01;
        this.Sideb = side02;
        this.Sidec = side03;
    }

    public double getPerimeter() {
        return ((this.Sidea + this.Sideb + this.Sidec) / 2);

    }

    public double getArea() {
        double d = this.getPerimeter();
        return (Math.sqrt((d - this.Sidea) * (d - this.Sidec) * (d - this.Sidec) * d));
    }

    public String toString() {
        return "Area: " + this.getArea() +"\nPerimeter: " + this.getPerimeter() +"\nColor:" + this.getColor() +"\nFilled: " + this.isIsFilled();
    }
}
