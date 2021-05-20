/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mealymakinesi;

/**
 *
 * @author gunay
 */
public class MealyArayuz extends javax.swing.JFrame {

    public String qParca[];
    public String eParca[];
    public String rParca[];
    public Durum durumlar[];
    
    
    public MealyArayuz() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        qLabel = new javax.swing.JLabel();
        eLabel = new javax.swing.JLabel();
        rLabel = new javax.swing.JLabel();
        qTextField = new javax.swing.JTextField();
        qBilgiLabel = new javax.swing.JLabel();
        eTextField = new javax.swing.JTextField();
        eBilgiLabel = new javax.swing.JLabel();
        rTextField = new javax.swing.JTextField();
        rBilgiLabel = new javax.swing.JLabel();
        osBilgiLabel = new javax.swing.JLabel();
        aiBilgiLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        afterInpTA = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        oldStateTA = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        afterInputOrnek = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        characterPrintedTA = new javax.swing.JTextArea();
        cpBilgiLabel = new javax.swing.JLabel();
        ornekLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        oldStateOrnek = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        characterPrintedOrnek = new javax.swing.JTextArea();
        inputStringTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        calistirButon = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        gecislerTxt = new javax.swing.JLabel();
        outputTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        qLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        qLabel.setText("Q:");

        eLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        eLabel.setText("∑:");

        rLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        rLabel.setText("Γ:");

        qTextField.setToolTipText("");

        qBilgiLabel.setText("(q0,q1,q2 gibi)");

        eTextField.setToolTipText("");

        eBilgiLabel.setText("(a,b gibi)");

        rTextField.setToolTipText("");

        rBilgiLabel.setText("(0,1 gibi)");

        osBilgiLabel.setText("Old State");

        aiBilgiLabel.setText("After Input New States");

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        afterInpTA.setColumns(20);
        afterInpTA.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        afterInpTA.setRows(5);
        jScrollPane4.setViewportView(afterInpTA);

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        oldStateTA.setColumns(2);
        oldStateTA.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        oldStateTA.setRows(5);
        oldStateTA.setTabSize(3);
        jScrollPane5.setViewportView(oldStateTA);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        afterInputOrnek.setEditable(false);
        afterInputOrnek.setBackground(new java.awt.Color(240, 240, 240));
        afterInputOrnek.setColumns(20);
        afterInputOrnek.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        afterInputOrnek.setRows(5);
        afterInputOrnek.setText("q2,q2\nq2,q0\nq3,q1\nq3,q1 ");
        afterInputOrnek.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jScrollPane1.setViewportView(afterInputOrnek);

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        characterPrintedTA.setColumns(2);
        characterPrintedTA.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        characterPrintedTA.setRows(5);
        characterPrintedTA.setTabSize(3);
        jScrollPane6.setViewportView(characterPrintedTA);

        cpBilgiLabel.setText("Outputs");

        ornekLabel.setForeground(new java.awt.Color(204, 0, 0));
        ornekLabel.setText("ORNEK:");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        oldStateOrnek.setEditable(false);
        oldStateOrnek.setBackground(new java.awt.Color(240, 240, 240));
        oldStateOrnek.setColumns(20);
        oldStateOrnek.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        oldStateOrnek.setRows(5);
        oldStateOrnek.setText("q0\nq1\nq2\nq3");
        oldStateOrnek.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jScrollPane2.setViewportView(oldStateOrnek);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        characterPrintedOrnek.setEditable(false);
        characterPrintedOrnek.setBackground(new java.awt.Color(240, 240, 240));
        characterPrintedOrnek.setColumns(20);
        characterPrintedOrnek.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        characterPrintedOrnek.setRows(5);
        characterPrintedOrnek.setText("0,1\n1,1\n0,1\n1,1");
        characterPrintedOrnek.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jScrollPane3.setViewportView(characterPrintedOrnek);

        jLabel1.setText("Input String:");

        jLabel2.setText("Gecisler:");

