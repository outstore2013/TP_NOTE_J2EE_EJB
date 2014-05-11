/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Louis
 */
@Stateless
public  class Session implements SessionRemote {
    @PersistenceContext
    private EntityManager em;
    @PersistenceContext(name="EJBPhotosPU")

    @Override
    public void createPhoto(Personne pe, Photo p) {
        em.persist(pe);
        em.persist(p);
    }

    @Override
    public void deletePhoto(Photo p) {
        em.remove(p);
    }

    @Override
    public void updatePhoto(Photo p) {
        em.merge(p);
    }

    @Override
    public void createPersonne(Personne pe) {
        em.persist(pe);
    }

    @Override
    public void deletePersonne(Personne pe) {
        em.merge(pe);
    }

    @Override
    public void updatePersonne(Personne pe) {
        em.remove(pe);
    }
    
    
    
}
