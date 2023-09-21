import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {
  @Test
  void successfulSearchTest() {
    open("https://doramaclub.net/3179-q1-korol-zemli.html");
    $("[name=q]").setValue("selenide").pressEnter();
    $("[id=search]").shouldHave(text("https://ru.selenide.org"));

  }
}
