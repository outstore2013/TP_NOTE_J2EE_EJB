/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientapp;

import controllers.Controller;
import entities.Personne;

/**
 *
 * @author Louis
 */
public class ClientApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personne pe = new Personne();
        pe.setNom("Hunger");
        pe.setPrenom("Gégé");
        Controller ct = new Controller();
        //ct.createPersonne(pe);
        ct.deletePersonne(pe);
        
    }
    
}
