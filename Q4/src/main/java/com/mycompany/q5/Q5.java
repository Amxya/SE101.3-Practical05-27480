package com.mycompany.q5;

/**
 *
 * @author amind
 */
public class Q5 {

    public static void main(String[] args) {
        Circle c = new Circle();
        c.circle(7.0);
        c.calculateArea();
        c.display();
        
        Rectangle r = new Rectangle();
        r.rectangle(5, 10);
        r.calculateArea();
        r.display();
    }
}
