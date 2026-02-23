package com.example.financialadvisor.entities;

import javax.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private FinancialAdvisor financialAdvisor;

    public Client() {}

    public Client(Long clientId, String name, FinancialAdvisor financialAdvisor) {
        this.clientId = clientId;
        this.name = name;
        this.financialAdvisor = financialAdvisor;
    }

    public Long getClientId() { return clientId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public FinancialAdvisor getFinancialAdvisor() { return financialAdvisor; }
    public void setFinancialAdvisor(FinancialAdvisor financialAdvisor) { this.financialAdvisor = financialAdvisor; }
}
