package com.epam.informationhandling.expressioncalculation;

public class TerminalDivideExpression implements MathExpression{
    @Override
    public void interpret(Context context) {
        Double secondMember = context.pop();
        Double firstMember = context.pop();
        context.push(firstMember / secondMember);
    }
}
