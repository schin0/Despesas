/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desenvolvimento;

import java.text.DecimalFormat;

/**
 *
 * @author schin
 */
public class Tela extends javax.swing.JFrame {
    //Declaração de Variáveis
    double receita, alimentacao, transporte, saude, moradia, compras, reserva, outros, totalDespesas, resultado, porcAlimentacao, porcTransporte,porcSaude, porcMoradia, porcCompras, porcReserva, porcOutros;
    DecimalFormat dfReal = new DecimalFormat("#,##0.00");
    DecimalFormat dfPorc = new DecimalFormat("0.0");
    
    public Tela() {
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

        painel = new javax.swing.JPanel();
        lblImg = new javax.swing.JLabel();
        lblAlimentacao = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblTransporte = new javax.swing.JLabel();
        lblSaude = new javax.swing.JLabel();
        lblCompras = new javax.swing.JLabel();
        lblMoradia = new javax.swing.JLabel();
        lblOutros = new javax.swing.JLabel();
        lblReserva = new javax.swing.JLabel();
        lblPorcAlimentacao = new javax.swing.JLabel();
        lblTituloResultadoDespesas = new javax.swing.JLabel();
        txtlReceita = new javax.swing.JTextField();
        lblTituloSituacao = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        txtTransporte = new javax.swing.JTextField();
        txtAlimentacao = new javax.swing.JTextField();
        txtMoradia = new javax.swing.JTextField();
        txtCompras = new javax.swing.JTextField();
        txtReserva = new javax.swing.JTextField();
        txtOutros = new javax.swing.JTextField();
        txtSaude = new javax.swing.JTextField();
        lblTotalDespesas = new javax.swing.JLabel();
        lblPorcTransporte = new javax.swing.JLabel();
        lblPorcMoradia = new javax.swing.JLabel();
        lblPorcSaude = new javax.swing.JLabel();
        lblPorcCompras = new javax.swing.JLabel();
        lblPorcOutros = new javax.swing.JLabel();
        lblPorcReserva = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        lblTituloResutado1 = new javax.swing.JLabel();
        lblSituacao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblImg.setIcon(new javax.swing.ImageIcon("C:\\Users\\schin\\OneDrive\\Área de Trabalho\\ETEC\\Atividades\\TPR\\despesas2.jpg")); // NOI18N

        lblAlimentacao.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblAlimentacao.setText("Alimentação");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Receita");

        lblTransporte.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblTransporte.setText("Transporte");

        lblSaude.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblSaude.setText("Saúde");

        lblCompras.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblCompras.setText("Compras Gerais");

        lblMoradia.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblMoradia.setText("Moradia");

        lblOutros.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblOutros.setText("Outros");

        lblReserva.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblReserva.setText("Fundo de Reserva ");

        lblPorcAlimentacao.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPorcAlimentacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPorcAlimentacao.setText("...");

        lblTituloResultadoDespesas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTituloResultadoDespesas.setText("Total Despesas");

        txtlReceita.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtlReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlReceitaActionPerformed(evt);
            }
        });

        lblTituloSituacao.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTituloSituacao.setText("Situação");

        lblResultado.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultado.setText("...");

        txtTransporte.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtAlimentacao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtMoradia.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtCompras.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtReserva.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtOutros.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtSaude.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblTotalDespesas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTotalDespesas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalDespesas.setText("...");

        lblPorcTransporte.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPorcTransporte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPorcTransporte.setText("...");

        lblPorcMoradia.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPorcMoradia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPorcMoradia.setText("...");

        lblPorcSaude.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPorcSaude.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPorcSaude.setText("...");

        lblPorcCompras.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPorcCompras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPorcCompras.setText("...");

        lblPorcOutros.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPorcOutros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPorcOutros.setText("...");

        lblPorcReserva.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPorcReserva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPorcReserva.setText("...");

        btnCalcular.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        lblTituloResutado1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTituloResutado1.setText("Resultado");

        lblSituacao.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSituacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSituacao.setText("...");

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(lblSaude)
                            .addComponent(lblMoradia)
                            .addComponent(lblCompras)
                            .addComponent(lblReserva)
                            .addComponent(lblOutros)
                            .addComponent(lblTransporte))
                        .addGap(37, 37, 37)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImg)
                            .addComponent(txtlReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelLayout.createSequentialGroup()
                                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(painelLayout.createSequentialGroup()
                                        .addComponent(txtOutros, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblPorcOutros, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelLayout.createSequentialGroup()
                                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMoradia, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSaude, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAlimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPorcReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblPorcCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblPorcMoradia, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblPorcSaude, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblPorcTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblPorcAlimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelLayout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(painelLayout.createSequentialGroup()
                                                    .addComponent(lblTituloResutado1)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(painelLayout.createSequentialGroup()
                                                    .addComponent(lblTituloResultadoDespesas)
                                                    .addGap(68, 68, 68)
                                                    .addComponent(lblTotalDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(painelLayout.createSequentialGroup()
                                        .addGap(178, 178, 178)
                                        .addComponent(lblTituloSituacao))
                                    .addGroup(painelLayout.createSequentialGroup()
                                        .addGap(135, 135, 135)
                                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addComponent(lblAlimentacao))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtlReceita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAlimentacao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPorcAlimentacao)
                                .addComponent(txtAlimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPorcTransporte)
                                .addComponent(lblTituloResultadoDespesas)
                                .addComponent(lblTotalDespesas))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTransporte)))
                        .addGap(18, 18, 18)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSaude, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSaude, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPorcSaude, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMoradia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPorcMoradia)
                            .addComponent(lblMoradia))
                        .addGap(18, 18, 18)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPorcCompras)
                            .addComponent(lblCompras))
                        .addGap(18, 18, 18))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btnCalcular)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTituloResutado1)
                            .addComponent(lblResultado))
                        .addGap(23, 23, 23)
                        .addComponent(lblTituloSituacao)
                        .addGap(37, 37, 37)))
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPorcReserva)
                        .addComponent(lblSituacao))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblReserva)))
                .addGap(18, 18, 18)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOutros)
                    .addComponent(txtOutros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPorcOutros))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        //Ao clicar no botão Limpar:
        receita = 0;
        alimentacao = 0; 
        transporte = 0; 
        saude = 0; 
        moradia = 0; 
        compras = 0;
        reserva = 0;
        outros = 0;
        totalDespesas = 0;
        resultado = 0;
        porcAlimentacao = 0; 
        porcTransporte = 0;
        porcSaude = 0;
        porcMoradia = 0;
        porcCompras = 0;
        porcReserva = 0;
        porcOutros = 0;
        lblPorcAlimentacao.setText("...");
        lblPorcCompras.setText("...");
        lblPorcMoradia.setText("...");
        lblPorcOutros.setText("...");
        lblPorcReserva.setText("...");
        lblPorcSaude.setText("...");
        lblPorcTransporte.setText("...");
        lblTotalDespesas.setText("...");
        lblResultado.setText("...");
        lblSituacao.setText("...");
        txtAlimentacao.setText("");
        txtCompras.setText("");
        txtMoradia.setText("");
        txtOutros.setText("");
        txtReserva.setText("");
        txtTransporte.setText("");
        txtlReceita.setText("");
        txtSaude.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        //Ao clicar no botão Calcular:
        receita = Double.parseDouble(txtlReceita.getText());

        alimentacao = Double.parseDouble(txtAlimentacao.getText());
        transporte = Double.parseDouble(txtTransporte.getText());
        saude = Double.parseDouble(txtSaude.getText());
        moradia = Double.parseDouble(txtMoradia.getText());
        compras = Double.parseDouble(txtCompras.getText());
        reserva = Double.parseDouble(txtReserva.getText());
        outros = Double.parseDouble(txtOutros.getText());

        //Total Despesas
        totalDespesas = alimentacao + transporte + saude + moradia + compras + reserva + outros;

        //Calcular Porcentagens
        porcAlimentacao = (alimentacao / totalDespesas) * 100;
        porcTransporte = (transporte / totalDespesas) * 100;
        porcSaude= (saude / totalDespesas) * 100;
        porcMoradia = (moradia / totalDespesas) * 100;
        porcCompras = (compras / totalDespesas) * 100;
        porcReserva = (reserva / totalDespesas) * 100;
        porcOutros = (outros / totalDespesas) * 100;
        
        //Mostrar Despesas
        lblTotalDespesas.setText("R$ " + dfReal.format(totalDespesas));

        //Mostrar Porcentagens
        lblPorcAlimentacao.setText(dfPorc.format(porcAlimentacao) + "%");
        lblPorcTransporte.setText(dfPorc.format(porcTransporte) + "%");
        lblPorcSaude.setText(dfPorc.format(porcSaude) + "%");
        lblPorcMoradia.setText(dfPorc.format(porcMoradia) + "%");
        lblPorcCompras.setText(dfPorc.format(porcCompras) + "%");
        lblPorcReserva.setText(dfPorc.format(porcReserva) + "%");
        lblPorcOutros.setText(dfPorc.format(porcOutros) + "%");
        
        //Resultado
        resultado = receita - totalDespesas;
        
        //Mostrar Resultado
        lblResultado.setText("R$ " + dfReal.format(resultado));
        lblSituacao.setText("" +  resultado);

        if (resultado >= 0) {
            lblSituacao.setText("Você está se organizando bem");
        } else {
            lblSituacao.setText("Falta controle financeiro");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtlReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlReceitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlReceitaActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblAlimentacao;
    private javax.swing.JLabel lblCompras;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblMoradia;
    private javax.swing.JLabel lblOutros;
    private javax.swing.JLabel lblPorcAlimentacao;
    private javax.swing.JLabel lblPorcCompras;
    private javax.swing.JLabel lblPorcMoradia;
    private javax.swing.JLabel lblPorcOutros;
    private javax.swing.JLabel lblPorcReserva;
    private javax.swing.JLabel lblPorcSaude;
    private javax.swing.JLabel lblPorcTransporte;
    private javax.swing.JLabel lblReserva;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblSaude;
    private javax.swing.JLabel lblSituacao;
    private javax.swing.JLabel lblTituloResultadoDespesas;
    private javax.swing.JLabel lblTituloResutado1;
    private javax.swing.JLabel lblTituloSituacao;
    private javax.swing.JLabel lblTotalDespesas;
    private javax.swing.JLabel lblTransporte;
    private javax.swing.JPanel painel;
    private javax.swing.JTextField txtAlimentacao;
    private javax.swing.JTextField txtCompras;
    private javax.swing.JTextField txtMoradia;
    private javax.swing.JTextField txtOutros;
    private javax.swing.JTextField txtReserva;
    private javax.swing.JTextField txtSaude;
    private javax.swing.JTextField txtTransporte;
    private javax.swing.JTextField txtlReceita;
    // End of variables declaration//GEN-END:variables
}
