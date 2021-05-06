package edu.handong.csee.java.hw2.converters;

/** This is a class for KM to M converter */
public class KMToMConverter implements Convertible {
    private double km ;
    private double m ;

    /** Setter method */
    public void setFromValue(double fromValue) {
        km = fromValue ;
    }

    /** Getter method */
    public double getConvertedValue() {
        return m ;
    }

    /** Converting method */
    public void convert() {
        m = km * 0.001 ;
    }
}