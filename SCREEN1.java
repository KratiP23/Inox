
import java.awt.Color;
import java.awt.Dimension;
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author XII
 */
public class SCREEN1 extends javax.swing.JFrame {
int count=0;
    /**
     * Creates new form SCREEN1
     */

public void save(String screen,String bookdate,String timing,String moviename,String seat)
{

    
    try
{
   String scr=(String)jComboBox1.getSelectedItem();
 String bd=jTextField2.getText();
    String time=(String)jComboBox2.getSelectedItem();
 String mname=jLabel51.getText();
 
  // String seats=jLabel1.getText(); 
     JOptionPane.showMessageDialog(rootPane, seat);
     Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/inox","root","tiger");
    String sql="insert into seat values('"+scr+"','"+bd+"','"+time+"','"+mname+"','"+seat+"');";
    Statement stmt=con.createStatement();
    stmt.executeUpdate(sql);
    JOptionPane.showMessageDialog(null,"Record saved successfully");
}catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e);
}  
    
    
    
    
    
    
    
    
    
    

}


 public void book_seats(String s)
 {
 if(s.equals("A1"))
 {
 jLabel1.setBackground(Color.blue);    
jLabel1.setEnabled(false);
 }
 
 if(s.equals("A2"))
 {
 jLabel2.setBackground(Color.blue);    
jLabel2.setEnabled(false);
 }
 if(s.equals("A3"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
  if(s.equals("A4"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
  if(s.equals("A5"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
   if(s.equals("A6"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
   if(s.equals("A7"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 } 
   if(s.equals("A8"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 } 
   if(s.equals("A9"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 } 
   if(s.equals("A10"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 } 
    if(s.equals("A11"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
   
    if(s.equals("A12"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
    if(s.equals("A13"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
  
     if(s.equals("A14"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
    if(s.equals("A15"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
   if(s.equals("A16"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 } 
    if(s.equals("A17"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
   
    if(s.equals("A18"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
    if(s.equals("A19"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
   
    if(s.equals("A20"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
   if(s.equals("A21"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 } 
    if(s.equals("A22"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
    if(s.equals("A23"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
    if(s.equals("A24"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
    if(s.equals("A25"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
    if(s.equals("A26"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
    if(s.equals("A27"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
    if(s.equals("A28"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
    if(s.equals("A29"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
    if(s.equals("A30"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
    if(s.equals("A31"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
   
    if(s.equals("A32"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
    if(s.equals("A33"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
    if(s.equals("A34"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
    if(s.equals("A35"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
    if(s.equals("A36"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
   if(s.equals("A37"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }  
    if(s.equals("A38"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 } 
    if(s.equals("A39"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 } 
     if(s.equals("A40"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
     if(s.equals("A41"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
     if(s.equals("A42"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
   if(s.equals("A43"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }  
     if(s.equals("A44"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
   if(s.equals("A45"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }  
    
     if(s.equals("A46"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
    if(s.equals("A47"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 } 
   if(s.equals("A48"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }  
     if(s.equals("A49"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
     if(s.equals("A50"))
 {
 jLabel3.setBackground(Color.blue);    
jLabel3.setEnabled(false);
 }
    
    
    
    
    
    
    
    
    
    
    
    
    
 }

    public SCREEN1() {
        initComponents();
        
        setMinimumSize(new Dimension(300,400).getSize());
        this.setResizable(true);
setExtendedState(MAXIMIZED_BOTH);/*To see your application starts maximized!*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel52 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel58 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setText("A1");
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(74, 161, 20, 20);

        jLabel2.setBackground(new java.awt.Color(255, 153, 153));
        jLabel2.setText("A2");
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 161, 20, 20);

        jLabel3.setBackground(new java.awt.Color(255, 153, 153));
        jLabel3.setText("A3");
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(181, 165, 19, 14);

        jLabel4.setBackground(new java.awt.Color(255, 153, 153));
        jLabel4.setText("A4");
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(223, 165, 19, 14);

        jLabel5.setBackground(new java.awt.Color(255, 153, 153));
        jLabel5.setText("A5");
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(260, 165, 19, 14);

        jLabel6.setBackground(new java.awt.Color(255, 153, 153));
        jLabel6.setText("A6");
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(351, 165, 19, 14);

        jLabel7.setBackground(new java.awt.Color(255, 153, 153));
        jLabel7.setText("A7");
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(400, 165, 19, 14);

        jLabel8.setBackground(new java.awt.Color(255, 153, 153));
        jLabel8.setText("A8");
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8);
        jLabel8.setBounds(447, 165, 19, 14);

        jLabel9.setBackground(new java.awt.Color(255, 153, 153));
        jLabel9.setText("A9");
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9);
        jLabel9.setBounds(499, 165, 19, 14);

        jLabel10.setBackground(new java.awt.Color(255, 153, 153));
        jLabel10.setText("A10");
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10);
        jLabel10.setBounds(551, 165, 30, 14);

        jLabel11.setBackground(new java.awt.Color(255, 153, 153));
        jLabel11.setText("B1");
        jLabel11.setOpaque(true);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11);
        jLabel11.setBounds(75, 193, 19, 14);

        jLabel12.setBackground(new java.awt.Color(255, 153, 153));
        jLabel12.setText("B2");
        jLabel12.setOpaque(true);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12);
        jLabel12.setBounds(129, 193, 19, 14);

        jLabel13.setBackground(new java.awt.Color(255, 153, 153));
        jLabel13.setText("B3");
        jLabel13.setOpaque(true);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13);
        jLabel13.setBounds(181, 193, 19, 14);

        jLabel14.setBackground(new java.awt.Color(255, 153, 153));
        jLabel14.setText("B4");
        jLabel14.setOpaque(true);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel14);
        jLabel14.setBounds(224, 193, 19, 14);

        jLabel15.setBackground(new java.awt.Color(255, 153, 153));
        jLabel15.setText("B5");
        jLabel15.setOpaque(true);
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15);
        jLabel15.setBounds(261, 193, 19, 14);

        jLabel16.setBackground(new java.awt.Color(255, 153, 153));
        jLabel16.setText("B6");
        jLabel16.setOpaque(true);
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel16);
        jLabel16.setBounds(352, 193, 19, 14);

        jLabel17.setBackground(new java.awt.Color(255, 153, 153));
        jLabel17.setText("B7");
        jLabel17.setOpaque(true);
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel17);
        jLabel17.setBounds(401, 193, 19, 14);

        jLabel18.setBackground(new java.awt.Color(255, 153, 153));
        jLabel18.setText("B8");
        jLabel18.setOpaque(true);
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel18);
        jLabel18.setBounds(448, 193, 19, 14);

        jLabel19.setBackground(new java.awt.Color(255, 153, 153));
        jLabel19.setText("B9");
        jLabel19.setOpaque(true);
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel19);
        jLabel19.setBounds(500, 193, 19, 14);

        jLabel20.setBackground(new java.awt.Color(255, 153, 153));
        jLabel20.setText("B10");
        jLabel20.setOpaque(true);
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel20);
        jLabel20.setBounds(551, 193, 30, 14);

        jLabel21.setBackground(new java.awt.Color(255, 153, 153));
        jLabel21.setText("C1");
        jLabel21.setOpaque(true);
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel21);
        jLabel21.setBounds(75, 225, 19, 14);

        jLabel22.setBackground(new java.awt.Color(255, 153, 153));
        jLabel22.setText("C2");
        jLabel22.setOpaque(true);
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel22);
        jLabel22.setBounds(130, 225, 19, 14);

        jLabel23.setBackground(new java.awt.Color(255, 153, 153));
        jLabel23.setText("C3");
        jLabel23.setOpaque(true);
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel23);
        jLabel23.setBounds(181, 225, 19, 14);

        jLabel24.setBackground(new java.awt.Color(255, 153, 153));
        jLabel24.setText("C4");
        jLabel24.setOpaque(true);
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel24);
        jLabel24.setBounds(223, 225, 20, 14);

        jLabel25.setBackground(new java.awt.Color(255, 153, 153));
        jLabel25.setText("C5");
        jLabel25.setOpaque(true);
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel25);
        jLabel25.setBounds(261, 225, 19, 14);

        jLabel26.setBackground(new java.awt.Color(255, 153, 153));
        jLabel26.setText("C6");
        jLabel26.setOpaque(true);
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel26);
        jLabel26.setBounds(351, 225, 19, 14);

        jLabel27.setBackground(new java.awt.Color(255, 153, 153));
        jLabel27.setText("C7");
        jLabel27.setOpaque(true);
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel27);
        jLabel27.setBounds(400, 225, 19, 14);

        jLabel28.setBackground(new java.awt.Color(255, 153, 153));
        jLabel28.setText("C8");
        jLabel28.setOpaque(true);
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel28);
        jLabel28.setBounds(447, 225, 19, 14);

        jLabel29.setBackground(new java.awt.Color(255, 153, 153));
        jLabel29.setText("C9");
        jLabel29.setOpaque(true);
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel29);
        jLabel29.setBounds(499, 225, 19, 14);

        jLabel30.setBackground(new java.awt.Color(255, 153, 153));
        jLabel30.setText("C10");
        jLabel30.setOpaque(true);
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel30);
        jLabel30.setBounds(551, 225, 30, 14);

        jLabel31.setBackground(new java.awt.Color(255, 153, 153));
        jLabel31.setText("D1");
        jLabel31.setOpaque(true);
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel31);
        jLabel31.setBounds(75, 250, 19, 14);

        jLabel32.setBackground(new java.awt.Color(255, 153, 153));
        jLabel32.setText("D2");
        jLabel32.setOpaque(true);
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel32);
        jLabel32.setBounds(130, 250, 19, 14);

        jLabel33.setBackground(new java.awt.Color(255, 153, 153));
        jLabel33.setText("D3");
        jLabel33.setOpaque(true);
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel33);
        jLabel33.setBounds(181, 250, 19, 14);

        jLabel34.setBackground(new java.awt.Color(255, 153, 153));
        jLabel34.setText("D4");
        jLabel34.setOpaque(true);
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel34);
        jLabel34.setBounds(223, 250, 19, 14);

        jLabel35.setBackground(new java.awt.Color(255, 153, 153));
        jLabel35.setText("D5");
        jLabel35.setOpaque(true);
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel35);
        jLabel35.setBounds(261, 250, 19, 14);

        jLabel36.setBackground(new java.awt.Color(255, 153, 153));
        jLabel36.setText("D6");
        jLabel36.setOpaque(true);
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel36);
        jLabel36.setBounds(351, 250, 19, 14);

        jLabel37.setBackground(new java.awt.Color(255, 153, 153));
        jLabel37.setText("D7");
        jLabel37.setOpaque(true);
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel37);
        jLabel37.setBounds(400, 250, 19, 14);

        jLabel38.setBackground(new java.awt.Color(255, 153, 153));
        jLabel38.setText("D8");
        jLabel38.setOpaque(true);
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel38);
        jLabel38.setBounds(447, 250, 19, 14);

        jLabel39.setBackground(new java.awt.Color(255, 153, 153));
        jLabel39.setText("D9");
        jLabel39.setOpaque(true);
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel39MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel39);
        jLabel39.setBounds(499, 250, 19, 14);

        jLabel40.setBackground(new java.awt.Color(255, 153, 153));
        jLabel40.setText("D10");
        jLabel40.setOpaque(true);
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel40MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel40);
        jLabel40.setBounds(551, 250, 30, 14);

        jLabel41.setBackground(new java.awt.Color(255, 153, 153));
        jLabel41.setText("E1");
        jLabel41.setOpaque(true);
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel41MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel41);
        jLabel41.setBounds(75, 282, 19, 14);

        jLabel42.setBackground(new java.awt.Color(255, 153, 153));
        jLabel42.setText("E2");
        jLabel42.setOpaque(true);
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel42MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel42);
        jLabel42.setBounds(130, 282, 19, 14);

        jLabel43.setBackground(new java.awt.Color(255, 153, 153));
        jLabel43.setText("E3");
        jLabel43.setOpaque(true);
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel43MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel43);
        jLabel43.setBounds(181, 282, 15, 14);

        jLabel44.setBackground(new java.awt.Color(255, 153, 153));
        jLabel44.setText("E4");
        jLabel44.setOpaque(true);
        jLabel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel44MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel44);
        jLabel44.setBounds(223, 282, 19, 14);

        jLabel45.setBackground(new java.awt.Color(255, 153, 153));
        jLabel45.setText("E5");
        jLabel45.setOpaque(true);
        jLabel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel45MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel45);
        jLabel45.setBounds(260, 282, 19, 14);

        jLabel46.setBackground(new java.awt.Color(255, 153, 153));
        jLabel46.setText("E6");
        jLabel46.setOpaque(true);
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel46MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel46);
        jLabel46.setBounds(351, 282, 19, 14);

        jLabel47.setBackground(new java.awt.Color(255, 153, 153));
        jLabel47.setText("E7");
        jLabel47.setOpaque(true);
        jLabel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel47MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel47);
        jLabel47.setBounds(400, 282, 19, 14);

        jLabel48.setBackground(new java.awt.Color(255, 153, 153));
        jLabel48.setText("E8");
        jLabel48.setOpaque(true);
        jLabel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel48MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel48);
        jLabel48.setBounds(447, 282, 19, 14);

        jLabel49.setBackground(new java.awt.Color(255, 153, 153));
        jLabel49.setText("E9");
        jLabel49.setOpaque(true);
        jLabel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel49MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel49);
        jLabel49.setBounds(499, 282, 19, 14);

        jLabel50.setBackground(new java.awt.Color(255, 153, 153));
        jLabel50.setText("E10");
        jLabel50.setOpaque(true);
        jLabel50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel50MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel50);
        jLabel50.setBounds(551, 282, 30, 14);

        jLabel51.setText("MOVIE NAME");
        getContentPane().add(jLabel51);
        jLabel51.setBounds(290, 99, 152, 30);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(240, 10, 120, 20);

        jLabel52.setText("seats");
        getContentPane().add(jLabel52);
        jLabel52.setBounds(56, 140, 40, 14);

        jButton3.setText("CLICK TO BOOK TICKET");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(0, 10, 160, 23);

        jLabel53.setText("DATE");
        getContentPane().add(jLabel53);
        jLabel53.setBounds(382, 27, 40, 14);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(440, 24, 78, 20);

        jLabel54.setText("TIMINGS");
        getContentPane().add(jLabel54);
        jLabel54.setBounds(70, 79, 60, 14);

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(163, 76, 56, 20);

        jLabel55.setText("SCREEN");
        getContentPane().add(jLabel55);
        jLabel55.setBounds(180, 10, 50, 14);

        jLabel56.setText("FOR COUNTING");
        getContentPane().add(jLabel56);
        jLabel56.setBounds(120, 140, 100, 14);
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(440, 50, 91, 20);

        jButton1.setText("bill");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(298, 317, 45, 23);

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goo.jpg"))); // NOI18N
        jLabel58.setText("i");
        getContentPane().add(jLabel58);
        jLabel58.setBounds(-11, 2, 660, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
try
{
      Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/inox","root","tiger");
    String sql="select distinct screen from newmovie;";
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery(sql);
    jComboBox1.removeAllItems();
  while(rs.next())
  {
  jComboBox1.addItem(""+rs.getString(1));
  }
  // for date
    sql="select curdate();";
    rs=stmt.executeQuery(sql);
    if(rs.next())
  {
  jTextField2.setText(""+rs.getString(1));
  }
    // for timing
    String movie=jLabel51.getText();
      sql="select time from newmovie where moviename='"+movie+"';";
       rs=stmt.executeQuery(sql);
       jComboBox2.removeAllItems();;
    while(rs.next())
  {
  jComboBox2.addItem(""+rs.getString(1));
  }
 
}catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e);
}          // TODO add your handling code here:






    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
if(jLabel1.isEnabled()==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel1.setBackground(Color.blue);    
jLabel1.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel1.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);


}

// TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
    if(jLabel2.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
     jLabel2.setBackground(Color.blue);
jLabel2.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel2.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

} // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
if(jLabel3.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel3.setBackground(Color.blue);
jLabel3.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel3.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
if(jLabel4.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel4.setBackground(Color.blue);
jLabel4.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel4.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
if(jLabel5.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel5.setBackground(Color.blue);
jLabel5.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel5.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
if(jLabel6.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel6.setBackground(Color.blue);
jLabel6.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel6.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
if(jLabel7.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel7.setBackground(Color.blue);
jLabel7.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel7.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
if(jLabel8.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel8.setBackground(Color.blue);
jLabel8.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel8.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}    // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
if(jLabel9.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel9.setBackground(Color.blue);
jLabel9.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel9.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
if(jLabel10.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel10.setBackground(Color.blue);
jLabel10.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel10.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
if(jLabel11.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel11.setBackground(Color.blue);
jLabel11.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel11.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
if(jLabel12.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel12.setBackground(Color.blue);
jLabel12.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel12.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
if(jLabel13.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel13.setBackground(Color.blue);
jLabel13.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel13.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
if(jLabel14.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel14.setBackground(Color.blue);
jLabel14.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel14.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
if(jLabel15.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel15.setBackground(Color.blue);
jLabel15.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel15.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
if(jLabel16.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel16.setBackground(Color.blue);
jLabel16.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel16.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
if(jLabel17.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel17.setBackground(Color.blue);
jLabel17.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel17.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
if(jLabel18.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel18.setBackground(Color.blue);
jLabel18.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel18.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}      // TODO add your handling code here:
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
if(jLabel19.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel19.setBackground(Color.blue);
jLabel19.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel19.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}      // TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
if(jLabel20.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel20.setBackground(Color.blue);
jLabel20.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel20.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
if(jLabel21.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel21.setBackground(Color.blue);
jLabel21.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel21.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}     // TODO add your handling code here:
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
if(jLabel22.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel22.setBackground(Color.blue);
jLabel22.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel22.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}     // TODO add your handling code here:
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
if(jLabel23.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel23.setBackground(Color.blue);
jLabel23.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel23.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}     // TODO add your handling code here:
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
if(jLabel24.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel24.setBackground(Color.blue);
jLabel24.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel24.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
if(jLabel25.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel25.setBackground(Color.blue);
jLabel25.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel25.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
if(jLabel26.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel26.setBackground(Color.blue);
jLabel26.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel26.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}      // TODO add your handling code here:
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
if(jLabel27.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel27.setBackground(Color.blue);
jLabel27.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel27.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}      // TODO add your handling code here:
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
if(jLabel28.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel28.setBackground(Color.blue);
jLabel28.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel28.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
if(jLabel29.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel29.setBackground(Color.blue);
jLabel29.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel29.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
if(jLabel30.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel30.setBackground(Color.blue);
jLabel30.setEnabled(false);
count=count+1;
jLabel5.setText(""+count);
String seat=jLabel30.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
if(jLabel3.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel31.setBackground(Color.blue);
jLabel31.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel31.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
if(jLabel32.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel32.setBackground(Color.blue);
jLabel32.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel32.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}           // TODO add your handling code here:
    }//GEN-LAST:event_jLabel32MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

          // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
if(jLabel34.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel34.setBackground(Color.blue);
jLabel34.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel34.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}     // TODO add your handling code here:
    }//GEN-LAST:event_jLabel34MouseClicked

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
if(jLabel35.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel35.setBackground(Color.blue);
jLabel35.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel35.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel35MouseClicked

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
if(jLabel36.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel36.setBackground(Color.blue);
jLabel36.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel36.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}            // TODO add your handling code here:
    }//GEN-LAST:event_jLabel36MouseClicked

    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked
if(jLabel37.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel37.setBackground(Color.blue);
jLabel37.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel37.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}            // TODO add your handling code here:
    }//GEN-LAST:event_jLabel37MouseClicked

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
if(jLabel38.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel38.setBackground(Color.blue);
jLabel38.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel38.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}          // TODO add your handling code here:
    }//GEN-LAST:event_jLabel38MouseClicked

    private void jLabel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseClicked
if(jLabel39.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel39.setBackground(Color.blue);
jLabel39.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel39.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}           // TODO add your handling code here:
    }//GEN-LAST:event_jLabel39MouseClicked

    private void jLabel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseClicked
if(jLabel40.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel40.setBackground(Color.blue);
jLabel40.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel40.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}           // TODO add your handling code here:
    }//GEN-LAST:event_jLabel40MouseClicked

    private void jLabel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseClicked
if(jLabel41.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel41.setBackground(Color.blue);
jLabel41.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel41.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}      // TODO add your handling code here:
    }//GEN-LAST:event_jLabel41MouseClicked

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseClicked
if(jLabel42.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel42.setBackground(Color.blue);
jLabel42.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel42.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}    // TODO add your handling code here:
    }//GEN-LAST:event_jLabel42MouseClicked

    private void jLabel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseClicked
if(jLabel43.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel43.setBackground(Color.blue);
jLabel43.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel43.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel43MouseClicked

    private void jLabel44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel44MouseClicked
if(jLabel44.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel44.setBackground(Color.blue);
jLabel44.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel44.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel44MouseClicked

    private void jLabel45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseClicked
if(jLabel45.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel45.setBackground(Color.blue);
jLabel45.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel45.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel45MouseClicked

    private void jLabel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseClicked
if(jLabel46.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel46.setBackground(Color.blue);
jLabel46.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel46.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel46MouseClicked

    private void jLabel47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseClicked
if(jLabel47.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel47.setBackground(Color.blue);
jLabel47.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel47.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}     // TODO add your handling code here:
    }//GEN-LAST:event_jLabel47MouseClicked

    private void jLabel48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseClicked
if(jLabel48.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel48.setBackground(Color.blue);
jLabel48.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel48.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel48MouseClicked

    private void jLabel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseClicked
if(jLabel49.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel49.setBackground(Color.blue);
jLabel49.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel49.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}     // TODO add your handling code here:
    }//GEN-LAST:event_jLabel49MouseClicked

    private void jLabel50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseClicked
if(jLabel50.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel50.setBackground(Color.blue);
jLabel50.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel50.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);

}   // TODO add your handling code here:
    }//GEN-LAST:event_jLabel50MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
// movie name
try
{
 
   String scr=(String)jComboBox1.getSelectedItem();
   String cdate=jTextField2.getText();

     Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/inox","root","tiger");
    String sql="select moviename from newmovie where screen='"+scr+"' and '"+cdate+"' >= releasingdate and '"+cdate+"'<=removingdate ;";
    Statement stmt=con.createStatement();
    
    ResultSet rs=stmt.executeQuery(sql);
    if(rs.next())
        jLabel51.setText(""+rs.getString(1));
     
    
    String sql1="select time from newmovie where screen='"+scr+"' and '"+cdate+"' >= releasingdate and '"+cdate+"'<=removingdate ;";
    rs=stmt.executeQuery(sql1);
    jComboBox2.removeAllItems();
    while(rs.next())
        jComboBox2.addItem(""+rs.getString(1));
}catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e);
}  
        
        

//booked ticket
    String scr=(String)jComboBox1.getSelectedItem();
String cdate =jTextField2.getText();
String ctime=(String)jComboBox2.getSelectedItem();
        
try
{
    
     Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/inox","root","tiger");
    String sql="select seats from bill where screen='"+scr+"' and  bkdATE='"+cdate+"' AND TIME='"+ctime+"';";
    Statement stmt=con.createStatement();
    
    ResultSet rs=stmt.executeQuery(sql);
    while(rs.next())
    {
   
    book_seats(rs.getString(1));
    } 
   
}catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e);
}  
    
        
// TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed


// TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
if(jLabel33.isEnabled( )==false)
{
JOptionPane.showMessageDialog(rootPane,"seat already booked");
}
else
{
    jLabel33.setBackground(Color.blue);
jLabel33.setEnabled(false);
count=count+1;
jLabel56.setText(""+count);
String seat=jLabel34.getText();
String screen=(String)jComboBox1.getSelectedItem();
String timing=(String)jComboBox2.getSelectedItem();
String moviename=jLabel51.getText();
String bookdate=jTextField2.getText();
save(screen,bookdate,timing,moviename,seat);
}        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel33MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 BILL A=new BILL();
A.setVisible(true); 
this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SCREEN1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SCREEN1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SCREEN1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SCREEN1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SCREEN1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
