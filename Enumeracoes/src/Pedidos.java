
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author valmi
 */
public class Pedidos {
    private int id;
    private Date momento;
    private OrderStatus status;
    
    public Pedidos(){
        
    }

    public Pedidos(int id, Date momento, OrderStatus status) {
        this.id = id;
        this.momento = momento;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedidos{" + "id=" + id + ", momento=" + momento + ", status=" + status + '}';
    }
    
    
}
