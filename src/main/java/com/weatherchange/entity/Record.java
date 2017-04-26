package com.weatherchange.entity;

public class Record {
    private int id;
    private int year;
    private int month;
    private int day;
    private int tflag;
    private double tmin;
    private int qtmin;
    private double tmean;
    private int qtmean;
    private double tmax;
    private int qtmax;
    private double r;
    private int cr;
    private int qr;

    public Record(int id, int year, int month, int day, int tflag, double tmin, int qtmin, double tmean, int qtmean, double tmax, int qtmax, double r, int cr, int qr) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.day = day;
        this.tflag = tflag;
        this.tmin = tmin;
        this.qtmin = qtmin;
        this.tmean = tmean;
        this.qtmean = qtmean;
        this.tmax = tmax;
        this.qtmax = qtmax;
        this.r = r;
        this.cr = cr;
        this.qr = qr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getTflag() {
        return tflag;
    }

    public void setTflag(int tflag) {
        this.tflag = tflag;
    }

    public double getTmin() {
        return tmin;
    }

    public void setTmin(double tmin) {
        this.tmin = tmin;
    }

    public int getQtmin() {
        return qtmin;
    }

    public void setQtmin(int qtmin) {
        this.qtmin = qtmin;
    }

    public double getTmean() {
        return tmean;
    }

    public void setTmean(double tmean) {
        this.tmean = tmean;
    }

    public int getQtmean() {
        return qtmean;
    }

    public void setQtmean(int qtmean) {
        this.qtmean = qtmean;
    }

    public double getTmax() {
        return tmax;
    }

    public void setTmax(double tmax) {
        this.tmax = tmax;
    }

    public int getQtmax() {
        return qtmax;
    }

    public void setQtmax(int qtmax) {
        this.qtmax = qtmax;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public int getCr() {
        return cr;
    }

    public void setCr(int cr) {
        this.cr = cr;
    }

    public int getQr() {
        return qr;
    }

    public void setQr(int qr) {
        this.qr = qr;
    }

    public String getStrDate() {
        return String.format("%d_%02d_%02d", year, month, day);
    }

    public String getDate() {
        return String.format("%d-%02d-%02d", year, month, day);
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", tflag=" + tflag +
                ", tmin=" + tmin +
                ", qtmin=" + qtmin +
                ", tmean=" + tmean +
                ", qtmean=" + qtmean +
                ", tmax=" + tmax +
                ", qtmax=" + qtmax +
                ", r=" + r +
                ", cr=" + cr +
                ", qr=" + qr +
                '}';
    }
}
