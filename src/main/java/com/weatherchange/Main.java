package com.weatherchange;

import com.weatherchange.entity.Record;
import com.weatherchange.utils.FileReaderUtil;
import com.weatherchange.utils.FileWriterUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));

        File folder = new File(Constants.SOURCE_PATH);
        File[] listOfFiles = folder.listFiles();

        int i = 1;
        for (File file : listOfFiles) {
            if (file.isFile()) {
                String filePath = file.getPath();
                System.out.println("#" + i + " Reading file: " + filePath);
                ArrayList<Record> records = FileReaderUtil.readFile(filePath);
                FileWriterUtil.writeFile(records);
                i++;
            }
        }
    }
}
