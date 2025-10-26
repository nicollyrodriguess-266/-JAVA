/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ander
 */
public class LicaoOnze {
    public static void main(String [] args){
    int ladoUm = 5;
    int ladoDois = 5;
    int ladoTres = 3;
    
    if (ladoUm == ladoDois && ladoDois == ladoTres){
    System.out.println("Triângulo Equilatero");
    } else if (ladoUm == ladoDois || ladoUm == ladoTres || ladoDois ==  ladoTres){
        System.out.println("Triângulo Isoceles");}
    else {
        System.out.println("Triângulo Escaleno");}
    }
}