package Interface;

import java.sql.ResultSet;
import java.sql.SQLException;
import Proccess.LoaiSP;//Lớp LoaiSP trong Proccess đã thực hiện
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class frmDanhMucLoaiSP extends javax.swing.JFrame {

    private final LoaiSP lsp = new LoaiSP();
    private boolean cothem = true;
    private final DefaultTableModel tableModel = new DefaultTableModel();
//Ham do du lieu vao tableModel

    public void ShowData() throws SQLException {
        ResultSet result = lsp.ShowLoaiSP();
        try {
            while (result.next()) { // nếu còn đọc tiếp được một dòng dữ liệu
                String rows[] = new String[2];
                rows[0] = result.getString(1); // lấy dữ liệu tại cột số 1 (ứng với mã hàng)
                rows[1] = result.getString(2); // lấy dữ liệu tai cột số 2 ứng với tên hàng
                tableModel.addRow(rows); // đưa dòng dữ liệu vào tableModel
                //mỗi lần có sự thay đổi dữ liệu ở tableModel thì Jtable sẽ tự động update
            }
        } catch (SQLException e) {
        }
    }
    //Ham xoa du lieu trong tableModel

    public void ClearData() throws SQLException {
        //Lay chi so dong cuoi cung
        int n = tableModel.getRowCount() - 1;
        for (int i = n; i >= 0; i--) {
            tableModel.removeRow(i);//Remove tung dong
        }
    }
    //Ham xoa cac TextField

    private void setNull() {
        //Xoa trang cac JtextField
        this.txtMaLoai.setText(null);
        this.txtTenLoai.setText(null);
        this.txtMaLoai.requestFocus();
    }
    //Ham khoa cac TextField

    private void setKhoa(boolean a) {
        //Khoa hoac mo khoa cho Cac JTextField
        this.txtTenLoai.setEnabled(!a);
        this.txtMaLoai.setEnabled(!a);
    }
    //Ham khoa cac Button

    private void setButton(boolean a) {
        //Vo hieu hoac co hieu luc cho cac JButton
        this.btnthem.setEnabled(a);
        this.btnxoa.setEnabled(a);
        this.btnsua.setEnabled(a);
        this.btnluu.setEnabled(!a);
        this.btnkluu.setEnabled(!a);
        this.btnthoat.setEnabled(a);
    }

    public frmDanhMucLoaiSP() throws SQLException {
        initComponents(); // Khởi tạo các components trên JFrame
        String[] colsName = {"Mã Loai", "Tên loai"};
        // đặt tiêu đề cột cho tableModel
        tableModel.setColumnIdentifiers(colsName);
        // kết nối jtable với tableModel
        tbLSanPham.setModel(tableModel);
        //gọi hàm ShowData để đưa dữ liệu vào tableModel
        ShowData();
        //goi Ham xoa trang cac TextField
        setNull();
        //Goi ham Khoa cac TextField
        setKhoa(true);
        //Goi vo hieu 2 button Luu, K.Luu. Mo khoa 4 button con lao
        setButton(true);
    }
    //Code tu sinh khi thiet ke giao dien va cac code khac ở đây…….

    public static void main(String args[]) throws SQLException {
        frmDanhMucLoaiSP f = new frmDanhMucLoaiSP();
        f.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnthem = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnluu = new javax.swing.JButton();
        btnkluu = new javax.swing.JButton();
        btnthoat = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbLSanPham = new javax.swing.JTable();
        txtMaLoai = new javax.swing.JTextField();
        txtTenLoai = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("DANH MỤC LOẠI SẢN PHẨM ");

        jLabel2.setText("Mã Loại: ");

        jLabel3.setText("Tên Loại: ");

        btnthem.setBackground(new java.awt.Color(222, 222, 222));
        btnthem.setText("Thêm");
        btnthem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnthemMouseClicked(evt);
            }
        });

        btnxoa.setText("Xóa");
        btnxoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnxoaMouseClicked(evt);
            }
        });
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnsua.setText("Sửa");
        btnsua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsuaMouseClicked(evt);
            }
        });

        btnluu.setText("Lưu");
        btnluu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnluuMouseClicked(evt);
            }
        });

        btnkluu.setText("K.Lưu");
        btnkluu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnkluuMouseClicked(evt);
            }
        });

        btnthoat.setText("Thoát");
        btnthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthoatActionPerformed(evt);
            }
        });

        tbLSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã loại", "Tên loại"
            }
        ));
        tbLSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbLSanPhamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbLSanPham);

        txtMaLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaLoaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnthem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnxoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnsua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnluu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnkluu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnthoat))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthem)
                    .addComponent(btnxoa)
                    .addComponent(btnsua)
                    .addComponent(btnluu)
                    .addComponent(btnkluu)
                    .addComponent(btnthoat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
    }//GEN-LAST:event_btnxoaActionPerformed

    private void tbLSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLSanPhamMouseClicked
        //Hien thi du lieu len cac JTextField khi Click chuot vao JTable
        try {
            //Lay chi so dong dang chon
            int row = this.tbLSanPham.getSelectedRow();
            String ml = (this.tbLSanPham.getModel().getValueAt(row, 0)).toString();
            ResultSet rs = lsp.ShowLoaiSP(ml);//Goi ham lay du lieu theo ma loai
            if (rs.next())//Neu co du lieu
            {
                this.txtMaLoai.setText(rs.getString("Maloai"));
                this.txtTenLoai.setText(rs.getString("Tenloai"));
            }
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_tbLSanPhamMouseClicked

    private void btnthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthoatActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnthoatActionPerformed

    private void btnxoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnxoaMouseClicked
        String ml = txtMaLoai.getText();
        try {
            if (ml.length() == 0) {
                JOptionPane.showMessageDialog(null, "Chon 1 loai SP de xoa",
                        "Thong bao", 1);
            } else {
                if (JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa " + ml + " này hay không? ", "  Thông báo", 2) == 0) {
                    lsp.DeleteData(ml);//goi ham xoa du lieu theo ma loai
                    ClearData();//Xoa du lieu trong tableModel
                    ShowData();//Do du lieu vao table Model
                    setNull();//Xoa trang Textfield
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Xóa thất bại", "Thong bao", 1);
        }
    }//GEN-LAST:event_btnxoaMouseClicked

    private void btnsuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsuaMouseClicked
        String ml = txtMaLoai.getText();
        if (ml.length() == 0) //Chua chon Ma loai
        {
            JOptionPane.showMessageDialog(null, "Vui long chon loi can sua", " Thong bao", 1);
        } else {
            setKhoa(false);//Mo khoa cac TextField
            this.txtMaLoai.enable(false);
            setButton(false); //Khoa cac Button
            cothem = false; //Gan cothem=false de ghi nhan trang thai la sua
        }
    }//GEN-LAST:event_btnsuaMouseClicked

    private void btnthemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnthemMouseClicked
        setNull();//Xoa trang TextField
        setKhoa(false);//Mo khoa TextField
        setButton(false);//Goi ham khoa cac Button
        cothem = true;//Gan cothem = true de ghi nhan trang thai them moi
    }//GEN-LAST:event_btnthemMouseClicked

    private void btnluuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnluuMouseClicked
        String ml = txtMaLoai.getText();
        String tl = txtTenLoai.getText();
        if (ml.length() == 0 || tl.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Vui long nhap Ma loai va ten loai", "Thong bao", 1);
        } else if (ml.length() > 2 || tl.length() > 30) {
            JOptionPane.showMessageDialog(null,
                    "Ma loai chi 2 ky tu, ten loai la 20", "Thong bao", 1);
        } else {
            try {
                if (cothem == true) //Luu cho tthem moi
                {
                    lsp.InsertData(ml, tl);
                } else //Luu cho sua
                {
                    lsp.EditData(ml, tl);
                }
                ClearData(); //goi ham xoa du lieu tron tableModel
                ShowData(); //Do lai du lieu vao Table Model
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Cap nhat that bai",
                        "Thong bao", 1);
            }
            setKhoa(false);
            setButton(true);
        }

    }//GEN-LAST:event_btnluuMouseClicked

    private void btnkluuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkluuMouseClicked
        setNull();
        setKhoa(true);
        setButton(true);

    }//GEN-LAST:event_btnkluuMouseClicked

    private void txtMaLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaLoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaLoaiActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnkluu;
    private javax.swing.JButton btnluu;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnthoat;
    private javax.swing.JButton btnxoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbLSanPham;
    private javax.swing.JTextField txtMaLoai;
    private javax.swing.JTextField txtTenLoai;
    // End of variables declaration//GEN-END:variables
}
