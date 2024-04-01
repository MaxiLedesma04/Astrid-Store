package ANUBIT.TiendaVirtual.dtos;

import ANUBIT.TiendaVirtual.models.BuyType;

import java.time.LocalDateTime;

public class TicketDTO {
    private Long id;
    private String numberOrder;
    private double amount;
    private LocalDateTime date;
    private BuyType type;
    private String email;

    public TicketDTO() {
    }

    public TicketDTO(Long id, String numberOrder, double amount, LocalDateTime date, BuyType type, String email) {
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

    public String getNumberOrder() {
        return numberOrder;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public BuyType getType() {
        return type;
    }

    public String getEmail() {
        return email;
    }
}
