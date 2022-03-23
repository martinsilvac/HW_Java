/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author marti
 */
public class Perfil {
    private String user;
    private String pass;
    private NivelAcceso nvl;
    
    public Perfil(){
        this.user = "";
        this.pass = "";
        this.nvl = NivelAcceso.NULO;
    }

    public Perfil(String user, String pass, NivelAcceso nvl) {
        this.user = user;
        this.pass = pass;
        this.nvl = nvl;
    }
    
    public Perfil(Perfil p){
        this.user = p.user;
        this.pass = p.pass;
        this.nvl = p.nvl;
        
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public NivelAcceso getNvl() {
        return nvl;
    }

    public void setNvl(NivelAcceso nvl) {
        this.nvl = nvl;
    }
    
    public boolean complejidadClave(){
        
        //longitud de la clave > que 8 ; clave aceptable
        if(pass.length() > 8){
            //tiene + de 8 caracteres, revisar mayusculas y que tenga al menos un número
            boolean mayusc = false;
            boolean num = false;
            char c;
            
            for(int i=0; i<pass.length(); i++){
                c = pass.charAt(i);
                
                if(Character.isDigit(c)){
                    num = true;
                }
                if(Character.isUpperCase(c)){
                    mayusc = true;
                }
            }
            // contiene mayusculas, 1 numero y 8 caracteres totales = clave segura
            if(num && mayusc){
                return true;
            }
            
        }
        
        return false;
          
    }
    @Override
    public String toString() {
        return "Perfil{" + "user=" + user + ", pass=" + pass + ", nvl=" + nvl + '}';
    }

}
