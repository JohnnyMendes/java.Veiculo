/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unit.al.teste;
import br.unit.al.model.CaminhaoVO;
import br.unit.al.negocio.CaminhaoBO;

public class CaminhaoTeste {
    public static void main(String [] args){
      
      CaminhaoVO caminhaoVO=new CaminhaoVO();
      CaminhaoVO caminhaoVO1=new CaminhaoVO(258.65, 8);
      CaminhaoVO caminhaoVO2=new CaminhaoVO(258.45, 8, "Modelo TRUCK", "UFO-6969", 1975, 45000.00);
      CaminhaoBO caminhaoBO=new CaminhaoBO();
      
      caminhaoBO.exibirDados(caminhaoVO);
      caminhaoBO.exibirDados(caminhaoVO1);
      caminhaoBO.exibirDados(caminhaoVO2);
  }  
}
