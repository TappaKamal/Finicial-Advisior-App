package com.example.financialadvisor.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisorId;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "financialAdvisor", cascade = CascadeType.ALL)
    private List<Client> clients;

    public FinancialAdvisor() {}

    public FinancialAdvisor(Long advisorId, String name, List<Client> clients) {
        this.advisorId = advisorId;
        this.name = name;
        this.clients = clients;
    }

    public Long getAdvisorId() { return advisorId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<Client> getClients() { return clients; }
    public void setClients(List<Client> clients) { this.clients = clients; }
}
