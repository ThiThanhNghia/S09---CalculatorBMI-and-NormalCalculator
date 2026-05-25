/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sh09;

/**
 * S09 - This class contains operators.
 *
 * @author CE201300 - Thi Thanh Nghĩa
 */
public enum Operator {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/"),
    EXPONENT("^"),
    EQUAL("=");

    private final String symbol;

    /**
     * This constructor automatically assigns operator symbols.
     *
     * @param symbol The correct symbol for each operator.
     */
    Operator(String symbol) {
        this.symbol = symbol;
    }

    /**
     * This method is used to get the symbol of each operator.
     *
     * @return symbol of each operator.
     */
    public String getSymbol() {
        return this.symbol;
    }
}
