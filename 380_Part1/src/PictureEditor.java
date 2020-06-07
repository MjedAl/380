
import BookClasses.Picture;
import BookClasses.Pixel;
import BookClasses.SimplePicture;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author Mjed
 */
public class PictureEditor extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public PictureEditor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        redSlider = new javax.swing.JSlider();
        greenSlider = new javax.swing.JSlider();
        blueSlider = new javax.swing.JSlider();
        chooseImg = new javax.swing.JButton();
        ImagePanel = new javax.swing.JPanel();
        imgLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Editor"); // NOI18N
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 150));

        jLabel1.setText("Red:");

        jLabel2.setText("Green:");

        jLabel3.setText("Blue:");

        redSlider.setMaximum(255);
        redSlider.setToolTipText("");
        redSlider.setValue(0);
        redSlider.setEnabled(false);
        redSlider.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                redSliderFocusLost(evt);
            }
        });
        redSlider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                redSliderMouseReleased(evt);
            }
        });
        redSlider.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                redSliderKeyReleased(evt);
            }
        });

        greenSlider.setMaximum(255);
        greenSlider.setValue(0);
        greenSlider.setEnabled(false);
        greenSlider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                greenSliderMouseReleased(evt);
            }
        });

        blueSlider.setMaximum(255);
        blueSlider.setValue(0);
        blueSlider.setEnabled(false);
        blueSlider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                blueSliderMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(30, 30, 30)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(blueSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                    .addComponent(greenSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                    .addComponent(redSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(redSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(greenSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(blueSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        chooseImg.setText("Choose an image");
        chooseImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseImgActionPerformed(evt);
            }
        });

        ImagePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        imgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLabel.setText("Missing an image");

        javax.swing.GroupLayout ImagePanelLayout = new javax.swing.GroupLayout(ImagePanel);
        ImagePanel.setLayout(ImagePanelLayout);
        ImagePanelLayout.setHorizontalGroup(
            ImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ImagePanelLayout.setVerticalGroup(
            ImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ImagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(chooseImg)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chooseImg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void redSliderFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_redSliderFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_redSliderFocusLost

    private void redSliderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_redSliderKeyReleased
    }//GEN-LAST:event_redSliderKeyReleased

    private void redSliderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redSliderMouseReleased
        R_Value = redSlider.getValue();
        updateColors();
    }//GEN-LAST:event_redSliderMouseReleased

    private void greenSliderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_greenSliderMouseReleased
        // TODO add your handling code here:
        G_Value = greenSlider.getValue();
        updateColors();
    }//GEN-LAST:event_greenSliderMouseReleased

    private void blueSliderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blueSliderMouseReleased
        // TODO add your handling code here:
        B_Value = blueSlider.getValue();
        updateColors();
    }//GEN-LAST:event_blueSliderMouseReleased


    private void chooseImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseImgActionPerformed
        // TODO add your handling code here:

        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        jfc.setDialogTitle("Select an image");
        jfc.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG", "png");
        jfc.addChoosableFileFilter(filter);

        int returnValue = jfc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            System.out.println(jfc.getSelectedFile().getPath() + " is selected");
            imgName = jfc.getSelectedFile().getPath();
            redSlider.setEnabled(true);
            greenSlider.setEnabled(true);
            blueSlider.setEnabled(true);
            redSlider.setValue(0);
            greenSlider.setValue(0);
            blueSlider.setValue(0);
            R_Value = -1;
            G_Value = -1;
            B_Value = -1;
            pic = new SimplePicture(imgName);
            updateIMG();

        }

    }//GEN-LAST:event_chooseImgActionPerformed

    /**
     * @param args the command line arguments
     */
    private static int R_Value=-1;
    private static int G_Value=-1;
    private static int B_Value=-1;
    private static String imgName;
    private static SimplePicture pic;

    // **************************************************************************************************************
    private void updateColors() {
        // convert 255 to 100%.
        // if less than 50 decrese value.
        // more than 50 increase value.

        Pixel[] pixelArray = pic.getPixels();
        for (Pixel pixelObj : pixelArray) {

            if (R_Value != -1) {
                pixelObj.setRed(R_Value);
            }
            if (G_Value != -1) {
                pixelObj.setGreen(G_Value);
            }
            if (B_Value != -1) {
                pixelObj.setBlue(B_Value);
            }

        }
        updateIMG();
    }
    // **************************************************************************************************************

    private void updateIMG() {
        Image img = (pic.getImage()).getScaledInstance(imgLabel.getWidth(), imgLabel.getHeight(), Image.SCALE_SMOOTH);;
        imgLabel.setText("");
        imgLabel.setIcon(new ImageIcon(img));
        System.out.printf("R= %d,G= %d,B= %d \n", R_Value, G_Value, B_Value);

    }

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
            java.util.logging.Logger.getLogger(PictureEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PictureEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PictureEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PictureEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PictureEditor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ImagePanel;
    private javax.swing.JSlider blueSlider;
    private javax.swing.JButton chooseImg;
    private javax.swing.JSlider greenSlider;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider redSlider;
    // End of variables declaration//GEN-END:variables
}
