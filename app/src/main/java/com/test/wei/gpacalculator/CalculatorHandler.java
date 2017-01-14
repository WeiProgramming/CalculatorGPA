package com.test.wei.gpacalculator;

import java.util.ArrayList;
/**
 * Created by Wei on 1/14/17.
 */
public class CalculatorHandler {
    private String grade;
    private int numUnit;
    private double overallClassUnits;
    private int numOfClassesCounter = 0;
    private double numUnits = 0.0;
    private static final double A_PLUS= 4.0;
    private static final double A = 4.0;
    private static final double A_MINUS = 3.7;
    private static final double B_PLUS = 3.3;
    private static final double B = 3.0;
    private static final double B_MINUS = 2.7;
    private static final double C_PLUS = 2.3;
    private static final double C = 2.0;
    private static final double C_MINUS = 1.7;
    private static final double D_PLUS = 1.3;
    private static final double D = 1.0;
    private static final double D_MINUS = .7;
    private static final double F = 0;

    public CalculatorHandler(){
    }

    public CalculatorHandler(String letter, int unit){
        this.grade = letter;
        this.numUnit = unit;
    }

    /**returns the number of units
     *
     * @param units the number of units or credits given within a class
     * @param grade the graded that has been recieved
     * @return the overall total of units earned with respect to grade
     */
    public double calculateNumofUnits(int units, String grade){
        if(grade.equals("A+")){
           numUnits += units*A_PLUS;
            numOfClassesCounter++;
        }
        else if(grade.equals("A")){
            numUnits += units*A;
            numOfClassesCounter++;
        }
        else if(grade.equals("A-")){
            numUnits += units*A_MINUS;
            numOfClassesCounter++;
        }
        else if(grade.equals("B+")){
            numUnits += units*B_PLUS;
            numOfClassesCounter++;
        }
        else if(grade.equals("B")){
            numUnits += units*B;
            numOfClassesCounter++;
        }
        else if(grade.equals("B-")){
            numUnits += units*B_MINUS;
            numOfClassesCounter++;
        }
        else if(grade.equals("C+")){
            numUnits += units*C_PLUS;
            numOfClassesCounter++;
        }
        else if(grade.equals("C")){
            numUnits += units*C;
            numOfClassesCounter++;
        }
        else if(grade.equals("C-")){
            numUnits += units*C_MINUS;
            numOfClassesCounter++;
        }
        else if(grade.equals("D+")){
            numUnits += units*D_PLUS;
            numOfClassesCounter++;
        }
        else if(grade.equals("D")){
            numUnits += units*D;
            numOfClassesCounter++;
        }
        else if(grade.equals("D-")){
            numUnits += units*D_MINUS;
            numOfClassesCounter++;
        }
        else if(grade.equals("F")){
            numUnits += units*F;
            numOfClassesCounter++;
        }
        else{
            System.out.println("not a letter");
        }
        return numUnits;
    }

    public double unweightedGPA(){
        double GPA = overallClassUnits/numOfClassesCounter;
        return GPA;
    }
}
