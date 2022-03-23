/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Rut.Rut;

/**
 *
 * @author marti
 */
public class Cliente {
    private Rut rut;
    
    public Cliente(){
        this.rut = new Rut ();
    }
    
    public Cliente (Rut rut){
        this.rut = new Rut(rut);
    }
    
    public Cliente (String rut){
        this.rut = new Rut(rut);
    }
    
    public Cliente (Cliente c){
        this.rut = new Rut(c.rut);
    }

    public Rut getRut() {
        return rut;
    }

    public void setRut(Rut rut) {
        this.rut = rut;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + '}';
    }
    
}
