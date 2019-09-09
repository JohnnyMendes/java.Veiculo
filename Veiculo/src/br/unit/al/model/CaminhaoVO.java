/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unit.al.model;


  public class CaminhaoVO extends VeiculoVO{
    
    private Double capacidade;
    private int numEixos;

    public CaminhaoVO(Double capacidade, int numEixos, String modelo, String placa, Integer anoFabricacao, Double valor) {
        super(modelo, placa, anoFabricacao, valor);
        this.capacidade = capacidade;
        this.numEixos = numEixos;
    }

    public CaminhaoVO() {
        super();
    }

    public CaminhaoVO(Double capacidade, int numEixos) {
        super();
        this.capacidade = capacidade;
        this.numEixos = numEixos;
       
    }

    public CaminhaoVO(String modelo, String placa, int anoFabricacao, double capacidade, int numEixos, double valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public Double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Double capacidade) {
        this.capacidade = capacidade;
    }

    public int getNumEixos() {
        return numEixos;
    }

    public void setNumEixos(int numEixos) {
        this.numEixos = numEixos;
    }
    
    
}  

