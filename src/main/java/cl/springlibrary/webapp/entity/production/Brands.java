package cl.springlibrary.webapp.entity.production;

import javax.persistence.*;

@Entity
@Table(name = "brands")
public class Brands {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brand_id")
    private Integer brandId;
    @Column(name = "brand_name")
    private String brandName;

    public Brands() {
    }

    public Brands(String brandName) {
        this.brandName = brandName;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Brands brands = (Brands) o;

        return brandName != null ? brandName.equals(brands.brandName) : brands.brandName == null;
    }

    @Override
    public int hashCode() {
        return brandName != null ? brandName.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Brands{" +
                "brandId=" + brandId +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}
