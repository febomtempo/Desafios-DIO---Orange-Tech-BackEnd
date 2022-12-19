// 2 - DOWNLOAD DE PACOTES

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.   

import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();
        
        // TODO: Crie a condição necessária para que, de acordo com o tamanho, seja printado no console barras representando o download
        for (int i = 0; i< tamanho; i++){
          System.out.print("/");
        }
    }
}