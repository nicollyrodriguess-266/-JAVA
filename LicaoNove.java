/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ander
 */
public class LicaoNove {
    public static void main(String [] args) {
        double valor = 285.5;
        double valorFinal;
        
        if (valor > 100) {
            valorFinal = valor * 0.9;
        } else {
            valorFinal = valor * 0.95;}
        System.out.println("O valor final com desconto é " + valorFinal);
    }
}
