package com.epam.informationhandling.expressioncalculation;

public class TerminalMultiplyExpression implements MathExpression {
    @Override
    public void interpret(Context context) {
        context.push(context.pop() * context.pop());
    }
}
