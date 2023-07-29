package org.example;

import javax.persistence.*;
import java.util.List;

@Entity
public class ClientPortfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "clientPortfolio", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Security> securities;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }
}
