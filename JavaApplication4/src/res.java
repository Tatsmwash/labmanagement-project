/**
 *
 * @author tats and ingrid
 */
import javaapplication4.SqliteConnector;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JFrame;
public class res extends javax.swing.JFrame {
     Connection conn = null ;
    PreparedStatement stmt = null;
    public res() {
        initComponents();
         conn=(Connection) SqliteConnector.ConnectorDB(); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtroom = new javax.swing.JTextField();
        btnbook = new javax.swing.JButton();
        btnnew = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reservation");

        jLabel1.setText("ID:");

        jLabel2.setText("Room Number:");

        txtroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtroomActionPerformed(evt);
            }
        });

        btnbook.setBackground(new java.awt.Color(255, 0, 0));
        btnbook.setText("Book");
        btnbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbookActionPerformed(evt);
            }
        });

        btnnew.setBackground(new java.awt.Color(255, 0, 0));
        btnnew.setText("New");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Cancel");

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Reservation");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/images (1).jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtroom, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnbook)
                        .addGap(48, 48, 48)
                        .addComponent(btnnew)
                        .addGap(38, 38, 38)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtroom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(btnnew)
                    .addComponent(btnbook))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("id");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtroomActionPerformed
       try {
String sql = "SELECT Count( reservation) FROM lab LEFT OUTER JOIN user ON lab.room_number = user.room_number AND ID =? ;";
         stmt = conn.prepareStatement(sql);
         stmt.setString(1, txtID.getText());
         stmt.setString(1, txtroom.getText()); 
        JFrame frame = new JFrame("InputDialog Example #1");
         Object[] options = {"Ok", "Cancel"};
        JOptionPane.showOptionDialog(frame,
        "Check database if seat is available then click Ok.\n" + " if no seat then click Cancel.",
        "Book Seats",
        JOptionPane.OK_CANCEL_OPTION,
        JOptionPane.INFORMATION_MESSAGE,
        null,options,options[0]);  
         stmt.execute();
    
         } catch (Exception e) {
          JOptionPane.showMessageDialog(null,e);
         } 
    }//GEN-LAST:event_txtroomActionPerformed

    private void btnbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbookActionPerformed
      
     String sql = "Insert into reserve (ID,room_number) values(?,? )"; 
     try {
      
      stmt = conn.prepareStatement(sql);
      
      stmt.setString(1, txtID.getText());
      
      stmt.setString(2, txtroom.getText());
      stmt.execute();
      JOptionPane.showMessageDialog(null,"Saved");
       } catch(Exception e ) {
      JOptionPane.showMessageDialog(null,e);
    }     
      
    }//GEN-LAST:event_btnbookActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
      user s = new user();
        s.setVisible(true);  
    }//GEN-LAST:event_btnnewActionPerformed
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(res.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new res().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbook;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtroom;
    // End of variables declaration//GEN-END:variables

   
        
    }

