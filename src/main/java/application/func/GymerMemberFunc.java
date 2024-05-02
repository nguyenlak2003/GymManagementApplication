/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.func;

import application.entity.GymerMember;
import application.entity.GymerMemberXML;
import application.untils.FileUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Le Van Phong Tu
 */
public class GymerMemberFunc {
    private static final String GYMERMEMBER_FILE_NAME = "gymermembers.xml";
    private List<GymerMember> listGymMembers;

    public GymerMemberFunc() {
        this.listGymMembers = readListGymMembers();
    }
    
    /* Lưu các object vào file .xml */
    
    public void writeListGymerMembers(List<GymerMember> gymerMembers) {
        GymerMemberXML gymerMemberXML = new GymerMemberXML();
        gymerMemberXML.setGymerMember(gymerMembers);
        FileUtils.writeXMLtoFile(GYMERMEMBER_FILE_NAME, gymerMemberXML);
    }
    
    /* Đọc các object từ file .xml */
    
    private List<GymerMember> readListGymMembers() {
        List<GymerMember> list = new ArrayList<GymerMember>();
        GymerMemberXML gymerMemberXML = (GymerMemberXML) FileUtils.readXMLFile(
                GYMERMEMBER_FILE_NAME, GymerMemberXML.class);
        if (gymerMemberXML != null) {
            list = gymerMemberXML.getGymerMember();
        }
        return list;
    }
    
    /* Thêm các object vào list và lưu list vào .xml */
    
    public void add(GymerMember gymerMember ) {
        int id = (!listGymMembers.isEmpty()) ? (listGymMembers.size() + 1) : 1;
        gymerMember.setId(id);
        listGymMembers.add(gymerMember);
        writeListGymerMembers(listGymMembers);
    }
    
    /* Cập nhật object và lưu vào .xml */
    
    public void edit(GymerMember gymerMember) {
        int size = listGymMembers.size();
        for (int i = 0; i < size; i++) {
            if (listGymMembers.get(i).getId() == gymerMember.getId()) {
                listGymMembers.get(i).setName(gymerMember.getName());
                listGymMembers.get(i).setAddress(gymerMember.getAddress());
                listGymMembers.get(i).setAddress(gymerMember.getAddress());
                listGymMembers.get(i).setStartDay(gymerMember.getStartDay());
                listGymMembers.get(i).setEndDay(gymerMember.getEndDay());
                listGymMembers.get(i).setdateOfBirth(gymerMember.getdateOfBirth());
                listGymMembers.get(i).setPhoneNumber(gymerMember.getPhoneNumber());
                writeListGymerMembers(listGymMembers);
                break;
            }
        }
    }
    
    /* Xóa object */
    
    public boolean delete(GymerMember gymerMember) {
        boolean isFound = false;
 
        for (int i = 0; i < listGymMembers.size(); i++) {
            if (listGymMembers.get(i).getId() == gymerMember.getId()) {
                gymerMember = listGymMembers.get(i);
                isFound = true;
                break;
            }
        }
        if (isFound) {
            listGymMembers.remove(gymerMember);
            writeListGymerMembers(listGymMembers);
            return true;
        }
        return false;
    }
    
    /* Sắp xếp tăng dần theo tên */
    
    public void sortGymerMemberByName() {
        Collections.sort(listGymMembers, new Comparator<GymerMember>() {
            public int compare(GymerMember gymerMember1, GymerMember gymerMember2) {
                return gymerMember1.getName().compareTo(gymerMember2.getName());
            }
        });
    }

    public List<GymerMember> getListGymMembers() {
        return listGymMembers;
    }

    public void setListGymMembers(List<GymerMember> listGymMembers) {
        this.listGymMembers = listGymMembers;
    }
    
    
}
