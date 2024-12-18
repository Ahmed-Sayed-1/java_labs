import java.util.StringTokenizer;
import java.util.regex.*;
import java.lang.Math;
public class lab2_1 
{
    public static void main(String[] args) 
    {
      System.out.println(str("ITI develops people and ITI house of developers and ITI for people", "ITI")); 
      System.out.println(str1("ITI develops people and ITI house of developers and ITI for people", "ITI")); 
      System.out.println(str2("ITI develops people and ITI house of developers and ITI for people", "ITI")); 
      ip("192.9.2.50");
       MinMax();
       MinMax1();
    }
    public static  int str(String s,String sub) 
    {
       String[] parts = s.split(sub);
        return parts.length - 1;
    }
    public static  int str1(String s,String sub) 
    {
       int counter=0;
       int index=0;
       while(s.indexOf(sub,index)!=-1)
       {
            if(s.indexOf(sub,index)==0) {counter++;}
            counter++;
            index+=(s.indexOf(sub,index)+sub.length()-1);
       }
       
        return counter-1;
    }
    public static  int str2(String s,String sub) 
    {
        StringTokenizer T = new StringTokenizer(s, sub);
        return T.countTokens();
    }
    public static  void ip(String s) 
    {
        if(validIp(s)){
        StringTokenizer T = new StringTokenizer(s, ".");
         while (T.hasMoreTokens()) 
         {
            System.out.println(T.nextToken());
        }
        }else
        {
         System.out.println("invalid IP");
        }
    }
    public static  boolean validIp(String ip) 
    {
        String number="(\\d{1,2}|(0|1)\\"+ "d{2}|2[0-4]\\d|25[0-5])";
        Pattern p = Pattern.compile(number+"\\."+number+"\\."+number+"\\."+number);
        return p.matcher(ip).matches();
    }
    public static  void MinMax() 
    {
        int arr[]=new int [1000];
        int min=arr[0],max=arr[0];
        for(int i=0;i<1000;i++)
        {
        arr[i] = (int)(Math.random() * 1000) + 1;
        }
        long minTime = System.nanoTime();
       for(int i = 0; i<arr.length; i++){
        if (arr[i] < min) 
          {
            min = arr[i];
          }
       }
      minTime = System.nanoTime() - minTime;
    
    long maxTime = System.nanoTime();
      for(int i = 0; i<arr.length; i++)
      {
        if (arr[i] > max) max = arr[i];
      }
    maxTime=System.nanoTime() -maxTime;
     System.out.println("Max = "+max+"\t Time of max"+maxTime+"\n Min ="+min+"\tTime of min "+minTime);
     }
     
     public static  void MinMax1() 
    {
        int arr[]=new int [1000];
        
        for(int i=0;i<1000;i++)
        {
        arr[i] = i+1;
        }
        int min=arr[0],max=arr[999];
        int start=0;
        int end=arr.length-1  ;
        int mid=(end-start)/2;
        long minTime = System.nanoTime();
        while(start<=end)
        {
          if (arr[mid] == min ) break;
          else if (arr[mid] > min) end = mid - 1;
          else start = mid + 1;
          mid = ((end - start) / 2) + start;
        }
        minTime = System.nanoTime() - minTime;
        
    long maxTime = System.nanoTime();
    start=0;
    end=arr.length;
    mid=(end-start)/2;
      while(start<=end)
        {
          if (arr[mid] == max ) break;
          else if (arr[mid] > max) end = mid - 1;
          else start = mid + 1;
          mid = ((end - start) / 2) + start;
        }
    maxTime=System.nanoTime() -maxTime;
System.out.println("Max = "+max+"\t Time of max"+maxTime+"\n Min ="+min+"\t Time of min "+minTime);
     }
    }
   
