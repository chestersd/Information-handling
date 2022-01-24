package com.epam.informationhandling.parsing;

import com.epam.informationhandling.component.Component;
import com.epam.informationhandling.component.Composite;

public abstract class AbstractParser implements Parser{
    private final Parser successor;

    public AbstractParser(Parser successor) {
        this.successor = successor;
    }

    public AbstractParser() {
        successor = null;
    }

    public Parser getSuccessor() {
        return successor;
    }

    protected Composite templateParse(String text, String delimiterRegex) {
        Composite resultComposite = new Composite();
        String[] textSplitWithDelimiter = text.split(delimiterRegex);
        for (String textSegment : textSplitWithDelimiter) {
            Component textSegmentComposite = getSuccessor().parse(textSegment);
            resultComposite.add(textSegmentComposite);
        }
        return resultComposite;
    }
}
