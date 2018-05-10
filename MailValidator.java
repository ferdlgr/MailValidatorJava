/*************************************************************
* Made by: Maria Fernanda Delgado for:TC2020
*
* MailValidator.java is a program that validates if the
* expresion entered in the console is a valid email address
*
* note: to compila use javac MailValidator.java
*       to run use java MailValidator
*
* Last check: February 2018
***************************************************************/

import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.StringTokenizer;
import java.util.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
//import org.apache.commons.lang3.StringUtils;

class MailValidator
{

    public   MailValidator()
    {
        boolean valid=true;
        String xpr=JOptionPane.showInputDialog("Ingrese la expresión a evaluar");
        int count=0;
        char arroba='@';
        //Mail se convierte en arreglo de caracteres
        char arr[]=xpr.toCharArray();
        //Checa que sólo haya una arroba
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==arroba)
            {count++;}
            System.out.println("Data at ["+i+"]="+arr[i]);
        }
        if(count>=2||count<1)
        {valid=false;}
        else
        {

            String[] parts = xpr.split("@");
            String part1 = parts[0]; //antes del arroba
            String part2 = parts[1]; // despues del arroba

            System.out.println("Usuario: "+part1);
            System.out.println("Dominio: "+part2);
             System.out.println("checo esp partes ab");


                    //Checa que no empiece con puntos o cosas raras
                    if (arr[0]=='.' || arr[0]=='%'||arr[0]=='$'||arr[0]=='&'||arr[0]=='#'||arr[0]=='/'||arr[0]=='0'||part1==null||part1==""||part1.length()<=1)
                    {
                        valid=false;
                        System.out.println("checo esp char");
                    }
                    else
                    {
                        char dot='.';
                        int count2=0;
                        char arr2[]=part2.toCharArray();
                        for(int j=0;j<arr2.length;j++)
                        {
                            if(arr2[j]==dot)
                            {count2++;}
                            System.out.println("Data at ["+j+"]="+arr2[j]);

                        }
                        if(count2>=2||count2<1)
                        {valid=false;}
                    }


        }

        JOptionPane.showMessageDialog(null,"Su expresion es = "+valid);
        System.out.println("validez= "+valid);
    }
    public static void main(String args[])
    {
        do
        {
        MailValidator objeto = new MailValidator();
        }while(true);
    }
}
