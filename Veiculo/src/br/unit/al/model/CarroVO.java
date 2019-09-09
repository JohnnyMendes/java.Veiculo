/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unit.al.model;

/**
 *
 * @author 1191511607
 */
public class CarroVO extends VeiculoVO{
    
    private Double capacidade;
    private int numEixos;

    public CarroVO(Double capacidade, int numEixos, String modelo, String placa, Integer anoFabricacao, Double valor) {
        super(modelo, placa, anoFabricacao, valor);
        this.capacidade = capacidade;
        this.numEixos = numEixos;
    }

    public CarroVO() {
        super();
    }

    public CarroVO(Double capacidade, int numEixos) {
        super();
        this.capacidade = capacidade;
        this.numEixos = numEixos;
       
    }

    public CarroVO(String modelo, String placa, int anoFabricacao, int anoModelo, int numPortas, double valor) {
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
    

