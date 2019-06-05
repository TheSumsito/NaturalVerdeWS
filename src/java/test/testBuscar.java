/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;
import modelo.dao.daoControlador;
import modelo.entidades.Proyecto;

/**
 *
 * @author mjara
 */
public class testBuscar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        daoControlador dao = new daoControlador();

        if (dao.filtrarProyecto("CAMBIO SISTEMA DE REGADO")) {
            System.out.println("Proyecto Encontrado");
            Random generadorAleatorios = new Random();
            int numero = 1 + generadorAleatorios.nextInt(100000);
            System.out.println(numero);

        } else {
            System.out.println("No Encontrado");
        }

        if (dao.filtrarTrabajadores("REBOOT SOFTWARE")) {
            System.out.println("Equipo Encontrado");
        } else {
            System.out.println("Equipo No Encontrado");
        }
    }

}
