package com.weatherchange.utils;

import com.weatherchange.Constants;
import com.weatherchange.entity.Record;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileWriterUtil {
    static BufferedWriter bw = null;
    static FileWriter fw = null;

    public static void writeFile(ArrayList<Record> records) {

        try {

            fw = new FileWriter(Constants.TARGET_PATH + "\\" + records.get(0).getId() + ".ttl");
            bw = new BufferedWriter(fw);

            bw.write(Constants.PREFIX);
            for (Record record : records) {
                writeRecord(record);
            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (bw != null)
                    bw.close();

                if (fw != null)
                    fw.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }

    }

    private static void writeRecord(Record record) throws IOException {
        String id = String.format(Constants.ID, record.getId(), record.getStrDate());
        bw.write(String.format(Constants.W_MEASURE, id));
        bw.write(String.format(Constants.DATEM, id, record.getDate()));
        bw.write(String.format(Constants.ST_MEASURE, id, record.getId()));
        bw.write(String.format(Constants.TFLAG, id, record.getTflag()));
        bw.write(String.format(Constants.QTMIN, id, record.getQtmin()));
        bw.write(String.format(Constants.QTMEAN, id, record.getQtmean()));
        bw.write(String.format(Constants.QTMAX, id, record.getQtmax()));
        bw.write(String.format(Constants.QR, id, record.getQr()));
        bw.write(String.format(Constants.CR, id, record.getCr()));
        bw.write(String.format(Constants.TMEAN, id, record.getTmean()));
        bw.write(String.format(Constants.TMIN, id, record.getTmin()));
        bw.write(String.format(Constants.TMAX, id, record.getTmax()));
        bw.write(String.format(Constants.PRECIP, id, record.getR()));
    }
}
