
import cpit380practice.Picture;
import cpit380practice.Pixel;
import cpit380practice.SimplePicture;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
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
        targetLab = new javax.swing.JLabel();
        imgLabel = new javax.swing.JLabel();
        cropImg = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        clearImage = new javax.swing.JButton();
        Rotateleft = new javax.swing.JButton();
        RotateRight = new javax.swing.JButton();
        Rotate180 = new javax.swing.JButton();
        Blend = new javax.swing.JButton();

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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10))
                    .addComponent(greenSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blueSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        chooseImg.setText("Choose an image");
        chooseImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseImgActionPerformed(evt);
            }
        });

        ImagePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        targetLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        targetLab.setText("Missing an image");

        imgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLabel.setText("Missing an image");

        javax.swing.GroupLayout ImagePanelLayout = new javax.swing.GroupLayout(ImagePanel);
        ImagePanel.setLayout(ImagePanelLayout);
        ImagePanelLayout.setHorizontalGroup(
            ImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ImagePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(targetLab, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ImagePanelLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(492, Short.MAX_VALUE)))
        );
        ImagePanelLayout.setVerticalGroup(
            ImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(targetLab, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
            .addGroup(ImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ImagePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(imgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        cropImg.setText("Crop image");
        cropImg.setToolTipText("");
        cropImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cropImgActionPerformed(evt);
            }
        });

        jButton1.setText("Convert to gray scale image");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertToGrayScale(evt);
            }
        });

        clearImage.setText("Clear");
        clearImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearImageActionPerformed(evt);
            }
        });

        Rotateleft.setText("Rotate left");
        Rotateleft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RotateleftActionPerformed(evt);
            }
        });

        RotateRight.setText("Rotate Right");
        RotateRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RotateRightActionPerformed(evt);
            }
        });

        Rotate180.setText("Rotate 180");
        Rotate180.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rotate180ActionPerformed(evt);
            }
        });

        Blend.setText("Blend");
        Blend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ImagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cropImg)
                            .addComponent(clearImage))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Rotateleft, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(Blend, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(751, 751, 751)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(RotateRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Rotate180, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(88, 88, 88))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(chooseImg))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chooseImg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cropImg)
                                .addGap(18, 18, 18)
                                .addComponent(clearImage))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Rotateleft)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RotateRight)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Rotate180)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Blend)
                        .addGap(47, 47, 47)
                        .addComponent(jButton1))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
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
            pic = new Picture(imgName);
            Image img = (pic.getImage()).getScaledInstance(imgLabel.getWidth(), imgLabel.getHeight(), Image.SCALE_SMOOTH);;
            imgLabel.setText("");
            imgLabel.setIcon(new ImageIcon(img));
            updateIMG();

        }

    }//GEN-LAST:event_chooseImgActionPerformed

    int numOfClicks = 0;
    int x1;
    int x2;
    int y1;
    int y2;

    private void cropImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cropImgActionPerformed
        // TODO add your handling code here:
        // image cropped button
        if (pic == null) {
            JOptionPane.showMessageDialog(null, "Select an image please!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JFrame parent = new JFrame();
            JOptionPane.showMessageDialog(parent, "Please click on two points in the image");

            imgLabel.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    System.out.println("Clicked!");
                    System.out.println(e.getX());
                    System.out.println(e.getY());
                    numOfClicks++;
                    if (numOfClicks == 1) {
                        x1 = e.getX();
                        y1 = e.getY();
                    } else if (numOfClicks == 2) {
                        x2 = e.getX();
                        y2 = e.getY();
                        // call the crop method with both cordinates.
                        CropImage(x1, y1, x2, y2);
                        numOfClicks = 0;
                        imgLabel.removeMouseListener(this);
                    }
                }
            });
        }
    }//GEN-LAST:event_cropImgActionPerformed

    //***************************************************************************************************************
    //
    //
    BufferedImage image;
    int width;
    int height;

    // not completed
    private void ConvertToGrayScale(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertToGrayScale
        if (pic == null) {
            JOptionPane.showMessageDialog(null, "Select an image please!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Pixel[] pxl = pic.getPixels();
            for (int i = 0; i < pxl.length; i++) {
                int avg = (pxl[i].getRed() + pxl[i].getBlue() + pxl[i].getGreen()) / 3;
                pxl[i].setColor(new Color(avg, avg, avg));
            }
            updateIMG();
        }


    }//GEN-LAST:event_ConvertToGrayScale

    private void clearImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearImageActionPerformed
        pic = new Picture(imgName);
        updateIMG();
    }//GEN-LAST:event_clearImageActionPerformed

    private void RotateleftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RotateleftActionPerformed
        if (pic != null) {
            pic = pic.rotateLeft();
            updateIMG();
        } else {
            JOptionPane.showMessageDialog(null, "Select an image please!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_RotateleftActionPerformed

    private void RotateRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RotateRightActionPerformed
        if (pic != null) {
            pic = pic.rotateRight();
            updateIMG();
        } else {
            JOptionPane.showMessageDialog(null, "Select an image please!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_RotateRightActionPerformed

    private void Rotate180ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rotate180ActionPerformed
        if (pic != null) {
            pic = pic.rotate(180);
            updateIMG();
        } else {
            JOptionPane.showMessageDialog(null, "Select an image please!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Rotate180ActionPerformed

    private void BlendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlendActionPerformed
        if (pic != null) {
            JFileChooser jFileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
            jFileChooser.showOpenDialog(jFileChooser);
            Picture picture_obj = new Picture(jFileChooser.getSelectedFile().getAbsolutePath());
            if ((picture_obj.getWidth() * picture_obj.getHeight()) == (pic.getWidth() * pic.getHeight())) {
                Pixel[] pic_1 = pic.getPixels();
                Pixel[] pic_2 = picture_obj.getPixels();
                int num_Colors = 3;
                int i = 0;
                while (i < pic_1.length) {
                    //----Here we calc the Colors----
                    int valueP1 = ((pic_1[i].getRed() + pic_1[i].getGreen() + pic_1[i].getBlue()) / num_Colors);
                    int valueP2 = ((pic_2[i].getRed() + pic_2[i].getGreen() + pic_2[i].getBlue()) / num_Colors);
                    //----Here we calc avg for 2 pic----
                    int avg_Colors = (int) (valueP1 + valueP2) / 2;
                    pic_1[i].setColor(new Color(avg_Colors));
                     i++;
                }
                updateIMG();
            } else {
                JOptionPane.showMessageDialog(null, "the image should be the same size!");
            }
            updateIMG();
        } else {
            JOptionPane.showMessageDialog(null, "Select an image !", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BlendActionPerformed

    //** NEEDS SOME EDIT**
    private void CropImage(int x1, int y1, int x2, int y2) {

//        System.out.println("OpW" + pic.getWidth());
//        System.out.println("OpH" + pic.getHeight());
//        System.out.println("LabelW " + imgLabel.getWidth());
//        System.out.println("LabelH " + imgLabel.getHeight());
//        System.out.println("OX1 " + x1);
//        System.out.println("OY1 " + y1);
//        System.out.println("OX2 " + x2);
//        System.out.println("OY2 " + y2);
        // convert from max of label view to actual pic width and height
        double W = (pic.getWidth() * 1.00 / targetLab.getWidth());
        double H = (pic.getHeight() * 1.00 / targetLab.getHeight());

        x1 = (int) (W * x1);
        x2 = (int) (W * x2);
        y1 = (int) (H * y1);
        y2 = (int) (H * y2);

//        System.out.println("X1 " + x1);
//        System.out.println("Y1 " + y1);
//        System.out.println("X2 " + x2);
//        System.out.println("Y2 " + y2);
        Picture newPic = new Picture(pic.getWidth(), pic.getHeight());

        Pixel sourcePixel;
        Pixel targetPixel;

        for (int i = x1; i < x2; i++) {
            for (int j = y1; j < y2; j++) {
                sourcePixel = pic.getPixel(i, j);
                targetPixel = newPic.getPixel(i, j);
                targetPixel.setColor(sourcePixel.getColor());
            }

        }
        pic = newPic;
        updateIMG();

    }
    /**
     * @param args the command line arguments
     */
    private static int R_Value = -1;
    private static int G_Value = -1;
    private static int B_Value = -1;
    private static String imgName;
    private static Picture pic;

    // **************************************************************************************************************
    // needs to be updated as the following:
    // convert 255 to 100%.
    // if less than 50 decrese value.
    // more than 50 increase value.  
    private void updateColors() {
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
        targetLab.setText("");
        targetLab.setIcon(new ImageIcon(img));
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
    private javax.swing.JButton Blend;
    private javax.swing.JPanel ImagePanel;
    private javax.swing.JButton Rotate180;
    private javax.swing.JButton RotateRight;
    private javax.swing.JButton Rotateleft;
    private javax.swing.JSlider blueSlider;
    private javax.swing.JButton chooseImg;
    private javax.swing.JButton clearImage;
    private javax.swing.JButton cropImg;
    private javax.swing.JSlider greenSlider;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider redSlider;
    private javax.swing.JLabel targetLab;
    // End of variables declaration//GEN-END:variables
}
