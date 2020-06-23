
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
public class Program {
    public static void main(String[] args) {
        Pedidos pedido = new Pedidos(1080, new Date(), OrderStatus.AGUARDANDO_PAGAMENTO);
        System.out.println(pedido);
        
        OrderStatus os1 = OrderStatus.ENTREGUE;
        OrderStatus os2 = OrderStatus.valueOf("Delivered");
        
        System.out.println(os1);
        System.out.println(os2);
        
    }
    
}