        calistirButon.setText("Calistir");
        calistirButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calistirButonActionPerformed(evt);
            }
        });

        jLabel3.setText("Output:");

        gecislerTxt.setText("-");

        outputTxt.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(outputTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gecislerTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(443, 443, 443))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(qLabel)
                                .addComponent(rLabel)
                                .addComponent(eLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(qTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(qBilgiLabel))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(eTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(eBilgiLabel))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rBilgiLabel)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ornekLabel)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(74, 74, 74)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(osBilgiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(28, 28, 28)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(aiBilgiLabel)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                            .addGap(569, 569, 569)
                            .addComponent(cpBilgiLabel))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel1)
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(inputStringTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(calistirButon)))))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cpBilgiLabel)
                    .addComponent(aiBilgiLabel)
                    .addComponent(osBilgiLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(ornekLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputStringTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calistirButon)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(gecislerTxt)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(outputTxt)
                    .addComponent(jLabel3))
                .addGap(91, 91, 91))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qBilgiLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(eTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eBilgiLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rBilgiLabel)))
                .addGap(411, 411, 411))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calistirButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calistirButonActionPerformed
       
        degerleriAl();
        tabloBilgileriniAl();
        sonucuYaz();
        
        
    }//GEN-LAST:event_calistirButonActionPerformed

       public void degerleriAl(){
        qParca = qTextField.getText().trim().split(","); // durum isimleri
        eParca = eTextField.getText().trim().split(","); // girdi alfabesi
        rParca = rTextField.getText().trim().split(","); // çıktı alfabesi
        
        durumlar = new Durum[qParca.length];
        
        for(int i=0; i<qParca.length; i++){
            durumlar[i] = new Durum(qParca[i], eParca.length);  // girdi alfabesi a ve b ise 1 durumdan 2 tane çıkış olabilir
        }                                                      
        
    }
    
    public void tabloBilgileriniAl(){
        String afterInpSatirlar[] = afterInpTA.getText().trim().split("\n");
        String cpSatirlar[] = characterPrintedTA.getText().trim().split("\n"); 
        String aiParca[], cpParca[];
        
        
        for(int i=0; i<afterInpSatirlar.length; i++){
            aiParca = afterInpSatirlar[i].trim().split(",");
            
            for(int j=0; j<aiParca.length; j++){
                
                for(Durum durum:durumlar){
                    if(durum.durumAdi.matches(aiParca[j])){
                        durumlar[i].gecisler[j] = durum;
                        break;
                    }
                } 
            }
            
        }
        
        for(int i=0; i<cpSatirlar.length; i++){
            cpParca = cpSatirlar[i].trim().split(",");
            
            for(int j=0; j<cpParca.length; j++){
                durumlar[i].cikislar[j] = cpParca[j];
            }
                    
        }
        
        
            
    }
    
    
    
     public void sonucuYaz(){
        Durum anlikDurum = durumlar[0];
        String inputString = inputStringTxt.getText().trim();
        String output = "";
        String gecisler = anlikDurum.durumAdi;
        
        for(int i=0; i<inputString.length(); i++){
            
            for(int j=0; j<eParca.length; j++){
                if(Character.toString(inputString.charAt(i)).matches(eParca[j]) ){
                    output += anlikDurum.cikislar[j];
                    anlikDurum = anlikDurum.gecisler[j];
                }
            }
            gecisler += "->"+ anlikDurum.durumAdi;
            
        }
        
        gecislerTxt.setText(gecisler);
        outputTxt.setText(output);
        
        
    }
    
    
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
            java.util.logging.Logger.getLogger(MealyArayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MealyArayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MealyArayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MealyArayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MealyArayuz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea afterInpTA;
    private javax.swing.JTextArea afterInputOrnek;
    private javax.swing.JLabel aiBilgiLabel;
    private javax.swing.JButton calistirButon;
    private javax.swing.JTextArea characterPrintedOrnek;
    private javax.swing.JTextArea characterPrintedTA;
    private javax.swing.JLabel cpBilgiLabel;
    private javax.swing.JLabel eBilgiLabel;
    private javax.swing.JLabel eLabel;
    private javax.swing.JTextField eTextField;
    private javax.swing.JLabel gecislerTxt;
    private javax.swing.JTextField inputStringTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea oldStateOrnek;
    private javax.swing.JTextArea oldStateTA;
    private javax.swing.JLabel ornekLabel;
    private javax.swing.JLabel osBilgiLabel;
    private javax.swing.JLabel outputTxt;
    private javax.swing.JLabel qBilgiLabel;
    private javax.swing.JLabel qLabel;
    private javax.swing.JTextField qTextField;
    private javax.swing.JLabel rBilgiLabel;
    private javax.swing.JLabel rLabel;
    private javax.swing.JTextField rTextField;
    // End of variables declaration//GEN-END:variables
}
