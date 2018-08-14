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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "EMPLOYE", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Employe.findAll", query = "SELECT e FROM Employe e")
    , @NamedQuery(name = "Employe.findByMatemp", query = "SELECT e FROM Employe e WHERE e.matemp = :matemp")
    , @NamedQuery(name = "Employe.findByNomemp", query = "SELECT e FROM Employe e WHERE e.nomemp = :nomemp")
    , @NamedQuery(name = "Employe.findByPrenemp", query = "SELECT e FROM Employe e WHERE e.prenemp = :prenemp")
    , @NamedQuery(name = "Employe.findByCnps", query = "SELECT e FROM Employe e WHERE e.cnps = :cnps")
    , @NamedQuery(name = "Employe.findBySalairedebase", query = "SELECT e FROM Employe e WHERE e.salairedebase = :salairedebase")
    , @NamedQuery(name = "Employe.findByCodesitmat", query = "SELECT e FROM Employe e WHERE e.codesitmat = :codesitmat")
    , @NamedQuery(name = "Employe.findByCodestatut", query = "SELECT e FROM Employe e WHERE e.codestatut = :codestatut")})
public class Employe implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EmployePK employePK;
    @Basic(optional = false)
    @Column(name = "MATEMP")
    private String matemp;
    @Basic(optional = false)
    @Column(name = "NOMEMP")
    private String nomemp;
    @Basic(optional = false)
    @Column(name = "PRENEMP")
    private String prenemp;
    @Column(name = "CNPS")
    private String cnps;
    @Basic(optional = false)
    @Column(name = "SALAIREDEBASE")
    private int salairedebase;
    @Basic(optional = false)
    @Column(name = "CODESITMAT")
    private int codesitmat;
    @Basic(optional = false)
    @Column(name = "CODESTATUT")
    private int codestatut;

    public Employe() {
    }

    public Employe(EmployePK employePK) {
        this.employePK = employePK;
    }

    public Employe(EmployePK employePK, String matemp, String nomemp, String prenemp, int salairedebase, int codesitmat, int codestatut) {
        this.employePK = employePK;
        this.matemp = matemp;
        this.nomemp = nomemp;
        this.prenemp = prenemp;
        this.salairedebase = salairedebase;
        this.codesitmat = codesitmat;
        this.codestatut = codestatut;
    }

    public EmployePK getEmployePK() {
        return employePK;
    }

    public void setEmployePK(EmployePK employePK) {
        this.employePK = employePK;
    }

    public String getMatemp() {
        return matemp;
    }

    public void setMatemp(String matemp) {
        String oldMatemp = this.matemp;
        this.matemp = matemp;
        changeSupport.firePropertyChange("matemp", oldMatemp, matemp);
    }

    public String getNomemp() {
        return nomemp;
    }

    public void setNomemp(String nomemp) {
        String oldNomemp = this.nomemp;
        this.nomemp = nomemp;
        changeSupport.firePropertyChange("nomemp", oldNomemp, nomemp);
    }

    public String getPrenemp() {
        return prenemp;
    }

    public void setPrenemp(String prenemp) {
        String oldPrenemp = this.prenemp;
        this.prenemp = prenemp;
        changeSupport.firePropertyChange("prenemp", oldPrenemp, prenemp);
    }

    public String getCnps() {
        return cnps;
    }

    public void setCnps(String cnps) {
        String oldCnps = this.cnps;
        this.cnps = cnps;
        changeSupport.firePropertyChange("cnps", oldCnps, cnps);
    }

    public int getSalairedebase() {
        return salairedebase;
    }

    public void setSalairedebase(int salairedebase) {
        int oldSalairedebase = this.salairedebase;
        this.salairedebase = salairedebase;
        changeSupport.firePropertyChange("salairedebase", oldSalairedebase, salairedebase);
    }

    public int getCodesitmat() {
        return codesitmat;
    }

    public void setCodesitmat(int codesitmat) {
        int oldCodesitmat = this.codesitmat;
        this.codesitmat = codesitmat;
        changeSupport.firePropertyChange("codesitmat", oldCodesitmat, codesitmat);
    }

    public int getCodestatut() {
        return codestatut;
    }

    public void setCodestatut(int codestatut) {
        int oldCodestatut = this.codestatut;
        this.codestatut = codestatut;
        changeSupport.firePropertyChange("codestatut", oldCodestatut, codestatut);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employePK != null ? employePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employe)) {
            return false;
        }
        Employe other = (Employe) object;
        if ((this.employePK == null && other.employePK != null) || (this.employePK != null && !this.employePK.equals(other.employePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "interfaceGraphiq.Employe[ employePK=" + employePK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
