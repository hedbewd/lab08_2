package edu.handong.csee.java.hw2.converters;

/** This is the class for converting all materials at the same time. */
public class AllConverter {
    private double fromValue ;
    private String originalMeasure ;

    /** Set value for method chaining. */
    public AllConverter setFromValue(double fromValue) {
        this.fromValue = fromValue ;
        return this ;
    }
    
    /** Set original measure for method chaining. */
    public AllConverter setOriginalMeasure(String originalMeasure) {
        this.originalMeasure = originalMeasure ;
        return this ;
    }

    /** Convert and print */
    public void convertAndPrintOut() {
        if (originalMeasure.equals("KM")) {
            System.out.println(fromValue + " KM to " + fromValue * 1000.0 + " M") ;
            double mile ;
            mile = Math.round(fromValue * 0.625 * 100000) / 100000.0 ;
            System.out.println(fromValue + " KM to " + mile + " MILE") ;
        }
        else if (originalMeasure.equals("TON")) {
            System.out.println(fromValue + " TON to " + fromValue * 1000.0 + " KG") ;
            System.out.println(fromValue + " TON to " + fromValue * 1000000.0 + " G") ;
        }
        else
            System.out.println("AllConverter cannot support the measure!") ;
    }
}