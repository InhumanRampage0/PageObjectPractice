package tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BoxPracticeFormWithJavaFaker {
    Faker faker = new Faker();


    String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            gender = "Other";


    @Test
    void selenideSearchTest() {
        open("https://demoqa.com/automation-practice-form");
// usersData
        $("#firstName").val(firstName);
        $("#lastName").val(lastName);
        $("#userEmail").val(email);
        $("#genterWrapper").$(byText(gender)).click();
        $("#userNumber").val("1234567890");
// dataPicker
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("April");
        $(".react-datepicker__year-select").selectOptionByValue("1992");
        $(".react-datepicker__day--028").click();
// subjects
        $("#subjectsInput").setValue("English").pressEnter();
        $("#subjectsInput").setValue("Hindi").pressEnter();

        $(byText("Sports")).click();
        $(byText("Music")).click();
// selectPicture
        $("#uploadPicture").uploadFromClasspath("kumamon.jpg");
//putAddress
        $("#currentAddress").setValue("Sevastopol");
//selectStateAndCity
        $("#react-select-3-input").setValue("NCR").pressEnter();
        $("#react-select-4-input").setValue("Noida").pressEnter();

        $("#submit").click();
        $x("//td[text()='Student Name']").parent().shouldHave(text(firstName + " " + lastName));
        $x("//td[text()='Student Email']").parent().shouldHave(text(email));
        $x("//td[text()='Gender']").parent().shouldHave(text(gender));
        $x("//td[text()='Mobile']").parent().shouldHave(text("1234567890"));


    }
}