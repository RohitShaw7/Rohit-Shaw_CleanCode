package com.epam.CleanCode;
import java.io.*;


public class SimpleCompoundInterest 
{
    static
    {
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter printThing = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
            printThing.write("Enter the material standard : \n Enter 1 standard material \n Enter 2 above standard material \n Enter 3 high standard material \n");
            printThing.flush();
            int option = Integer.parseInt(br.readLine());
            printThing.write("You want fully automated home? (Y/N) :");
            printThing.flush();
            String yes_no = br.readLine();
            printThing.write("Total Area of House :");
            printThing.flush();
            float area = Float.parseFloat(br.readLine());
            printThing.flush();
            //char final_choice = yes_no.charAt(0).toLowerCase();
            if(option == 1)
            {
                printThing.write("Cost = "+(area*1200));
                printThing.flush();
            }
            else if(option == 2){
                printThing.write("Cost = "+(area*1500));
                printThing.flush();
            }
            else if(option == 3){
                printThing.write("Cost = "+(area*1800));
                printThing.flush();
            }
            else if(option == 3 && yes_no.toLowerCase().charAt(0)=='y'){
                printThing.write("Cost = "+(area*2500));
                printThing.flush();
            }
            else
            {
                printThing.write("Wrong Choice");
                printThing.flush();
            }
            System.exit(0);
        }
        catch(Exception e)
        {
            
        }
    }
}






