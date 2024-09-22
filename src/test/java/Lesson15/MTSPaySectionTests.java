package Lesson15;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

// Задание Lesson15 создание тестов для блока "Онлайн пополнение без комиссии
public class MTSPaySectionTests {

    WebDriver driver;

    // В блоке BeforeClass производится подготовка к тестам
    @BeforeClass
    public void setUp() {

        // Создание экземпляра класса WebDriver и открытие сайта "https://www.mts.by/"
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");

        /* Так как окно с настройками cookie появляется не всегда но мешает проведению тестов,
          оно находится в блоке try/catch */
        try {
            // Нажатие кнопки "Принять"
            WebElement cookie = driver.findElement(By.id("cookie-agree"));
            cookie.click();
        } catch (NoSuchElementException n) {
            n.printStackTrace();
        }
    }

    // Задание №1 Проверка названия блока
    @Test
    public void checkName() {

        // Поиск заголовка ...
        WebElement header = driver.findElement(By.cssSelector(
                "#pay-section > div > div > div.col-12.col-xl-8 > section > div > h2"));
        // ... и проверка на соответствие
        Assert.assertEquals(header.getText(), "Онлайн пополнение\n" +
                "без комиссии", "Название блока не соответсвует требуему!");
    }

    // Задание №2 Проверка проверка отображения логотипов платежных систем
    @Test
    public void paysLogosIsExist() {

        Assert.assertTrue(driver.findElement(By.cssSelector(
                "#pay-section > div > div > div.col-12.col-xl-8 > section > div > div.pay__partners > ul > li:nth-child(1) > img"
        )).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector(
                "#pay-section > div > div > div.col-12.col-xl-8 > section > div > div.pay__partners > ul > li:nth-child(2) > img"
        )).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector(
                "#pay-section > div > div > div.col-12.col-xl-8 > section > div > div.pay__partners > ul > li:nth-child(3) > img"
        )).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector(
                "#pay-section > div > div > div.col-12.col-xl-8 > section > div > div.pay__partners > ul > li:nth-child(4) > img"
        )).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector(
                "#pay-section > div > div > div.col-12.col-xl-8 > section > div > div.pay__partners > ul > li:nth-child(5) > img"
        )).isDisplayed());
    }

    // Задание №3 Проверка ссылки "Подробнее о сервисе"
    @Test
    public void testLinkIsCorrect() {

        // Поиск ссылки и нажатие
        WebElement link = driver.findElement(By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > a"));
        link.click();

        // Проверка перехода на страницу с информацией об оплате
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/", "ССылка ведет на неправильную страницу!");

        // Возврат на главную страницу
        driver.navigate().back();
    }

    // Задание №4 Проверка кнопки "Продолжить"
    @Test
    public void checkContinueButton() {

        // Поиск и заполнение поля "Номер телефона"
        WebElement phone = driver.findElement(By.id("connection-phone"));
        phone.sendKeys("(29)777-77-77");

        // Поиск и заполнение поля "Сумма"
        WebElement summa = driver.findElement(By.id("connection-sum"));
        summa.sendKeys("100");

        // Поиск и нажатие кнопки "Продолжить"
        WebElement contButton = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));
        contButton.click();

        // Фрейм оплаты открывается с задержкой, поэтому добавлено ожидание
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        // Переключение драйвера на фрейм оплаты
        driver.switchTo().frame(driver.findElement(By.cssSelector("body > div.bepaid-app > div > iframe")));

        // Поиск, проверка и нажатие кнопки закрыть
        WebElement close = driver.findElement(By.cssSelector(
                "body > app-root > div > div > app-header > header > div > app-back-navigation > div > div > svg-icon"));
        Assert.assertTrue(close.isEnabled());
        close.click();

        // Возврат на основной фрейм
        driver.switchTo().parentFrame();
    }

    // Закрытие драйвера после проведения тестов
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
