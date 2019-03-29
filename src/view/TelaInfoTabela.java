/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import classes.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.*;

/**
 *
 * @author off1c
 */
public class TelaInfoTabela extends javax.swing.JFrame {

    /**
     * Creates new form TelaInfoTabela
     */
    
    private Tabela tabela;
    private ArrayList<Coluna> colunas;
    private ArrayList<String[]> linhas;
    private ArrayList<String[]> linhasBuffered;
    
    // Conversoes 
    private String[] colunasString; 

    private boolean jaBuscou;
        
    
    public TelaInfoTabela(Tabela tabela) {
        
        initComponents();
        
        txtInfo.setText(txtInfo.getText() + tabela.getNome());
        
        this.linhasBuffered = new ArrayList<>();
        this.tabela = tabela;
        this.colunas = tabela.getColunas();
        this.linhas = tabela.getLinhas();
        
        colunasString = new String[colunas.size()];
        
        //String[] colunasStringTipo = new String[colunas.size()];

        int i = 0;
        for (Coluna coluna : colunas) {
            colunasString[i] = coluna.getNome();
            //colunasStringTipo[i] = coluna.getNome() + " : " + coluna.getTipo();
            ++i;
        }
        
        //boxColuna.setModel(new javax.swing.DefaultComboBoxModel<>(colunasStringTipo));
        boxColuna.setModel(new javax.swing.DefaultComboBoxModel<>(colunasString));
        
        toArrayObject(linhas);

        
    }
    
    public TelaInfoTabela() {
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
        table = new javax.swing.JTable();
        lblEm = new javax.swing.JLabel();
        lblPesquisar = new javax.swing.JLabel();
        boxColuna = new javax.swing.JComboBox<>();
        txtFValor = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table.setEnabled(false);
        jScrollPane2.setViewportView(table);

        lblEm.setText("em");

        lblPesquisar.setText("Pesquisa:");

        boxColuna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

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
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(lblPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFValor, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblEm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxColuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVoltar))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 4, Short.MAX_VALUE))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(lblEm)
                    .addComponent(lblPesquisar)
                    .addComponent(boxColuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addContainerGap(27, Short.MAX_VALUE))
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
        
        if (jaBuscou) {
            toArrayObject(linhas);
            jaBuscou = false;
        } else {
            this.dispose();
        }
        

    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String valorLido = txtFValor.getText();
        Coluna colunaSelected = this.colunas.get(boxColuna.getSelectedIndex());
        ArrayList<String> achados = new ArrayList<>();
        ArrayList<Integer> linhasAchados = new ArrayList<>();
        boolean empty = valorLido.equals("");
        
        
        boolean achouDado = false;
        
        
        if (empty) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {            
            try {
                tipoCorreto(valorLido, colunaSelected);
                
                switch (colunaSelected.getTipo().toLowerCase()) {
                    case "string":
                    case "boolean":
                        int index = 0;
                        for (String[] linha : linhas) {
                            
                            for (String linhaDado : linha) {

                                achouDado = linhaDado.toLowerCase().contains(valorLido.toLowerCase());
                                if (achouDado) {
                                    achados.add(linhaDado);
                                    linhasAchados.add(index);
                                    linhasBuffered.add(linhas.get(index));
                                }
                               
                                
                            }
                            
                            if(achados.size() > 0){
                                achouDado = true;
                            }
                            ++index;
                           
                        }
                        
                        break;
                    case "int":
                    case "double":
                        String linhaConcatenada = "";
                        for (String[] linha : linhas) {
                            for (String linhaDado : linha) {
                                try {
                                    double linhaDadoDob = Double.parseDouble(linhaDado);
                                    double valorLidoDob = Double.parseDouble(linhaDado);
                                    
                                    if (linhaDadoDob == valorLidoDob) {
                                        achouDado = true;
                                        linhasBuffered.add(linha);
                                    }
                                } catch(Exception e) {}
                            }
                        }
                        
                        
                        
                        break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Insira valor do tipo <" + colunaSelected.getTipo() + ">");
                e.printStackTrace();
            }
               
            if(achouDado){

                toArrayObject(linhasBuffered);
                linhasBuffered.clear();
                
                jaBuscou = true;
                
            }
                     
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInfoTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInfoTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInfoTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInfoTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInfoTabela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxColuna;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEm;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JPanel panel;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtFValor;
    private javax.swing.JLabel txtInfo;
    // End of variables declaration//GEN-END:variables

    private void tipoCorreto(String valorLido, Coluna coluna) throws Exception {

        String tipoColuna = coluna.getTipo().toLowerCase();

        switch (tipoColuna) {
            case "int":
            case "double":
                try {
                    double dob = Double.valueOf(valorLido);
                } catch (Exception e) {
                    throw e;
                }
                break;
            case "boolean":
                if (!(valorLido.equalsIgnoreCase("true")
                        || valorLido.equalsIgnoreCase("false"))) {
                    Exception e = new Exception();
                    throw e;
                }
                break;
        }
    }
    
    
   private void toArrayObject(ArrayList<String[]> linhasLidas ){
        Object[][] linhasObject = new Object[linhasLidas.size()][colunas.size()];
        
        int l = 0;
        int c = 0;
        for (String[] linha : linhasLidas) {
            for (String linhaDado : linha) {
                //System.out.println("linhaDado: " + linhaDado);
                linhasObject[l][c++] = linhaDado;
            }
            c = 0;
            ++l;
        }
        
        table.removeAll();
        
        table.setModel(new javax.swing.table.DefaultTableModel(
                linhasObject,
                colunasString
        ));
   }
}
