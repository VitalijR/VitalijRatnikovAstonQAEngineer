package Lesson18;

import io.qameta.allure.Owner;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

// Задание Lesson16. Применение паттерна PageObject для тестирования платежной секции
public class MTSPaySectionTests {
    WebDriver driver;
    PaySectionPage paySectionPage;

    @Owner("Виталий")
    // В блоке BeforeClass производится подготовка к тестам.
    @BeforeMethod
    public void setUp() {

        // Создание экземпляра класса WebDriver и открытие сайта "https://www.mts.by/"
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");

                /* Так как окно с настройками cookie появляется не всегда но мешает проведению тестов,
          оно находится в блоке try/catch */
        try {
            WebElement cookie = driver.findElement(By.id("cookie-agree"));
            cookie.click();
        } catch (NoSuchElementException n) {
            n.printStackTrace();
        } catch (ElementNotInteractableException e) {
            e.printStackTrace();
        }

        // Создание экземпляра класса paySectionPage
        paySectionPage = new PaySectionPage(driver);
    }

    // Поверка названия блока
    @Test
    public void checkName() {
        // Вызов метода getHeaderText класса paySectionPage
        Assert.assertEquals(paySectionPage.getHeaderText(),
                "Онлайн пополнение\nбез комиссии", "Название блока не соответсвует требуему!");
    }

    // Проверка отображения логотипов в блоке оплаты
    @Test
    public void paysLogosIsExist() {
        for (int i = 1; i <= 5; i++) {
            // Вызов метода isLogoDisplayed класса paySectionPage
            Assert.assertTrue(paySectionPage.isLogoDisplayed(i), "Логотип " + i + " не отображается.");
        }
    }

    // Проверка корректности плейсхолдеров
    @Test
    public void checkPlaceholders (){

        // Массив с ожидаемыми плейсхолдерами
        String [] placeholders = {"Номер телефона", "Номер абонента", "Номер счета на 44", "Номер счета на 2073"};

        for (int i = 0; i < 4; i++) {

            // Вызов метода selectPayOptions класса paySectionPage
            paySectionPage.selectPayOptions(i);

            // Возвращенный из метода getPlaceholderPhoneNumber массив записывается в массив s
            String [] s = paySectionPage.getPlaceholderPhoneNumber(i, placeholders);

            // Проверяется соответствие фактического и ожидаемого текста плейсхолдеров
            Assert.assertEquals(s [0], s [1], "Неверный плейсхолдер в поле номер");
            Assert.assertEquals(paySectionPage.getPlaceholderSum(),
                    "Сумма", "Неверный плейсхолдер в поле сумма");
            Assert.assertEquals(paySectionPage.getPlaceholderEmail(),
                    "E-mail для отправки чека", "Неверный плейсхолдер в поле email");
        }
    }

    // Проверка ссылки "Подробнее о сервисе"
    @Test
    public void testLinkIsCorrect() {
        // Вызов метода clickLink класса paySectionPage
        paySectionPage.clickLink();
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/",
                "Ссылка ведет на неправильную страницу!");

        // Возврат на главную страницу
        driver.navigate().back();
    }

    // Проверка кнопки "Продолжить"
    @Test
    public void checkContinueButton() {
        paySectionPage.enterPhoneAndSum("(29)777-77-77", "100");

        // Вызов метода isContinueButtonEnabled класса paySectionPage
        Assert.assertTrue(paySectionPage.isContinueButtonEnabled(), "Кнопка продолжить не кликабельна");
    }


    //Проверка фрейма оплаты
    @Test
    public void checkPayFrame () {

        // Вызов метода enterPhoneAndSum класса paySectionPage
        paySectionPage.enterPhoneAndSum("(29)777-77-77", "100");

        // Вызов метода clickContinueButton класса paySectionPage
        paySectionPage.clickContinueButton();

        // Вызов метода switchToPayFrame класса paySectionPage
        paySectionPage.switchToPayFrame();

        //Проверка суммы в заголовке и на кнопке
        Assert.assertEquals(paySectionPage.getSumInFrame(),
                "100.00 BYN", "Сумма в заголовке не соответствует требуемой");
        Assert.assertEquals(paySectionPage.getSumOnButton(),
                "Оплатить 100.00 BYN", "Сумма на кнопке не соответствует требуемой");

        //Проверка номера телефона в заголовке
        Assert.assertEquals(paySectionPage.getPhoneInFrame(),
                "Оплата: Услуги связи Номер:375297777777", "Номер телефона не соответствует требуемому");

        // Проверка плейсхолдеров фрейма оплаты
        Assert.assertEquals(paySectionPage.getPlaceholderCardNumber(),
                "Номер карты", "Неверный плейсхолдер в поле номер карты");
        Assert.assertEquals(paySectionPage.getPlaceholderValidity(),
                "Срок действия", "Неверный плейсхолдер в поле срок действия");
        Assert.assertEquals(paySectionPage.getPlaceholderCVC(),
                "CVC", "Неверный плейсхолдер в поле CVC");
        Assert.assertEquals(paySectionPage.getPlaceholderName(),
                "Имя держателя (как на карте)", "Неверный плейсхолдер в поле Имя держателя");


        // Проверка отображения логотипов во фрейме
        for (int i = 1; i <= 4; i++) {
            Assert.assertTrue(paySectionPage.isLogoInFrameDisplayed(i), "Логотип " + i + " не отображается.");
        }

        // Закрытие окна оплаты
        paySectionPage.closePopup();

        // Возврат на основной фрейм
        driver.switchTo().parentFrame();
    }

    // Закрытие драйвера после проведения тестов
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}