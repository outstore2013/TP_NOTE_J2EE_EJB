/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Louis
 */
@Stateless
@LocalBean
public class Session {
    @PersistenceContext
    private EntityManager em;
    @PersistenceContext(name="TP_Photo")
    
    
}
