/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.calculatedage.lab9;

import static java.lang.System.console;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Villarreal
 */
public class Persona {
    int resp1;
    String datas;
    public String getDatas() {
        return datas;
    }
      

    

    main repetir = new main();
    public Persona() {
    }
   
    
    public String  Calculatedaño (int age,int mes,int day, String nameperson ){

        Calendar cal = new GregorianCalendar();
        Operation calculo= new Operation();
        int rage,rmonth,rday;
        int ageactually=cal.get(Calendar.YEAR);
        int meslly=cal.get(Calendar.MONTH)+1;
        int daylly=cal.get(Calendar.DAY_OF_MONTH);
        rage=calculo.rest(ageactually, age);
        rmonth=calculo.rest(meslly, mes);
        if (day<0|day>31){
            JOptionPane.showMessageDialog(null,"Ha ingresado mal el dia");
            Pregunta();
           
        }
        if (mes<0|mes>12){
            JOptionPane.showMessageDialog(null,"Ha ingresado mal el mes");
            Pregunta();
         
        }
        if (age<0|age>ageactually){
            JOptionPane.showMessageDialog(null,"Ha ingresado mal el año");
            Pregunta();
            
        }
        if (day>daylly){
            rmonth=rmonth-1;
        }
          rday=calculo.rest(daylly, day);
        if(rday<0){
            rday=rday+31; 
    }
    if(rage<0 |rmonth<0|rday<0 && age==ageactually){
          JOptionPane.showMessageDialog(null,"Usted auno nace");
          Pregunta();
      }
     if(mes>meslly){
          rmonth=rmonth+12;
      }
         if (ageactually==age&&day==daylly&&mes==meslly){
            JOptionPane.showMessageDialog(null,"Nacio Hoy");
            Pregunta();
            
        }
        datas=nameperson+";"+Integer.toString(rage)+";"+Integer.toString(rmonth)+";"+Integer.toString(rday)+"; ";      
        JOptionPane.showMessageDialog(null,datas);
        return datas;
       
            
    }
    
    
    
    
   
    
    
    
    
    
    
    
    
    
    
 
     public void Pregunta(){
    do{
         resp1=JOptionPane.showConfirmDialog(null,"Desea repetir el proceso"); 
         repetir.Ejecutar();
         }while (resp1==JOptionPane.OK_OPTION);  
         JOptionPane.showMessageDialog(null, "Chaosss..");         
         
     }
   
     



} 

   
    
    
    

