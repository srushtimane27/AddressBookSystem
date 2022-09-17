package com.Bridgelabz.AddressBook;

import java.io.FileWriter;
import com.opencsv.CSVWriter;

public class WriteIntoCSV {
    public static void main(String args[]) throws Exception {
        //Instantiating the CSVWriter class
        CSVWriter writer = new CSVWriter(new FileWriter("C:/Users/SRUSHTI/Documents/AddressBook.csv"));
        //Writing data to a csv file
        String line1[] = {"First Name", "Last Name", "Address", "City", "State", "Zip", "Phone Number", "Email"};
        String line2[] = {"Srushti", "Mane", "Dapodi", "Pune", "Maharashtra", "42516", "451278525", "abc@gmail.com"};
        String line3[] = {"Rasika", "Mule", "Aundh", "Satara", "Maharashtra", "42513", "236548625", "bhg@gmail.com"};
        //Writing data to the csv file
        writer.writeNext(line1);
        writer.writeNext(line2);
        writer.writeNext(line3);
        //Flushing data from writer to file
        writer.flush();
        System.out.println("Data entered");
    }

}
