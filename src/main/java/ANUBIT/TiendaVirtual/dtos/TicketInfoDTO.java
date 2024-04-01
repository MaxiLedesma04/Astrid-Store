package ANUBIT.TiendaVirtual.dtos;

public class TicketInfoDTO {
    private long id;
    private double totalAmount;
    private int quantity;

    public TicketInfoDTO() {
    }

    public TicketInfoDTO(long id, double totalAmount, int quantity) {
        this.id = id;
        this.totalAmount = totalAmount;
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public int getQuantity() {
        return quantity;
    }
}
