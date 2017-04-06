/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luiz Eduardo
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          Pilha p1 = new Pilha(5);
        
          p1.Insercao("Teste");
          p1.Insercao("Teste");
          p1.Insercao("Teste");
          p1.Insercao("Teste");
          //p1.Insercao("Luiz");
          //p1.Insercao("Luiz");
          p1.Contapilha();
          p1.Remove();
        }
        
    }
    

