package chain;

import org.junit.jupiter.api.Test;

public class BoxPracticeFormTests {
    BoxPracticePage BoxPracticeFormTests = new BoxPracticePage();

    @Test
    void  successfulFillFormTest(){
        BoxPracticeFormTests
                .openPage()
                .fillForm()
                .checkData();
    }



}
