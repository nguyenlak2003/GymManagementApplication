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
    public void writeListStudents(List<GymerMember> gymerMembers) {
        GymerMemberXML gymerMemberXML = new GymerMemberXML();
        gymerMemberXML.setGymerMember(gymerMembers);
        FileUtils.writeXMLtoFile(GYMERMEMBER_FILE_NAME, gymerMemberXML);
    }

    private List<GymerMember> readListGymMembers() {
        List<GymerMember> list = new ArrayList<GymerMember>();
        GymerMemberXML gymerMemberXML = (GymerMemberXML) FileUtils.readXMLFile(
                GYMERMEMBER_FILE_NAME, GymerMemberXML.class);
        if (gymerMemberXML != null) {
            list = gymerMemberXML.getStudent();
        }
        return list;
    }
    public void add(GymerMember gymerMember ) {
        int id = (listGymMembers.size() > 0) ? (listGymMembers.size() + 1) : 1;
        gymerMember.setId(id);
        listGymMembers.add(gymerMember);
        writeListStudents(listGymMembers);
    }
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
                writeListStudents(listGymMembers);
                break;
            }
        }
    }
    public boolean delete(GymerMember gymerMember) {
        boolean isFound = false;
        int size = listGymMembers.size();
        for (int i = 0; i < size; i++) {
            if (listGymMembers.get(i).getId() == gymerMember.getId()) {
                gymerMember = listGymMembers.get(i);
                isFound = true;
                break;
            }
        }
        if (isFound) {
            listGymMembers.remove(gymerMember);
            writeListStudents(listGymMembers);
            return true;
        }
        return false;
    }
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
