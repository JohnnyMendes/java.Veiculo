/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unit.al.negocio;

import br.unit.al.model.CaminhaoVO;


public class CaminhaoBO {
        
   public void exibirDados(CaminhaoVO caminhaoVO){
       System.out.println(""+caminhaoVO.getModelo());
       System.out.println(""+caminhaoVO.getPlaca());
       System.out.println(""+caminhaoVO.getAnoFabricacao());
       System.out.println(""+caminhaoVO.getValor());
   }
    
}
