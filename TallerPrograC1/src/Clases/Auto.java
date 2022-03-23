/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author marti
 */
public class Auto {
    private String modelo;
    private int valor;
    private int stockInicial;
    private int stockVendido;
    private int stockRestante;
    
    public Auto(){
        this.modelo = "-";
        this.stockInicial = 0;
        this.stockRestante = 0;
        this.stockVendido = 0;
        this.valor = 0;
    }
    
    public Auto(String modelo, int sIni,  int sVen, int val){
        this.modelo = modelo;
        this.stockInicial = sIni;
        this.stockVendido = sVen;
        this.valor = val;
    }
    
    public Auto(Auto a){
        this.modelo = a.modelo;
        this.stockInicial = a.stockInicial;
        this.stockVendido = a.stockVendido;
        this.valor = a.valor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getStockInicial() {
        return stockInicial;
    }

    public void setStockInicial(int stockInicial) {
        this.stockInicial = stockInicial;
    }

    public int getStockVendido() {
        return stockVendido;
    }

    public void setStockVendido(int stockVendido) {
        this.stockVendido = stockVendido;
    }

    public int getStockRestante() {
        return stockRestante;
    }

    public void setStockRestante(int stockRestante) {
        this.stockRestante = stockRestante;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Auto{");
        sb.append("modelo=").append(modelo);
        sb.append(", valor=").append(valor);
        sb.append(", stockInicial=").append(stockInicial);
        sb.append(", stockVendido=").append(stockVendido);
        sb.append(", stockRestante=").append(stockRestante);
        sb.append('}');
        return sb.toString();
    }

    
    
}
