package com.tw.apistackbase.core;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "COMPANY_PROFILE")
public class Profile {

    public Profile() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Long id;

    @Column(name = "REGISTERED_CAPITAL")
    private int registeredCapital;

    @Column(name = "CERT_ID")
    private String certId;

    public int getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(int registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }
}
