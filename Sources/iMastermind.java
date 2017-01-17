import com.apple.component.Component;
import javax.swing.JTextField;
import javax.swing.*;
/*
 * iMastermind.java
 *
 * Created on 23 novembre 2006, 20:40
 */

/**
 *
 * @author  Fildz
 */
public class iMastermind extends javax.swing.JFrame {
    
    private Mastermind mm;
    
    
    /** Creates new form iMastermind */
    public iMastermind() {
        // Instancition de la classe Mastermind pour l'envoi des variables
        mm = new Mastermind(8,4,true,this);
        
        // Initialisation de l'interface
        initComponents();
        jCheckBox1.setSelected(true); // par defaut on coche le mode repetitions
         jCheckBox2.setSelected(true); // par defaut on coche le mode repetitions
         jCheckBox3.setSelected(true); // par defaut on coche le mode repetitions
         jCheckBox4.setSelected(true); // par defaut on coche le mode repetitions
        
        
        majMastermind();
        
        
    }
    
    public void majMastermind()
    {
             // R�cuperation des regles par d�faut et envoi � l'instance Mastermind
        int n = Integer.parseInt(jTextField1.getText());
        int k = Integer.parseInt(jTextField2.getText());
        boolean repetition = jCheckBox1.isSelected();
        int nbCombi = Integer.parseInt(jTextField3.getText());
        
        
        mm.setN(n);
        mm.setK(k);
        mm.setRepetition(repetition);
        
        // initialisation des param par defaut
        mm.setNbCombi(nbCombi);
        
        int[] combi = new int[k];
        if (k <6)
        for(int i=1;i<=k;i++)
        {
           JTextField jt =(JTextField) jPanel17.getComponent(i);
           
           combi[i-1]=Integer.parseInt(jt.getText());
           
        }
        
        mm.setCombi(combi); 
        
        mm.setStrategie1(jCheckBox2.isSelected());
        mm.setStrategie2(jCheckBox3.isSelected());
        mm.setStrategie3(jCheckBox4.isSelected());
        mm.setAffichage(!jCheckBox6.isSelected());
    }
    
    public JTextArea getTextArea(int i)
    {
        javax.swing.JTextArea jta = null;
        if (i==1)
            jta =jTextArea3;
        if (i==2)
            jta =jTextArea4;
        if (i==3)
            jta =jTextArea5;

        
        return jta;
        
    }   
    public JTextArea getTextArea2(int i)
    {
        javax.swing.JTextArea jta = null;
        if (i==1)
            jta =jTextArea6;
        if (i==2)
            jta =jTextArea7;
        if (i==3)
            jta =jTextArea8;

        
        return jta;
        
    }
 
    
    public void setTextArea1(String text)
    {
        jTextArea1.setText(text);
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jPanel11 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jCheckBox6 = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("R\u00e8gles du Mastermind"));
        jPanel12.setLayout(new javax.swing.BoxLayout(jPanel12, javax.swing.BoxLayout.Y_AXIS));

        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel4.setText("Nombre de couleurs : N = ");
        jPanel13.add(jLabel4);

        jTextField1.setText("8");
        jTextField1.setPreferredSize(new java.awt.Dimension(50, 22));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jPanel13.add(jTextField1);

        jPanel12.add(jPanel13);

        jPanel15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel5.setText("Nombre de cases :      K = ");
        jPanel15.add(jLabel5);

        jTextField2.setText("4");
        jTextField2.setPreferredSize(new java.awt.Dimension(50, 22));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jPanel15.add(jTextField2);

        jPanel12.add(jPanel15);

        jPanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jCheckBox1.setText("R\u00e9p\u00e9titions autoris\u00e9es");
        jCheckBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });

        jPanel14.add(jCheckBox1);

        jPanel12.add(jPanel14);

        jPanel3.add(jPanel12, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Calculs Combinatoires sur les r\u00e8gles"));
        jPanel4.setPreferredSize(new java.awt.Dimension(450, 109));
        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setRows(5);
        jTextArea1.setPreferredSize(new java.awt.Dimension(430, 80));
        jPanel4.add(jTextArea1);

        jPanel1.add(jPanel4, java.awt.BorderLayout.EAST);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.Y_AXIS));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Combinaison(s) secrete(s)"));
        jPanel16.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel6.setText("Par g\u00e9n\u00e9ration automatique: ");
        jPanel16.add(jLabel6);

        jTextField3.setText("0");
        jTextField3.setPreferredSize(new java.awt.Dimension(80, 22));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });

        jPanel16.add(jTextField3);

        jPanel5.add(jPanel16);

        jPanel17.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel7.setText("Par saisie de la combinaison secrete :");
        jPanel17.add(jLabel7);

        jTextField4.setText("1");
        jTextField4.setName("combi1");
        jTextField4.setPreferredSize(new java.awt.Dimension(25, 22));
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });

        jPanel17.add(jTextField4);

        jTextField5.setText("2");
        jTextField5.setName("combi2");
        jTextField5.setPreferredSize(new java.awt.Dimension(25, 22));
        jPanel17.add(jTextField5);

        jTextField6.setText("3");
        jTextField6.setName("combi3");
        jTextField6.setPreferredSize(new java.awt.Dimension(25, 22));
        jPanel17.add(jTextField6);

        jTextField7.setText("4");
        jTextField7.setName("combi4");
        jTextField7.setPreferredSize(new java.awt.Dimension(25, 22));
        jPanel17.add(jTextField7);

        jTextField8.setText("5");
        jTextField8.setName("combi5");
        jTextField8.setPreferredSize(new java.awt.Dimension(25, 22));
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jPanel17.add(jTextField8);

        jPanel5.add(jPanel17);

        jPanel6.add(jPanel5, java.awt.BorderLayout.NORTH);

        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jPanel7.setVerifyInputWhenFocusTarget(false);
        jPanel9.setLayout(new javax.swing.BoxLayout(jPanel9, javax.swing.BoxLayout.Y_AXIS));

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Strat\u00e9gies"));
        jCheckBox2.setText("Strat\u00e9gie 1 : Algorithmique classique - Basique, permet une r\u00e9f\u00e9rence de comparaison");
        jCheckBox2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jCheckBox2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox2StateChanged(evt);
            }
        });

        jPanel9.add(jCheckBox2);

        jCheckBox3.setText("Strat\u00e9gie 2 : Algorithmique classique - Seconde strat\u00e9gie de r\u00e9solution");
        jCheckBox3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jCheckBox3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox3StateChanged(evt);
            }
        });

        jPanel9.add(jCheckBox3);

        jCheckBox4.setText("Strat\u00e9gie 3 : Algorithmique classique - Optimis\u00e9 (digne du raisonnement humain)");
        jCheckBox4.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jCheckBox4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox4StateChanged(evt);
            }
        });

        jPanel9.add(jCheckBox4);

        jPanel7.add(jPanel9);

        jButton1.setText("R\u00e9soudre !");
        jButton1.setPreferredSize(new java.awt.Dimension(200, 60));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel11.add(jButton1);

        jPanel7.add(jPanel11);

        jCheckBox6.setText("Ne pas afficher le d\u00e9tail de la r\u00e9solution");
        jCheckBox6.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jCheckBox6.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox6StateChanged(evt);
            }
        });

        jPanel7.add(jCheckBox6);

        jPanel8.add(jPanel7, java.awt.BorderLayout.NORTH);

        jPanel10.setLayout(new javax.swing.BoxLayout(jPanel10, javax.swing.BoxLayout.X_AXIS));

        jPanel19.setLayout(new java.awt.BorderLayout());

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jPanel19.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Bilan"));
        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jScrollPane1.setViewportView(jTextArea6);

        jPanel19.add(jScrollPane1, java.awt.BorderLayout.SOUTH);

        jPanel10.add(jPanel19);

        jPanel18.setLayout(new java.awt.BorderLayout());

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jPanel18.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        jScrollPane6.setBorder(javax.swing.BorderFactory.createTitledBorder("Bilan"));
        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);
        jScrollPane6.setViewportView(jTextArea7);

        jPanel18.add(jScrollPane6, java.awt.BorderLayout.SOUTH);

        jPanel10.add(jPanel18);

        jPanel20.setLayout(new java.awt.BorderLayout());

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        jPanel20.add(jScrollPane5, java.awt.BorderLayout.CENTER);

        jScrollPane7.setBorder(javax.swing.BorderFactory.createTitledBorder("Bilan"));
        jTextArea8.setColumns(20);
        jTextArea8.setRows(5);
        jScrollPane7.setViewportView(jTextArea8);

        jPanel20.add(jScrollPane7, java.awt.BorderLayout.SOUTH);

        jPanel10.add(jPanel20);

        jPanel8.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox6StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox6StateChanged
mm.setAffichage(!jCheckBox6.isSelected());
    }//GEN-LAST:event_jCheckBox6StateChanged

    private void jCheckBox4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox4StateChanged
mm.setStrategie1(jCheckBox4.isSelected());
    }//GEN-LAST:event_jCheckBox4StateChanged

    private void jCheckBox3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox3StateChanged
mm.setStrategie1(jCheckBox3.isSelected());
    }//GEN-LAST:event_jCheckBox3StateChanged

    private void jCheckBox2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox2StateChanged
mm.setStrategie1(jCheckBox2.isSelected());

    }//GEN-LAST:event_jCheckBox2StateChanged

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased

    }//GEN-LAST:event_jTextField4KeyReleased

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        mm.setNbCombi(Integer.parseInt(jTextField3.getText()));
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        mm.setNbCombi(Integer.parseInt(jTextField3.getText()));
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jTextArea3.setText("");
        jTextArea4.setText("");
        jTextArea5.setText("");
        jTextArea6.setText("");
        jTextArea7.setText("");
        jTextArea8.setText("");
        
        majMastermind();
        try {
        mm.resoudre();
        }
        catch (Exception e){ e.printStackTrace(); }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased

        mm.setN(Integer.parseInt(jTextField1.getText()));
        
        jTextArea1.setText(mm.calcul());
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased

        mm.setK(Integer.parseInt(jTextField2.getText()));
        
        jTextArea1.setText(mm.calcul());
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
    mm.setRepetition(jCheckBox1.isSelected());
    jTextArea1.setText(mm.calcul());
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged
    mm.setRepetition(jCheckBox1.isSelected());
    jTextArea1.setText(mm.calcul());
    }//GEN-LAST:event_jCheckBox1StateChanged

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
    mm.setRepetition(jCheckBox1.isSelected());
    jTextArea1.setText(mm.calcul());
    
    
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

        mm.setK(Integer.parseInt(jTextField2.getText()));
        
        jTextArea1.setText(mm.calcul());
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

        mm.setN(Integer.parseInt(jTextField1.getText()));
        
        jTextArea1.setText(mm.calcul());
        
        
        
        
    }//GEN-LAST:event_jTextField1ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new iMastermind().setVisible(true);
            }
        });
        
       
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
    
}