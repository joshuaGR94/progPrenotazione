/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez06_oop;

/**
 *
 * @author tss
 */
public class Utente {

    private String name;
    private String surname;
    private String username;
    private String password;
    private String email;

    public Utente(String name, String surname, String username, String password, String email) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.email = email;
        
         String okSurname = "";
         String okName = "";
        if (surname.length() > 50)// taglialo
        {
            okSurname = surname.substring(0, 50);

        } else {
            okSurname = surname;
        }
        okSurname = okSurname.toUpperCase();
          if (name.length() > 50)// taglialo
        {
            okName = name.substring(0, 50);

        } else {
            okName = name;
        }
        okName = okName.toUpperCase();
        //cognome apposto

        name = okName;
    }

    public String getNome() {
        return name;
    }

    public String getCognome() {
        return surname;
    }


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
