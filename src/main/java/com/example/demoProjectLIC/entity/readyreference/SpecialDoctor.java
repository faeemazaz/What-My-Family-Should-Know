package com.example.demoProjectLIC.entity.readyreference;

import com.example.demoProjectLIC.entity.HeadOfFamily;
import jakarta.persistence.*;

@Entity
@Table(name = "special_doctor")
public class SpecialDoctor extends ReadyReferenceField {

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId")
    private HeadOfFamily headOfFamily;

    public SpecialDoctor(Long id, String name, String officeAddress, String residenceAddress, String contact, HeadOfFamily headOfFamily) {
        super(id, name, officeAddress, residenceAddress, contact);
        this.headOfFamily = headOfFamily;
    }

    public HeadOfFamily getHeadOfFamily() {
        return headOfFamily;
    }

    public void setHeadOfFamily(HeadOfFamily headOfFamily) {
        this.headOfFamily = headOfFamily;
    }
}
