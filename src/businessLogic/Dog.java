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
 public class Dog extends Pet{
    private String breed;
    public Dog(String id, String name, String hairColor, String breed) {
        super(id, name, hairColor);
        this.breed = breed;
    }

    @Override
    public String sound() {
        return "guau";
    }
    
}
