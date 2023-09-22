/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package porelpunto;

import java.util.Scanner;

public class PorElPunto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter=0;
        double VentasTotales=0;
        System.out.println("¿Para cuántos días tienes cifras de ventas?");
        double ventasDías = sc.nextDouble();
        while(counter<ventasDías){
            System.out.println("Ingrese las ventas para el día "+(counter+1));
            double Ventas = sc.nextDouble();
            VentasTotales = VentasTotales + Ventas;
            counter++;
        }
        System.out.println("La ventas totales son "+VentasTotales);           
    }   
}
