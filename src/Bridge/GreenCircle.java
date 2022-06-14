/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bridge;

/**
 *
 * @author vinny
 */
public class GreenCircle implements DrawAPI{

    @Override
    public void drawCircle(int radius, int x, int y) {
       System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
    
}
