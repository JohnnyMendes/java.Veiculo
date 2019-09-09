
package heranca;
import br.unit.al.model.CaminhaoVO;
import br.unit.al.model.CarroVO;
import br.unit.al.model.VeiculoVO;
import java.util.Scanner;

public class Frota {
   public static void main(String args[])
   {
       Scanner sInput=new Scanner(System.in);
       Scanner nInput=new Scanner(System.in);
       
       int tam, i, anoFabricacao, anoModelo, numPortas = 0, numEixos;
       Double capacidade, valor;
       String tipo, modelo, placa;
       
       System.out.println("Digite o tamanho da frota: ");
       tam=nInput.nextInt();
       VeiculoVO frota[]=new VeiculoVO[tam];
       
       for(i=0; i<tam; i++)
       {
           System.out.println("Tipo do "+ (i+1) +".o veículo (a-auto/c-caminhao):");
           tipo=sInput.nextLine();
           
           if (!tipo.equalsIgnoreCase("a") && !tipo.equalsIgnoreCase("c"))
                    System.out.println("TIPO NÃO PREVISTO");
           
           System.out.println("Modelo: ");
           modelo=sInput.nextLine();
           System.out.println("Placa: ");
           placa=sInput.nextLine();
           System.out.println("Ano Fabricacao: ");
           anoFabricacao=nInput.nextInt();
           System.out.println("Valor: ");
           valor=nInput.nextDouble();
           
           if (tipo.equalsIgnoreCase("a"))
           {
              System.out.println("Ano Modelo: ");
              anoModelo=nInput.nextInt();
              
              frota[i]=new CarroVO(modelo, placa, anoFabricacao, anoModelo, numPortas, valor);
           }
           
           else if (tipo.equalsIgnoreCase("c"))
           {
               System.out.println("Capacidade (toneladas): ");
               capacidade=nInput.nextDouble();
               System.out.println("Num de Eixos: ");
               numEixos=nInput.nextInt();
               frota[i]=new CaminhaoVO (modelo, placa, anoFabricacao, capacidade, numEixos, valor);
           }
           else
           {
               frota[i]=new VeiculoVO (modelo, placa, anoFabricacao, valor);
           }
       }
       for(i=0; i<tam; i++)
       {
           System.out.println("Veiculo n.o"+ (i+1));
           if (frota[i]!=null)
               frota[i].imprime();
           System.out.println();
       }
   }
      
    
}
