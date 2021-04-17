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
/**
 *
 * creating abstract class GeometricObject
 */
public abstract class GeometricObject {
        private boolean isFilled;
        private String color;

    public GeometricObject(boolean isFilled, String color) {
        this.isFilled = isFilled;
        this.color = color;
    }
    public boolean isIsFilled() {
        return isFilled;
    }

    public String getColor() {
        return color;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

}
