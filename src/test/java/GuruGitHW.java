import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GuruGitHW {

    @Test
    void successfulSearchTest() {
        open("https://www.google.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("body").shouldHave(text("Мы зарегистрировали подозрительный трафик"));
    }

    @Test
    void duckduckgoTest() {
        open("https://www.duckduckgo.com/");
        $("[name=q]").setValue("QAguru").pressEnter();
        $("body").shouldHave(text("qa.guru"));
    }
}
