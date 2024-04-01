package ANUBIT.TiendaVirtual.dtos;

public class BuyDTO {
    private Long id;
    public Long quantity;
    public double unitPrice;

    public BuyDTO() {
    }

    public BuyDTO(Long id, Long quantity, double unitPrice) {
        this.id = id;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public Long getId() {
        return id;
    }

    public Long getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}
