import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a program that outputs all possibilities to put + or - or nothing between the numbers 1,2,…,9 (in this order)
 * such that the result is 100. For example 1 + 2 + 3 - 4 + 5 + 6 + 78 + 9 = 100.
 */
public class PossibilitiesTotalingOneHundred {
    private static final String PLUS = "+";
    private static final String MINUS = "-";

    private static final List<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 2, 3));

    private static final List<String> operands = new ArrayList<>(Arrays.asList("", PLUS, MINUS));
    private static final List<List<String>> operandCombinations = new ArrayList<>();
    private static final List<String> equations = new ArrayList<>();
    private static final List<List<String>> splittedEquations = new ArrayList<>();

    public static void main(String[] args)  {
        createOperandCombinations();
        createEquations();
        splitEquations();
        calculateTotals();

        System.out.println("\nDone.");
    }

    private static void createOperandCombinations() {
        for (String operand1: operands) {
            for (String operand2: operands) {
                operandCombinations.add(new ArrayList<>(Arrays.asList(operand1, operand2)));
            }
        }
    }

    private static void createEquations() {
        for(List operandCombination : operandCombinations) {
            String equation = "";

            for(int x = 0; x < numbersList.size(); x++) {
                equation += numbersList.get(x);

                if(x != numbersList.size() - 1) {
                    equation += operandCombination.get(x);
                }
            }

            equations.add(equation);
        }
    }

    private static void splitEquations() {
        for (String equation : equations) {
            splittedEquations.add(Arrays.asList(
                    equation.split("((?<=\\" + PLUS + ")|(?=\\" + PLUS + "))|((?<=" + MINUS + ")|(?=" + MINUS + "))"))
            );
        }
    }

    private static void calculateTotals() {
        for(List<String> splitEquation : splittedEquations) {
            System.out.print(splitEquation + " = ");
            int total = Integer.parseInt(splitEquation.get(0));

            for(int z = 2; z < splitEquation.size(); z += 2) {
                final String operand = splitEquation.get(z - 1);
                final Integer operator = Integer.parseInt(splitEquation.get(z));

                if (operand.equals(PLUS)) {
                    total += operator;
                } else if(operand.equals(MINUS)) {
                    total -= operator;
                } else {
                    throw new UnsupportedOperationException("Unsupported operand.");
                }
            }

            System.out.println(total + "\n");
        }
    }
}


