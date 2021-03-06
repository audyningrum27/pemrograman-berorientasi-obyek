package tugas13;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author audy
 */
public class MainView extends javax.swing.JFrame {
    private final MainService MainService;
    private MakananTableModel MakananTableModel;
    private ArrayList<Makanan> daftarMkn;
    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
        MainService = new MainService();
        getMakanan();
    }
    
    private void getMakanan() {
        daftarMkn = MainService.getAll();
        MakananTableModel = new MakananTableModel(daftarMkn);
        MakananTable.setModel(MakananTableModel);
    }
    
    private void insertMakanan(Makanan food) {
        MainService.insert(food);
        getMakanan();
        clearForm();
    }
    
    private void clearForm() {
        namaField.setText("");
        jenisComboBox.setSelectedIndex(0);
        ratingBtnGroup.clearSelection();
        kaloriSpinner.setValue(0);
    }
    
    private void searchMakanan(String kataCari) {
        daftarMkn = MainService.getAll(kataCari);
        MakananTableModel = new MakananTableModel(daftarMkn);
        MakananTable.setModel(MakananTableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ratingBtnGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        namaLabel = new javax.swing.JLabel();
        namaField = new javax.swing.JTextField();
        jenisLabel = new javax.swing.JLabel();
        jenisComboBox = new javax.swing.JComboBox<>();
        ratingLabel = new javax.swing.JLabel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        kaloriLabel = new javax.swing.JLabel();
        kaloriSpinner = new javax.swing.JSpinner();
        saveBtn = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        detailBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MakananTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(515, 700));

        jPanel1.setBackground(new java.awt.Color(240, 240, 240));
        jPanel1.setForeground(new java.awt.Color(60, 63, 65));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 63, 65));
        jLabel1.setText("MAKANAN FAVORIT");

        namaLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        namaLabel.setForeground(new java.awt.Color(60, 63, 65));
        namaLabel.setText("Nama Makanan");

        namaField.setBackground(new java.awt.Color(255, 255, 255));
        namaField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        namaField.setForeground(new java.awt.Color(60, 63, 65));

        jenisLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jenisLabel.setForeground(new java.awt.Color(60, 63, 65));
        jenisLabel.setText("Jenis Makanan");

        jenisComboBox.setBackground(new java.awt.Color(187, 187, 187));
        jenisComboBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jenisComboBox.setForeground(new java.awt.Color(60, 63, 65));
        jenisComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Minuman", "Cemilan" }));

        ratingLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ratingLabel.setForeground(new java.awt.Color(60, 63, 65));
        ratingLabel.setText("Rating Makanan");

        ratingBtnGroup.add(rb1);
        rb1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rb1.setForeground(new java.awt.Color(60, 63, 65));
        rb1.setText("1");

        ratingBtnGroup.add(rb2);
        rb2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rb2.setForeground(new java.awt.Color(60, 63, 65));
        rb2.setText("2");

        ratingBtnGroup.add(rb3);
        rb3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rb3.setForeground(new java.awt.Color(60, 63, 65));
        rb3.setText("3");

        kaloriLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        kaloriLabel.setForeground(new java.awt.Color(60, 63, 65));
        kaloriLabel.setText("Kalori Makanan");

        kaloriSpinner.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        saveBtn.setBackground(new java.awt.Color(42, 110, 244));
        saveBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(240, 240, 240));
        saveBtn.setText("SIMPAN");
        saveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveBtnMouseClicked(evt);
            }
        });

        searchField.setBackground(new java.awt.Color(255, 255, 255));
        searchField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        searchField.setForeground(new java.awt.Color(60, 63, 65));

        searchBtn.setText("Cari");
        searchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBtnMouseClicked(evt);
            }
        });

        detailBtn.setText("Detail");
        detailBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detailBtnMouseClicked(evt);
            }
        });

        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 225));
        jScrollPane1.setRequestFocusEnabled(false);

        MakananTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Nama Makanan", "Rating"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(MakananTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(detailBtn))
                    .addComponent(saveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jenisLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ratingLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kaloriLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(kaloriSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(rb1)
                                    .addGap(18, 18, 18)
                                    .addComponent(rb2)
                                    .addGap(18, 18, 18)
                                    .addComponent(rb3)))
                            .addComponent(jenisComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(namaField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)))))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaLabel))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jenisLabel)
                    .addComponent(jenisComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ratingLabel)
                    .addComponent(rb1)
                    .addComponent(rb2)
                    .addComponent(rb3))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kaloriSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kaloriLabel))
                .addGap(20, 20, 20)
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchField)
                    .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(detailBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseClicked
        String namaMakanan = namaField.getText();
        String jenisMakanan = jenisComboBox.getSelectedItem().toString();
        String ratingMakanan = "";
        int kaloriMakanan = Integer.parseInt(kaloriSpinner.getValue().toString());
        
        if(rb1.isSelected()){
            ratingMakanan = rb1.getText();
        }else if(rb2.isSelected()) {
            ratingMakanan = rb2.getText();
        }else if(rb3.isSelected()) {
            ratingMakanan = rb3.getText();
        }else {
            JOptionPane.showMessageDialog(null, "Semua form harus diisi", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (namaMakanan.equals("")) {
            JOptionPane.showMessageDialog(null, "Semua form harus diisi", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (kaloriMakanan <= 0) {
            JOptionPane.showMessageDialog(null, "Kalori tidak boleh minus", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        insertMakanan(new Makanan(0, namaMakanan, jenisMakanan, ratingMakanan, kaloriMakanan));
    }//GEN-LAST:event_saveBtnMouseClicked

    private void searchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnMouseClicked
        String kataCari = searchField.getText();
        searchMakanan(kataCari);
    }//GEN-LAST:event_searchBtnMouseClicked

    private void detailBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailBtnMouseClicked
        int index = MakananTable.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "Anda belum memilih makanan", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Makanan food = daftarMkn.get(index);
            String popupMessage = "Makanan: " + food.getNama() + "\nJenis: " + food.getJenis() + "\nrating: " + food.getRating() + "\nKalori: " + food.getKalori();
            JOptionPane.showMessageDialog(null, popupMessage, "Detail", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_detailBtnMouseClicked

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable MakananTable;
    private javax.swing.JButton detailBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jenisComboBox;
    private javax.swing.JLabel jenisLabel;
    private javax.swing.JLabel kaloriLabel;
    private javax.swing.JSpinner kaloriSpinner;
    private javax.swing.JTextField namaField;
    private javax.swing.JLabel namaLabel;
    private javax.swing.ButtonGroup ratingBtnGroup;
    private javax.swing.JLabel ratingLabel;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}
