package edu.handong.csee.java.hw2.converters;

/** This is a class for TON to G converter */
public class TONToKGConverter implements Convertible {
    private double ton ;
    private double kg ;

    /** Setter method */
    public void setFromValue(double fromValue) {
        ton = fromValue ;
    }

    /** Getter method */
    public double getConvertedValue() {
        return kg ;
    }

    /** Converting method */
    public void convert() {
        kg = ton * 1000 ;
    }
}