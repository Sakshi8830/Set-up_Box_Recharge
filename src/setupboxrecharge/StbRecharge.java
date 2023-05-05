/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setupboxrecharge;

import java.util.Scanner;
class Stb
{
  long stbno;
  String type;
  String name;
  long tamt;
  Stb(long stbno,String type,String name,long tamt)
  {
      this.stbno=stbno;
      this.type=type;
      this.tamt=tamt;
      this.name=name;
  }
  public void getDetail()
  {
       System.out.println("Set Up Box Recharge Details:");
        System.out.println("\t\tStbno.\t|\tStb Type\t|\tCustomer Name\t|\tAmount pay");
        System.out.println("\t\t"+stbno+"\t|\t"+type+"\t\t|\t"+name+"\t\t|\t"+tamt);
  }

    void getRecharge(int paid)
    {
        if(paid==tamt)
        {
            System.out.println("Customer is eligible to take next recharge");
            System.out.println("Please pay for continue service Rs."+tamt);
        }
        else
        if(paid<tamt)
        {
            tamt=tamt-paid;
         System.out.println("Customer is not eligible to take recharge!!To continue service Please complete your amount:"+tamt);
        }
        else
            if(paid>tamt)
            {
              System.out.println("Your eligible to take next recharge");
              tamt=tamt-paid;
              System.out.println("Complete this amount to continue your service:"+tamt);
            }
    }
}
public class StbRecharge {
  public static void main(String args[])
  {
      Scanner scanner=new Scanner(System.in);
      Stb s1=new Stb(1234,"SD","Lili",400);
      Stb s2=new Stb(1235,"HD","Harry",450);
      Stb s3=new Stb(1236,"SD","Michale",400);
      while(true)
      {
      System.out.println("---Welcome To UCN Digital TV Service---");
      System.out.println("Enter your name:");
      String name=scanner.next();
      System.out.println("Enter type of setup box number:");
      long stbno=scanner.nextLong();
      if(name.equalsIgnoreCase(s1.name)|| stbno==s1.stbno)
      {
          System.out.println("Your eligible for further service");
          s1.getDetail();
          System.out.println("Enter Customer paid amount:");
          int paid=scanner.nextInt();
          s1.getRecharge(paid);
      }
      else
        if(name.equalsIgnoreCase(s2.name)|| stbno==s2.stbno)
      {
          System.out.println("Your eligible for further service");
          s2.getDetail();
          System.out.println("Enter Customer paid amount:");
          int paid=scanner.nextInt();
          s2.getRecharge(paid);
      }
      else
         if(name.equalsIgnoreCase(s3.name)||  stbno==s3.stbno)
      {
          System.out.println("Your eligible for further service");
          s3.getDetail();
          System.out.println("Enter Customer paid amount:");
          int paid=scanner.nextInt();
          s3.getRecharge(paid);
      }
      else
         System.out.println("Not found customer information!!");    
      }
  }
}

