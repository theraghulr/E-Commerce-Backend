package Entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "sellers")
public class seller {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "sellerid")
    private String sellerId;

    @Column(name = "email")
    private String email;

    @Column(name = "gstnumber")
    private String gstNumber;

    // Getters and Setters...


    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGstNumber() {
        return gstNumber;
    }

    public void setGstNumber(String gstNumber) {
        this.gstNumber = gstNumber;
    }


//    @OneToMany(mappedBy = "seller")
//    private List<Product> products;


}
