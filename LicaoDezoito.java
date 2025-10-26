/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ander
 */
public class LicaoDezoito {
    public static void main(String[] args) {
        int velocidade = 135; // km/h

        if (velocidade > 120) {
            int limite = velocidade - 120;
            double multa = limite * 10.0; 
            System.out.println("Velocidade acima do limite!");
            System.out.println("Multa: R$ " + multa);
        } else {
            System.out.println("Velocidade dentro do limite.");
        }
    }
}
