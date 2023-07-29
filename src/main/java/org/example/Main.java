package org.example;

import javax.annotation.processing.Generated;
import javax.persistence;
import java.util.List;


@Entity
public class System {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long SystemID;


    @OneToMany(mappedBy = "system", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FinancialAdvisor> financialAdvisors;

    public Long getSystemID() {
        return SystemID;
    }

    public void setSystemID(Long systemid) {
        this.systemid = systemid;
    }

    public List<FinancialAdvisor> getFinancialAdvisors() {
        return financialAdvisors;
    }

    public void setFinancialAdvisors(List<FinancialAdvisor> financialAdvisors) {
        this.financialAdvisors = financialAdvisors;
    }

}
