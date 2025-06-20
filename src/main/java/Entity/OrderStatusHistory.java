package Entity;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "orderstatushistory")
public class OrderStatusHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private Long id;

//    @ManyToOne
//    @JoinColumn(name = "orderid")
//    private Order order;

    @Column(name = "status")
    private String status;

    @Column(name = "changedat")
    private LocalDateTime changedAt;

    @ManyToOne
    @JoinColumn(name = "createdby")
    private UserDetails createdBy;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public Order getOrder() {
//        return order;
//    }
//
//    public void setOrder(Order order) {
//        this.order = order;
//    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getChangedAt() {
        return changedAt;
    }

    public void setChangedAt(LocalDateTime changedAt) {
        this.changedAt = changedAt;
    }

    public UserDetails getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserDetails createdBy) {
        this.createdBy = createdBy;
    }
}