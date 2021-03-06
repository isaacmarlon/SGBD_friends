/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import classes.*;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Douglas, isaac, paulo
 */
public class TelaComparacoesValores extends javax.swing.JFrame {
    
    private Tabela tabela;
    private ArrayList<Coluna> colunas;
    private ArrayList<String[]> linhas;
    private ArrayList<String[]> linhasAchadas;
    private ArrayList<Double> doublesColuna;
    private double valorAchado; 
    private int sliderPosition;
    private boolean iguaisSelected;
    
    public TelaComparacoesValores(Tabela tabela, ArrayList<String[]> linhasAchadas, ArrayList<Double> doublesColuna,double valorAchado) {
        initComponents();
        
        txtInfo.setText(txtInfo.getText() + tabela.getNome());
        
        this.tabela = tabela;
        this.colunas = tabela.getColunas();
        this.linhas = tabela.getLinhas();
        this.linhasAchadas = linhasAchadas;
        this.doublesColuna = doublesColuna;
        this.valorAchado = valorAchado;
        
        
        showIguais();
        
        //ManipuladorTabelas.parseToTable(jTable, colunas, linhasAchadas);
        
    }
    
    public TelaComparacoesValores(Tabela tabela, ArrayList<String[]> linhasAchadas, ArrayList<Double> doublesColuna,double valorAchado, boolean enableSlide) {
        initComponents();
        
        txtInfo.setText(txtInfo.getText() + tabela.getNome());
        
        this.tabela = tabela;
        this.colunas = tabela.getColunas();
        this.linhas = tabela.getLinhas();
        this.linhasAchadas = linhasAchadas;
        this.doublesColuna = doublesColuna;
        this.valorAchado = valorAchado;
        
        jPanel1.setVisible(enableSlide);
        
        //slider.setEnabled(enableSlide);
        showIguais();
        
        //ManipuladorTabelas.parseToTable(jTable, colunas, linhasAchadas);
        
    }
    
    public TelaComparacoesValores() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        txtInfo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        slider = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Comparar Valores");

        panel.setBackground(new java.awt.Color(255, 255, 255));

        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        txtInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtInfo.setText("Tabela: ");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable.setEnabled(false);
        jScrollPane2.setViewportView(jTable);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtrar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Maiores");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Iguais");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Menores");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("<=");

        slider.setMaximum(4);
        slider.setMinorTickSpacing(4);
        slider.setValue(2);
        slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText(">=");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addComponent(jLabel4)
                .addContainerGap())
            .addComponent(slider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(txtInfo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 20, Short.MAX_VALUE))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtInfo)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed

        this.dispose();

    }//GEN-LAST:event_btnVoltarActionPerformed

    private void sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderStateChanged
        
        this.sliderPosition = slider.getValue();

        selectComparacao();
    }//GEN-LAST:event_sliderStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaComparacoesValores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaComparacoesValores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaComparacoesValores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaComparacoesValores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaComparacoesValores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JPanel panel;
    private javax.swing.JSlider slider;
    private javax.swing.JLabel txtInfo;
    // End of variables declaration//GEN-END:variables

    private void showIguais() {
        
        ManipuladorTabelas.parseToTable(jTable, colunas, linhasAchadas);
    }
    
    private void showMenor() {
        
        ArrayList linhasResult = Comparador.linhasBelowTo(linhas, doublesColuna, valorAchado);   
        
        ManipuladorTabelas.parseToTable(jTable, colunas, linhasResult);
        
    }
    
    private void showMenorOuIgual() {
        
        ArrayList linhasResult = Comparador.linhasBelowEqualsTo(linhas, doublesColuna, valorAchado);   
        
        ManipuladorTabelas.parseToTable(jTable, colunas, linhasResult);
        
    }
    
    private void showMaior() {
        
        ArrayList linhasResult = Comparador.linhasUpTo(linhas, doublesColuna, valorAchado);   
        
        ManipuladorTabelas.parseToTable(jTable, colunas, linhasResult);
        
    }
    
    private void showMaiorOuIgual() {
        
        ArrayList linhasResult = Comparador.linhasUpEqualsTo(linhas, doublesColuna, valorAchado);   
        
        ManipuladorTabelas.parseToTable(jTable, colunas, linhasResult);
        
    }

    private void selectComparacao() {
    
        switch(sliderPosition) {
            case 0:
                showMenorOuIgual();
                break;
            case 1:
                showMenor();
                break;
            case 2:
                showIguais();
                break;
            case 3:
                showMaior();
                break;
            case 4:
                showMaiorOuIgual();
                break;
        }
    
    }
}
