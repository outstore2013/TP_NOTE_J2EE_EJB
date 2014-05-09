/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Louis
 */
@Entity
@Table(name = "photo", catalog = "photos", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Photo.findAll", query = "SELECT p FROM Photo p"),
    @NamedQuery(name = "Photo.findByIdPhoto", query = "SELECT p FROM Photo p WHERE p.idPhoto = :idPhoto"),
    @NamedQuery(name = "Photo.findByNomPhoto", query = "SELECT p FROM Photo p WHERE p.nomPhoto = :nomPhoto"),
    @NamedQuery(name = "Photo.findByCheminPhoto", query = "SELECT p FROM Photo p WHERE p.cheminPhoto = :cheminPhoto")})
public class Photo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPhoto", nullable = false)
    private Integer idPhoto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nomPhoto", nullable = false, length = 50)
    private String nomPhoto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "cheminPhoto", nullable = false, length = 50)
    private String cheminPhoto;
    @JoinColumn(name = "idPersonne", referencedColumnName = "idPersonne", nullable = false)
    @ManyToOne(optional = false)
    private Personne idPersonne;

    public Photo() {
    }

    public Photo(Integer idPhoto) {
        this.idPhoto = idPhoto;
    }

    public Photo(Integer idPhoto, String nomPhoto, String cheminPhoto) {
        this.idPhoto = idPhoto;
        this.nomPhoto = nomPhoto;
        this.cheminPhoto = cheminPhoto;
    }

    public Integer getIdPhoto() {
        return idPhoto;
    }

    public void setIdPhoto(Integer idPhoto) {
        this.idPhoto = idPhoto;
    }

    public String getNomPhoto() {
        return nomPhoto;
    }

    public void setNomPhoto(String nomPhoto) {
        this.nomPhoto = nomPhoto;
    }

    public String getCheminPhoto() {
        return cheminPhoto;
    }

    public void setCheminPhoto(String cheminPhoto) {
        this.cheminPhoto = cheminPhoto;
    }

    public Personne getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(Personne idPersonne) {
        this.idPersonne = idPersonne;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPhoto != null ? idPhoto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Photo)) {
            return false;
        }
        Photo other = (Photo) object;
        if ((this.idPhoto == null && other.idPhoto != null) || (this.idPhoto != null && !this.idPhoto.equals(other.idPhoto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Photo[ idPhoto=" + idPhoto + " ]";
    }
    
}
