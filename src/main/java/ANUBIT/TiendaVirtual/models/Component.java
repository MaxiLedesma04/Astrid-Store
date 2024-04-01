package ANUBIT.TiendaVirtual.models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Component {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private Long id;

    private String name;
    private String brand;
    @Column(name="description", length=2000)
    private String description;
    @ElementCollection
    @Column(name="snapshot")
    private List<String> snapshot;

    @ElementCollection
    @Column(name="colors")
    private List<String> colors;

    @ElementCollection
    @Column(name="photos")
    private List<String> photos;
    private double price;
    private int stock;
    @OneToMany(mappedBy = "component", cascade = CascadeType.ALL)
    private Set<Buy> buys = new HashSet<>();

    public Component() {
    }

    public Component(String name, String brand, String description, List<String> snapshot, List<String> colors, List<String> photos, double price, int stock) {
        this.name = name;
        this.brand = brand;
        this.description = description;
        this.snapshot = snapshot;
        this.colors = colors;
        this.photos = photos;
        this.price = price;
        this.stock = stock;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(List<String> snapshot) {
        this.snapshot = snapshot;
    }

    public List<String> getColors() {
        return colors;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Set<Buy> getBuys() {
        return buys;
    }

    public void setBuys(Set<Buy> buys) {
        this.buys = buys;
    }

    public void addBuy(Buy buy) {
        this.buys.add(buy);
    }
}
