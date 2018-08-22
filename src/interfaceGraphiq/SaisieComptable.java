/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceGraphiq;

import fonctions.BaseDedonnees;
import fonctions.MaVarialble;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class SaisieComptable extends javax.swing.JFrame {

    /**
     * Creates new form SaisieComptable
     */
    BaseDedonnees bd=new BaseDedonnees();
    
    public SaisieComptable() {
        initComponents();
        tableload(sc_table);
        //comboBox(sc_combo_class,"SELECT LIBCLASSE FROM CLASSE");
        //comboBoxxCC(sc_combo_sous_compte);
        //comboBox(sc_combo_compte, "SELECT LIBCOMPTE FROM COMPTE");
        //comboBox(sc_combo_compte, "SELECT LIBCOMPTE FROM COMPTE,CLASSE WHERE COMPTE.CODECLASSE=CLASSE.CODECLASSE AND COMPTE.CODECLASSE=3"/*+sc_combo_class.getSelectedIndex()*/);
       
    }
    public String mareq="";
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        sc_table = new javax.swing.JTable();
        sc_ajouter = new javax.swing.JButton();
        sc_modifier = new javax.swing.JButton();
        sc_supprimer = new javax.swing.JButton();
        sc_date = new javax.swing.JTextField();
        sc_num_fact = new javax.swing.JTextField();
        sc_societe = new javax.swing.JTextField();
        sc_cout = new javax.swing.JTextField();
        sc_typ_trans = new javax.swing.JComboBox<>();
        sc_amortiss = new javax.swing.JComboBox<>();
        sc_dotation = new javax.swing.JTextField();
        sc_lib_saisi = new javax.swing.JTextField();
        sc_combo_compte = new javax.swing.JComboBox<>();
        sc_combo_class = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sc_combo_sous_compte = new javax.swing.JComboBox<>();
        sc_val_compt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Saisie comptable");

        sc_table.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        sc_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Num.", "Date", "Num. Facture", "Société", "Coût", "Type de transaction", "Amortissable", "Dotation", "Libellé de la saisie", "Compte"
            }
        ));
        sc_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sc_tableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(sc_table);
        if (sc_table.getColumnModel().getColumnCount() > 0) {
            sc_table.getColumnModel().getColumn(0).setHeaderValue("Num.");
            sc_table.getColumnModel().getColumn(1).setHeaderValue("Date");
            sc_table.getColumnModel().getColumn(2).setHeaderValue("Num. Facture");
            sc_table.getColumnModel().getColumn(3).setHeaderValue("Société");
            sc_table.getColumnModel().getColumn(4).setHeaderValue("Coût");
            sc_table.getColumnModel().getColumn(5).setHeaderValue("Type de transaction");
            sc_table.getColumnModel().getColumn(6).setHeaderValue("Amortissable");
            sc_table.getColumnModel().getColumn(7).setHeaderValue("Dotation");
            sc_table.getColumnModel().getColumn(8).setHeaderValue("Libellé de la saisie");
            sc_table.getColumnModel().getColumn(9).setHeaderValue("Compte");
        }

        sc_ajouter.setText("Ajouter");
        sc_ajouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sc_ajouterMouseClicked(evt);
            }
        });
        sc_ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sc_ajouterActionPerformed(evt);
            }
        });

        sc_modifier.setText("Modifier");
        sc_modifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sc_modifierMouseClicked(evt);
            }
        });

        sc_supprimer.setText("Supprimer");
        sc_supprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sc_supprimerMouseClicked(evt);
            }
        });

        sc_typ_trans.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sortie de fonds", "Entrée de fonds" }));

        sc_amortiss.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Non", "Oui" }));

        sc_dotation.setText("0");

        sc_combo_compte.setEditable(true);
        sc_combo_compte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Compte" }));
        sc_combo_compte.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sc_combo_compteItemStateChanged(evt);
            }
        });
        sc_combo_compte.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sc_combo_compteFocusGained(evt);
            }
        });
        sc_combo_compte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sc_combo_compteMouseClicked(evt);
            }
        });
        sc_combo_compte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sc_combo_compteActionPerformed(evt);
            }
        });

        sc_combo_class.setEditable(true);
        sc_combo_class.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Classe", "Classe 1", "Classe 2", "Classe 3", "Classe 4", "Classe 5", "Classe 6", "Classe 7", "Classe 8", "Classe 9" }));
        sc_combo_class.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sc_combo_classItemStateChanged(evt);
            }
        });

        jLabel1.setText("Amortissable");

        jLabel2.setText("Type de trans.");

        jLabel3.setText("Date");

        jLabel4.setText("Numéro facture");

        jLabel5.setText("Société");

        jLabel6.setText("Coût");

        jLabel7.setText("Dotation");

        jLabel8.setText("Libellé de la saisie");

        sc_combo_sous_compte.setEditable(true);
        sc_combo_sous_compte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sous-compte" }));
        sc_combo_sous_compte.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sc_combo_sous_compteFocusGained(evt);
            }
        });
        sc_combo_sous_compte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sc_combo_sous_compteMouseClicked(evt);
            }
        });
        sc_combo_sous_compte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sc_combo_sous_compteActionPerformed(evt);
            }
        });

        sc_val_compt.setName("sc_val_compte"); // NOI18N

        jButton1.setText("Quitter");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sc_date, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                .addGap(9, 9, 9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                .addGap(77, 77, 77)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sc_num_fact)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                .addGap(59, 59, 59)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sc_societe)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                .addGap(90, 90, 90)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                                .addGap(87, 87, 87))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sc_cout, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                .addGap(6, 6, 6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                .addGap(35, 35, 35))
                            .addComponent(sc_typ_trans, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sc_amortiss, 0, 122, Short.MAX_VALUE)
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                .addGap(32, 32, 32)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sc_dotation, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                .addGap(2, 2, 2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                .addGap(69, 69, 69)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sc_combo_compte, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sc_combo_class, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sc_combo_sous_compte, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sc_lib_saisi, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sc_val_compt, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jScrollPane1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sc_ajouter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sc_modifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sc_supprimer, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(sc_combo_class, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sc_combo_compte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sc_combo_sous_compte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sc_date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel1))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sc_amortiss, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sc_dotation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sc_lib_saisi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sc_val_compt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sc_typ_trans, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sc_cout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sc_societe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sc_num_fact, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sc_ajouter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sc_modifier)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sc_supprimer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sc_ajouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sc_ajouterMouseClicked
        // TODO add your handling code here:
       
           
        
    }//GEN-LAST:event_sc_ajouterMouseClicked

    private void sc_combo_classItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sc_combo_classItemStateChanged
        // TODO add your handling code here:
        comboBoxC(sc_combo_compte);
        //comboBoxCC(sc_combo_sous_compte,sc_combo_compte.getSelectedItem().toString());
       
      
    }//GEN-LAST:event_sc_combo_classItemStateChanged

    private void sc_supprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sc_supprimerMouseClicked
        // TODO add your handling code here:
        //this.dispose();   
    }//GEN-LAST:event_sc_supprimerMouseClicked

    private void sc_combo_compteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sc_combo_compteMouseClicked
             JOptionPane.showMessageDialog(null, "bonjour");
             //comboBoxCC(sc_combo_sous_compte,sc_combo_compte.getSelectedItem().toString());
    }//GEN-LAST:event_sc_combo_compteMouseClicked

    private void sc_tableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sc_tableMousePressed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null, String.valueOf(sc_table.getValueAt(sc_table.getSelectedRow(), 2)));
        sc_date.setText(String.valueOf(sc_table.getValueAt(sc_table.getSelectedRow(), 1)));
        sc_num_fact.setText(String.valueOf(sc_table.getValueAt(sc_table.getSelectedRow(), 2)));
        sc_societe.setText(String.valueOf(sc_table.getValueAt(sc_table.getSelectedRow(), 3)));
        sc_cout.setText(String.valueOf(sc_table.getValueAt(sc_table.getSelectedRow(), 4)));
        sc_dotation.setText(String.valueOf(sc_table.getValueAt(sc_table.getSelectedRow(), 7)));
        sc_lib_saisi.setText(String.valueOf(sc_table.getValueAt(sc_table.getSelectedRow(), 8)));
        sc_val_compt.setText(String.valueOf(sc_table.getValueAt(sc_table.getSelectedRow(), 9)));
    }//GEN-LAST:event_sc_tableMousePressed

    private void sc_modifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sc_modifierMouseClicked
     
       bd.insertData("UPDATE SAISIE_COMPTABLE SET NUMFACT = '"+sc_num_fact.getText()+"', LIBSAISIE = '"+sc_lib_saisi.getText()+"', "
                + "COUT =" +sc_cout.getText()+", DATES = '"+sc_date.getText()+"', TYPE_TRANSAC = '"+sc_typ_trans.getSelectedItem().toString()+"',"
                + " AMORTISSEMENT = '"+sc_amortiss.getSelectedItem().toString()+"',"
                + " DOTATIONS_AMORT = "+sc_dotation.getText()+", SOCIETE = '"+sc_societe.getText()+"', "
                + "S_COMPTE ="+sc_val_compt.getText()+"  WHERE NUMSAISIE ="+sc_table.getValueAt(sc_table.getSelectedRow(), 0));
       cleanTableau();
       tableload(sc_table);
    }//GEN-LAST:event_sc_modifierMouseClicked

    private void sc_combo_compteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sc_combo_compteItemStateChanged
      
        comboBoxCC(sc_combo_sous_compte,sc_combo_compte.getSelectedItem().toString());
       
        // MaVarialble mav=new MaVarialble();
        //mav.setCompte(sc_combo_compte.getSelectedItem().toString());
    }//GEN-LAST:event_sc_combo_compteItemStateChanged

    private void sc_combo_sous_compteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sc_combo_sous_compteMouseClicked
        JOptionPane.showMessageDialog(null, "bonjour");
    }//GEN-LAST:event_sc_combo_sous_compteMouseClicked

    private void sc_combo_compteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sc_combo_compteFocusGained
        // TODO add your handling code here:
        //comboBoxCC(sc_combo_sous_compte);
    }//GEN-LAST:event_sc_combo_compteFocusGained

    private void sc_combo_sous_compteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sc_combo_sous_compteFocusGained
    
    }//GEN-LAST:event_sc_combo_sous_compteFocusGained

    private void sc_combo_compteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sc_combo_compteActionPerformed
        // TODO add your handling code here:
        //comboBoxC(sc_combo_compte);
         //JOptionPane.showMessageDialog(null, "bonjour");
        // comboBoxCC(sc_combo_sous_compte);
         //MaVarialble mav=new MaVarialble();
        //mav.setCompte(sc_combo_compte.getSelectedItem().toString());
    }//GEN-LAST:event_sc_combo_compteActionPerformed

    private void sc_combo_sous_compteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sc_combo_sous_compteActionPerformed
        // TODO add your handling code here:
         //comboBoxCC(sc_combo_sous_compte);
    }//GEN-LAST:event_sc_combo_sous_compteActionPerformed

    private void sc_ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sc_ajouterActionPerformed
        // TODO add your handling code here:
         bd.insertData("INSERT INTO saisie_comptable (NUMFACT, LIBSAISIE, COUT, DATES, TYPE_TRANSAC, AMORTISSEMENT, DOTATIONS_AMORT, SOCIETE, S_COMPTE, ID_USER) \n" +
        "VALUES ('"+sc_num_fact.getText()+"', '"+sc_lib_saisi.getText()+"', "+sc_cout.getText()+", '"+sc_date.getText()+"', '"+sc_typ_trans.getSelectedItem().toString()+"', '"+sc_amortiss.getSelectedItem().toString()+"', "+sc_dotation.getText()+", '"+sc_societe.getText()+"', "+sc_val_compt.getText()+", 1);\n" +
        "");
        System.out.println("insertion réussi !!"+sc_lib_saisi.getText());
          
        tableload(sc_table);
        cleanTableau();
    }//GEN-LAST:event_sc_ajouterActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaisieComptable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sc_ajouter;
    private javax.swing.JComboBox<String> sc_amortiss;
    private javax.swing.JComboBox<String> sc_combo_class;
    private javax.swing.JComboBox<String> sc_combo_compte;
    private javax.swing.JComboBox<String> sc_combo_sous_compte;
    private javax.swing.JTextField sc_cout;
    private javax.swing.JTextField sc_date;
    private javax.swing.JTextField sc_dotation;
    private javax.swing.JTextField sc_lib_saisi;
    private javax.swing.JButton sc_modifier;
    private javax.swing.JTextField sc_num_fact;
    private javax.swing.JTextField sc_societe;
    private javax.swing.JButton sc_supprimer;
    private javax.swing.JTable sc_table;
    private javax.swing.JComboBox<String> sc_typ_trans;
    private javax.swing.JTextField sc_val_compt;
    // End of variables declaration//GEN-END:variables

    private void cleanTableau() {
        
        sc_cout.setText("");
        sc_date.setText("");
        sc_dotation.setText("");
        sc_lib_saisi.setText("");
        sc_num_fact.setText("");
        sc_societe.setText("");
        sc_val_compt.setText("");
             
    }

    private void tableload(JTable jt) {
       DefaultTableModel dt=(DefaultTableModel)jt.getModel();      
       dt.setRowCount(0);
        try {
            ResultSet resultSet=bd.getData("SELECT * FROM SAISIE_COMPTABLE");
            while(resultSet.next())
            {
                Vector v=new Vector();
                v.add(resultSet.getString(1));
                v.add(resultSet.getString(5));
                v.add(resultSet.getString(2));
                v.add(resultSet.getString(9));
                v.add(resultSet.getString(4));
                v.add(resultSet.getString(6));
                v.add(resultSet.getString(7));
                v.add(resultSet.getString(8));
                v.add(resultSet.getString(3));
                v.add(resultSet.getString(10));
                dt.addRow(v);
            }
        } catch (Exception ex) {
            Logger.getLogger(SaisieComptable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void comboBox(JComboBox jc, String req)
    {       
        try {
            ResultSet resultSet=bd.getData(req);
            while(resultSet.next())
            {            
                jc.addItem(resultSet.getString(1));
            }
        } catch (Exception ex) {
            Logger.getLogger(SaisieComptable.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }  
     private void comboBoxC(JComboBox jc)
    {       
         MaVarialble mav=new MaVarialble();
        int var = 0;
        jc.removeAllItems();
        String req="SELECT LIBCOMPTE FROM COMPTE,CLASSE WHERE COMPTE.CODECLASSE=CLASSE.CODECLASSE AND COMPTE.CODECLASSE="+jc;
        try {
            ResultSet resultSet=bd.getData(req);
            while(resultSet.next())
            {     
                jc.addItem(resultSet.getString(1)); 
                mav.setTableau(resultSet.getString(1),var);
                System.out.println(resultSet.getString(1));
            }
        } catch (Exception ex) {
            Logger.getLogger(SaisieComptable.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
     private void comboBoxCC(JComboBox jc,String abc)
    {       
        
        jc.removeAllItems();
        
        MaVarialble mav=new MaVarialble();
      
        String req="SELECT LIBELLES_COMPTE FROM SOUS_COMPTE,COMPTE WHERE SOUS_COMPTE.CODECOMPTE=COMPTE.CODECOMPTE "
                + "AND SOUS_COMPTE.CODECOMPTE=(select CODECOMPTE from COMPTE where LIBCOMPTE='"+abc+"')";
        try {
            ResultSet resultSet=bd.getData(req);
           
            while(resultSet.next())
            {                          
                jc.addItem(/*mav.getTableau()*/resultSet.getString(1));              
            }
        } catch (Exception ex) {
            Logger.getLogger(SaisieComptable.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
      private void comboBoxxCC(JComboBox jc)
    {       
        jc.removeAllItems();
        MaVarialble mav=new MaVarialble();
        String req="SELECT LIBELLES_COMPTE FROM SOUS_COMPTE";
        try {
            ResultSet resultSet=bd.getData(req);
            while(resultSet.next())
            {            
                jc.addItem(resultSet.getString(1));
            }
        } catch (Exception ex) {
            Logger.getLogger(SaisieComptable.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
