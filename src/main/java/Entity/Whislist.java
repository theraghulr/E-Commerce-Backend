package Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="whislist")

public class Whislist {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="Whislistid")
    private Long whishlistid;

    @Column(name="userid")
    private long userid;

    @Column(name="productid")
    private long productid;

    @Column(name="createdate")
    private LocalDateTime createdate;


    //Getters And Setters

    public  Long getWhishlistId(){
        return whishlistid;
    }

    public void  setWhislistId(long whishlistid){
        this.whishlistid = whishlistid;
    }

    public  Long getUserID(){
        return userid;
    }

    public void setUserId(Long userid){
        this.userid=userid;
    }

    public Long setProductId(){
        return productid;
    }

    public void getProductId(Long productid){
        this.productid=productid;
    }

    public LocalDateTime getCreatedate() {
        return createdate;
    }

    public void setCreatedate(LocalDateTime createdate){
        this.createdate = createdate;
    }
}
