package Controllers;
import models.Person;
import Views.View;

public class Controller {

    private View view;
    private SortingMethods sortingMethods;
    private SearcMethods searcMethods;
    private Person[] personas;
    
    public Controller(View view, SortingMethods sortingMethods,SearcMethods searcMethods){
        this.view = view;
        this.searcMethods = searcMethods;
        this.sortingMethods = sortingMethods;
    }
    public void start(){
        int option = 0;
        do{
            option = view.showMenu();
            switch (option) {
                case 1:
                    inputPersons();
                    
                    break;
                case 2:
                    addPerson();
                    break;
                case 3:
                    sortPerson();
                    break;
                default:
                System.out.println("Opcion no valida");
                    break;
            }
        }while(option != 0);
    }
    private void sortPerson() {
        int sortingOption = view.selectSortingMethod();
        if(sortingOption == 1){
            sortingMethods.sortByNameWithBuble(personas);
        }else if(sortingOption == 2){
            sortingMethods.sortByNameWithSelection(personas);
        }else{
            view.showMessage("opcion invalida");
        }

    }
    public void inputPersons(){

        int numeroPersons = view.inputInt("Ingrese el numero de personas");
        personas = new Person[numeroPersons];
        for( int i = 0; i < numeroPersons; i++){
            personas[i] =  view.inputPersons();
        }
    }
    public void addPerson(){
        if(personas== null){
            view.showMessage("No existe, Ingrese el numero de personas por primera vez ");
            inputPersons();
        }else{
        int numeroPersons = view.inputInt("Ingrese el numero de personas a adicionar: " );

        //temporal
        Person[] personstotal = new Person[personas.length + numeroPersons];
        for(int i = 0; i < personas.length; i++){
            personstotal[i] = personas[i];
        }
        for (int i = personas.length; i < personstotal.length; i++) {
            personas[i] = view.inputPersons();

            
        }
        personas = personstotal;
         }

    }
    
}