/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author dmadero
 */
public class Vet {
    private HashMap<String, Pet> pets;

    public Vet() {
        this.pets = new HashMap<>();
    }
    
    public void removePet(String s){
        if(pets.containsKey(s)){
            pets.remove(s);
        }
    }
    public void showPetsType(String type){
    
    }
    public void showPets(){
    
    }

    public HashMap<String, Pet> getPets() {
        return pets;
    }

    public void setPets(HashMap<String, Pet> pets) {
        this.pets = pets;
    }
    
}
