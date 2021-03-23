/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import exceptions.QuantityNotValidException;
import files.AbstractFileReader;
import java.awt.event.KeyEvent;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import onlinepharmacy.Pharmacy;
import onlinepharmacy.Product;

/**
 *
 * @author Abdelrahman
 */
public class AdminProductControl extends javax.swing.JFrame {

    /**
     * Creates new form AdminProductControl
     */
    public AdminProductControl() {
        initComponents();
        this.jRadioButton1.setSelected(true);
        addRowtoTable();
        
    }
     public void Search(String name)  {
        Pharmacy pharmacy = new Pharmacy();
        AbstractFileReader reader = new AbstractFileReader();
        pharmacy.setProduct(reader.getProduct());
        String status = pharmacy.SearchProduct(name);
        System.out.print(name);
        JOptionPane.showMessageDialog(null, status+"  ", "Status",JOptionPane.PLAIN_MESSAGE);
        
        

    }
    public void validateQuantity(int quan)throws QuantityNotValidException {
        if(quan == 0)
            throw new QuantityNotValidException();
    }
    public void addCosmeticToTable() {
        Pharmacy pharmacy = new Pharmacy();
        Product newProduct = new Product();

        AbstractFileReader reader = new AbstractFileReader();
        pharmacy.setProduct(reader.getProduct());
        DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
        Object rowData[] = new Object[30]; 
        int rows = model.getRowCount();
        for(int i = rows - 1; i >=0; i--)
        {
            model.removeRow(i); 
        }
        for(Map.Entry<String,Product> entry:reader.getProduct().entrySet() ) {
            newProduct = entry.getValue();
            String categoryCheck = newProduct.getCategory();
            if(categoryCheck=="cosmetic"){
                newProduct = entry.getValue();
                rowData[0]= newProduct.getName();
                rowData[1]= newProduct.getProductCode();
                rowData[2]= newProduct.getCategory();
                rowData[3]= newProduct.getPrice();
                rowData[4]= newProduct.getQuantity();
                model.addRow(rowData);     

            }
        }
        jTable1.setDefaultEditor(Object.class, null);
}
    public void addDrugstoTable(){
        Pharmacy pharmacy = new Pharmacy();
        Product newProduct = new Product();
        
        AbstractFileReader reader = new AbstractFileReader();
        pharmacy.setProduct(reader.getProduct());
        DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
        Object rowData[] = new Object[30]; 
        int rows = model.getRowCount();       
        for(int i = rows - 1; i >=0; i--)
        {
            model.removeRow(i); 
        }
        for(Map.Entry<String,Product> entry:reader.getProduct().entrySet() ) {
            newProduct = entry.getValue();
            String categoryCheck = newProduct.getCategory();
            if(categoryCheck=="drug"){
                newProduct = entry.getValue();
                rowData[0]= newProduct.getName();
                rowData[1]= newProduct.getProductCode();
                rowData[2]= newProduct.getCategory();
                rowData[3]= newProduct.getPrice();
                rowData[4]= newProduct.getQuantity();
                model.addRow(rowData);
            }
        }
        jTable1.setDefaultEditor(Object.class, null);
    }
    public void addprescription(){
        Pharmacy pharmacy = new Pharmacy();
        Product newProduct = new Product();
        
        AbstractFileReader reader = new AbstractFileReader();
        pharmacy.setProduct(reader.getProduct());
        DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
        Object rowData[] = new Object[30]; 
        int rows = model.getRowCount();       
        for(int i = rows - 1; i >=0; i--)
        {
            model.removeRow(i); 
        } 
        for(Map.Entry<String,Product> entry:reader.getProduct().entrySet() ) {
            newProduct = entry.getValue();
            String categoryCheck = newProduct.getCategory();
            if(categoryCheck=="prescription"){
                newProduct = entry.getValue();
                rowData[0]= newProduct.getName();
                rowData[1]= newProduct.getProductCode();
                rowData[2]= newProduct.getCategory();
                rowData[3]= newProduct.getPrice();
                rowData[4]= newProduct.getQuantity();
                model.addRow(rowData);
            }
        }
        jTable1.setDefaultEditor(Object.class, null);
    }
    public void addRowtoTable(){
        Pharmacy pharmacy = new Pharmacy();
        Product newProduct = new Product();
        
        AbstractFileReader reader = new AbstractFileReader();
        pharmacy.setProduct(reader.getProduct());
        DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
        Object rowData[] = new Object[30];
        int rows = model.getRowCount(); 
        for(int i = rows - 1; i >=0; i--)
        {
            model.removeRow(i); 
        }
        for(Map.Entry<String,Product> entry:reader.getProduct().entrySet() ) {
                newProduct = entry.getValue();
                rowData[0]= newProduct.getName();
                rowData[1]= newProduct.getProductCode();
                rowData[2]= newProduct.getCategory();
                rowData[3]= newProduct.getPrice();
                rowData[4]= newProduct.getQuantity();
                model.addRow(rowData);
        }
        jTable1.setDefaultEditor(Object.class, null);
    }
    public void under10Units(){
        Pharmacy pharmacy = new Pharmacy();
        Product newProduct = new Product();
        
        AbstractFileReader reader = new AbstractFileReader();
        pharmacy.setProduct(reader.getProduct());
        DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
        Object rowData[] = new Object[30];
        int rows = model.getRowCount(); 
        for(int i = rows - 1; i >=0; i--)
        {
            model.removeRow(i); 
        }
        for(Map.Entry<String,Product> entry:reader.getProduct().entrySet() ) {
            newProduct = entry.getValue();
            String categoryCheck = newProduct.getCategory();
            if(newProduct.getQuantity()<10){
                newProduct = entry.getValue();
                rowData[0]= newProduct.getName();
                rowData[1]= newProduct.getProductCode();
                rowData[2]= newProduct.getCategory();
                rowData[3]= newProduct.getPrice();
                rowData[4]= newProduct.getQuantity();
                model.addRow(rowData);
                
            }
            jTable1.setDefaultEditor(Object.class, null);
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
        jDialog1 = new javax.swing.JDialog();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();

        jDialog1.setSize(new java.awt.Dimension(500, 500));

        jTextField2.setText("Name");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setText("Code");

        jTextField4.setText("Category");

        jTextField5.setText("Price");

        jTextField6.setText("Quantity");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setText("Code");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 204));
        jLabel5.setText("Category");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setText("Price");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 204));
        jLabel7.setText("Quantity");

        jButton4.setForeground(new java.awt.Color(0, 153, 204));
        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/mini.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 204));
        jLabel9.setText("Add Product");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6)))
                        .addGap(53, 53, 53)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField6)
                            .addComponent(jTextField5)
                            .addComponent(jTextField4)
                            .addComponent(jTextField3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel8))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(20, 20, 20)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(49, 49, 49)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/Webp.net-resizeimage.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add Product");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 153, 255));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Delete Product");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.setText("Search For Product");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(0, 153, 153));
        jRadioButton1.setText("All Products");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(0, 153, 153));
        jRadioButton2.setText("Cosmetic");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(0, 153, 153));
        jRadioButton3.setText("Off Shelf");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(0, 153, 153));
        jRadioButton4.setText("Prescription");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Code", "Category", "Price", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 34)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Admin Controls");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(0, 153, 153));
        jRadioButton5.setText("Product under 10 units");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 255));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jRadioButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton3)
                                    .addComponent(jRadioButton1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton4)
                                    .addComponent(jRadioButton2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(43, 43, 43))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4))
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.jDialog1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
             int SelectRow = this.jTable1.getSelectedRow();
            model.removeRow(SelectRow);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error:You did'nt Select a row","Inane error",JOptionPane.ERROR_MESSAGE);  
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        addRowtoTable();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        this.addCosmeticToTable();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
         addDrugstoTable();
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        this.addprescription();
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        this.under10Units();
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       new AdminOperation().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String name = this.jTextField2.getText();
        String code = this.jTextField3.getText();
        String category = this.jTextField4.getText();
        String price = this.jTextField5.getText();
        String quan = this.jTextField6.getText();
        DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
        Object rowData[] = new Object[6];
        rowData[0] = name;
        rowData[1] = code;
        rowData[2] = category;
        rowData[3] = price;
        rowData[4] = quan;
        Integer q = Integer.valueOf(quan);
        try{
            this.validateQuantity(q);
        }catch(QuantityNotValidException e){
            JOptionPane.showMessageDialog(null,e.getMessage()+" ","Inane error",JOptionPane.ERROR_MESSAGE);
        }
        model.addRow(rowData);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          String Status = this.jTextField1.getText();
          Search(Status);
         }
    }//GEN-LAST:event_jTextField1KeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
