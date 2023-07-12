mport jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private long portfolioId;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    // Other attributes and relationships

    protected Portfolio() {

    }

    public Portfolio(Client client) {
        this.client = client;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    // Other getters and setters for attributes and relationships
}