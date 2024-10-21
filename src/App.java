import Views.View;
import Controllers.*;

public class App {
    public static void main(String[] args) throws Exception {
        //crear vista
        View vista = new View();
          
        // Crear las clases con los metodos de ordenamiento y busqueda
        SortingMethods sortingMethods = new SortingMethods();
        SearcMethods searcMethods = new SearcMethods();
        //crear controlador
        Controller controller = new Controller(vista, sortingMethods, searcMethods);
    }
}
