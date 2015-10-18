/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FootballTeamManagement;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author jayakrishnan
 */
public class UserFace extends javax.swing.JFrame {

    dbhandler db = new dbhandler();
    String Uteam = null;
    int inboxcurrheight=10;

    /**
     * Creates new form UserFace
     */
    public UserFace(String U) {
       
            Uteam = U;
            initComponents();
            setbasedetails(U);
            
           
       inboxitem();
        
     
    }

    public UserFace() {
        initComponents();
        this.dispose();
        System.out.println("no Args Found!");
        new Login().setVisible(true);
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
        BudgetLabel = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jp3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT1 = new javax.swing.JTable();
        javax.swing.JButton jb = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        refresh2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jT2 = new javax.swing.JTable();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        LabelTeamName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User Home");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Log Out");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        BudgetLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BudgetLabel.setText("---");

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jp3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jp3Layout = new javax.swing.GroupLayout(jp3);
        jp3.setLayout(jp3Layout);
        jp3Layout.setHorizontalGroup(
            jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 653, Short.MAX_VALUE)
        );
        jp3Layout.setVerticalGroup(
            jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Inbox", jp3);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jT1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jT1);

        jb.setText("Refresh table");
        jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(392, Short.MAX_VALUE)
                .addComponent(jb)
                .addGap(164, 164, 164))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Current Squad", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        refresh2.setText("refresh");
        refresh2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh2ActionPerformed(evt);
            }
        });

        jT2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jT2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refresh2)
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(refresh2)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Transfer Listed", jPanel4);
        jTabbedPane1.addTab("Search", jTabbedPane2);

        LabelTeamName.setText("TeamName");

        jLabel3.setText("Logged as:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Budget:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelTeamName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(BudgetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addGap(19, 19, 19))
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(BudgetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelTeamName)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(674, 523));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActionPerformed
refreshjt1();   
    }//GEN-LAST:event_jbActionPerformed

    private void refresh2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh2ActionPerformed
