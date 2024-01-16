package com.example.demoProjectLIC.entity;

import jakarta.persistence.*;

@Entity
public class PersonCloseToMyHeart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nomineeId;

    private String nomineeName;
    private String nomineeRelationship;
    private String address;
    private String contact;
    private String reasonForClose;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId")
    private HeadOfFamily headOfFamily;

    public PersonCloseToMyHeart() {

    }

    public PersonCloseToMyHeart(Long nomineeId, String nomineeName, String nomineeRelationship, String address, String contact, String reasonForClose, HeadOfFamily headOfFamily) {
        this.nomineeId = nomineeId;
        this.nomineeName = nomineeName;
        this.nomineeRelationship = nomineeRelationship;
        this.address = address;
        this.contact = contact;
        this.reasonForClose = reasonForClose;
        this.headOfFamily = headOfFamily;
    }

    public Long getNomineeId() {
        return nomineeId;
    }

    public void setNomineeId(Long nomineeId) {
        this.nomineeId = nomineeId;
    }

    public String getNomineeName() {
        return nomineeName;
    }

    public void setNomineeName(String nomineeName) {
        this.nomineeName = nomineeName;
    }

    public String getNomineeRelationship() {
        return nomineeRelationship;
    }

    public void setNomineeRelationship(String nomineeRelationship) {
        this.nomineeRelationship = nomineeRelationship;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getReasonForClose() {
        return reasonForClose;
    }

    public void setReasonForClose(String reasonForClose) {
        this.reasonForClose = reasonForClose;
    }

    public HeadOfFamily getHeadOfFamily() {
        return headOfFamily;
    }

    public void setHeadOfFamily(HeadOfFamily headOfFamily) {
        this.headOfFamily = headOfFamily;
    }
}
