package com.example.demoProjectLIC.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "child")
public class Child extends Person {
    private PersonType type;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId")
    private HeadOfFamily headOfFamily;

    public Child() {
    }

    public Child(PersonType type, HeadOfFamily headOfFamily) {
        this.type = type;
        this.headOfFamily = headOfFamily;
    }

    public Child(Long id, String name, Date dateOfBirth, String paceOfBirth, String anniversary, String mobile, String email, String bloodGroup, String emergencyContact, String organizationContact, String educationalQualification, PersonType type, HeadOfFamily headOfFamily) {
        super(id, name, dateOfBirth, paceOfBirth, anniversary, mobile, email, bloodGroup, emergencyContact, organizationContact, educationalQualification);
        this.type = type;
        this.headOfFamily = headOfFamily;
    }

    @Enumerated(EnumType.STRING)
    public PersonType getType() {
        return type;
    }

    public void setType(PersonType type) {
        this.type = type;
    }

    public HeadOfFamily getHeadOfFamily() {
        return headOfFamily;
    }

    public void setHeadOfFamily(HeadOfFamily headOfFamily) {
        this.headOfFamily = headOfFamily;
    }
}
