/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ander
 */
public class LicaoDez {
    public static void main(String [] args){
    double peso = 75.6;
    double altura = 1.70;
    
    double imc = peso / (altura * altura);
    System.out.println("Seu IMC é: " + imc);
    
    if (imc < 18.5) {
    System.out.println("Abaixo do seu peso");
    } else if (imc <25){
    System.out.println("Peso ideal");
        } else {
            System.out.println("Sobrepeso");}
    }
   
}
