/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

import Clases.Perfil;
import java.util.List;
import Proyecto.NumToText;

/**
 *
 * @author marti
 */
public class Proceso {
  
    public static String ConsultarClaves(){
        return null;
    }
    
    public static String CrearClaves(){
        return null;
    }
    
    public static String ConsultarStock(){
        return null;
    }
    
    public static String ConsutlarVentas(){
        return null;
    }
    
    public static String NumtoText(int val){
        int iUnidad = val%10;	
        val = val/10;
        String sTexto = NumToText.unidadEnTexto(iUnidad);
        
        int iDecena = val%10;
        val=val/10;
        
        if ((iUnidad==0) && (iDecena>0))
                sTexto = NumToText.decenaEnTexto(iDecena);
        else if (iDecena==1)
                sTexto = NumToText.decenas(10+iUnidad);
        else if (iDecena > 1)
                sTexto = NumToText.decenaEnTexto(iDecena) + " y " + sTexto;
        
        int iCentena = val%10;
        if ((iCentena!=1) && (iCentena!=5) && (iCentena!=9) && (iCentena!=0))
                sTexto = NumToText.unidadEnTexto(iCentena) + "cientos" + " " + sTexto;
        else if ((iCentena==1) || (iCentena==5) || (iCentena==9))
                sTexto = NumToText.centenaEnTexto(iCentena) + " " + sTexto;
        
        return sTexto;
    }
}
