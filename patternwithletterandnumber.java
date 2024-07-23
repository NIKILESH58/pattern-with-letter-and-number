import java.io.*;
import java.util.Scanner;
public class patternwithletterandnumber
{
    public static void main(String[] args) 

    {
        Scanner sc = new Scanner(System.in);      
        int n = sc.nextInt();     
        char character='A';
        int number=1;
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                                    System.out.print(" ");
            }
             for(int k=0;k<=i;k++)
                                    
            {                   if(k==0||k==i)
                                {
                                    System.out.print(character+" ");
                                    int a=(int)character;
                                    a=a+1;
                                    character=(char)a;
                                }
                                else
                                    {
                                   System.out.print(number+" ");
                                 number=number+1;
                                 if(number>9)
                                 number=number-10;
                                }

            }
                                    System.out.println(" ");
                                    
        }
    }
}