refreshjt2(); 
     
    }//GEN-LAST:event_refresh2ActionPerformed

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
            java.util.logging.Logger.getLogger(UserFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserFace().setVisible(true);
            }
        });
    }

    public void setbasedetails(String U) {
        LabelTeamName.setText(U);
        BudgetLabel.setText("---");
        dbhandler db = new dbhandler();
        try {
            ResultSet r = db.st.executeQuery("SELECT currentbudget FROM team where teamname='" + U + "'");
            r.next();
            BudgetLabel.setText(r.getString(1));
        } catch (Exception e) {
            System.out.println(e);
        } 
 
 // refresh on load table 2 bye table
 refreshjt1();
        refreshjt2();

    }

    private void refresh_table_2(String sql, JTable jT) {
        try {

            int i = 0;

            ResultSet r = db.st.executeQuery(sql);
            jT.setModel(DbUtils.resultSetToTableModel(r));
            jT.getColumn("TRANSFER").setCellRenderer(new ButtonRenderer());
            jT.getColumn("TRANSFER").setCellEditor(new ButtonEditor(new JCheckBox()));

            r.close();
        } catch (Exception e) {
            System.out.println(e);

        }

    }

    private void addinboxitems(String msg,int Avalue) {
        JLabel Inbox1 = new JLabel();
        final JKButton Accept1 = new JKButton();
        final JKButton Decline1 = new JKButton();
        Accept1.JKintValue=Avalue;
        Decline1.JKintValue=Avalue;
        Inbox1.setText(msg);
        Accept1.setText("Accept");
        Decline1.setText("Decline ");
        Inbox1.setBounds(5, inboxcurrheight, 250, 20);
        Accept1.setBounds(300, inboxcurrheight, 80, 30);
        Decline1.setBounds(400, inboxcurrheight, 80, 30);
        jp3.add(Inbox1);
        jp3.add(Accept1); 
        jp3.add(Decline1); 
        inboxcurrheight+=50;
Accept1.addActionListener( new ActionListener()
{
    public void actionPerformed(ActionEvent e)
    {
//        System.out.println("Do Something, Accept1 Clicked"+Accept1.JKintValue);
        try{
             db.st.execute("delete from request where PLAYERID="+Accept1.JKintValue+" ");
      
       jp3.removeAll();
       inboxitem();
       jp3.revalidate();
       jp3.repaint();
        }catch(Exception ex){
            System.out.println("delete player request unsuccessful");
        } 
           
    }
});Decline1.addActionListener( new ActionListener()
{
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Do Something Decline1 Clicked"+Decline1.JKintValue);
    }
});
    }

    private void refreshjt2() {
      String sql = "SELECT  * FROM player where PLAYERTEAM not in '" + Uteam + "' and transfer='Remove' ";

        refresh_table_2(sql, jT2);

        DefaultTableModel model = (DefaultTableModel) jT2.getModel();

//        model.addColumn("Buy");
        jT2.getColumn("BUY").setCellRenderer(new ButtonRenderer());
        jT2.getColumn("BUY").setCellEditor(new ButtonEditor(new JCheckBox()));
        jT2.getColumnModel().getColumn(0).setWidth(0); 
        jT2.getColumnModel().getColumn(0).setMinWidth(0);
        jT2.getColumnModel().getColumn(0).setMaxWidth(0);
        jT2.removeColumn(jT2.getColumnModel().getColumn(5));  

    }

    private void refreshjt1() {
        String sql = "SELECT  * FROM player where playerteam in '" + Uteam + "'  ";

        refresh_table_2(sql, jT1);
        jT1.getColumnModel().getColumn(0).setWidth(0); 
        jT1.getColumnModel().getColumn(0).setMinWidth(0);
        jT1.getColumnModel().getColumn(0).setMaxWidth(0);
        jT1.removeColumn(jT1.getColumnModel().getColumn(2));
        jT1.removeColumn(jT1.getColumnModel().getColumn(5));

    }

    private void inboxitem() {
        
            int id;
            String from;
            String to;
            float amt;
  try {
              ResultSet r;
            r = db.st.executeQuery("SELECT * FROM request where CURRENT_TEAM='" + Uteam + "'");
        
             
            while( r.next()){
                id=r.getInt(1)  ;
                from=r.getString(3)  ;
                to=r.getString(2)  ;
                amt=r.getFloat(4)  ;
                System.out.println(id+" "+ from +" "+ to +" "+ amt);
                addinboxitems(from+" bids player '"+to+"'( "+id+" ) for  "+amt,id);
            }
                r.close();
                inboxcurrheight=10;
        } catch (SQLException ex) {
            Logger.getLogger(UserFace.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    class ButtonRenderer extends JButton implements TableCellRenderer {

        public ButtonRenderer() {
            setOpaque(true);
        }

        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            if (isSelected) {
                setForeground(table.getSelectionForeground());
                setBackground(table.getSelectionBackground());
            } else {
                setForeground(table.getForeground());
                setBackground(UIManager.getColor("Button.background"));
            }
            setText((value == null) ? "" : value.toString());
            return this;
        }
    }

    class ButtonEditor extends DefaultCellEditor {

        protected JButton button;

        private String label;

        private boolean isPushed;
        private int rowno = 0;//new 
        private int current_row_value = 0;//new 

        public ButtonEditor(JCheckBox checkBox) {
            super(checkBox);
            button = new JButton();
            button.setOpaque(true);
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    fireEditingStopped();
                }
            });
        }

        public Component getTableCellEditorComponent(JTable table, Object value,
                boolean isSelected, int row, int column) {
//      System.out.println("Hello");
//    if (isSelected) {
//      button.setForeground(table.getSelectionForeground());
//      button.setBackground(table.getSelectionBackground());
//    } else {
//      button.setForeground(table.getForeground());
//      button.setBackground(table.getBackground());
//    }
            label = (value == null) ? "" : value.toString();
            button.setText(label);
            isPushed = true;
            rowno = row;
            return button;
        }

        public Object getCellEditorValue() {
            String sqlupdatetransfer;
            if (isPushed && (!label.toLowerCase().equals("buy"))) {
                // 
                //  
                current_row_value = getprimarykeyvalue(rowno, jT1);
                System.out.println("label" + label);
                if (label.toLowerCase().equals("transfer")) {
                    sqlupdatetransfer = "update player set transfer='Remove' where playerid='" + current_row_value + "'";

                } else {
                    sqlupdatetransfer = "update player set transfer='Transfer' where playerid='" + current_row_value + "'";
                }
                try {
                    db.st.executeUpdate(sqlupdatetransfer);
                } catch (Exception ex) {

                }
//        JOptionPane.showMessageDialog(button, label + ": Ouch!"+current_row_value);//new 
                // System.out.println(label + ": Ouch!");

            } else if (isPushed && (label.toLowerCase().equals("buy"))) {

                current_row_value = getprimarykeyvalue(rowno, jT2);
                String sql = "SELECT * FROM player WHERE playerid=" + current_row_value + "  ";
                try {
                    ResultSet r = db.st.executeQuery(sql);
                    r.next();
                    int player_id = r.getInt(1);
                    String srcteam = r.getString(3);
                    String dsteam = Uteam;
                    int amt = 500;
                    System.out.println("  " + player_id + "  " + srcteam + "  " + dsteam + "  " + amt + "");
                    sql = "INSERT INTO request( PLAYERID,CURRENT_TEAM,OFFER_FROM,OFFERED_AMOUNT,STATUS)"
                            + " VALUES(" + player_id + ",'" + srcteam + "','" + dsteam + "'," + amt + ",1)";
                    db.st.execute(sql);
                    System.out.println("  " + player_id + "  " + srcteam + "  " + dsteam + "  " + amt + "");
                } catch (Exception e) {

                }

            }

            isPushed = false;

            return new String(label);
        }

        public boolean stopCellEditing() {
            isPushed = false;
            return super.stopCellEditing();
        }

        protected void fireEditingStopped() {
            super.fireEditingStopped();
        }

        private int getprimarykeyvalue(int rowno, JTable jT) {

            Object data = (Object) jT.getValueAt(rowno, 0);
            int x;

            String toString = data.toString();
            return Integer.parseInt(toString);

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BudgetLabel;
    private javax.swing.JLabel LabelTeamName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jT1;
    private javax.swing.JTable jT2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPanel jp3;
    private javax.swing.JButton refresh2;
    // End of variables declaration//GEN-END:variables

}
