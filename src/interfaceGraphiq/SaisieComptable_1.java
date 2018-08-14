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
@Table(name = "SAISIE_COMPTABLE", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "SaisieComptable_1.findAll", query = "SELECT s FROM SaisieComptable_1 s")
    , @NamedQuery(name = "SaisieComptable_1.findByNumsaisie", query = "SELECT s FROM SaisieComptable_1 s WHERE s.numsaisie = :numsaisie")
    , @NamedQuery(name = "SaisieComptable_1.findByNumfact", query = "SELECT s FROM SaisieComptable_1 s WHERE s.numfact = :numfact")
    , @NamedQuery(name = "SaisieComptable_1.findByLibsaisie", query = "SELECT s FROM SaisieComptable_1 s WHERE s.libsaisie = :libsaisie")
    , @NamedQuery(name = "SaisieComptable_1.findByCout", query = "SELECT s FROM SaisieComptable_1 s WHERE s.cout = :cout")
    , @NamedQuery(name = "SaisieComptable_1.findByDates", query = "SELECT s FROM SaisieComptable_1 s WHERE s.dates = :dates")
    , @NamedQuery(name = "SaisieComptable_1.findByTypeTransac", query = "SELECT s FROM SaisieComptable_1 s WHERE s.typeTransac = :typeTransac")
    , @NamedQuery(name = "SaisieComptable_1.findByAmortissement", query = "SELECT s FROM SaisieComptable_1 s WHERE s.amortissement = :amortissement")
    , @NamedQuery(name = "SaisieComptable_1.findByDotationsAmort", query = "SELECT s FROM SaisieComptable_1 s WHERE s.dotationsAmort = :dotationsAmort")
    , @NamedQuery(name = "SaisieComptable_1.findBySociete", query = "SELECT s FROM SaisieComptable_1 s WHERE s.societe = :societe")
    , @NamedQuery(name = "SaisieComptable_1.findBySCompte", query = "SELECT s FROM SaisieComptable_1 s WHERE s.sCompte = :sCompte")
    , @NamedQuery(name = "SaisieComptable_1.findByIdUser", query = "SELECT s FROM SaisieComptable_1 s WHERE s.idUser = :idUser")})
public class SaisieComptable_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "NUMSAISIE")
    private Integer numsaisie;
    @Column(name = "NUMFACT")
    private String numfact;
    @Basic(optional = false)
    @Column(name = "LIBSAISIE")
    private String libsaisie;
    @Basic(optional = false)
    @Column(name = "COUT")
    private int cout;
    @Basic(optional = false)
    @Column(name = "DATES")
    private String dates;
    @Basic(optional = false)
    @Column(name = "TYPE_TRANSAC")
    private String typeTransac;
    @Basic(optional = false)
    @Column(name = "AMORTISSEMENT")
    private String amortissement;
    @Basic(optional = false)
    @Column(name = "DOTATIONS_AMORT")
    private int dotationsAmort;
    @Basic(optional = false)
    @Column(name = "SOCIETE")
    private String societe;
    @Basic(optional = false)
    @Column(name = "S_COMPTE")
    private int sCompte;
    @Basic(optional = false)
    @Column(name = "ID_USER")
    private int idUser;

    public SaisieComptable_1() {
    }

    public SaisieComptable_1(Integer numsaisie) {
        this.numsaisie = numsaisie;
    }

    public SaisieComptable_1(Integer numsaisie, String libsaisie, int cout, String dates, String typeTransac, String amortissement, int dotationsAmort, String societe, int sCompte, int idUser) {
        this.numsaisie = numsaisie;
        this.libsaisie = libsaisie;
        this.cout = cout;
        this.dates = dates;
        this.typeTransac = typeTransac;
        this.amortissement = amortissement;
        this.dotationsAmort = dotationsAmort;
        this.societe = societe;
        this.sCompte = sCompte;
        this.idUser = idUser;
    }

    public Integer getNumsaisie() {
        return numsaisie;
    }

    public void setNumsaisie(Integer numsaisie) {
        Integer oldNumsaisie = this.numsaisie;
        this.numsaisie = numsaisie;
        changeSupport.firePropertyChange("numsaisie", oldNumsaisie, numsaisie);
    }

    public String getNumfact() {
        return numfact;
    }

    public void setNumfact(String numfact) {
        String oldNumfact = this.numfact;
        this.numfact = numfact;
        changeSupport.firePropertyChange("numfact", oldNumfact, numfact);
    }

    public String getLibsaisie() {
        return libsaisie;
    }

    public void setLibsaisie(String libsaisie) {
        String oldLibsaisie = this.libsaisie;
        this.libsaisie = libsaisie;
        changeSupport.firePropertyChange("libsaisie", oldLibsaisie, libsaisie);
    }

    public int getCout() {
        return cout;
    }

    public void setCout(int cout) {
        int oldCout = this.cout;
        this.cout = cout;
        changeSupport.firePropertyChange("cout", oldCout, cout);
    }

    public String getDates() {
        return dates;
    }

    public void setDates(String dates) {
        String oldDates = this.dates;
        this.dates = dates;
        changeSupport.firePropertyChange("dates", oldDates, dates);
    }

    public String getTypeTransac() {
        return typeTransac;
    }

    public void setTypeTransac(String typeTransac) {
        String oldTypeTransac = this.typeTransac;
        this.typeTransac = typeTransac;
        changeSupport.firePropertyChange("typeTransac", oldTypeTransac, typeTransac);
    }

    public String getAmortissement() {
        return amortissement;
    }

    public void setAmortissement(String amortissement) {
        String oldAmortissement = this.amortissement;
        this.amortissement = amortissement;
        changeSupport.firePropertyChange("amortissement", oldAmortissement, amortissement);
    }

    public int getDotationsAmort() {
        return dotationsAmort;
    }

    public void setDotationsAmort(int dotationsAmort) {
        int oldDotationsAmort = this.dotationsAmort;
        this.dotationsAmort = dotationsAmort;
        changeSupport.firePropertyChange("dotationsAmort", oldDotationsAmort, dotationsAmort);
    }

    public String getSociete() {
        return societe;
    }

    public void setSociete(String societe) {
        String oldSociete = this.societe;
        this.societe = societe;
        changeSupport.firePropertyChange("societe", oldSociete, societe);
    }

    public int getSCompte() {
        return sCompte;
    }

    public void setSCompte(int sCompte) {
        int oldSCompte = this.sCompte;
        this.sCompte = sCompte;
        changeSupport.firePropertyChange("SCompte", oldSCompte, sCompte);
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        int oldIdUser = this.idUser;
        this.idUser = idUser;
        changeSupport.firePropertyChange("idUser", oldIdUser, idUser);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numsaisie != null ? numsaisie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SaisieComptable_1)) {
            return false;
        }
        SaisieComptable_1 other = (SaisieComptable_1) object;
        if ((this.numsaisie == null && other.numsaisie != null) || (this.numsaisie != null && !this.numsaisie.equals(other.numsaisie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "interfaceGraphiq.SaisieComptable_1[ numsaisie=" + numsaisie + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
