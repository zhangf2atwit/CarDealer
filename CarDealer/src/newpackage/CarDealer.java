package newpackage;


import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CarDealer extends javax.swing.JFrame {

    public CarDealer() {
        initComponents();
        connect();
    }

    Connection con;
    PreparedStatement pre;

    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/car_dealer", "root", "");
        } catch (ClassNotFoundException ex) {

            Logger.getLogger(CarDealer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CarDealer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void print() {
        Cars car = new Cars();
        car.setRegister_id(Integer.parseInt(jTextField_id.getText()));
        car.setBrand(jTextField_brand.getText());
        car.setModel(jTextField_model.getText());
        car.setColor(jTextField_color.getText());
        car.setNum_seats(Integer.parseInt(jTextField_seat.getText()));
        car.setPrice(Double.parseDouble(jTextField_price.getText()));
        car.setBrandNew(jTextField_new.getText().charAt(0));

        // jText_info.setText(car.toString());
        VipService user1 = new VipService(Integer.parseInt(jTextField_id.getText()), jTextField_brand.getText(), jTextField_model.getText(),
                jTextField_color.getText(), Integer.parseInt(jTextField_seat.getText()), Double.parseDouble(jTextField_price.getText()), jTextField_new.getText().charAt(0),
                Double.parseDouble(jTextField_tax.getText()), Double.parseDouble(jTextField_discount.getText()));

        user1.setTaxRate(Double.parseDouble(jTextField_tax.getText()));
        user1.setDiscount(Double.parseDouble(jTextField_discount.getText()));

        jText_info.setText(car.toString() + user1.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_name = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_id = new javax.swing.JLabel();
        jLabel_brand = new javax.swing.JLabel();
        jLabel_price = new javax.swing.JLabel();
        jLabel_color = new javax.swing.JLabel();
        jLabel_seat = new javax.swing.JLabel();
        jLabel_model = new javax.swing.JLabel();
        jLabel_new = new javax.swing.JLabel();
        jTextField_id = new javax.swing.JTextField();
        jTextField_model = new javax.swing.JTextField();
        jTextField_brand = new javax.swing.JTextField();
        jTextField_price = new javax.swing.JTextField();
        jTextField_seat = new javax.swing.JTextField();
        jTextField_new = new javax.swing.JTextField();
        jTextField_color = new javax.swing.JTextField();
        jButton_save = new javax.swing.JButton();
        jButton_delete = new javax.swing.JButton();
        jPanel_toStr = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jText_info = new javax.swing.JTextArea();
        jLabel_discount = new javax.swing.JLabel();
        jLabel_seat2 = new javax.swing.JLabel();
        jTextField_discount = new javax.swing.JTextField();
        jLabel_seat3 = new javax.swing.JLabel();
        jTextField_tax = new javax.swing.JTextField();
        jTextField_search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_name.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        label_name.setForeground(new java.awt.Color(102, 102, 255));
        label_name.setText("Worcester Car Dealer  ");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_id.setText("Redister ID");

        jLabel_brand.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_brand.setText("Brand");

        jLabel_price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_price.setText("Price");

        jLabel_color.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_color.setText("Color");

        jLabel_seat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_seat.setText("Number of seats");

        jLabel_model.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_model.setText("Model");

        jLabel_new.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_new.setText("Brand New('y' or 'n')");

        jTextField_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_id.setForeground(new java.awt.Color(51, 51, 255));
        jTextField_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_idActionPerformed(evt);
            }
        });

        jTextField_model.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_model.setForeground(new java.awt.Color(51, 51, 255));

        jTextField_brand.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_brand.setForeground(new java.awt.Color(51, 51, 255));

        jTextField_price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_price.setForeground(new java.awt.Color(51, 51, 255));

        jTextField_seat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_seat.setForeground(new java.awt.Color(51, 51, 255));

        jTextField_new.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_new.setForeground(new java.awt.Color(51, 51, 255));

        jTextField_color.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_color.setForeground(new java.awt.Color(51, 51, 255));

        jButton_save.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton_save.setForeground(new java.awt.Color(51, 51, 255));
        jButton_save.setText("Save");
        jButton_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_saveActionPerformed(evt);
            }
        });

        jButton_delete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton_delete.setForeground(new java.awt.Color(51, 51, 255));
        jButton_delete.setText("Delete");
        jButton_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deleteActionPerformed(evt);
            }
        });

        jPanel_toStr.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jText_info.setColumns(20);
        jText_info.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jText_info.setRows(5);
        jScrollPane1.setViewportView(jText_info);

        javax.swing.GroupLayout jPanel_toStrLayout = new javax.swing.GroupLayout(jPanel_toStr);
        jPanel_toStr.setLayout(jPanel_toStrLayout);
        jPanel_toStrLayout.setHorizontalGroup(
            jPanel_toStrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_toStrLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel_toStrLayout.setVerticalGroup(
            jPanel_toStrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_toStrLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jLabel_discount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_discount.setText("Discount");

        jLabel_seat2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_seat2.setText("Tax");

        jTextField_discount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_discount.setForeground(new java.awt.Color(51, 51, 255));

        jLabel_seat3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_seat3.setText("VIP calculator :");

        jTextField_tax.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_tax.setForeground(new java.awt.Color(51, 51, 255));

        jTextField_search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_searchActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_model, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_brand, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(233, 233, 233))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_price, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_color, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_price, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_model, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_brand, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_id, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_discount, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jTextField_discount, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_seat2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(jTextField_tax, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(58, 58, 58))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_color, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_new, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_seat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_seat, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_new, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton_delete)
                                                .addGap(92, 92, 92)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jButton_save, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(73, 73, 73))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(37, 37, 37))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel_seat3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jTextField_search, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addComponent(jPanel_toStr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel_id, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel_brand, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_model, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_seat3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel_discount, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel_seat2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_tax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_color, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel_price, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_save)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jButton_delete)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel_seat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_seat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel_new, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_new, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jTextField_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel_toStr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(label_name, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(label_name, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_idActionPerformed

    private void jButton_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_saveActionPerformed
        // create a new object
        Cars car = new Cars();
        car.setRegister_id(Integer.parseInt(jTextField_id.getText()));
        car.setBrand(jTextField_brand.getText());
        car.setModel(jTextField_model.getText());
        car.setColor(jTextField_color.getText());
        car.setNum_seats(Integer.parseInt(jTextField_seat.getText()));
        car.setPrice(Double.parseDouble(jTextField_price.getText()));
        car.setBrandNew(jTextField_new.getText().charAt(0));

        System.out.println(car.toString());

        VipService user1 = new VipService();
        user1.setTaxRate(Double.parseDouble(jTextField_tax.getText()));
        user1.setDiscount(Double.parseDouble(jTextField_discount.getText()));
        System.out.println(user1.toString());

        try {
            pre = con.prepareStatement("insert into cars(register_id,brand,model,color,num_seats,price,brand_new) values (?,?,?,?,?,?,?)");
            car.setRegister_id(Integer.parseInt(jTextField_id.getText()));   // int
            pre.setString(2, car.getBrand());      // String
            pre.setString(3, car.getModel());      // String
            pre.setString(4, car.getColor());      // String
            pre.setInt(5, car.getNum_seats());     // int
            pre.setDouble(6, car.getPrice());      // double
            pre.setString(7, String.valueOf(car.getBrandNew()));  // char

            //System.out.println("deBug");          
            int count = pre.executeUpdate();       // for count the update          
            if (count == 1) {
                print();                           // calling print function, print it on the teext view

                JOptionPane.showMessageDialog(this, "Recored Added.........");
                System.out.println("added all the infomation.");
            } else {
                JOptionPane.showMessageDialog(this, "Recored Failed !");
            }
        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_jButton_saveActionPerformed

    private void jButton_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deleteActionPerformed

        connect();   // make sure the data is connected       
        String register_id = "delete from cars where register_id = ?";
        try {
            PreparedStatement pstmt = con.prepareStatement(register_id);
            pstmt.setInt(1, Integer.parseInt(jTextField_id.getText()));
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record deleted successfully ! ");
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(CarDealer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton_deleteActionPerformed

    private void jTextField_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_searchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            
        
        
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
                if ("metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CarDealer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarDealer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarDealer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarDealer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarDealer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_delete;
    private javax.swing.JButton jButton_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_brand;
    private javax.swing.JLabel jLabel_color;
    private javax.swing.JLabel jLabel_discount;
    private javax.swing.JLabel jLabel_id;
    private javax.swing.JLabel jLabel_model;
    private javax.swing.JLabel jLabel_new;
    private javax.swing.JLabel jLabel_price;
    private javax.swing.JLabel jLabel_seat;
    private javax.swing.JLabel jLabel_seat2;
    private javax.swing.JLabel jLabel_seat3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_toStr;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField_brand;
    private javax.swing.JTextField jTextField_color;
    private javax.swing.JTextField jTextField_discount;
    private javax.swing.JTextField jTextField_id;
    private javax.swing.JTextField jTextField_model;
    private javax.swing.JTextField jTextField_new;
    private javax.swing.JTextField jTextField_price;
    private javax.swing.JTextField jTextField_search;
    private javax.swing.JTextField jTextField_seat;
    private javax.swing.JTextField jTextField_tax;
    private javax.swing.JTextArea jText_info;
    private javax.swing.JLabel label_name;
    // End of variables declaration//GEN-END:variables
}
