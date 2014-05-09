/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Louis
 */
@Remote
public interface SessionRemote {

    void createPhoto(entities.Photo p, entities.Personne pe);

    void deletePhoto(entities.Photo p);

    void updatePhoto(entities.Photo p);
    
    List<Photo> getPhotos();

    void createPersonne(entities.Personne pe);

    void deletePersonne(entities.Personne pe);

    void updatePersonne(entities.Personne pe);

    List<Personne> getPersonnes();
    
}
