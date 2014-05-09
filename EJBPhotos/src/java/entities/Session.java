/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Louis
 */
@Stateless
public class Session implements SessionRemote {
    @PersistenceContext
    private EntityManager em;
    @PersistenceContext(name="TP_Photo")

    public void createPhoto(Photo p, Personne pe) {
        em.persist(p);
        em.persist(pe);
    }

    public void deletePhoto(Photo p) {
        em.remove(p);
    }

    public void updatePhoto(Photo p) {
        em.merge(p);
    }

    public List<Photo> getPhotos() {
        Query q = em.createNamedQuery("Photo.findAll");
        List<Photo> lesPhotos = q.getResultList();
        return lesPhotos;
    }

    public void createPersonne(Personne pe) {
        em.persist(pe);
    }

    public void deletePersonne(Personne pe) {
        em.refresh(pe);
    }

    public void updatePersonne(Personne pe) {
        em.remove(pe);
    }

    public List<Personne> getPersonnes(){
        Query q = em.createNamedQuery("Personne.findAll");
        List<Personne> lesPersonnes = q.getResultList();
        return lesPersonnes;
    };
    
    
}
