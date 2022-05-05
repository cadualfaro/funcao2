/*
Criar uma função que recebe 2 inteiros e retorna o menor dele
BÔNUS: Como podemos utilizar a função criada para achar o menor número de 3 inteiros?
 */
package funcao2;
import java.util.Scanner;
public class Funcao2 {
static int valores(int valor1, int valor2){
    int menor = Math.min(valor1,valor2);
        return menor;
        }

    public static void main(String[] args) {
        Scanner my_scan = new Scanner(System.in);
            int compara = 0;
            int num = 0;
            int a;
            
        System.out.print("Digite o 1º valor: ");
            int primeiro = my_scan.nextInt();
                System.out.println("");
        
        System.out.print("Digite o 2º valor: ");
            int segundo = my_scan.nextInt();
                System.out.println("");
            
        int menor = valores(primeiro, segundo);
            System.out.println("O menor entre os valores digitados e: "+menor);
                System.out.println("");
                
        while(true){
            System.out.println("Deseja adicionar outro valor para comparacao?");
            System.out.print("Responda com s para sim ou n para nao: ");
            System.out.println("");
                char r = my_scan.next().charAt(0);
                    switch(r){
                        case 's':
                        System.out.print("Digite o numero que deseja comparar: ");
                        num = my_scan.nextInt();
                        compara = Math.min(menor,num);
                        System.out.println("O menor entre eles e: "+compara);
                        
                        case 'n':
                        System.out.println("");
                        break;
                    }
                    break;
        }
    }
}
