/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez06_oop;

import java.time.LocalDateTime;
import java.time.Month;
import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // utente(nome ,cognome, ,username, password,mail)
        //data prenotazione cosa prenotare (array prenotazioni)
        //eventi(es concerto ,film( titolo data luogo))
        // biglietti (codici evento,costo,nome ,dove,quando)
    }
     Utente utente1 = new Utente("andrea", "regis", "andrea", "rgsjhmo", "aga");
     LocalDateTime dataevento = LocalDateTime.of(2019,12, 22, 15, 0);
     Evento evento1 = new Evento("emp", "milano", "concerto", 60, "CNCRT");
     Biglietto ticket1 = new Biglietto(evento1, utente1, LocalDateTime.MAX);

     
}
