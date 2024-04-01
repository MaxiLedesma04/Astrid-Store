package ANUBIT.TiendaVirtual.models;

import jakarta.persistence.*;

@Entity
public class Buy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private Long id;
    public Long quantity;
    public double unitPrice;
    @ManyToOne
    @JoinColumn(name="ticket_id")
    private Ticket ticket;
    @ManyToOne
    @JoinColumn(name="component_id")
    private Component component;
    public Buy() {
    }

    public Buy(Long id, Long quantity, double unitPrice) {
        this.id = id;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }
}
