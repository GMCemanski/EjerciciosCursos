/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.ConsultasPersona;
import modelo.Persona;
import vista.VistaPersona;

/**
 *
 * @author Ale
 */
public class ControladorPersona implements ActionListener{
    
    private VistaPersona vista;
    private Persona persona;
    private ConsultasPersona modelo;

    public ControladorPersona(VistaPersona vista, Persona persona, ConsultasPersona modelo) {
        this.vista = vista;
        this.persona = persona;
        this.modelo = modelo;
        vista.jbInsertar.addActionListener(this);
        vista.jbLimpiar.addActionListener(this);
        vista.jbModificar.addActionListener(this);
        vista.jbBuscar1.addActionListener(this);
        vista.jbEliminar.addActionListener(this);
    }
    
    public void iniciar(){
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        vista.jtfIdPersona1.setVisible(false);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== vista.jbInsertar){ //Si de nuestra vista se toco el botón Insertar hace tal cosa
            persona.setClave(vista.jtfClave1.getText());
            persona.setNombre(vista.jtfNombre1.getText());
            persona.setDomicilio(vista.jtfDomicilio1.getText());
            persona.setCelular(vista.jtfCelular1.getText());
            persona.setCorreo_electronico(vista.jtfCorreo1.getText());
            persona.setFecha_nacimiento(Date.valueOf(vista.jtfFechaNac1.getText()));
            persona.setGenero(vista.jcbGenero1.getSelectedItem().toString());
            
            try {
                if(modelo.insertar(persona)){
                    JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
                }else{
                    JOptionPane.showMessageDialog(null, "Error al insertar registro");
                }                
            } catch (SQLException ex) {
                Logger.getLogger(ControladorPersona.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }
        if(ae.getSource()== vista.jbLimpiar){
            System.out.println("llegue al boton");
            limpiarCajas();
        }
        if(ae.getSource()==vista.jbBuscar1){
            persona.setClave(vista.jtfBuscar1.getText());// se fija el valor de clave que está en la caja y lo setea en persona
            
            if(modelo.buscar(persona)){ //Se va al modelo buscar, le da la persona por parámetro que tiene tal clave, y ahi lleva todos los campos de persona
                vista.jtfIdPersona1.setText(String.valueOf(persona.getIdPersona()));
                vista.jtfClave1.setText(persona.getClave());
                vista.jtfNombre1.setText(persona.getNombre());
                vista.jtfDomicilio1.setText(persona.getDomicilio());
                vista.jtfCelular1.setText(persona.getCelular());
                vista.jtfCorreo1.setText(persona.getCorreo_electronico());
                vista.jtfFechaNac1.setText(String.valueOf(persona.getFecha_nacimiento()));
                vista.jcbGenero1.setSelectedItem(persona.getGenero());
            }else{ // Si no encuentra alguien con esa clave.
                JOptionPane.showMessageDialog(null, "No existe una persona con dicha clave");
                limpiarCajas();
            }
        }
        if(ae.getSource()==vista.jbEliminar){
            persona.setIdPersona(Integer.parseInt(vista.jtfIdPersona1.getText()));
            try {
                if(modelo.eliminar(persona)){
                    JOptionPane.showMessageDialog(null, "Se ha eliminado el registro correctamemnte");
                    limpiarCajas();
                }else{
                    JOptionPane.showMessageDialog(null, "No se ha podido elminar el registro.");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(ControladorPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(ae.getSource()==vista.jbModificar){
            persona.setIdPersona(Integer.parseInt(vista.jtfIdPersona1.getText()));
            persona.setClave(vista.jtfClave1.getText());
            persona.setNombre(vista.jtfNombre1.getText());
            persona.setDomicilio(vista.jtfDomicilio1.getText());
            persona.setCelular(vista.jtfCelular1.getText());
            persona.setCorreo_electronico(vista.jtfCorreo1.getText());
            persona.setFecha_nacimiento(Date.valueOf(vista.jtfFechaNac1.getText()));
            persona.setGenero(vista.jcbGenero1.getSelectedItem().toString());
            
            try {
                if(modelo.modificar(persona)){
                    JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
                    limpiarCajas();
                }else{
                    JOptionPane.showMessageDialog(null, "No se pudo modificar el registro");
                    limpiarCajas();
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(ControladorPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
                      
        }
    }
    
    public void limpiarCajas(){
        vista.jtfIdPersona1.setText(null);
        vista.jtfBuscar1.setText(null);
        vista.jtfClave1.setText(null);
        vista.jtfNombre1.setText(null);
        vista.jtfDomicilio1.setText(null);
        vista.jtfCelular1.setText(null);
        vista.jtfCorreo1.setText(null);
        vista.jtfFechaNac1.setText(null);
        vista.jcbGenero1.setSelectedIndex(0);
    }
    
}
