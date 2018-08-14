/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceGraphiq;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "STATUT", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Statut.findAll", query = "SELECT s FROM Statut s")
    , @NamedQuery(name = "Statut.findByCodestatut", query = "SELECT s FROM Statut s WHERE s.codestatut = :codestatut")
    , @NamedQuery(name = "Statut.findByLibstatut", query = "SELECT s FROM Statut s WHERE s.libstatut = :libstatut")})
public class Statut implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODESTATUT")
    private Integer codestatut;
    @Basic(optional = false)
    @Column(name = "LIBSTATUT")
    private String libstatut;

    public Statut() {
    }

    public Statut(Integer codestatut) {
        this.codestatut = codestatut;
    }

    public Statut(Integer codestatut, String libstatut) {
        this.codestatut = codestatut;
        this.libstatut = libstatut;
    }

    public Integer getCodestatut() {
        return codestatut;
    }

    public void setCodestatut(Integer codestatut) {
        Integer oldCodestatut = this.codestatut;
        this.codestatut = codestatut;
        changeSupport.firePropertyChange("codestatut", oldCodestatut, codestatut);
    }

    public String getLibstatut() {
        return libstatut;
    }

    public void setLibstatut(String libstatut) {
        String oldLibstatut = this.libstatut;
        this.libstatut = libstatut;
        changeSupport.firePropertyChange("libstatut", oldLibstatut, libstatut);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codestatut != null ? codestatut.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Statut)) {
            return false;
        }
        Statut other = (Statut) object;
        if ((this.codestatut == null && other.codestatut != null) || (this.codestatut != null && !this.codestatut.equals(other.codestatut))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "interfaceGraphiq.Statut[ codestatut=" + codestatut + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
