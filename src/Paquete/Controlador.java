package Paquete;

import Vistas.FrmAcerca;
import Vistas.FrmInstructivo;
import Vistas.Frm3;
import Vistas.Frm4;
import Vistas.Frm5;
import Vistas.Frm6;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class Controlador {
    private FrmVista vista;
    private Modelo modelo;
    
    public Controlador(FrmVista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        
        // Configurar listeners para todos los botones
        configurarListeners();
    }
    
    private void configurarListeners() {
        // Botón Acerca de
        this.vista.btnAcercade.addActionListener(e -> mostrarAcercaDe());
        
        // Botón Instructivo
        this.vista.btnInstructivo.addActionListener(e -> mostrarInstructivo());
        
        // Botón Crear Vector
        this.vista.CrearVec.addActionListener(e -> mostrarFrm3());
        
        // Botón Ingresar Datos
        this.vista.IgresarDatos.addActionListener(e -> mostrarFrm4());
        
        // Botón Listado
        this.vista.Listado.addActionListener(e -> mostrarFrm5());
        
        // Botón Mostrar Mayor
        this.vista.MostrarMayor.addActionListener(e -> mostrarFrm6());
    }
    
    private void mostrarAcercaDe() {
        FrmAcerca acercaDe = new FrmAcerca((JFrame)vista, true);
        acercaDe.setLocationRelativeTo(vista);
        acercaDe.setVisible(true);
    }
    
    private void mostrarInstructivo() {
        FrmInstructivo instructivo = new FrmInstructivo((JFrame)vista, true);
        instructivo.setLocationRelativeTo(vista);
        instructivo.setVisible(true);
    }
    
    private void mostrarFrm3() {
        Frm3 frm3 = new Frm3((JFrame)vista, true);
        frm3.setLocationRelativeTo(vista);
        frm3.setVisible(true);
    }
    
    private void mostrarFrm4() {
        Frm4 frm4 = new Frm4((JFrame)vista, true);
        frm4.setLocationRelativeTo(vista);
        frm4.setVisible(true);
    }
    
    private void mostrarFrm5() {
        Frm5 frm5 = new Frm5((JFrame)vista, true);
        frm5.setLocationRelativeTo(vista);
        frm5.setVisible(true);
    }
    
    private void mostrarFrm6() {
        Frm6 frm6 = new Frm6((JFrame)vista, true);
        frm6.setLocationRelativeTo(vista);
        frm6.setVisible(true);
    }
}