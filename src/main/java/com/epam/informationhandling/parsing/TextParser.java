package com.epam.informationhandling.parsing;

import com.epam.informationhandling.component.Composite;

public class TextParser extends AbstractParser {
    private static final String PARAGRAPH_DELIMITER = "\n";

    public TextParser(Parser successor) {
        super(successor);
    }

    @Override
    public Composite parse(String text) {
        return templateParse(text, PARAGRAPH_DELIMITER);
    }
}
