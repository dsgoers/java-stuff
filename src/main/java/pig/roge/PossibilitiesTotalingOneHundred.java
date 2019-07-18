package pig.roge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a program that outputs all possibilities to put + or - or nothing
 * between the numbers 1,2,…,9 (in this order) such that the result is 100.
 * For example 1 + 2 + 3 - 4 + 5 + 6 + 78 + 9 = 100.
 */
public final class PossibilitiesTotalingOneHundred {
    private PossibilitiesTotalingOneHundred() { }

    private static final String PLUS = "+";
    private static final String MINUS = "-";

    private static final List<Integer> NUMBERS_LIST = new ArrayList<>(
            Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

    private static final List<String> OPERANDS = new ArrayList<>(
            Arrays.asList("", PLUS, MINUS));
    private static final List<List<String>> OPERAND_COMBINATIONS = new
            ArrayList<>();
    private static final List<String> EQUATIONS = new ArrayList<>();
    private static final List<List<String>> SPLITTED_EQUATIONS = new
            ArrayList<>();

    public static void main(final String[] args)  {
        createOperandCombinations();
        createEquations();
        splitEquations();
        calculateTotals();

        System.out.println("\nDone.");
    }

    private static void createOperandCombinations() {
        for (String operand1: OPERANDS) {
            for (String operand2: OPERANDS) {
                for (String operand3: OPERANDS) {
                    for (String operand4: OPERANDS) {
                        for (String operand5: OPERANDS) {
                            for (String operand6: OPERANDS) {
                                for (String operand7: OPERANDS) {
                                    for (String operand8: OPERANDS) {
                                        OPERAND_COMBINATIONS.add(
                                                new ArrayList<>(Arrays.asList(
                                                operand1,
                                                operand2,
                                                operand3,
                                                operand4,
                                                operand5,
                                                operand6,
                                                operand7,
                                                operand8
                                        )));
                                    }
                                }
                            }
                        }
                    }
                }

            }
        }
    }

    private static void createEquations() {
        for (List operandCombination : OPERAND_COMBINATIONS) {
            String equation = "";

            for (int x = 0; x < NUMBERS_LIST.size(); x++) {
                equation += NUMBERS_LIST.get(x);

                if (x != NUMBERS_LIST.size() - 1) {
                    equation += operandCombination.get(x);
                }
            }

            EQUATIONS.add(equation);
        }
    }

    private static void splitEquations() {
        for (String equation : EQUATIONS) {
            SPLITTED_EQUATIONS.add(Arrays.asList(
                    equation.split("((?<=\\" + PLUS + ")|(?=\\" + PLUS + "))"
                            + "|((?<=" + MINUS + ")|(?=" + MINUS + "))"))
            );
        }
    }

    private static void calculateTotals() {
        for (List<String> splitEquation : SPLITTED_EQUATIONS) {
            int total = Integer.parseInt(splitEquation.get(0));

            for (int z = 2; z < splitEquation.size(); z += 2) {
                final String operand = splitEquation.get(z - 1);
                final Integer operator = Integer.parseInt(splitEquation.get(z));

                if (operand.equals(PLUS)) {
                    total += operator;
                } else if (operand.equals(MINUS)) {
                    total -= operator;
                } else {
                    throw new UnsupportedOperationException(
                            "Unsupported operand.");
                }
            }

            if (total == 100) {
                System.out.println(splitEquation + "\n");
            }
        }
    }
}


