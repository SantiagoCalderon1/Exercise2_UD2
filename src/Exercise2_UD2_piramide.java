/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author alumnot
 */
public class Exercise2_UD2_piramide {

    public static void Piramide(int fila) {
        for (int i = 1; i <= fila; i++) {
            for (int j = 1; j <= fila - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        int fila=10;
        
        Piramide(fila);
    }
}
