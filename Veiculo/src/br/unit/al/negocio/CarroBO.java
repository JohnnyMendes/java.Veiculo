/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unit.al.negocio;

import br.unit.al.model.CarroVO;

        
public class CarroBO {
    public void exibirDados(CarroVO carroVO){
       System.out.println(""+carroVO.getModelo());
       System.out.println(""+carroVO.getPlaca());
       System.out.println(""+carroVO.getAnoFabricacao());
       System.out.println(""+carroVO.getValor());
   }
    
}
