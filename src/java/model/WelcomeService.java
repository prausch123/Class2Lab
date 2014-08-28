/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author peter
 */
public class WelcomeService {
    
    public String processName(String name) {
        return name.toUpperCase();
    }
    
    public String returnDate() {
        Calendar calendar = GregorianCalendar.getInstance();
        Date date = new Date();
        
        calendar.setTime(date);
        int time = calendar.get(Calendar.HOUR);
        
        if(time < 12) {
            return "morning";
        } else if(time >= 12 && time <= 17){
            return "afternoon";
        } else if(time >= 17 && time <= 24) {
            return "evening";
        } else {
            return "Error";
        }
    }
}
