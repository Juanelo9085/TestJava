package testjava;

import javax.swing.JOptionPane;

/**
 *
 * @author Juanelo
 */
public class FrmTestJava extends javax.swing.JFrame {

  TestJava testJava;

  public FrmTestJava() {
    initComponents();
    setLocationRelativeTo(this);
  }
  
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jPanel2 = new javax.swing.JPanel();
    btnEjercicio1 = new javax.swing.JButton();
    btnEjercicio2 = new javax.swing.JButton();
    btnEjercicio3 = new javax.swing.JButton();
    btnEjercicio4 = new javax.swing.JButton();
    btnLimpiar = new javax.swing.JButton();
    jScrollPane2 = new javax.swing.JScrollPane();
    panelRequerimientos = new javax.swing.JTextPane();
    jScrollPane3 = new javax.swing.JScrollPane();
    panelResultado = new javax.swing.JEditorPane();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Test Java");
    setResizable(false);

    jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

    btnEjercicio1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    btnEjercicio1.setText("Ejercicio 1");
    btnEjercicio1.setToolTipText("Imprime los números del 0 al 1000 salteados de 5 en 5.");
    btnEjercicio1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnEjercicio1ActionPerformed(evt);
      }
    });

    btnEjercicio2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    btnEjercicio2.setText("Ejercicio 2");
    btnEjercicio2.setToolTipText("Imprime los números del 1000 al 0 salteados de 10 en 10.");
    btnEjercicio2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnEjercicio2ActionPerformed(evt);
      }
    });

    btnEjercicio3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    btnEjercicio3.setText("Ejercicio 3");
    btnEjercicio3.setToolTipText("Pedir nombre de usuario e imprimir solo las vocales.");
    btnEjercicio3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnEjercicio3ActionPerformed(evt);
      }
    });

    btnEjercicio4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    btnEjercicio4.setText("Ejercicio 4");
    btnEjercicio4.setToolTipText("Imprimir los primeros 50 dígitos de la serie Fibonacci.");
    btnEjercicio4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnEjercicio4ActionPerformed(evt);
      }
    });

    btnLimpiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    btnLimpiar.setText("Limpiar resultado");
    btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnLimpiarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGap(25, 25, 25)
        .addComponent(btnEjercicio1)
        .addGap(14, 14, 14)
        .addComponent(btnEjercicio2)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(btnEjercicio3)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(btnEjercicio4)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
        .addComponent(btnLimpiar)
        .addGap(44, 44, 44))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnEjercicio1)
          .addComponent(btnEjercicio2)
          .addComponent(btnEjercicio3)
          .addComponent(btnEjercicio4)
          .addComponent(btnLimpiar))
        .addContainerGap(19, Short.MAX_VALUE))
    );

    panelRequerimientos.setText("1. Ciclo que imprime los números del 0 al 1000 salteados de 5 en 5.\n2. Ciclo que imprime los números del 1000 al 0 salteados de 10 en 10.\n3. Pedir nombre de usuario e imprimir solo las vocales.\n4. Imprimir los primeros 50 dígitos de la serie Fibonacci");
    jScrollPane2.setViewportView(panelRequerimientos);

    jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
    jScrollPane3.setViewportView(panelResultado);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
            .addComponent(jScrollPane2)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
        .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnEjercicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjercicio1ActionPerformed
    testJava = new TestJava();
    panelResultado.setText("" + testJava.numerosCincoEnCinco());
  }//GEN-LAST:event_btnEjercicio1ActionPerformed

  private void btnEjercicio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjercicio2ActionPerformed
    testJava = new TestJava();
    panelResultado.setText("" + testJava.numerosDiezEnDiez());
  }//GEN-LAST:event_btnEjercicio2ActionPerformed

  private void btnEjercicio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjercicio3ActionPerformed
    String usuario = "";
    do {      
      usuario = JOptionPane.showInputDialog(rootPane, "Ingrese el nombre del usuario", "Usuario", JOptionPane.INFORMATION_MESSAGE);
    } while ("".equals(usuario));
    try{
      testJava = new TestJava();
      panelResultado.setText("" + testJava.imprimirVocales(usuario));
    }catch(Exception e){
      panelResultado.setText(null);
      JOptionPane.showMessageDialog(rootPane, "No se puede realizar la operación, debe ingresar un usuario", "Error", JOptionPane.INFORMATION_MESSAGE);
    }
  }//GEN-LAST:event_btnEjercicio3ActionPerformed

  private void btnEjercicio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjercicio4ActionPerformed
    testJava = new TestJava();
    panelResultado.setText("" + testJava.secuenciaFibonacci());
  }//GEN-LAST:event_btnEjercicio4ActionPerformed

  private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
    panelResultado.setText(null);
    panelResultado.requestFocus();
  }//GEN-LAST:event_btnLimpiarActionPerformed

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
      java.util.logging.Logger.getLogger(FrmTestJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(FrmTestJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(FrmTestJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(FrmTestJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new FrmTestJava().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnEjercicio1;
  private javax.swing.JButton btnEjercicio2;
  private javax.swing.JButton btnEjercicio3;
  private javax.swing.JButton btnEjercicio4;
  private javax.swing.JButton btnLimpiar;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane3;
  private javax.swing.JTextPane panelRequerimientos;
  private javax.swing.JEditorPane panelResultado;
  // End of variables declaration//GEN-END:variables
}
