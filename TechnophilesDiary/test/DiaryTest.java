import diaryPhiles.Diary;
import diaryPhiles.Gist;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiaryTest {
    Diary myDiary;
    @BeforeEach
    public void setUp(){
        myDiary = new Diary("Bobo","gist234");
    }
    @Test
    public void diaryCanBeCreatedTest(){
        assertEquals(myDiary.getOwnerName(),"Bobo");
        assertEquals("gist234",myDiary.getPassword());
    }
    @Test
    public void passwordCanBeUpdatedTest(){
        myDiary.setPassword("gistmanaic234");
        assertEquals("gistmanaic234",myDiary.getPassword());
    }
    @Test
    public void gistCanBeAddedTest(){
        assertEquals(0, myDiary.getGists().size());;
        myDiary.addNewGist("My Pride","When i say my pride,i mean a ...","gist234");
        assertEquals(1, myDiary.getGists().size());
        myDiary.addNewGist("As e dey hot","Wetin eyes no go see for this Lagos wey person dey, na so i dey mind my buisness o before...","gist234");
        assertEquals(2, myDiary.getGists().size());
    }
    @Test
    public void gistCanBeSearchedUsingTitleTest(){
        myDiary.addNewGist("My Pride","When i say my pride,i mean a ...","gist234");
        myDiary.addNewGist("As e dey hot","Wetin eyes no go see for this Lagos wey person dey, na so i dey mind my buisness o before...","gist234");
        assertEquals(2, myDiary.getGists().size());

        Gist myGist = myDiary.searchGistByTitle("my pride");
        assertEquals("My Pride", myGist.getTitle());
        assertEquals("When i say my pride,i mean a ...",myGist.getFullGist());
        System.out.println(myGist);
    }
    @Test
    public void gistCanBeDeletedTest(){
        myDiary.addNewGist("My Pride","When i say my pride,i mean a ...","gist234");
        myDiary.addNewGist("As e dey hot","Wetin eyes no go see for this Lagos wey person dey, na so i dey mind my buisness o before...","gist234");
        assertEquals(2, myDiary.getGists().size());
        myDiary.deleteGist("my pride", "gist234");
        assertEquals(1, myDiary.getGists().size());
//        Gist myGist = myDiary.searchGistByTitle("my pride");
//        assertEquals("Gist not Found", myGist.getTitle());
//        assertEquals("Gist not Found",myGist.getFullGist());


    }
    @Test
    public void allGistCanBeViewedTest(){
        myDiary.addNewGist("My Pride","When i say my pride,i mean a ...","gist234");
        myDiary.addNewGist("As e dey hot","Wetin eyes no go see for this Lagos wey person dey, na so i dey mind my buisness o before...","gist234");
        assertEquals(2, myDiary.getGists().size());
        Gist myGist = myDiary.viewAllGist("gist234");
        assertEquals(myGist, myDiary.getGists());


    }



}
