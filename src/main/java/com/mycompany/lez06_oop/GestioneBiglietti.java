/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez06_oop;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class GestioneBiglietti {

    static ArrayList<Evento> elencoEventi = new ArrayList<Evento>();
    static ArrayList<Utente> elencoUtenti = new ArrayList<Utente>();
    static ArrayList<Biglietto> elencoBiglietti = new ArrayList<Biglietto>();
    
     /*@param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // utente(nome ,cognome, ,username, password,mail)
        //data prenotazione cosa prenotare (array prenotazioni)
        //eventi(es concerto ,film( titolo data luogo))
        // biglietti (codici evento,costo,nome ,dove,quando)
        Utente utente1;
        Evento evento1;
        Biglietto ticket1;

        utente1 = new Utente("andrea", "regis", "andrea", "rgsjhmo", "aga");
        elencoUtenti.add(utente1);
        utente1 = new Utente("pluto", "pippo", "andrea", "rgsjhmo", "aga");
        elencoUtenti.add(utente1);
        utente1 = new Utente("matteo", "secondi", "andrea", "rgsjhmo", "aga");
        elencoUtenti.add(utente1);
        LocalDateTime dataevento = LocalDateTime.of(2019, 12, 22, 15, 0);
        evento1 = new Evento("emp", dataevento, "milano");
        elencoEventi.add(evento1);
        ticket1 = new Biglietto(60, dataevento, elencoEventi.get(1), elencoUtenti.get(0));
        elencoBiglietti.add(ticket1);
        evento1 = new Evento("gom", dataevento, "milano");
        elencoEventi.add(evento1);
        ticket1 = new Biglietto(130, dataevento, evento1, utente1);
        elencoBiglietti.add(ticket1);
        System.out.print(ticket1);
    }
    static String stampaTicket(){
    String ris = "Elenco biglietti \n";
    for (int i= 0; i < elencoBiglietti.size();i++){
        Biglietto tick = elencoBiglietti.get(i);
        Evento ev = tick.getEvento();
        Utente ut = tick.getUtente();
        ris+= (1+ i) + " -" + ev.getTitolo() + " - " 
         + ut.getCognome() + " " + ut.getNome() + "\n" ;
             
    
    }    
    
    
    return ris;
    
    
    }
    
    
}
