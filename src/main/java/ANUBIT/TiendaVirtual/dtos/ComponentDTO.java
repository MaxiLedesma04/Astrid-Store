package ANUBIT.TiendaVirtual.dtos;

import ANUBIT.TiendaVirtual.models.Component;

import java.util.List;

public class ComponentDTO {
    private Long id;
    private String name;
    private String brand;
    private String description;

    private List<String> snapshot;
    private List<String> colors;
    private List<String> photos;
    private double price;
    private int stock;

    public ComponentDTO(Long id, String name, String brand, String description, List<String> snapshot, List<String> colors, List<String> photos, double price, int stock) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.description = description;
        this.snapshot = snapshot;
        this.colors = colors;
        this.photos = photos;
        this.price = price;
        this.stock = stock;
    }
    public ComponentDTO() {
    }

    public ComponentDTO(Component component) {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getSnapshot() {
        return snapshot;
    }

    public List<String> getColors() {
        return colors;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
}
