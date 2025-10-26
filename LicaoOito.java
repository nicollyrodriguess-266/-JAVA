/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ander
 */
public class LicaoOito {
    public static void main(String [] args){
        int dia = 31;
        int mes = 10;
        
        String signo = "";
        
        if ((dia >= 23 && mes == 9) || (dia <=22 && mes == 10)){
            signo = "Libra";
            } else if ((dia >= 22 && mes == 10) || (dia <=21 && mes == 11)){
            signo = "Escorpião";
                 } else if ((dia >= 23 && mes == 11) || (dia <=24 && mes == 12)){
                     signo = "Capricónio";
                 } else {
                    signo = "Outro signo";}
        System.out.println("Seu signo é " + signo);
}
}
