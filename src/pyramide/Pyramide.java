/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramide;

/**
 *
 * @author Flosch
 */
public class Pyramide {

    private final double height;
    private final double baseLength;

    public Pyramide(double height, double baseLength) {
        this.height = height;
        this.baseLength = baseLength;
    }
    
    
    
//    public Pyramide( double  aHeight,double aBaseLength){
//        height = aHeight;
//        baseLength = aBaseLength;
//    }

    
    public double getVolume() {
        
        return height * baseLength * baseLength / 3;
    }
    public double getSurfaace(){
        double sideLength = Math.sqrt(height * height + baseLength * baseLength /4);
        return 2 * baseLength * sideLength;
    }

}
