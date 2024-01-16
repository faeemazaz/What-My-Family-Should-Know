package com.example.demoProjectLIC.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class MedicalHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long medicalId;

    private String vaccinationName;

    private Date vaccinationDate;

    private String reactionOfMedicine;

    private String metallicImpact;

    private String takingLifeSavingMedicine;

    private String dosage;

    private String symptoms;

    private String sos;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId")
    private HeadOfFamily headOfFamily;

    public MedicalHistory() {

    }

    public MedicalHistory(Long medicalId, String vaccinationName, Date vaccinationDate, String reactionOfMedicine, String metallicImpact, String takingLifeSavingMedicine, String dosage, String symptoms, String sos, HeadOfFamily headOfFamily) {
        this.medicalId = medicalId;
        this.vaccinationName = vaccinationName;
        this.vaccinationDate = vaccinationDate;
        this.reactionOfMedicine = reactionOfMedicine;
        this.metallicImpact = metallicImpact;
        this.takingLifeSavingMedicine = takingLifeSavingMedicine;
        this.dosage = dosage;
        this.symptoms = symptoms;
        this.sos = sos;
        this.headOfFamily = headOfFamily;
    }

    public Long getMedicalId() {
        return medicalId;
    }

    public void setMedicalId(Long medicalId) {
        this.medicalId = medicalId;
    }

    public String getVaccinationName() {
        return vaccinationName;
    }

    public void setVaccinationName(String vaccinationName) {
        this.vaccinationName = vaccinationName;
    }

    public Date getVaccinationDate() {
        return vaccinationDate;
    }

    public void setVaccinationDate(Date vaccinationDate) {
        this.vaccinationDate = vaccinationDate;
    }

    public String getReactionOfMedicine() {
        return reactionOfMedicine;
    }

    public void setReactionOfMedicine(String reactionOfMedicine) {
        this.reactionOfMedicine = reactionOfMedicine;
    }

    public String getMetallicImpact() {
        return metallicImpact;
    }

    public void setMetallicImpact(String metallicImpact) {
        this.metallicImpact = metallicImpact;
    }

    public String getTakingLifeSavingMedicine() {
        return takingLifeSavingMedicine;
    }

    public void setTakingLifeSavingMedicine(String takingLifeSavingMedicine) {
        this.takingLifeSavingMedicine = takingLifeSavingMedicine;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getSos() {
        return sos;
    }

    public void setSos(String sos) {
        this.sos = sos;
    }

    public HeadOfFamily getHeadOfFamily() {
        return headOfFamily;
    }

    public void setHeadOfFamily(HeadOfFamily headOfFamily) {
        this.headOfFamily = headOfFamily;
    }
}
