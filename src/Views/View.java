package Views;

import java.util.Scanner;

import models.Person;

public class View {

    private Scanner scanner;
    public View(){
        scanner = new Scanner(System.in);
    }

    public int showMenu(){
        System.out.println("Menu");
        System.out.println("1. Ingresar Personas");
        System.out.println("100. Salir");
        System.out.println("Ingrese una opcion");
        return scanner.nextInt();
    }
    public int inputInt(String message){
        System.out.println(message );
        return scanner.nextInt();
    }
    public Person inputPersons(){
        String name = inputName();
        int age = inputAge();
        return new Person(name, age);
    }
    public String inputName(){
        return inputInt("Ingrese el nombre");
    }
    public int inputAge(){
        return inputInt("Ingrese la edad");
    }

    public int selectSortingMethod() {
        System.out.println("Ingrese la condcion a ordenar");
        System.out.println("1. Por nombre: ");
        System.out.println("2. Por edad: ");
        System.out.println("Ingrese una opcion: ");
        return scanner.nextInt();
    }

    public void showMessage(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showMessage'");
    }
}
