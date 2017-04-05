/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1calc;
/**
 *
 * @author Luiz Eduardo
 */
import java.util.Scanner;
public class Exercicio1Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a,b;
        
        Calculadora c = new Calculadora();
        
        System.out.print("Digite a opção desejada:\n");
        
        System.out.print("1-Soma");
        System.out.print("2-Subtração");
        System.out.print("3-Divisão");
        System.out.print("4-Multiplicação");
        
        scanner ler = new scanner(System.in);
        int Valor = ler.nextInt();
        
        switch(Valor){
         
            case 1:
                Scanner input1 = new Scanner(System.in);       
                System.out.println("Qual o primeiro numero: ");
                a = input1.nextInt();
                System.out.println("Qual o segundo numero: ");
                b = input1.nextInt(); 
	    	int operacaosoma = c.soma(a, b);
	    	System.out.println(operacaosoma);
                break;
            case 2:
                Scanner input2 = new Scanner(System.in);       
                System.out.println("Qual o primeiro numero: ");
                a = input2.nextInt();
                System.out.println("Qual o segundo numero: ");
                b = input2.nextInt(); 
	    	int operacaosubtracao = c.subtrai(a, b);
	    	System.out.println(operacaosubtracao);
                break;
            case 3:
                Scanner input3 = new Scanner(System.in);       
                System.out.println("Qual o primeiro numero: ");
                a = input3.nextInt();
                System.out.println("Qual o segundo numero: ");
                b = input3.nextInt(); 
	    	int operacaodivisao = c.divide(a, b);
	    	System.out.println(operacaodivisao);
                break;
            case 4:
                Scanner input4 = new Scanner(System.in);       
                System.out.println("Qual o primeiro numero: ");
                a = input4.nextInt();
                System.out.println("Qual o segundo numero: ");
                b = input4.nextInt(); 
	    	int operacaomultiplicacao = c.multiplica(a, b);
	    	System.out.println(operacaomultiplicacao);
                break;
        }
    }
}
