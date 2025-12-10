package br.ifs.edu.cads.api.hotel.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_estado")
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 2)
    private String uf;

    public Estado() {}

    public Estado(Long id, String uf) {
        this.id = id;
        this.uf = uf;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getUf() { return uf; }
    public void setUf(String uf) { this.uf = uf; }
}