/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coder.calendar;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author coder
 */
public class JDateChooser extends com.toedter.calendar.JDateChooser{
    
    public void setLocalDate(LocalDate localDate){
        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        this.setDate(date);
    }
    
    public LocalDate getLocalDate(){
        if(this.getDate() != null){
            Instant instant = Instant.ofEpochMilli(this.getDate().getTime());
            return LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalDate();
        }
        return null;
    }
    
}
