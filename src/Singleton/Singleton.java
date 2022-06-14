/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author vinny
 */
public class Singleton {

    //create an object of SingleObject
    private static Singleton instance = new Singleton();

    //make the constructor private so that this class cannot be
    //instantiated
    private Singleton() {
    }

    //Get the only object available
    public static Singleton getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Este es el patrón de diseño SINGLETON");
    }
}
