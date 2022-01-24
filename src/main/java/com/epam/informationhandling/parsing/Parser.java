package com.epam.informationhandling.parsing;

import com.epam.informationhandling.component.Composite;

public interface Parser {
    Composite parse(String text);
}
