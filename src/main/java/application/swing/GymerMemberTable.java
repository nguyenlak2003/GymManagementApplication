/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package application.swing;

import application.entity.GymerMember;
import application.untils.TaoXML;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import static javax.xml.xpath.XPathConstants.NODE;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Le Van Phong Tu
 */
public class GymerMemberTable extends javax.swing.JPanel {
    //"src/application/GymerMembers.xml"
    DocumentBuilderFactory dbf;
    DocumentBuilder db;
    Document doc;
    String ten_file = "src/GymerMembersz.xml";
    ArrayList<GymerMember> nvList;
    DefaultTableModel dfModel;
    
    ArrayList<GymerMember> getAllGymerMembers() throws ParserConfigurationException{
        dbf = DocumentBuilderFactory.newInstance();
        try{
            db = dbf.newDocumentBuilder();
        }catch(SAXException ex){
            Logger.getLogger(nfjdhfjdhfdf.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    private void hienThi() throws org.xml.sax.SAXException {
        try {

            try {
                dbf = DocumentBuilderFactory.newInstance();
                db = dbf.newDocumentBuilder();
                doc = (Document) db.parse(ten_file);

                
                NodeList nlgymer = doc.getElementsByTagName("gymer");
                NodeList nltengymer = doc.getElementsByTagName("hoten");
                NodeList nlgioitinh = doc.getElementsByTagName("gioitinh");
                NodeList nlngaysinh = doc.getElementsByTagName("ngaysinh");
                NodeList nldiachi = doc.getElementsByTagName("diachi");
                NodeList nlsdt = doc.getElementsByTagName("sdt");
                NodeList nlnbd = doc.getElementsByTagName("ngaybatdau");
                NodeList nlnkt = doc.getElementsByTagName("ngayketthuc");
                NodeList nlhlv = doc.getElementsByTagName("huanluyenvien");
                
                

                nvList = new ArrayList<>();

                for (int i = 0; i < nlgymer.getLength(); i++) {
                    GymerMember gymer = new GymerMember();
                    gymer.setid(nlgymer.item(i).getAttributes().getNamedItem("id").getNodeValue());
                    gymer.setName(nltengymer.item(i).getTextContent());
                    gymer.setGender(nlgioitinh.item(i).getTextContent());
                    gymer.setAddress(nldiachi.item(i).getTextContent());
                    gymer.setPhoneNumber(nlsdt.item(i).getTextContent());
                    gymer.setDob(nlngaysinh.item(i).getTextContent());
                    gymer.setStartDay(nlnbd.item(i).getTextContent());
                    gymer.setEndDay(nlnkt.item(i).getTextContent());
                    gymer.setCoach(nlhlv.item(i).getTextContent());

                    nvList.add(gymer);
                }

                dfModel = new DefaultTableModel();

                dfModel.setColumnCount(0);
                dfModel.setRowCount(0);

                dfModel.addColumn("ID");
                dfModel.addColumn("Tên");
                dfModel.addColumn("Giới tính");
                dfModel.addColumn("Sinh Nhật");
                dfModel.addColumn("Địa chỉ");
                dfModel.addColumn("Số điện thoại");
                dfModel.addColumn("Ngày đăng kí");
                dfModel.addColumn("Ngày kết thúc");
                dfModel.addColumn("Huấn luyện viên");
                
               

                for (GymerMember gymer : nvList) {
                    Vector v = new Vector();
                    v.add(gymer.getid());
                    v.add(gymer.getName());
                    v.add(gymer.getGender());
                    v.add(gymer.getDob());
                    v.add(gymer.getAddress());
                    v.add(gymer.getPhoneNumber());
                    v.add(gymer.getStartDay());
                    v.add(gymer.getEndDay());
                    v.add(gymer.getCoach());
                    dfModel.addRow(v);
                }

                m_gymerThongtin.setModel(dfModel);

            } catch (SAXException | IOException ex) {
                Logger.getLogger(GymerMemberTable.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(GymerMemberTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    /**
     * Creates new form GymerMemberTable
     */
    public GymerMemberTable() throws SAXException {
        hienThi();
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        endDateField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        dobField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        startDateField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        m_gymerThongtin = new javax.swing.JTable();
        genderComboBox = new javax.swing.JComboBox<>();
        coachComboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("BẢNG THÔNG TIN NGƯỜI TẬP");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 390, -1));

        jLabel1.setText("Coach");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 40, 20));
        add(endDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 160, -1));

        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 40, 20));

        jLabel3.setText("Gener");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 40, 20));

