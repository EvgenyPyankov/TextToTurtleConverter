package com.weatherchange;

public class Constants {
    public static final String SOURCE_PATH = "D:\\Programming\\Diploma\\SemanticData\\SourceData\\data\\source";
    public static final String TARGET_PATH = "D:\\Programming\\Diploma\\SemanticData\\SourceData\\data\\target";
    public static final String PREFIX = "@prefix rdf:  <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .\n" +
            "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n" +
            "@prefix dbr:  <http://dbpedia.org/resource/> .\n" +
            "@prefix dbo:  <http://dbpedia.org/ontology/> .\n" +
            "@prefix xsd:  <http://www.w3.org/2001/XMLSchema#> .\n" +
            "@prefix geo:  <http://www.w3.org/2003/01/geo/wgs84_pos#> .\n" +
            "@prefix mt: <http://example.org/meteo_ru_data/> .\n" +
            "@prefix mto: <http://example.org/meteo_ru_data/ontology/> .\n" +
            "@prefix mtr: <http://example.org/meteo_ru_data/resource/> .\n";
    public static final String W_MEASURE = "%s a mto:w_measure.\n";
    public static final String DATEM = "%s mto:datem \"%s\"^^xsd:date.\n";
    public static final String ST_MEASURE = "%s mto:st_measure mtr:stat_%d.\n";
    public static final String TFLAG = "%s mto:tflag \"%d\"^^xsd:int.\n";
    public static final String QTMIN = "%s mto:qtmin \"%d\"^^xsd:int.\n";
    public static final String QTMEAN = "%s mto:qtmean \"%d\"^^xsd:int.\n";
    public static final String QTMAX = "%s mto:qtmax \"%d\"^^xsd:int.\n";
    public static final String QR = "%s mto:qr \"%d\"^^xsd:int.\n";
    public static final String CR = "%s mto:cr \"%d\"^^xsd:int.\n";
    public static final String TMEAN = "%s mto:tmean \"%f\"^^xsd:float.\n";
    public static final String TMIN = "%s mto:tmin \"%f\"^^xsd:float.\n";
    public static final String TMAX = "%s mto:tmax \"%f\"^^xsd:float.\n";
    public static final String PRECIP = "%s mto:precip \"%f\"^^xsd:float.\n";
    public static final String ID = "mtr:rc_%d_%s";
}
