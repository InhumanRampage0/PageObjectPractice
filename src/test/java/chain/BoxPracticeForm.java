package chain;

import org.junit.jupiter.api.Test;

public class BoxPracticeForm {
    BoxPracticePage BoxPracticeForm = new BoxPracticePage();

    @Test
    void  successfulFillFormTest(){
        BoxPracticeForm
                .openPage()
                .fillForm()
                .checkData();
    }



}
