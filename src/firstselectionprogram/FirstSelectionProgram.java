/*
 * Michael Botros
 * September 19th, 2019
 * This program uses decision making to classify your reduction rate depending on how much you spent and it then calculates and displays your total
 */

package firstselectionprogram;

import java.util.Scanner;
/**
 *
 * @author mibot3117
 */
public class FirstSelectionProgram {
    

    
    public static void main(String[] args) {
        
        //creating a scanner object
        Scanner keyedInput = new Scanner (System.in);
        
        //declaring all constants (rates and cutoffs) and variables
        final double REDUCTION_RATE1 = 0.1;
        final double REDUCTION_RATE2 = 0.2;
        final double REDUCTION_RATE3 = 0.3;
        final double REDUCTION_RATE4 = 0.4;
        final double CUTOFF1 = 40.0;
        final double CUTOFF2 = 80.0;
        final double CUTOFF3 = 120.0;
        double savings = 0;
        double total = 0;
        double spent = 0;
        double reductionRateDisplay = 0;
        
        //prompting user for amount spent and storing it
        System.out.println("Please enter the amount you spent:");
        spent = keyedInput.nextDouble();
        
        //The nest sections use if statements to find which reduction rate to use depending on the amount spent. It then calculates the reduction amount and stores it for output
        if (spent <= CUTOFF1 && spent > 0) {
            
        savings = (REDUCTION_RATE1 * spent);
        total = spent - savings;
        reductionRateDisplay = REDUCTION_RATE1;
        
        } else if (spent <= CUTOFF2){
        
        savings = (REDUCTION_RATE2 * spent);
        total = spent - savings;
        reductionRateDisplay = REDUCTION_RATE2;
        
        } else if (spent <= CUTOFF3){
        
        savings = (REDUCTION_RATE3 * spent);
        total = spent - savings;
        reductionRateDisplay = REDUCTION_RATE3;
            
        } else if (spent > CUTOFF3){
        
        savings = (REDUCTION_RATE4 * spent);
        total = spent - savings;
        reductionRateDisplay = REDUCTION_RATE4;
            
        }
        
        //The next two sections simply round the values for savings and total
        savings = savings * 100;
        savings = Math.round(savings);
        savings = savings/100;
        
        total = total * 100;
        total = Math.round(total);
        total = total/100;
        
        //These lines then output all relevant information to the user
        System.out.println("You spent " + spent + "$");
        System.out.println("You are saving " + (reductionRateDisplay * 100) + "%");
        System.out.println("You are saving " + savings + "$");
        System.out.println("Your total is " + total + "$");
    }
    
}
