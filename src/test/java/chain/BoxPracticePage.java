package chain;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BoxPracticePage {

    public BoxPracticePage openPage(){
        open("https://demoqa.com/automation-practice-form");
         return this;

    }

    public BoxPracticePage fillForm(){
            $("#firstName").setValue("Bogdan");
            $("#lastName").setValue("Pershko");
            $("#userEmail").setValue("Boduk99@mail.ru");
            $(byText("Male")).click();
            $("#userNumber").setValue("0123456789");
            $("#dateOfBirthInput").click();
            $(".react-datepicker__month-select").selectOption("April");
            $(".react-datepicker__year-select").selectOptionByValue("1992");
            $(".react-datepicker__day--028").click();
            $("#subjectsInput").setValue("English").pressEnter();
            $("#subjectsInput").setValue("Hindi").pressEnter();
            $("#subjectsInput").setValue("Commerce").pressEnter();
            $(byText("Sports")).click();
            $(byText("Music")).click();
            $("#uploadPicture").uploadFromClasspath("kumamon.jpg");
            $("#currentAddress").setValue("Sevastopol");
            $("#react-select-3-input").setValue("NCR").pressEnter();
            $("#react-select-4-input").setValue("Noida").pressEnter();
            $("#submit").click();
            return this;

        }
        public void checkData(){
        $(".modal-content").shouldHave(text("Boduk99@mail.ru"), text("Bogdan Pershko"),
                text("0123456789"), text("28 April,1992"), text("English, Hindi, Commerce"),
                text("Sports, Music"), text("Sevastopol"), text("NCR Noida"), text("kumamon.jpg"));


    }

}
