package ANUBIT.TiendaVirtual.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private Long id;

    private String numberOrder;
    private double amount;
    private LocalDateTime date;
    private BuyType type;
    private String email;

    @OneToMany(mappedBy = "ticket", cascade = CascadeType.ALL)
    private Set<Buy> buys = new HashSet<>();

    public Ticket() {
    }

    public Ticket(Long id, String numberOrder, double amount, LocalDateTime date, BuyType type, String email) {
        this.id = id;
        this.numberOrder = numberOrder;
        this.amount = amount;
        this.date = date;
        this.type = type;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumberOrder() {
        return numberOrder;
    }

    public void setNumberOrder(String numberOrder) {
        this.numberOrder = numberOrder;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public BuyType getType() {
        return type;
    }

    public void setType(BuyType type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Buy> getBuys() {
        return buys;
    }

    public void setBuys(Set<Buy> buys) {
        this.buys = buys;
    }

    public void addBuy(Buy buy) {
        buy.setTicket(this);
        buys.add(buy);
    }
}
