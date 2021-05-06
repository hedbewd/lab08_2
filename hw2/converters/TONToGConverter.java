package edu.handong.csee.java.hw2.converters;

/** This is a class for TON to G converter */
public class TONToGConverter implements Convertible {
    private double ton ;
    private double g ;

    /** Setter method */
    public void setFromValue(double fromValue) {
        ton = fromValue ;
    }

    /** Getter method */
    public double getConvertedValue() {
        return g ;
    }

    /** Converting method */
    public void convert() {
        g = ton * 1000000 ;
    }
}