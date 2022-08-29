import javax.swing.*;

public class Bmi {

    public static void main(String[] args) {

        double lengthcm;
        lengthcm = Double.parseDouble(JOptionPane.showInputDialog(null, "Hur lång är du i cm?"));
        double length = lengthcm/100;

        double weight;
        weight = Double.parseDouble(JOptionPane.showInputDialog(null, "Hur mycket väger du i kg?"));

        double bmiResultat = weight/(length*length);
        String bmiVikt;




        //System.out.println("Längd: " + length + " m");
        //System.out.println("Vikt: " + weight);
        //System.out.println("Bmi: " + bmiResultat);
        //System.out.println("Bmi: " + Math.round(bmiResultat) + " avrundat");

            //beräknar viktklass
            if (bmiResultat <18.5) {
                //System.out.println("Viktklass: Undervikt");
                bmiVikt = "Undervikt";
            }
            else if (bmiResultat >=18.5 && bmiResultat <=25) {
                //System.out.println("Viktklass: Normalvikt");
                bmiVikt = "Normalvikt";
            }
            else if (bmiResultat >25 && bmiResultat <=30) {
                //System.out.println("Viktklass: Övervikt");
                bmiVikt = "Övervikt";
            }
            else if (bmiResultat >30 && bmiResultat <=35) {
                //System.out.println("Viktklass: Fetma klass 1");
                bmiVikt = "Fetma klass 1";
            }
            else if (bmiResultat >35 && bmiResultat <=40) {
                //System.out.println("Viktklass: Fetma klass 2");
                bmiVikt = "Fetma klass 2";
            }
            else{
                //System.out.println("Viktklass: Fetma Klass 3");
                bmiVikt = "Fetma Klass 3";
            }
        JOptionPane.showMessageDialog(null, "Längd: " + length + " m\n"
                + "Vikt: " + weight + " kg\n"
                + "Bmi: " + bmiResultat + "\n"
                + "Bmi: " + Math.round(bmiResultat) + " avrundat\n"
                + "Viktklass: " + bmiVikt);

        System.exit(0);

    }
}