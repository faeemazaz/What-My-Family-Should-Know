package com.example.demoProjectLIC.entity;

import com.example.demoProjectLIC.entity.readyreference.*;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "head_of_families")
public class HeadOfFamily extends Person {
    private PersonType type;

    private String aboutMe;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "headOfFamily")
    private List<Spouse> spouses;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "headOfFamily")
    private List<Child> children;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "headOfFamily")
    private MedicalHistory medicalHistory;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "headOfFamily")
    private List<PersonCloseToMyHeart> personCloseToMyHearts;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "headOfFamily")
    private List<FamilyDoctor> familyDoctors;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "headOfFamily")
    private List<SpecialDoctor> specialDoctors;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "headOfFamily")
    private List<Hospital> hospitals;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "headOfFamily")
    private List<TaxConsultant> taxConsultants;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "headOfFamily")
    private List<InsuranceAgent> insuranceAgents;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "headOfFamily")
    private List<StockBroker> stockBrokers;

    public HeadOfFamily() {

    }

    public HeadOfFamily(PersonType type, String aboutMe, List<Spouse> spouses, List<Child> children, MedicalHistory medicalHistory, List<PersonCloseToMyHeart> personCloseToMyHearts, List<FamilyDoctor> familyDoctors, List<SpecialDoctor> specialDoctors, List<Hospital> hospitals, List<TaxConsultant> taxConsultants, List<InsuranceAgent> insuranceAgents, List<StockBroker> stockBrokers) {
        this.type = type;
        this.aboutMe = aboutMe;
        this.spouses = spouses;
        this.children = children;
        this.medicalHistory = medicalHistory;
        this.personCloseToMyHearts = personCloseToMyHearts;
        this.familyDoctors = familyDoctors;
        this.specialDoctors = specialDoctors;
        this.hospitals = hospitals;
        this.taxConsultants = taxConsultants;
        this.insuranceAgents = insuranceAgents;
        this.stockBrokers = stockBrokers;
    }

    public HeadOfFamily(Long id, String name, Date dateOfBirth, String placeOfBirth, String anniversary, String mobile, String email, String bloodGroup, String emergencyContact, String organizationContact, String educationalQualification, PersonType type, String aboutMe, List<Spouse> spouses, List<Child> children, MedicalHistory medicalHistory, List<PersonCloseToMyHeart> personCloseToMyHearts, List<FamilyDoctor> familyDoctors, List<SpecialDoctor> specialDoctors, List<Hospital> hospitals, List<TaxConsultant> taxConsultants, List<InsuranceAgent> insuranceAgents, List<StockBroker> stockBrokers) {
        super(id, name, dateOfBirth, placeOfBirth, anniversary, mobile, email, bloodGroup, emergencyContact, organizationContact, educationalQualification);
        this.type = type;
        this.aboutMe = aboutMe;
        this.spouses = spouses;
        this.children = children;
        this.medicalHistory = medicalHistory;
        this.personCloseToMyHearts = personCloseToMyHearts;
        this.familyDoctors = familyDoctors;
        this.specialDoctors = specialDoctors;
        this.hospitals = hospitals;
        this.taxConsultants = taxConsultants;
        this.insuranceAgents = insuranceAgents;
        this.stockBrokers = stockBrokers;
    }

    @Enumerated(EnumType.STRING)
    public PersonType getType() {
        return type;
    }

    public void setType(PersonType type) {
        this.type = type;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public List<Spouse> getSpouses() {
        return spouses;
    }

    public void setSpouses(List<Spouse> spouses) {
        this.spouses = spouses;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public MedicalHistory getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(MedicalHistory medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public List<PersonCloseToMyHeart> getPersonCloseToMyHearts() {
        return personCloseToMyHearts;
    }

    public void setPersonCloseToMyHearts(List<PersonCloseToMyHeart> personCloseToMyHearts) {
        this.personCloseToMyHearts = personCloseToMyHearts;
    }

    public List<FamilyDoctor> getFamilyDoctors() {
        return familyDoctors;
    }

    public void setFamilyDoctors(List<FamilyDoctor> familyDoctors) {
        this.familyDoctors = familyDoctors;
    }

    public List<SpecialDoctor> getSpecialDoctors() {
        return specialDoctors;
    }

    public void setSpecialDoctors(List<SpecialDoctor> specialDoctors) {
        this.specialDoctors = specialDoctors;
    }

    public List<Hospital> getHospitals() {
        return hospitals;
    }

    public void setHospitals(List<Hospital> hospitals) {
        this.hospitals = hospitals;
    }

    public List<TaxConsultant> getTaxConsultants() {
        return taxConsultants;
    }

    public void setTaxConsultants(List<TaxConsultant> taxConsultants) {
        this.taxConsultants = taxConsultants;
    }

    public List<InsuranceAgent> getInsuranceAgents() {
        return insuranceAgents;
    }

    public void setInsuranceAgents(List<InsuranceAgent> insuranceAgents) {
        this.insuranceAgents = insuranceAgents;
    }

    public List<StockBroker> getStockBrokers() {
        return stockBrokers;
    }

    public void setStockBrokers(List<StockBroker> stockBrokers) {
        this.stockBrokers = stockBrokers;
    }
}
