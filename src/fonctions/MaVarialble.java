/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fonctions;

/**
 *
 * @author HP
 */
public class MaVarialble {
    String compte;String[] tableau=new String[200];

   

    public MaVarialble(String compte, String[] tableau) {
        this.compte = compte;
        this.tableau = tableau;
    }

    public MaVarialble() {
        
    }

    public String getCompte() {
        return compte;
    }

    public void setCompte(String compte) {
        this.compte = compte;
    }

    public String[] getTableau() {
        return tableau;
    }
    public String getTableauIndex(int ind) {
        return tableau[ind];
    }

    public void setTableau(String tableau,int ind) {
        this.tableau[ind]=tableau;
    }

   
    
}
