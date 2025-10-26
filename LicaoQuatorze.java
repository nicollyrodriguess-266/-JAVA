/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ander
 */
public class LicaoQuatorze {
        public static void main(String[] args) {
        int mes = 10;

        if (mes == 12 || mes == 1 || mes == 2) {
            System.out.println("Verão");
        } else if (mes >= 3 && mes <= 5) {
            System.out.println("Outono");
        } else if (mes >= 6 && mes <= 8) {
            System.out.println("Inverno");
        } else {
            System.out.println("Primavera");
        }
        }
}
