package com.epam.informationhandling.expressioncalculation;

public class TerminalPlusExpression implements MathExpression {
    @Override
    public void interpret(Context context) {
        context.push(context.pop() + context.pop());
    }
}
