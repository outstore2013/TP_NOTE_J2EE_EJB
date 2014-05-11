/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import entities.Personne;
import entities.SessionRemote;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Louis
 */
public class Controller {
    SessionRemote remote;
    
        public Controller(){
            try { 
                InitialContext ic = new InitialContext();
                remote = (SessionRemote)ic.lookup("java:global/EJBPhotos/Session!entities.SessionRemote");
            } catch (NamingException e) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    
    public void createPersonne(Personne pe){
        remote.createPersonne(pe);
    }
    public void deletePersonne(Personne pe){
        remote.deletePersonne(pe);
    }
}
