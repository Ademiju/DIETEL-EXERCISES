package chapterForteen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PigLatinTest {
    @Test
    void englishWordCanBeChangedToPigLatinWordTest(){
       String result = PigLatin.printPigLatinWord("jump");
        assertEquals("umpjay",result);
    }
    @Test
    void englishSentenceCanBeChangedToPigLatinWordTest(){
        String result = PigLatin.printPigLatinSentence("My name is Ademiju");
        assertEquals("yMay amenay siay demijuAay", result);
    }

}