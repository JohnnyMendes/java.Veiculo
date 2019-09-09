/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unit.al.teste;
import br.unit.al.model.CarroVO;
import br.unit.al.negocio.CarroBO;
/**
 *
 * @author 1191511607
 */
public class CarroTeste {
    public static void main(String [] args){
      
      CarroVO carroVO=new CarroVO();
      CarroVO carroVO1=new CarroVO(208.65, 4);
      CarroVO carroVO2=new CarroVO(208.45, 4, "Modelo TRUENO", "ALK-6969", 2010, 30000.00);
      CarroBO carroBO=new CarroBO();
      
      carroBO.exibirDados(carroVO);
      carroBO.exibirDados(carroVO1);
      carroBO.exibirDados(carroVO2);
  }  
}
