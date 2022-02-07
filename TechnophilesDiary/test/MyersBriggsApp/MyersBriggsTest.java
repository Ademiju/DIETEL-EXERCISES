package MyersBriggsApp;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;

public class MyersBriggsTest {
    MyersBriggs user;
    @BeforeEach
    public void setUp() {
        user = new MyersBriggs();
    }
//    @Test
//    public void QuestionnaireIsNotEmptyTest(){
//        user = new MyersBriggs();
//        assertFalse(user.questionnaire());
//    }
    @Test
    public void QuestionnaireContainPersonalityQuestionsTest(){
//        user.setQuestion();
//        assertEquals("A. expend energy, enjoy groups%nB. conserve energy, enjoy one-on-one ",user.getQuestion());
    }
}
