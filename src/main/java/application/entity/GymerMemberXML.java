/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.entity;

/**
 *
 * @author Le Van Phong Tu
 */
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "gymermembers")
@XmlAccessorType(XmlAccessType.FIELD)
public class GymerMemberXML {
    private List<GymerMember> gymerMember;

    public List<GymerMember> getStudent() {
        return gymerMember;
    }

    public void setGymerMember(List<GymerMember> gymerMember) {
        this.gymerMember = gymerMember;
    }
}
