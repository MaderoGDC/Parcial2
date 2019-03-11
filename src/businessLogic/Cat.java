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
public class Cat extends Pet{
    private boolean hunter;
    public Cat(String id, String name, String hairColor, boolean hunter) {
        super(id, name, hairColor);
        this.hunter = hunter;
    }

    @Override
    public String sound() {
        return "miau";
    }
    
}
