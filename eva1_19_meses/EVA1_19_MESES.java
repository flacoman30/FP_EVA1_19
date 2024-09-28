/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_meses;

import java.util.Scanner;

/**
 *
 * @author flac3
 */
public class EVA1_19_MESES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mes;
        Scanner captu = new Scanner(System.in);
        System.out.println("numero correspondiente al dia (1-12)");
        mes = captu.nextInt();
        captu.nextLine();
        
        if(mes == 1){
            System.out.println("Enero");
        }else if(mes == 2){
             System.out.println("Febrero");
        }else if(mes == 3){
            System.out.println("Marzo");
        }else if(mes == 4){
            System.out.println("Abril");
        }else if(mes == 5){
            System.out.println("Mayo");  
        }else if(mes == 6){     
            System.out.println("Junio");
        }else if(mes == 7){     
            System.out.println("julio");
        }else if(mes == 8){     
            System.out.println("agosto");
        }else if (mes == 9){     
            System.out.println("Spetiembre"); 
        }else if(mes == 10){     
            System.out.println("octubre");
        }else if(mes == 11){     
            System.out.println("noviembre");
        }else if(mes == 12){     
            System.out.println("diciembre");
       
         }else{//es ocional     
           System.out.println("numero no valido");
    }
    
}

}