package Paquete;

import javax.swing.JFrame;

public class Clase1 {
    public static void main(String[] args) {
        // Crear instancias del modelo y la vista
        Modelo modelo = new Modelo();
        FrmVista vista = new FrmVista();
        
        // Crear el controlador y pasarle la vista y el modelo
        Controlador controlador = new Controlador(vista, modelo);
        
        // Configurar la vista principal para terminar la aplicación al cerrar
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Hacer visible la vista principal
        vista.setVisible(true);
    }
}