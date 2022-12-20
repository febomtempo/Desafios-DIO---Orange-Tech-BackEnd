// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.   

import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidade = leitor.nextInt();
        int multas = leitor.nextInt();
        
        // TODO: Crie a condição necessária para verificar se os carros estão acima da velocidade
        boolean limiteVelocidade = velocidade <= 80;

        // TODO2: Crie a condição para verificar se os motoristas receberão ou não pontos na carteira de habilitação
        if(limiteVelocidade == false){
          multas++;
        }
        if(multas >= 3){
          System.out.println(multas + " multas. " + "Levou pontos na carteira");
        }else{
          System.out.println(multas + " multas. " + "Nao levou pontos na carteira");
        }
    }
}