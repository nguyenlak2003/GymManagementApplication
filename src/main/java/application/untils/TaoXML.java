/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.untils;

import application.entity.GymerMember;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author Le Van Phong Tu
 */
public class TaoXML {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();
            
            GymerMember gym1 = new GymerMember("1", "2", "3", "4", "5", "6", "7", "8", "9");
            GymerMember gym2 = new GymerMember("6", "9", "3", "4", "5", "6", "7", "8", "9");
            Element Gymermember = doc.createElement("Gymers");
            themNhanVien(doc, Gymermember, gym1);
            themNhanVien(doc, Gymermember, gym2);
            doc.appendChild(Gymermember);
            
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
            
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(TaoXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    static private void themNhanVien(Document doc, Element Gymers, GymerMember gym) {
        Element gymer = doc.createElement("gymer");
            
            Element hoten = doc.createElement("hoten");
            hoten.setTextContent(gym.getName());
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
            
            
            
            gymer.setAttribute("id", gym.getid());
            gymer.setAttribute("id", gym.getid());
            gymer.appendChild(hoten);
            gymer.appendChild(gioitinh);
            gymer.appendChild(ngaysinh);
            gymer.appendChild(diachi);
            gymer.appendChild(sdt);
            gymer.appendChild(ngaybatdau);
            gymer.appendChild(ngayketthuc);
            gymer.appendChild(huanluyenvien);
        

        Gymers.appendChild(gymer);
    }
}
