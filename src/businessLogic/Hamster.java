/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

/**
 *
 * @author dmadero
 */
public class Hamster extends Pet{
    private double weight;
    
    public Hamster(String id, String name, String hairColor, double weight) {
        super(id, name, hairColor);
        this.weight = weight;
    }

    @Override
    public String sound() {
        return "";
    }
    
}
