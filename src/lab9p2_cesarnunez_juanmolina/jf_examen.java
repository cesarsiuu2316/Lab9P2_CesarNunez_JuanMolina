
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9p2_cesarnunez_juanmolina;

import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Hwan
 */
public class jf_examen extends javax.swing.JFrame {

    private alumno usuarioExamen = new alumno();
    adminExamen ae;
    public jf_examen() {
        initComponents();
        
        for (clase temp : usuarioExamen.getClases()) {
            clasesCombo.addItem(temp.getNombreClase());
        }
        
        
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tiempoLabel = new javax.swing.JLabel();
        notificacionLabel = new javax.swing.JLabel();
        clasesCombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        seleccionarClase = new javax.swing.JButton();
        examenCombo = new javax.swing.JComboBox<>();
        examenID = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        v1 = new javax.swing.JRadioButton();
        f1 = new javax.swing.JRadioButton();
        v2 = new javax.swing.JRadioButton();
        f2 = new javax.swing.JRadioButton();
        v3 = new javax.swing.JRadioButton();
        f3 = new javax.swing.JRadioButton();
        v4 = new javax.swing.JRadioButton();
        f4 = new javax.swing.JRadioButton();
        v5 = new javax.swing.JRadioButton();
        f5 = new javax.swing.JRadioButton();
        finalizarExamen = new javax.swing.JButton();
        seleccionarExamen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Tiempo:");

        clasesCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        clasesCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clasesComboActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("EXAMEN");

        seleccionarClase.setText("SELECCIONAR");
        seleccionarClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarClaseActionPerformed(evt);
            }
        });

        examenCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        examenID.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        p1.setText("PREGUNTA 1");

        p2.setText("PREGUNTA 2");

        p3.setText("PREGUNTA 3");

        p4.setText("PREGUNTA 4");

        p5.setText("PREGUNTA 5");

        buttonGroup1.add(v1);
        v1.setText("VERDADERO");

        buttonGroup1.add(f1);
        f1.setText("FALSO");
        f1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(v2);
        v2.setText("VERDADERO");
        v2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v2ActionPerformed(evt);
            }
        });

        buttonGroup2.add(f2);
        f2.setText("FALSO");

        buttonGroup3.add(v3);
        v3.setText("VERDADERO");

        buttonGroup3.add(f3);
        f3.setText("FALSO");

        buttonGroup4.add(v4);
        v4.setText("VERDADERO");

        buttonGroup4.add(f4);
        f4.setText("FALSO");

        buttonGroup5.add(v5);
        v5.setText("VERDADERO");

        buttonGroup5.add(f5);
        f5.setText("FALSO");

        finalizarExamen.setText("FINALIZAR");
        finalizarExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarExamenActionPerformed(evt);
            }
        });

        seleccionarExamen.setText("SELECCIONAR");
        seleccionarExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarExamenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(227, 227, 227)
                        .addComponent(jLabel1)
                        .addGap(50, 50, 50)
                        .addComponent(tiempoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(450, 450, 450)
                        .addComponent(notificacionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(examenID, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(v1)
                            .addComponent(f1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(f5)
                            .addComponent(f4)
                            .addComponent(f3)
                            .addComponent(f2)
                            .addComponent(v2)
                            .addComponent(v3)
                            .addComponent(v4)
                            .addComponent(v5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(finalizarExamen))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clasesCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(examenCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(seleccionarExamen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seleccionarClase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(tiempoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(10, 10, 10)
                        .addComponent(notificacionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clasesCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seleccionarClase))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(examenCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seleccionarExamen))
                        .addGap(48, 48, 48)
                        .addComponent(examenID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(v1))
                    .addComponent(p1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p2)
                    .addComponent(v2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f2)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p3)
                    .addComponent(v3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f3)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p4)
                    .addComponent(v4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f4)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p5)
                    .addComponent(v5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(finalizarExamen)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clasesComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clasesComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clasesComboActionPerformed

    private clase tempClase = new clase();
    private void seleccionarClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarClaseActionPerformed
        for (clase temp : usuarioExamen.getClases()) {
            if(clasesCombo.getSelectedItem() == temp.getNombreClase()){
                tempClase = usuarioExamen.getClases().get(usuarioExamen.getClases().indexOf(temp));
                break;
            }
        }
        
        clasesCombo.setEnabled(false);
        seleccionarClase.setEnabled(false);
        
        for (examen temp : tempClase.getExamenes()) {
            int numero = temp.getIdExamen();
            examenCombo.addItem(""+numero);
        }
        
    }//GEN-LAST:event_seleccionarClaseActionPerformed

    private examen tempExamen = new examen();
    private void v2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_v2ActionPerformed

    private void f1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f1ActionPerformed

    
    
    private void seleccionarExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarExamenActionPerformed
        boolean estado = true;
        
        for (examen temp : tempClase.getExamenes()) {
            if(examenCombo.getSelectedItem().equals(temp.getIdExamen())){
                if(temp.getNota()==0){
                    tempExamen = tempClase.getExamenes().get(tempClase.getExamenes().indexOf(temp));
                    break;
                } else {
                    estado = false;
                    JOptionPane.showMessageDialog(null,"Ya has tomado este examen! Escoge otro.");
                    break;
                }
            }
        }
        
        if(estado){
            examenID.setText(""+tempExamen.getIdExamen());
        
            p1.setText(tempExamen.getExamen().get(0).getPregunta());
            p2.setText(tempExamen.getExamen().get(1).getPregunta());
            p3.setText(tempExamen.getExamen().get(2).getPregunta());
            p4.setText(tempExamen.getExamen().get(3).getPregunta());
            p5.setText(tempExamen.getExamen().get(4).getPregunta());

            examenCombo.setEnabled(false);
            seleccionarExamen.setEnabled(false);
        }
        
        ae = new adminExamen(tiempoLabel,notificacionLabel);
        hilo = new Thread(ae);
        hilo.run();
    }//GEN-LAST:event_seleccionarExamenActionPerformed

    private void finalizarExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarExamenActionPerformed
        int counter = 0;
        
        if(v1.isSelected()){
            if(tempExamen.getExamen().get(0).isRespuesta()==true){
                counter += 5;
            } 
        } else if (f1.isSelected()){
            if(tempExamen.getExamen().get(0).isRespuesta()==false){
                counter += 5;
            } 
        }
        
        if(v2.isSelected()){
            if(tempExamen.getExamen().get(1).isRespuesta()==true){
                counter += 5;
            } 
        } else if (f2.isSelected()){
            if(tempExamen.getExamen().get(1).isRespuesta()==false){
                counter += 5;
            } 
        }
        
        if(v3.isSelected()){
            if(tempExamen.getExamen().get(2).isRespuesta()==true){
                counter += 5;
            } 
        } else if (f3.isSelected()){
            if(tempExamen.getExamen().get(2).isRespuesta()==false){
                counter += 5;
            } 
        }
        
        if(v4.isSelected()){
            if(tempExamen.getExamen().get(3).isRespuesta()==true){
                counter += 5;
            } 
        } else if (f4.isSelected()){
            if(tempExamen.getExamen().get(3).isRespuesta()==false){
                counter += 5;
            } 
        }
        
        if(v5.isSelected()){
            if(tempExamen.getExamen().get(4).isRespuesta()==true){
                counter += 5;
            } 
        } else if (f5.isSelected()){
            if(tempExamen.getExamen().get(4).isRespuesta()==false){
                counter += 5;
            } 
        }
        
        
        JOptionPane.showMessageDialog(null, "Nota Final: "+counter+"/25");
        tempExamen.setNota(counter);
        ae.setEstado(false);
        dispose();
    }//GEN-LAST:event_finalizarExamenActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JComboBox<String> clasesCombo;
    private javax.swing.JComboBox<String> examenCombo;
    private javax.swing.JLabel examenID;
    private javax.swing.JRadioButton f1;
    private javax.swing.JRadioButton f2;
    private javax.swing.JRadioButton f3;
    private javax.swing.JRadioButton f4;
    private javax.swing.JRadioButton f5;
    private javax.swing.JButton finalizarExamen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel notificacionLabel;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel p5;
    private javax.swing.JButton seleccionarClase;
    private javax.swing.JButton seleccionarExamen;
    private javax.swing.JLabel tiempoLabel;
    private javax.swing.JRadioButton v1;
    private javax.swing.JRadioButton v2;
    private javax.swing.JRadioButton v3;
    private javax.swing.JRadioButton v4;
    private javax.swing.JRadioButton v5;
    // End of variables declaration//GEN-END:variables

    public void jf_examen(alumno temp ){
        this.usuarioExamen = temp;
    }
    
    Thread hilo;
}