        jLabel4.setText("Birthday");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 60, 20));

        jLabel5.setText("Address");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 40, 20));

        jLabel6.setText("Phone");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 40, 20));

        jLabel7.setText("Start");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 40, 20));

        jLabel8.setText("End");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 40, 20));
        add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 160, -1));
        add(dobField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 160, -1));
        add(addressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 160, -1));
        add(phoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 160, -1));
        add(startDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 160, -1));

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, -1, -1));

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, -1));

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, -1, -1));

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        m_gymerThongtin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Gymer", "Tên", "Giới tính", "Sinh nhật", "Địa chỉ", "Số điện thoại", "Ngày đăng kí", "Ngày kết thúc", "Huấn luyện viên"
            }
        ));
        m_gymerThongtin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_gymerThongtinMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(m_gymerThongtin);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 860, 470));

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        add(genderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        coachComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        coachComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coachComboBoxActionPerformed(evt);
            }
        });
        add(coachComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 160, -1));

        jLabel9.setText("ID");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));
        add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 160, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        String id = idField.getText();
        String name = nameField.getText();
        String gender = (String) genderComboBox.getSelectedItem();
        String dobString = dobField.getText();
        String address = addressField.getText();
        String phone = phoneField.getText();
        String startDateString = startDateField.getText();
        String endDateString = endDateField.getText();
        String coach = (String) coachComboBox.getSelectedItem();
        

        if (name.isEmpty() || gender.isEmpty() || dobString.isEmpty() || address.isEmpty() || phone.isEmpty()
                || startDateString.isEmpty() || endDateString.isEmpty() || coach.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            if (daTrungid(id)) {
                JOptionPane.showMessageDialog(this, "Trùng mã nhân viên", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                    
                    GymerMember gymer = new GymerMember(id, name, gender, address, phone, id, coach, gender, coach);

                    Element gymers = doc.getDocumentElement();
                    themgymer(doc, gymers, gymer);
                    ghiFile();
                    JOptionPane.showMessageDialog(this, "Thêm thành công", "Information", JOptionPane.INFORMATION_MESSAGE);
                    xoaTextBox();
                try {
                    hienThi();
                } catch (SAXException ex) {
                    Logger.getLogger(GymerMemberTable.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    
    }//GEN-LAST:event_addButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        xoaTextBox();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void coachComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coachComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coachComboBoxActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        try {
            String id = idField.getText();
            String name = nameField.getText();
            String gender = (String) genderComboBox.getSelectedItem();
            String dobString = dobField.getText();
            String address = addressField.getText();
            String phone = phoneField.getText();
            String startDateString = startDateField.getText();
            String endDateString = endDateField.getText();
            String coach = (String) coachComboBox.getSelectedItem();

            if (id.trim().isEmpty() || !daTrungid(id)) {
                JOptionPane.showMessageDialog(this, "Mã Gymer không hợp lê", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                String duongDan = "Gymers/gymer[@id='" + id + "']";
                XPathFactory xpf = XPathFactory.newInstance();
                XPath xp = xpf.newXPath();
                Node chon = (Node) xp.evaluate(duongDan, doc, XPathConstants.NODE);
                NodeList nlgym = chon.getChildNodes();

                nlgym.item(1).setTextContent(name);
                nlgym.item(3).setTextContent(gender);
                nlgym.item(5).setTextContent(dobString);
                nlgym.item(7).setTextContent(address);
                nlgym.item(9).setTextContent(phone);
                nlgym.item(11).setTextContent(startDateString);
                nlgym.item(13).setTextContent(endDateString);
                nlgym.item(15).setTextContent(coach);
                ghiFile();
                hienThi();
            }

        } catch (XPathExpressionException ex) {
            Logger.getLogger(GymerMemberTable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        String id, duongDan;
        id = idField.getText();
        if (id.trim().isEmpty() || !daTrungid(id)) {
            JOptionPane.showMessageDialog(this, "Mã Gymer không hợp lê", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                int result;
                duongDan = "Gymers/gymer[@id='" + id + "']";
                XPathFactory xpf = XPathFactory.newInstance();
                XPath xp = xpf.newXPath();
                Node chon = (Node) xp.evaluate(duongDan, doc, XPathConstants.NODE);
                Node cha = chon.getParentNode();
                result = JOptionPane.showConfirmDialog(this, "Bạn có chắc không?", "Confirm", JOptionPane.YES_NO_OPTION);
                if(result == 0) {
                    cha.removeChild(chon);
                    ghiFile();
                    JOptionPane.showMessageDialog(this, "Xoá thành công", "Information", JOptionPane.INFORMATION_MESSAGE);
                    xoaTextBox();
                    hienThi();
               }
                
            } catch (XPathExpressionException ex) {
                Logger.getLogger(GymerMemberTable.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SAXException ex) {
                Logger.getLogger(GymerMemberTable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void m_gymerThongtinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_gymerThongtinMouseClicked
        // TODO add your handling code here:
        int hangChon = m_gymerThongtin.getSelectedRow();
        String id, name, gender, dobString, address,phone,startDateString,endDateString,coach;
        id = (String) m_gymerThongtin.getValueAt(hangChon, 0);
        name = (String) m_gymerThongtin.getValueAt(hangChon, 1);
        gender = (String) m_gymerThongtin.getValueAt(hangChon, 2);
        dobString = (String) m_gymerThongtin.getValueAt(hangChon, 3);
        address = (String) m_gymerThongtin.getValueAt(hangChon, 4);
        phone = (String) m_gymerThongtin.getValueAt(hangChon, 5);
        startDateString = (String) m_gymerThongtin.getValueAt(hangChon, 6);
        endDateString = (String) m_gymerThongtin.getValueAt(hangChon, 7);
        coach = (String) m_gymerThongtin.getValueAt(hangChon, 8);
        

        idField.setText(id);
        nameField.setText(name);
        genderComboBox.setSelectedItem(gender);
        dobField.setText(dobString);
        addressField.setText(address);
        phoneField.setText(phone);
        startDateField.setText(startDateString);
        endDateField.setText(endDateString);
        coachComboBox.setSelectedItem(coach);
    }//GEN-LAST:event_m_gymerThongtinMouseClicked
    
    

    private void xoaTextBox() {
        idField.setText("");
        genderComboBox.setSelectedIndex(0);
        dobField.setText("");
        addressField.setText("");
        phoneField.setText("");
        startDateField.setText("");
        endDateField.setText("");
        coachComboBox.setSelectedIndex(0);
    }
    private boolean daDayDuThongTin(String maNV, String tenNV, String luong, String tenPhong, String dienThoai) {
        boolean daDayDu = true;
        if (maNV.trim().isEmpty() || tenNV.trim().isEmpty()) {
            daDayDu = false;
        } else if (luong.trim().isEmpty() || tenPhong.trim().isEmpty() || dienThoai.trim().isEmpty()) {
            daDayDu = false;
        }

        return daDayDu;
    }

    private boolean daTrungid(String id) {
        boolean daTrung = false;
        for (GymerMember gym : nvList) {
            if (gym.getid().compareToIgnoreCase(id) == 0) {
                daTrung = true;
                break;
            }

        }

        return daTrung;
    }

    private void themgymer(Document doc, Element GymerMembers, GymerMember gym) {
        Element GymerMember = doc.createElement("gymer");

        Element hoten = doc.createElement("hoten");
        hoten.setTextContent(gym.getid());
        Element gioitinh = doc.createElement("gioitinh");
        gioitinh.setTextContent(gym.getGender());
        Element ngaysinh = doc.createElement("ngaysinh");
        ngaysinh.setTextContent(gym.getDob());
        Element diachi = doc.createElement("diachi");
        diachi.setTextContent(gym.getAddress());
        Element sdt = doc.createElement("sdt");
        sdt.setTextContent(gym.getPhoneNumber());
        Element ngaybatdau = doc.createElement("ngaybatdau");
        ngaybatdau.setTextContent(gym.getStartDay());
        Element ngayketthuc = doc.createElement("ngayketthuc");
        ngayketthuc.setTextContent(gym.getEndDay());
        Element huanluyenvien = doc.createElement("huanluyenvien");
        huanluyenvien.setTextContent(gym.getCoach());

        

        GymerMember.setAttribute("id", gym.getid());
        GymerMember.appendChild(hoten);
        GymerMember.appendChild(gioitinh);
        GymerMember.appendChild(ngaysinh);
        GymerMember.appendChild(diachi);
        GymerMember.appendChild(sdt);
        GymerMember.appendChild(ngaybatdau);
        GymerMember.appendChild(ngayketthuc);
        GymerMember.appendChild(huanluyenvien);
        

        GymerMembers.appendChild(GymerMember);
    }

    private void ghiFile() {
        TransformerFactory tff = TransformerFactory.newInstance();
        try {
            Transformer tf = tff.newTransformer();
            tf.setOutputProperty(OutputKeys.INDENT, "yes");
            tf.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "3");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult("src/GymerMembersz.xml");
            tf.transform(source, result);
            System.out.println("Ghi file thanh cong!!!");

        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(TaoXML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(TaoXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField addressField;
    private javax.swing.JComboBox<String> coachComboBox;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField dobField;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField endDateField;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JTextField idField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable m_gymerThongtin;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField phoneField;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField startDateField;
    // End of variables declaration//GEN-END:variables

    
}
