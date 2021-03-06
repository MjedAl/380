
import cpit380practice.FileChooser;
import cpit380practice.Sound;
import cpit380practice.SoundSample;
import java.awt.Color;
import java.io.File;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mjed
 */
public class SoundEditor extends javax.swing.JFrame {

    /**
     * Creates new form SoundEditor
     */
    public SoundEditor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainFunctions = new javax.swing.JPanel();
        playSound = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        volumeSlider = new javax.swing.JSlider();
        clipSound = new javax.swing.JButton();
        splicingSound = new javax.swing.JButton();
        spreadSound = new javax.swing.JButton();
        reversingSound = new javax.swing.JButton();
        blendingSound = new javax.swing.JButton();
        simpleAVG = new javax.swing.JButton();
        weightedAVG = new javax.swing.JButton();
        chooseSound = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        playSound.setText("Play once");
        playSound.setToolTipText("");
        playSound.setEnabled(false);
        playSound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playSoundActionPerformed(evt);
            }
        });

        jLabel1.setText("Volume:");

        volumeSlider.setToolTipText("");
        volumeSlider.setEnabled(false);
        volumeSlider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                volumeSliderMouseReleased(evt);
            }
        });

        clipSound.setText("Clip");
        clipSound.setToolTipText("");
        clipSound.setEnabled(false);
        clipSound.setPreferredSize(new java.awt.Dimension(85, 32));
        clipSound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clipSoundActionPerformed(evt);
            }
        });

        splicingSound.setText("Splicing");
        splicingSound.setToolTipText("");
        splicingSound.setEnabled(false);
        splicingSound.setPreferredSize(new java.awt.Dimension(85, 32));
        splicingSound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                splicingSoundActionPerformed(evt);
            }
        });

        spreadSound.setText("Spread n Squeeze");
        spreadSound.setToolTipText("");
        spreadSound.setEnabled(false);
        spreadSound.setPreferredSize(new java.awt.Dimension(85, 32));
        spreadSound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spreadSoundActionPerformed(evt);
            }
        });

        reversingSound.setText("Reversing");
        reversingSound.setToolTipText("");
        reversingSound.setEnabled(false);
        reversingSound.setPreferredSize(new java.awt.Dimension(85, 32));
        reversingSound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reversingSoundActionPerformed(evt);
            }
        });

        blendingSound.setText("Blending");
        blendingSound.setToolTipText("");
        blendingSound.setEnabled(false);
        blendingSound.setPreferredSize(new java.awt.Dimension(85, 32));
        blendingSound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blendingSoundActionPerformed(evt);
            }
        });

        simpleAVG.setText("Simple AVG");
        simpleAVG.setToolTipText("");
        simpleAVG.setEnabled(false);
        simpleAVG.setPreferredSize(new java.awt.Dimension(85, 32));
        simpleAVG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpleAVGActionPerformed(evt);
            }
        });

        weightedAVG.setText("Weighted AVG");
        weightedAVG.setToolTipText("");
        weightedAVG.setEnabled(false);
        weightedAVG.setPreferredSize(new java.awt.Dimension(85, 32));
        weightedAVG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightedAVGActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainFunctionsLayout = new javax.swing.GroupLayout(mainFunctions);
        mainFunctions.setLayout(mainFunctionsLayout);
        mainFunctionsLayout.setHorizontalGroup(
            mainFunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainFunctionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainFunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(volumeSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playSound, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainFunctionsLayout.createSequentialGroup()
                        .addGroup(mainFunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainFunctionsLayout.createSequentialGroup()
                                .addComponent(clipSound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(splicingSound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(reversingSound, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(blendingSound, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(mainFunctionsLayout.createSequentialGroup()
                        .addComponent(simpleAVG, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(weightedAVG, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainFunctionsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(spreadSound, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainFunctionsLayout.setVerticalGroup(
            mainFunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainFunctionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainFunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clipSound, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(splicingSound, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reversingSound, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blendingSound, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(spreadSound, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainFunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weightedAVG, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simpleAVG, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(volumeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playSound, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        chooseSound.setText("Load a sound");
        chooseSound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseSoundActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainFunctions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chooseSound, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chooseSound)
                .addGap(12, 12, 12)
                .addComponent(mainFunctions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private Sound currentSound;
    private void chooseSoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseSoundActionPerformed
        // TODO add your handling code here:

        try {
            String filePath = FileChooser.pickAFile();
            currentSound = new Sound(filePath);
            changeContentStatus(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Some error happend:" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_chooseSoundActionPerformed

    private void volumeSliderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volumeSliderMouseReleased
        // TODO add your handling code here:

        currentSound.changeVolume(volumeSlider.getValue() / 50);
        currentSound.play();

    }//GEN-LAST:event_volumeSliderMouseReleased

    private void playSoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playSoundActionPerformed
        // TODO add your handling code here:
        currentSound.play();
    }//GEN-LAST:event_playSoundActionPerformed

    private void splicingSoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_splicingSoundActionPerformed
        // TODO add your handling code here:
        currentSound = currentSound.splice(1);
        while (true) {
            int reply = JOptionPane.showConfirmDialog(null, "Do you want to splice another sound ?", "Splice?", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                currentSound = currentSound.splice(1);
            } else {
                currentSound.play();
                break;
            }
        }
    }//GEN-LAST:event_splicingSoundActionPerformed

    private void spreadSoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spreadSoundActionPerformed
        // TODO add your handling code here:
        currentSound = currentSound.spreadThenSqueeze();
        currentSound.play();
    }//GEN-LAST:event_spreadSoundActionPerformed

    private void simpleAVGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpleAVGActionPerformed
        // TODO add your handling code here:
        // take num
        String size = JOptionPane.showInputDialog(null, "Please Enter the size of window please: ");
        try {
            int Size = Integer.parseInt(size);
            currentSound.simpleAverage(Size);
            currentSound.play();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please put integer only", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_simpleAVGActionPerformed

    private void clipSoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clipSoundActionPerformed

        String first = JOptionPane.showInputDialog(null, "Enter the start Index: ");
        String last = JOptionPane.showInputDialog(null, "Enter the end Index: ");
        int firstIndx = Integer.parseInt(first);
        int lastIndx = Integer.parseInt(last);

        Sound s = currentSound.clip(firstIndx, lastIndx);
        s.play();

    }//GEN-LAST:event_clipSoundActionPerformed

    private void weightedAVGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightedAVGActionPerformed
        // TODO add your handling code here:
        // Wavg
        Object[] options = {"LEFT",
            "MIDDLE",
            "RIGHT"};
        int choice = JOptionPane.showOptionDialog(this, "Please choose the skew of the filter", "Gaussuan filter option", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
        currentSound.weightedAverage((short) choice);
        currentSound.play();
    }//GEN-LAST:event_weightedAVGActionPerformed

    private void blendingSoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blendingSoundActionPerformed
        // TODO add your handling code here:
             String numberOfSound = JOptionPane.showInputDialog(null, "Please Enter the number of sounds : ");
        int num = Integer.parseInt(numberOfSound);

        if (num == 2) {

            String filePath1 = FileChooser.pickAFile();
            Sound sound1 = new Sound(filePath1);

            for (int i = 0; i < currentSound.getLength() - 1; i++) {

                currentSound.setSampleValueAt(i, currentSound.getSampleValueAt(i) + sound1.getSampleValueAt(i));

            }
        } else if (num == 3) {
            String filePath1 = FileChooser.pickAFile();
            Sound sound1 = new Sound(filePath1);
            String filePath2 = FileChooser.pickAFile();
            Sound sound2 = new Sound(filePath2);

            for (int i = 0; i < currentSound.getLength() - 1; i++) {

                currentSound.setSampleValueAt(i, currentSound.getSampleValueAt(i) + sound1.getSampleValueAt(i) + sound2.getSampleValueAt(i));

            }
        }

        currentSound.play();
    }//GEN-LAST:event_blendingSoundActionPerformed

    private void reversingSoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reversingSoundActionPerformed
        // TODO add your handling code here:
               SoundSample[] sound = currentSound.getSamples();
        int index = 0;

        for (int i = currentSound.getLength() - 1; i >= 0; i--) {

            SoundSample temp = sound[i];
            sound[index] = temp;

            currentSound.setSampleValueAt(index, currentSound.getSampleValueAt(i));
            index++;
        }

        currentSound.play();
    }//GEN-LAST:event_reversingSoundActionPerformed



    private void changeContentStatus(boolean status) {
        clipSound.setEnabled(status);
        splicingSound.setEnabled(status);
        spreadSound.setEnabled(status);
        reversingSound.setEnabled(status);
        blendingSound.setEnabled(status);
        simpleAVG.setEnabled(status);
        weightedAVG.setEnabled(status);
        playSound.setEnabled(status);
        volumeSlider.setEnabled(status);
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
            java.util.logging.Logger.getLogger(SoundEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SoundEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SoundEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SoundEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SoundEditor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton blendingSound;
    private javax.swing.JButton chooseSound;
    private javax.swing.JButton clipSound;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel mainFunctions;
    private javax.swing.JButton playSound;
    private javax.swing.JButton reversingSound;
    private javax.swing.JButton simpleAVG;
    private javax.swing.JButton splicingSound;
    private javax.swing.JButton spreadSound;
    private javax.swing.JSlider volumeSlider;
    private javax.swing.JButton weightedAVG;
    // End of variables declaration//GEN-END:variables
}
