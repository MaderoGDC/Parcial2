/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import java.util.Scanner;

/**
 *
 * @author dmadero
 */
public class Starter {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner lec = new Scanner("pets.txt");
        Vet v = new Vet();
        boolean terminar =  false;
        do{
        System.out.println("Bienvenido a la veterinaria: ");
        System.out.println("Que desea Hacer: ");
        System.out.println("1.remover mascota (necesita su id)");
        System.out.println("2.listar mascotas segun tipo");
        System.out.println("3.Listar todas las mascotas, guardar y salir");
            
        String op;
        op = teclado.nextLine();
        
        }while(terminar);
    }
    public Pet cargarM(Scanner lec){
            String tip = lec.next().trim();
            
            if(tip.equals("Dog")){
            String id = lec.next().trim();
            String name = lec.next().trim();
            String color = lec.next().trim();
            String raza = lec.next().trim();
                return new Dog(id, name,color, raza);
            }else if(tip.equals("Cat")){
                String id = lec.next().trim();
                String name = lec.next().trim();
                String color = lec.next().trim();
                Boolean hunter = lec.nextBoolean();
                return new Cat(id, name,color,hunter);
            }else{
                String id = lec.next().trim();
                String name = lec.next().trim();
                String color = lec.next().trim();
                double weight = lec.nextDouble();
                return new Hamster(id, name,color,weight);
            }
            
        
    }
    public void readPets(Vet v) {
        
    }
    public void guardar(){}
    
    public void manage(Vet v, String op) {
        Scanner teclado = new Scanner(System.in);
        switch (op) {
            case "1":
                String type;
                System.out.println("Digite el id de la mascota");
                type = teclado.nextLine();
                v.removePet(type);
                break;
            case "2":
                System.out.println("Listar");
                System.out.println("Digite el tipo de animales a listar (Dog, Cat o Hamster)");
                String tipo;
                tipo =  teclado.nextLine();
                v.showPetsType(tipo);
                break;
            case "3":
                System.out.println("Todas las mascotas de la vetrinaria: ");
                v.showPets();
                break;
        }switch (op) {
            case "1":
                String type;
                System.out.println("Digite el id de la mascota");
                type = teclado.nextLine();
                v.removePet(type);
                break;
            case "2":
                System.out.println("Listar");
                System.out.println("Digite el tipo de animales a listar (Dog, Cat o Hamster)");
                String tipo;
                tipo =  teclado.nextLine();
                v.showPetsType(tipo);
                break;
            case "3":
                System.out.println("Todas las mascotas de la vetrinaria: ");
                v.showPets();
                v.guardar();
                break;
            default:
                System.out.println("digito una opcion invalida");
        }
        }
    }


