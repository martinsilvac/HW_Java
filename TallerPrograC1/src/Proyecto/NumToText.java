/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * @author mayor
 */
public class NumToText {
    
    public static String unidadEnTexto(int iNumero){
    // Método que dado un número me lo devuelve en texto		
        switch(iNumero){
            case 1:
                    return "uno";
            case 2:
                    return "dos";
            case 3:
                    return "tres";
            case 4:
                    return "cuatro";
            case 5:
                    return "cinco";
            case 6:
                    return "seis";
            case 7:
                    return "siete";
            case 8:
                    return "ocho";
            case 9:
                    return "nueve";
            case 0:
                    return "cero";
            default:
                    return "";
        }
    }
    
    public static String decenaEnTexto(int iDecena){
        
        switch (iDecena){
              case 1:
                      return "diez";
              case 2:
                      return "veinte";
              case 3:
                      return "treinta";
              case 4:
                      return "cuarenta";
              case 5:
                      return "cincuenta";
              case 6:
                      return "sesenta";
              case 7:
                      return "setenta";
              case 8:
                      return "ochenta";
              case 9:
                      return "noventa";		
              default:
                      return "";
        }
    }
    
    public static String decenas(int iDecena){
        switch (iDecena){
              case 11:
                      return "once";
              case 12:
                      return "doce";
              case 13:
                      return "trece";
              case 14:
                      return "catorce";
              case 15:
                      return "quince";
              case 16:
                      return "dieciseis";
              case 17:
                      return "diecisiete";
              case 18:
                      return "dieciocho";
              case 19:
                      return "diecinueve";		
              default:
                      return "";
        }
    }
    public static String centenaEnTexto(int iCentena){
        switch (iCentena){
              case 1:
                      return "ciento";
              case 5:
                      return "quinientos";
              case 9:
                      return "novecientos";				
              default:
                      return "";
        }
    }
    
    
    
}
