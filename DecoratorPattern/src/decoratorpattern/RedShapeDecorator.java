/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package decoratorpattern;

/**
 *
 * @author Ladies Man
 */
public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape shapeDecorator) {
        super(shapeDecorator);
    }

    @Override
    public void draw() {
        super.draw(); //To change body of generated methods, choose Tools | Templates.
        setRedBorder();
    }
    
    public void setRedBorder(){
        System.out.println("Border Color : red");
    }
    
    
}
