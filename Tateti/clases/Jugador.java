/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Ale
 */
public class Jugador {
    private int victorias;
    private int empates;
    private String nombre;
    private Ficha Ficha;

    public Jugador(int victorias, int empates, String nombre, Ficha Ficha) {
        this.victorias = victorias;
        this.empates = empates;
        this.nombre = nombre;
        this.Ficha = Ficha;
    }

    public int getVictorias() {
        return victorias;
    }

    public int getEmpates() {
        return empates;
    }

    public String getNombre() {
        return nombre;
    }

    public Ficha getFicha() {
        return Ficha;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFicha(Ficha Ficha) {
        this.Ficha = Ficha;
    }
    
}
