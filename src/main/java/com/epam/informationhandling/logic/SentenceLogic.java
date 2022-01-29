package com.epam.informationhandling.logic;

import com.epam.informationhandling.comparator.TargetCharacterNumberComparator;
import com.epam.informationhandling.component.Component;
import com.epam.informationhandling.component.Composite;
import com.epam.informationhandling.component.Lexeme;

import java.util.ArrayList;
import java.util.List;

public class SentenceLogic {
    public Composite sortWordsByTargetCharacterNumber(Composite sentence, char targetCharacter) {
        List<Lexeme> lexemes = new ArrayList<>();
        for (Component component : sentence.getChildren()) {
            lexemes.add((Lexeme) component);
        }
        lexemes.sort(new TargetCharacterNumberComparator(targetCharacter));
        return new Composite(lexemes);
    }
}
