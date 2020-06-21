/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateintroduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author valmi
 */
public class DateIntroduct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
        
        Date y1 = sdf1.parse("25/06/2018");
        Date y2 = sdf2.parse("25/06/2018 15:42:07");
        System.out.println(y1);
        System.out.println(y2);
    };
    
    
}
