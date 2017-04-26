package com.weatherchange.utils;

import com.weatherchange.entity.Record;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReaderUtil {
    public static ArrayList<Record> readFile(String fileName){
        BufferedReader br = null;
        java.io.FileReader fr = null;

        ArrayList<Record> records = new ArrayList<Record>();

        try {

            fr = new java.io.FileReader(fileName);
            br = new BufferedReader(fr);

            String sCurrentLine;

            br = new BufferedReader(new java.io.FileReader(fileName));


            while ((sCurrentLine = br.readLine()) != null) {
                Record record = record = processLine(sCurrentLine);
                if (null != record)
                    records.add(record);
            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (br != null)
                    br.close();

                if (fr != null)
                    fr.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }
        return records;
    }

    public static Record processLine(String line){
        int id = Integer.parseInt(line.substring(0,5));
        int year = Integer.parseInt(line.substring(6,10));
        int month = Integer.parseInt(line.substring(11,13).trim());
        int day = Integer.parseInt(line.substring(14, 16).trim());
        int tflag = Integer.parseInt(line.substring(17,18));
        double tmin = Utils.tryParseDouble(line.substring(19,24).trim());
        int qtmin = Integer.parseInt(line.substring(25,26));
        double tmean = Utils.tryParseDouble(line.substring(27,32).trim());
        int qtmean = Integer.parseInt(line.substring(33,34));
        double tmax = Utils.tryParseDouble(line.substring(35,40).trim());
        int qtmax = Integer.parseInt(line.substring(41,42));
        double r = Utils.tryParseDouble(line.substring(43,48).trim());
        int cr = Integer.parseInt(line.substring(49,50));
        int qr = Integer.parseInt(line.substring(51,52));
        Record record = new Record(id, year, month, day,tflag,tmin,qtmin,tmean, qtmean,tmax,qtmax,r,cr,qr);
        return record;
    }
}
