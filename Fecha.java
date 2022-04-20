/*@author paola*/

package practica2;

import java.util.Scanner;

public class Fecha 
//Atributo
{
    private int dia;
    private int mes;
    private int año;    
    public int getDia() 
    {
        return dia;
    }

    public void setDia(int dia) 
    {
        this.dia = dia;
    }

    public int getMes() 
    {
        return mes;
    }

    public void setMes(int mes) 
    {
        this.mes = mes;
    }

    public int getAño() 
    {
        return año;
    }

    public void setAño(int año) 
    {
        this.año = año;
    }
    
    void leer_fecha()
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Validaremos la fecha");
        System.out.println("Ingrese el dia en numero: ");
        setDia(entrada.nextInt());
        System.out.println("Ingrese el mes con numero: ");
        setMes(entrada.nextInt());
        System.out.println("Ingrese el año en numero: ");
        setAño(entrada.nextInt());
    }
    
    int validar_fecha()
    {
        if(getMes()==1 && getDia()>31)
            return 0;
            
        else if(getMes()==1 && getDia()<=31)
            return 1;
        if(getMes()==2 && getDia()==29){
        if((getAño()%4==0 && getAño()%100 !=0) ||(getAño()%100==0 && getAño()%400==0) )
        
                return 1;
    }
            
        else if(getMes()==2 && getDia()<=28)
            return 1;
        else if(getMes()==2 && getDia()>28)
            return 0;                
        if(getMes()==3 && getDia()>31)
            return 0;            
        else if(getMes()==3 && getDia()<=31)
            return 1;
        if(getMes()==4 && getDia()>30)
            return 0;
        else if(getMes()==4 && getDia()<=30)
            return 1;
        if(getMes()==5 && getDia()>31)
            return 0;
        else if(getMes()==5 && getDia()<=31)
            return 1;
        if(getMes()==6 && getDia()>30)
            return 0;
        else if(getMes()==6 && getDia()<=30)
            return 1;
        if(getMes()==7 && getDia()>31)
            return 0;
        else if(getMes()==7 && getDia()<=31)
            return 1;
        if(getMes()==8 && getDia()>31)
            return 0;
        else if(getMes()==8 && getDia()<=31)
            return 1;
        if(getMes()==9 && getDia()>30)
            return 0;
        else if(getMes()==9 && getDia()<=30)
            return 1;
        if(getMes()==10 && getDia()>31)
           return 0;
        else if(getMes()==10 && getDia()<=31)
            return 1;
        if(getMes()==11 && getDia()>30)
            return 0;
        else if(getMes()==11 && getDia()<=30)
            return 1;
        if(getMes()==12 && getDia()>31)
            return 0;
        else if(getMes()==12 && getDia()<=31)
            return 1;
         
         return dia;
    }
    
    void imprimir_fecha_corta()
    {
        if(validar_fecha()==1)
        {
            if(getMes()<=12)
            System.out.println(getDia() + "/" + getMes() + "/" + getAño());
        } else
            System.out.println("Error de fecha");  
    }
    
    void imprimir_fecha_larga()
    {
         if(validar_fecha()==1)
         {
           switch (getMes()) 
           {
               case 1:
                   System.out.println(getDia() + " de enero de " + getAño());
                   break;
               case 2:
                   System.out.println(getDia() + " de febrero de " + getAño());
                   break;
               case 3:
                   System.out.println(getDia() + " de marzo de " + getAño());
                   break;
               case 4:
                   System.out.println(getDia() + " de abril de " + getAño());
                   break;
               case 5:
                   System.out.println(getDia() + " de mayo de " + getAño());
                   break;
               case 6:
                   System.out.println(getDia() + " de junio de " + getAño());
                   break;
               case 7:
                   System.out.println(getDia() + " de julio de " + getAño());
                   break;
               case 8:
                   System.out.println(getDia() + " de agosto de " + getAño());
                   break;
               case 9:
                   System.out.println(getDia() + " de septiembre de " + getAño());
                   break;
               case 10:
                   System.out.println(getDia() + " de octubre de " + getAño());
                   break;
               case 11:
                   System.out.println(getDia() + " de noviembre de " + getAño());
                   break;
               case 12:
                   System.out.println(getDia() + " de diciembre de " + getAño());
                   break;
               default:
                   break;
           }
        } 
    }

}
