package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

import java.time.Duration;


public class Bloxorz {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    public Bloxorz() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        // Set the path to the ChromeDriver executable

        // Create a new instance of the ChromeDriver
        this.driver = new ChromeDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.actions = new Actions(driver);
    }

    public static void main(String[] args) throws Throwable {
        try {
            Bloxorz bloxorz = new Bloxorz();
            bloxorz.launchCoolMathGames();
            bloxorz.navigateToBloxorz();
            bloxorz.navigateGameMenu();
            bloxorz.completeLevel1();
            bloxorz.completeLevel2();
            bloxorz.completeLevel3();
            bloxorz.completeLevel4();
            bloxorz.completeLevel5();
            bloxorz.completeLevel6();
            bloxorz.completeLevel7();
            bloxorz.completeLevel8();
            bloxorz.completeLevel9();
            bloxorz.completeLevel10();
            bloxorz.completeLevel11();
            bloxorz.completeLevel12();
            bloxorz.completeLevel13();
            bloxorz.completeLevel14();
            bloxorz.completeLevel15();
            bloxorz.completeLevel16();
            bloxorz.completeLevel17();
            bloxorz.completeLevel18();
            bloxorz.completeLevel19();
            bloxorz.completeLevel20();
            bloxorz.completeLevel21();
            bloxorz.completeLevel22();
            bloxorz.completeLevel23();
            bloxorz.completeLevel24();
            bloxorz.completeLevel25();
            bloxorz.completeLevel26();
            bloxorz.completeLevel27();
            bloxorz.completeLevel28();
            bloxorz.completeLevel29();
            bloxorz.completeLevel30();
            bloxorz.completeLevel31();
            bloxorz.completeLevel32();
            bloxorz.completeLevel33();

            Thread.sleep(30000);
//            bloxorz.closeDriver();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void launchCoolMathGames() {
        try {
            // Navigate to a webpage
            driver.get("https://www.coolmath-games.com");

            // Perform other actions on the webpage as needed
            driver.manage().window().maximize();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void navigateToBloxorz() throws Throwable {
        try {
            WebElement searchBar = wait.until(visibilityOfElementLocated(By.cssSelector("input[id='search-bar']")));
            searchBar.sendKeys("bloxorz");
            WebElement searchButton = wait.until(visibilityOfElementLocated(By.cssSelector("button[class='see-result']")));
            searchButton.click();
            WebElement bloxorzTitle = wait.until(visibilityOfElementLocated(By.cssSelector("a[href='/0-bloxorz']")));
            bloxorzTitle.click();

            //wait for ad to play
            Thread.sleep(40000);

            //switch to the game iframe to interact with the game
            driver.switchTo().frame("html5game");
            WebElement gameWindow = wait.until(visibilityOfElementLocated(By.cssSelector("canvas[id='canvas']")));
            gameWindow.click();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void navigateGameMenu() throws Throwable {
        try {
            //wait for game intro to play
            Thread.sleep(5000);

            WebElement gameWindow = wait.until(visibilityOfElementLocated(By.cssSelector("canvas[id='canvas']")));

            //click "Start New Game"
            actions.moveToElement(gameWindow, -100, 40).click().perform();

            //click the first "Next"
            Thread.sleep(1500);
            actions.moveToElement(gameWindow, 300, 130).click().perform();

            //click "Next" on the rest of the screens
            for (int i = 0; i < 8; i++) {
                Thread.sleep(500);
                actions.moveToElement(gameWindow, 300, 170).click().perform();
            }
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void closeDriver() {
        // Close the browser
        driver.quit();
    }

    public void move(String direction) throws Throwable {
        try {
            switch (direction) {
                case "up":
                    actions.keyDown("W").perform();
                    Thread.sleep(125);
                    actions.keyUp("W").perform();
                    Thread.sleep(125);
                    break;
                case "down":
                    actions.keyDown("S").perform();
                    Thread.sleep(125);
                    actions.keyUp("S").perform();
                    Thread.sleep(125);
                    break;
                case "left":
                    actions.keyDown("A").perform();
                    Thread.sleep(125);
                    actions.keyUp("A").perform();
                    Thread.sleep(125);
                    break;
                case "right":
                    actions.keyDown("D").perform();
                    Thread.sleep(125);
                    actions.keyUp("D").perform();
                    Thread.sleep(125);
                    break;
                case "space":
                    actions.keyDown(Keys.SPACE).perform();
                    Thread.sleep(125);
                    actions.keyUp(Keys.SPACE).perform();
                    Thread.sleep(125);
                    break;
            }
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void completeLevel1() throws Throwable {
        try {
            //wait for level intro
            Thread.sleep(6000);

            move("right");
            move("right");
            move("down");
            move("right");
            move("right");
            move("right");
            move("down");
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void completeLevel2() throws Throwable {
        try {
            //wait for level intro
            Thread.sleep(8000);

            move("up");
            move("right");
            move("down");
            move("right");
            move("right");
            move("right");
            move("right");
            move("up");
            move("up");
            move("down");
            move("right");
            move("down");
            move("right");
            move("right");
            move("up");
            move("right");
            move("up");
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void completeLevel3() throws Throwable {
        try {
            //wait for level intro
            Thread.sleep(8000);

            move("right");
            move("up");
            move("right");
            move("right");
            move("right");
            move("up");
            move("left");
            move("down");
            move("right");
            move("up");
            move("up");
            move("right");
            move("right");
            move("right");
            move("down");
            move("down");
            move("down");
            move("right");
            move("up");
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void completeLevel4() throws Throwable {
        try {
            // Wait for level intro
            Thread.sleep(8000);

            // Generated sequence
            move("up");
            move("left");
            move("up");
            move("right");
            move("right");
            move("up");
            move("right");
            move("right");
            move("right");
            move("right");
            move("right");
            move("right");
            move("down");
            move("right");
            move("down");
            move("down");
            move("down");
            move("down");
            move("down");
            move("right");
            move("up");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("down");

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void completeLevel5() throws Throwable {
        try {
            // Wait for level intro
            Thread.sleep(8000);

            // Generated sequence
            move("left");
            move("left");
            move("left");
            move("right");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("down");
            move("right");
            move("down");
            move("down");
            move("right");
            move("right");
            move("right");
            move("right");
            move("down");
            move("right");
            move("right");
            move("right");
            move("right");
            move("left");
            move("left");
            move("left");
            move("left");
            move("down");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void completeLevel6() throws Throwable {
        try {
            // Wait for level intro
            Thread.sleep(8000);

            // Generated sequence
            move("right");
            move("right");
            move("right");
            move("down");
            move("down");
            move("right");
            move("down");
            move("down");
            move("right");
            move("down");
            move("right");
            move("up");
            move("left");
            move("left");
            move("left");
            move("up");
            move("up");
            move("left");
            move("up");
            move("up");
            move("up");
            move("right");
            move("right");
            move("down");
            move("right");
            move("right");
            move("up");
            move("left");
            move("down");
            move("down");
            move("right");
            move("right");
            move("down");
            move("down");
            move("right");

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void completeLevel7() throws Throwable {
        try {
            // Wait for level intro
            Thread.sleep(8000);

            // Generated sequence
            move("down");
            move("left");
            move("up");
            move("right");
            move("right");
            move("right");
            move("right");
            move("right");
            move("down");
            move("right");
            move("left");
            move("up");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("down");
            move("right");
            move("down");
            move("right");
            move("down");
            move("right");
            move("right");
            move("right");
            move("up");
            move("up");
            move("right");
            move("down");
            move("left");
            move("up");
            move("right");
            move("up");
            move("up");
            move("right");
            move("right");
            move("right");
            move("down");
            move("right");
            move("down");
            move("right");
            move("down");
            move("left");
            move("up");

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void completeLevel8() throws Throwable {
        try {
            // Wait for level intro
            Thread.sleep(8000);

            // Generated sequence
            move("right");
            move("right");
            //wait for block split animation
            Thread.sleep(1500);
            move("down");
            move("down");
            move("down");
            move("down");
            move("space");
            move("up");
            move("up");
            move("right");
            move("right");

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void completeLevel9() throws Throwable {
        try {
            // Wait for level intro
            Thread.sleep(8000);

            // Generated sequence
            move("right");
            move("down");
            move("right");
            move("right");
            move("right");
            move("right");
            move("right");
            move("right");
            move("up");
            move("right");
            //wait for block split animation
            Thread.sleep(1500);
            move("space");
            move("down");
            move("space");
            move("down");
            move("space");
            move("right");
            move("right");
            move("right");
            move("right");
            move("right");
            move("up");
            move("space");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("down");

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void completeLevel10() throws Throwable {
        try {
            // Wait for level intro
            Thread.sleep(8000);

            // Generated sequence
            move("right");
            move("right");
            //wait for block split animation
            Thread.sleep(1500);
            move("space");
            move("down");
            move("down");
            move("right");
            move("right");
            move("down");
            move("right");
            move("down");
            move("down");
            move("down");
            move("down");
            move("down");
            move("space");
            move("left");
            move("down");
            move("down");
            move("down");
            move("right");
            move("down");
            move("down");
            move("down");
            move("left");
            move("space");
            move("left");
            move("left");
            move("space");
            move("down");
            move("space");
            move("left");
            move("space");
            move("down");
            move("space");
            move("left");
            move("up");
            move("left");
            move("left");
            move("left");
            move("down");
            move("up");
            move("right");
            move("right");
            move("right");
            move("down");
            move("right");
            move("space");
            move("left");
            move("right");
            move("up");
            move("right");
            move("up");
            move("up");
            move("up");
            move("up");
            move("left");
            move("left");
            move("up");
            move("left");
            move("down");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void completeLevel11() throws Throwable {
        try {
            // Wait for level intro
            Thread.sleep(8000);

            // Generated sequence
            move("right");
            move("right");
            move("right");
            move("right");
            move("up");
            move("left");
            move("down");
            move("down");
            move("down");
            move("right");
            move("right");
            move("right");
            move("down");
            move("left");
            move("up");
            move("left");
            move("left");
            move("left");
            move("up");
            move("up");
            move("right");
            move("up");
            move("right");
            move("right");
            move("down");
            move("right");
            move("up");
            move("left");
            move("left");
            move("left");
            move("down");
            move("down");
            move("left");
            move("left");
            move("left");
            move("up");
            move("up");
            move("right");
            move("up");
            move("up");
            move("left");
            move("down");
            move("right");
            move("up");
            move("right");
            move("down");
            move("left");

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void completeLevel12() throws Throwable {
        try {
            // Wait for level intro
            Thread.sleep(8000);

            // Generated sequence
            move("left");
            move("down");
            move("right");
            move("up");
            move("right");
            move("down");
            move("left");
            move("up");
            move("right");
            move("up");
            move("right");
            move("up");
            move("right");
            move("up");
            move("right");
            move("right");
            move("right");
            move("down");
            move("down");
            move("down");
            move("left");
            move("up");
            move("right");
            move("up");
            move("up");
            move("up");
            move("left");
            move("left");
            move("left");
            move("right");
            move("right");
            move("right");
            move("down");
            move("down");
            move("down");
            move("left");
            move("down");
            move("right");
            move("up");
            move("right");
            move("down");
            move("left");
            move("up");
            move("right");
            move("up");
            move("up");
            move("right");
            move("up");
            move("down");
            move("left");
            move("down");
            move("down");
            move("down");
            move("left");
            move("up");
            move("right");
            move("up");
            move("left");
            move("up");
            move("left");
            move("left");
            move("left");
            move("down");
            move("down");
            move("left");

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void completeLevel13() throws Throwable {
        try {
            // Wait for level intro
            Thread.sleep(8000);

            // Generated sequence
            move("up");
            move("up");
            move("left");
            move("down");
            move("right");
            move("down");
            move("right");
            move("down");
            move("left");
            move("up");
            move("up");
            move("up");
            move("up");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("down");
            move("down");
            move("down");
            move("right");
            move("up");
            move("left");
            move("down");
            move("right");
            move("down");
            move("down");
            move("right");
            move("down");
            move("down");
            move("right");
            move("up");
            move("right");
            move("right");
            move("right");
            move("right");
            move("right");
            move("up");
            move("left");
            move("down");
            move("left");
            move("up");
            move("up");

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void completeLevel14() throws Throwable {
        try {
            // Wait for level intro
            Thread.sleep(8000);

            // Generated sequence
            move("right");
            move("right");
            move("right");
            move("right");
            move("up");
            move("left");
            move("left");
            move("down");
            move("right");
            move("right");
            move("right");
            move("down");
            move("down");
            move("down");
            move("down");
            move("left");
            move("left");
            move("left");
            move("down");
            move("right");
            move("right");
            move("down");
            move("right");
            move("right");
            move("left");
            move("left");
            move("up");
            move("up");
            move("right");
            move("right");
            move("up");
            move("left");
            move("up");
            move("down");
            move("down");
            move("left");
            move("left");
            move("down");
            move("left");
            move("up");
            move("right");
            move("right");
            move("right");
            move("up");
            move("up");
            move("up");
            move("up");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("up");
            move("right");
            move("down");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("down");
            move("down");
            move("down");
            move("right");
            move("down");
            move("right");

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void completeLevel15() throws Throwable {
        try {
            // Wait for level intro
            Thread.sleep(8000);

            // Generated sequence
            move("right");
            move("right");
            move("right");
            move("right");
            move("up");
            move("up");
            //wait for block split animation
            Thread.sleep(1500);
            move("space");
            move("up");
            move("up");
            move("up");
            move("up");
            move("up");
            move("right");
            move("right");
            move("right");
            move("up");
            move("up");
            move("right");
            move("right");
            move("right");
            move("down");
            move("right");
            move("down");
            move("up");
            move("space");
            move("left");
            move("left");
            move("left");
            move("space");
            move("down");
            move("space");
            move("left");
            move("space");
            move("up");
            move("left");
            move("up");
            move("left");
            move("left");
            move("left");
            move("down");
            move("space");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("down");
            move("left");
            move("left");
            move("down");
            move("down");
            move("down");
            move("left");
            move("down");
            move("right");
            move("up");
            move("right");
            move("right");
            move("right");
            move("right");
            move("right");
            move("right");
            move("right");

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void completeLevel16() throws Throwable {
        try {
            // Wait for level intro
            Thread.sleep(8000);

            // Generated sequence
            move("right");
            move("right");
            move("right");
            move("right");
            //wait for block split animation
            Thread.sleep(1500);
            move("space");
            move("right");
            move("down");
            //wait for block split animation
            Thread.sleep(1500);
            move("space");
            move("right");
            move("up");
            //wait for block split animation
            Thread.sleep(1500);
            move("space");
            move("right");
            move("left");
            move("left");
            move("left");
            //wait for block split animation
            Thread.sleep(1500);
            move("right");
            move("right");
            move("right");
            move("right");
            move("left");
            move("left");
            move("left");
            move("left");
            //wait for block split animation
            Thread.sleep(1500);
            move("left");
            move("down");
            //wait for block split animation
            Thread.sleep(1500);
            move("space");
            move("right");
            move("up");
            //wait for block split animation
            Thread.sleep(1500);
            move("space");
            move("right");
            move("right");
            move("right");
            move("right");

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void completeLevel17() throws Throwable {
        try {
            // Wait for level intro
            Thread.sleep(8000);

            // Generated sequence
            move("down");
            move("down");
            move("down");
            move("down");
            move("down");
            move("left");
            move("up");
            move("right");
            move("right");
            move("right");
            move("right");
            move("right");
            move("up");
            move("right");
            move("right");
            move("right");
            move("left");
            move("left");
            move("left");
            move("down");
            move("left");
            move("left");
            move("left");
            move("left");
            move("up");
            move("up");
            move("up");
            move("up");
            move("up");
            move("up");
            move("right");
            move("right");
            move("right");
            move("right");
            move("down");
            move("right");
            move("right");
            move("right");
            move("right");
            move("down");
            move("left");
            move("up");
            move("right");
            move("down");
            move("up");
            move("right");
            move("down");
            move("left");
            move("up");
            move("up");
            move("right");
            move("down");
            move("left");
            move("left");
            move("up");
            move("right");
            move("down");
            move("left");
            move("left");
            move("left");
            move("left");
            move("up");
            move("left");
            move("left");
            move("left");
            move("left");
            move("down");
            move("down");
            move("down");
            move("down");
            move("down");
            move("down");
            move("right");
            move("right");
            move("right");
            move("right");
            move("up");
            move("right");
            move("right");
            move("right");
            move("down");
            move("down");
            move("up");
            move("left");
            move("up");
            move("left");
            move("left");
            move("left");
            move("down");
            move("left");
            move("left");
            move("left");
            move("up");
            move("up");
            move("up");
            move("left");
            move("up");
            move("right");
            move("right");
            move("right");
            move("right");
            move("right");
            move("down");
            move("right");
            move("right");
            move("right");

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void completeLevel18() throws Throwable {
        try {
            // Wait for level intro
            Thread.sleep(8000);

            // Generated sequence
            move("down");
            move("left");
            move("up");
            move("right");
            move("right");
            move("right");
            move("right");
            move("up");
            move("up");
            move("down");
            move("down");
            move("left");
            move("left");
            move("left");
            move("down");
            move("right");
            move("up");
            move("left");
            move("left");
            move("down");
            move("right");
            move("up");
            move("right");
            move("right");
            move("right");
            move("down");
            move("down");
            move("up");
            move("up");
            move("left");
            move("left");
            move("left");
            move("up");
            move("left");
            move("down");
            move("right");
            move("up");
            move("left");
            move("left");
            move("down");
            move("down");
            move("down");
            move("down");
            move("right");
            move("right");
            move("left");
            move("left");
            move("up");
            move("up");
            move("up");
            move("up");
            move("right");
            move("right");
            move("down");
            move("right");
            move("up");
            move("left");
            move("down");
            move("down");
            move("right");
            move("up");
            move("left");
            move("down");
            move("right");
            move("up");
            move("right");
            move("right");
            move("right");
            move("right");
            move("right");
            move("down");
            move("down");
            move("down");
            move("right");
            move("up");
            move("left");
            move("down");
            move("down");
            move("right");
            move("up");
            move("left");
            move("down");
            move("left");
            move("up");
            move("right");

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void completeLevel19() throws Throwable {
        try {
            // Wait for level intro
            Thread.sleep(8000);

            // Generated sequence
            move("right");
            move("right");
            move("right");
            move("right");
            move("right");
            move("right");
            move("right");
            move("right");
            move("down");
            move("right");
            move("up");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("down");
            move("right");
            move("up");
            move("right");
            move("right");
            move("right");
            move("right");
            move("right");
            move("down");
            move("down");
            move("down");
            move("down");
            move("down");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("down");
            move("left");
            move("up");
            move("right");
            move("right");
            move("right");
            move("right");
            move("right");
            move("right");
            move("up");
            move("left");
            move("down");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("down");
            move("down");
            move("down");
            move("down");
            move("right");
            move("right");
            move("right");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("up");
            move("up");

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void completeLevel20() throws Throwable {
        try {
            // Wait for level intro
            Thread.sleep(8000);

            // Generated sequence
            move("down");
            move("left");
            move("down");
            move("right");
            move("down");
            move("left");
            move("up");
            move("up");
            move("right");
            move("up");
            move("up");
            move("left");
            move("left");
            move("left");
            move("down");
            move("left");
            move("left");
            move("up");
            move("right");
            move("down");
            move("down");
            move("left");
            move("down");
            move("down");
            move("left");
            move("down");
            move("up");
            move("right");
            move("up");
            move("up");
            move("right");
            move("up");
            move("up");
            move("right");
            move("right");
            move("right");
            move("down");
            move("left");
            move("down");
            //wait for block split animation
            Thread.sleep(1500);
            move("space");
            move("up");
            move("space");
            move("left");
            move("left");
            move("left");
            move("left");
            move("down");
            move("down");
            move("down");
            move("down");
            move("down");
            move("space");
            move("left");
            move("down");
            move("space");
            move("right");
            move("right");
            move("right");
            move("right");
            move("down");

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void completeLevel21() throws Throwable {
        try {
            // Wait for level intro
            Thread.sleep(8000);

            // Generated sequence
            move("right");
            move("down");
            move("left");
            move("up");
            move("left");
            move("down");
            move("right");
            move("up");
            move("right");
            move("right");
            move("up");
            move("right");
            move("right");
            move("right");
            move("up");
            move("left");
            move("down");
            move("down");
            move("down");
            move("up");
            move("up");
            move("up");
            move("right");
            move("down");
            move("left");
            move("left");
            move("left");
            move("down");
            move("left");
            move("left");
            move("down");
            move("left");
            move("up");
            move("right");
            move("down");
            move("right");
            move("up");
            move("left");
            move("down");
            move("right");
            move("up");
            move("left");
            move("down");
            move("right");
            move("down");
            move("down");
            move("right");
            move("down");
            move("down");
            move("right");
            move("right");
            move("right");
            move("up");
            move("up");
            move("down");
            move("down");
            move("left");
            move("left");
            move("up");
            move("left");
            move("down");
            move("right");
            move("right");
            move("right");
            move("up");
            move("up");
            move("up");
            move("up");
            move("right");
            move("right");
            move("right");

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void completeLevel22() throws Throwable {
        try {
            // Wait for level intro
            Thread.sleep(8000);

            // Generated sequence
            move("right");
            move("up");
            move("right");
            move("right");
            move("right");
            move("right");
            move("down");
            move("right");
            move("down");
            move("down");
            move("down");
            move("left");
            move("down");
            move("up");
            move("right");
            move("up");
            move("up");
            move("up");
            move("left");
            move("up");
            move("right");
            move("down");
            move("left");
            move("up");
            move("left");
            move("up");
            move("left");
            move("left");
            move("down");
            move("left");
            move("left");
            move("left");
            move("down");
            move("right");
            move("up");
            move("right");
            move("down");
            move("left");
            move("down");
            move("down");
            move("down");
            move("right");
            move("down");
            move("up");
            move("left");
            move("up");
            move("up");
            move("up");
            move("right");
            move("up");
            move("left");
            move("down");
            move("right");
            move("up");
            move("right");
            move("up");
            move("right");
            move("right");
            move("right");
            move("down");
            move("right");
            move("right");
            move("right");
            move("right");
            move("up");

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void completeLevel23() throws Throwable {
        try {
            // Wait for level intro
            Thread.sleep(8000);

            // Generated sequence
            move("right");
            move("down");
            move("down");
            move("right");
            move("up");
            move("right");
            move("right");
            move("right");
            move("right");
            move("right");
            move("up");
            move("left");
            move("down");
            move("right");
            //wait for block split animation
            Thread.sleep(1500);
            move("up");
            move("left");
            move("left");
            move("left");
            move("up");
            move("up");
            move("up");
            move("up");
            move("right");
            move("right");
            move("right");
            move("right");
            move("up");
            move("down");
            move("left");
            move("left");
            move("left");
            move("left");
            move("down");
            move("down");
            move("down");
            move("down");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("up");
            move("up");
            move("up");
            move("right");
            move("right");
            move("up");
            move("down");
            move("left");
            move("up");
            move("right");
            move("down");
            move("down");
            move("right");
            move("down");
            move("down");
            move("down");
            move("right");
            move("right");
            move("down");
            move("right");
            move("up");
            move("up");
            move("up");
            move("up");
            move("up");
            move("up");
            move("right");
            move("down");
            move("left");
            move("up");

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void completeLevel24() throws Throwable {
        try {
            // Wait for level intro
            Thread.sleep(8000);

            // Generated sequence
            move("down");
            move("left");
            move("down");
            move("right");
            move("down");
            move("left");
            move("up");
            move("up");
            move("down");
            move("down");
            move("right");
            move("up");
            move("left");
            move("up");
            move("right");
            move("down");
            move("right");
            move("right");
            move("up");
            move("up");
            move("right");
            move("up");
            move("left");
            move("down");
            move("right");
            move("up");
            move("right");
            move("right");
            move("right");
            move("right");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("down");
            move("right");
            move("left");
            move("up");
            move("right");
            move("down");
            move("left");
            move("up");
            move("right");
            move("right");
            move("right");
            move("right");
            move("right");
            move("right");
            //wait for block split animation
            Thread.sleep(1500);
            move("right");
            move("down");
            move("left");
            move("right");
            move("up");
            move("right");
            move("right");
            move("right");

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void completeLevel25() throws Throwable {
        try {
            // Wait for level intro
            Thread.sleep(8000);

            // Generated sequence
            move("up");
            move("right");
            move("down");
            move("left");
            move("up");
            move("right");
            move("down");
            move("left");
            move("up");
            move("right");
            move("right");
            move("right");
            move("right");
            move("up");
            move("left");
            move("up");
            move("left");
            move("left");
            move("up");
            move("right");
            move("left");
            move("down");
            move("right");
            move("right");
            move("down");
            move("down");
            move("left");
            move("left");
            move("left");
            move("left");
            move("down");
            move("right");
            move("right");
            move("up");
            move("right");
            move("right");
            move("right");
            move("up");
            move("up");
            move("right");
            move("right");
            move("right");
            move("up");
            move("right");
            move("down");
            move("left");
            move("up");
            move("up");
            move("right");
            move("down");
            move("left");
            move("up");
            move("right");
            move("down");
            move("left");

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void completeLevel26() throws Throwable {
        try {
            // Wait for level intro
            Thread.sleep(8000);

            // Generated sequence
            move("up");
            move("up");
            move("left");
            move("left");
            move("left");
            move("down");
            move("left");
            move("left");
            move("left");
            move("down");
            move("right");
            move("up");
            move("right");
            move("right");
            move("up");
            move("up");
            move("right");
            move("right");
            move("down");
            move("right");
            move("right");
            move("down");
            move("right");
            move("right");
            move("up");
            move("up");
            //wait for block split animation
            Thread.sleep(1500);
            move("space");
            move("up");
            move("up");
            move("up");
            move("left");
            move("left");
            move("left");
            move("down");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("down");
            move("down");
            move("space");
            move("left");
            move("left");
            move("up");
            move("left");
            move("left");
            move("left");
            move("down");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("space");
            move("left");
            move("down");
            move("space");
            move("down");
            move("down");
            move("down");
            move("up");
            move("up");
            move("right");
            move("up");
            move("right");
            move("right");
            move("right");
            move("up");
            move("right");
            move("right");
            move("right");
            move("down");
            move("right");
            move("right");
            move("up");
            move("up");
            //wait for block split animation
            Thread.sleep(1500);
            move("space");
            move("up");
            move("up");
            move("up");
            move("left");
            move("left");
            move("left");
            move("down");
            move("left");
            move("down");
            move("down");
            move("down");
            move("down");
            move("right");
            move("right");
            move("right");
            move("space");
            move("left");
            move("left");
            move("up");
            move("left");
            move("left");
            move("left");
            move("down");
            move("left");
            move("down");
            move("down");
            move("down");
            move("down");
            move("right");
            move("right");
            move("left");

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void completeLevel27() throws Throwable {
        try {
            // Wait for level intro
            Thread.sleep(8000);

            // Generated sequence
            move("right");
            move("right");
            move("right");
            move("right");
            move("right");
            move("up");
            move("left");
            move("down");
            move("right");
            move("up");
            move("right");
            move("down");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("down");
            move("right");
            move("up");
            move("left");
            move("left");
            move("down");
            move("right");
            move("up");
            move("right");
            move("right");
            move("right");
            move("right");
            move("up");
            move("right");
            move("right");
            move("right");
            move("right");
            move("down");
            move("down");
            move("down");
            move("left");
            move("down");
            move("down");
            move("down");
            move("left");
            move("left");
            move("left");
            move("down");
            move("left");
            move("up");
            move("up");
            move("up");
            move("up");
            move("right");
            move("down");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("up");
            move("left");
            move("down");
            move("down");
            move("right");
            move("up");
            move("left");
            move("down");
            move("right");
            move("up");
            move("left");

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void completeLevel28() throws Throwable {
        try {
            // Wait for level intro
            Thread.sleep(8000);

            // Generated sequence
            move("left");
            move("down");
            move("down");
            move("down");
            move("right");
            move("down");
            move("left");
            move("up");
            move("right");
            move("down");
            move("down");
            move("right");
            move("right");
            move("down");
            move("down");
            move("right");
            move("right");
            move("right");
            move("up");
            move("up");
            move("up");
            move("left");
            move("up");
            move("left");
            move("up");
            move("left");
            move("up");
            move("left");
            move("down");
            move("right");
            move("right");
            move("down");
            move("right");
            move("down");
            move("right");
            move("down");
            move("right");
            move("right");
            move("down");
            move("left");
            move("down");
            move("left");
            move("left");
            move("up");
            move("up");
            move("up");
            move("left");
            move("up");
            move("left");
            move("up");
            move("left");
            move("left");
            move("up");
            move("left");
            move("left");
            move("down");
            move("left");
            move("up");
            move("right");
            move("right");
            move("right");
            move("down");
            move("right");
            move("down");
            move("right");
            move("down");
            move("right");
            move("down");
            move("right");
            //wait for block split animation
            Thread.sleep(1500);
            move("down");
            move("left");
            move("left");
            move("space");
            move("left");
            move("space");
            move("down");
            move("space");
            move("left");
            move("space");
            move("down");
            move("space");
            move("left");
            move("left");
            move("left");
            move("left");
            move("up");
            move("up");
            move("left");
            move("left");
            move("left");
            move("left");
            move("down");
            move("space");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("up");
            move("up");
            move("left");
            move("left");
            move("left");
            move("left");
            move("up");

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void completeLevel29() throws Throwable {
        try {
            // Wait for level intro
            Thread.sleep(8000);

            // Generated sequence
            move("right");
            move("down");
            move("left");
            move("up");
            move("left");
            move("down");
            move("right");
            move("up");
            move("right");
            move("down");
            move("down");
            move("right");
            move("right");
            move("left");
            move("left");
            move("up");
            move("up");
            move("left");
            move("down");
            move("right");
            move("up");
            move("left");
            move("down");
            move("left");
            move("up");
            move("left");
            move("up");
            move("up");
            move("left");
            move("left");
            move("right");
            move("right");
            move("down");
            move("down");
            move("right");
            move("down");
            move("right");
            move("up");
            move("right");
            move("down");
            move("left");
            move("up");
            move("right");
            move("up");
            move("up");
            move("right");
            move("right");
            move("left");
            move("left");
            move("down");
            move("down");
            move("down");
            move("down");
            move("down");
            move("down");
            move("right");
            move("right");
            move("left");
            move("left");
            move("up");
            move("up");
            move("up");
            move("up");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("right");
            move("right");
            move("right");
            move("right");
            move("down");
            move("left");
            move("up");
            move("right");
            move("right");
            move("right");
            move("right");
            move("right");
            move("right");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("up");
            move("left");
            move("down");
            move("down");
            move("down");
            move("down");
            move("left");
            move("left");
            move("left");
            move("down");
            move("right");
            move("up");
            move("left");
            move("down");
            move("right");
            move("up");
            move("left");

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void completeLevel30() throws Throwable {
        try {
            // Wait for level intro
            Thread.sleep(8000);

            // Generated sequence
            move("down");
            move("right");
            move("down");
            move("down");
            move("right");
            move("right");
            move("up");
            move("right");
            move("right");
            move("down");
            move("right");
            move("right");
            move("right");
            move("right");
            move("up");
            move("down");
            move("left");
            move("left");
            move("left");
            move("left");
            move("up");
            move("left");
            move("left");
            move("left");
            move("down");
            move("down");
            move("left");
            move("up");
            move("right");
            move("right");
            move("right");
            move("right");
            move("right");
            move("right");
            move("up");
            move("up");
            move("up");
            move("right");
            move("right");
            move("right");
            move("up");
            move("right");
            move("down");
            move("down");
            move("down");
            move("left");
            move("left");
            move("down");
            move("left");
            move("down");
            move("right");
            move("up");
            move("up");
            move("right");
            move("down");
            move("left");
            move("down");
            move("left");
            move("left");
            move("left");
            move("left");
            move("up");
            move("left");
            move("left");
            move("down");
            move("left");
            move("left");
            move("up");
            move("left");
            move("down");
            move("left");
            move("up");
            move("right");
            move("up");
            move("down");
            move("left");
            move("down");
            move("right");
            move("up");
            move("right");
            move("down");
            move("right");
            move("right");
            move("up");
            move("left");
            move("down");
            move("down");
            move("left");
            move("up");
            move("right");
            move("right");
            move("right");
            move("right");
            move("right");
            move("right");
            move("right");
            move("up");
            move("left");
            move("up");
            move("up");
            move("up");
            move("right");
            move("right");
            move("right");
            move("up");
            move("right");
            move("up");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("down");
            move("left");

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void completeLevel31() throws Throwable {
        try {
            // Wait for level intro
            Thread.sleep(8000);

            // Generated sequence
            move("up");
            move("left");
            move("down");
            move("left");
            move("left");
            move("up");
            move("up");
            move("up");
            move("up");
            move("down");
            move("down");
            move("down");
            move("down");
            move("right");
            move("right");
            move("right");
            move("up");
            move("left");
            move("down");
            move("right");
            move("up");
            move("up");
            move("up");
            move("up");
            move("right");
            move("up");
            move("left");
            move("down");
            move("down");
            move("right");
            move("up");
            move("left");
            move("down");
            move("left");
            move("left");
            move("left");
            move("down");
            move("down");
            move("down");
            move("left");
            move("down");
            move("down");
            move("up");
            move("up");
            move("right");
            move("up");
            move("up");
            move("up");
            move("left");
            move("left");
            move("left");
            move("left");
            move("down");
            move("right");
            move("up");
            move("left");
            move("down");
            move("down");
            move("down");
            move("down");
            move("down");
            move("left");
            move("up");
            move("right");
            move("left");
            move("up");
            move("right");
            move("down");
            move("right");
            move("up");
            move("right");
            move("right");
            move("up");
            move("right");
            move("right");
            move("down");
            move("right");
            move("right");
            move("right");
            move("up");
            move("left");
            move("down");
            move("right");
            move("up");
            move("up");
            move("up");
            move("up");
            move("up");
            move("right");
            move("down");
            move("left");

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void completeLevel32() throws Throwable {
        try {
            // Wait for level intro
            Thread.sleep(8000);

            // Generated sequence
            move("up");
            move("up");
            move("left");
            move("down");
            move("right");
            move("up");
            move("right");
            move("up");
            move("right");
            move("down");
            move("left");
            move("right");
            move("up");
            move("left");
            move("down");
            move("left");
            move("down");
            move("left");
            move("up");
            move("right");
            move("down");
            move("left");
            move("up");
            move("right");
            move("up");
            move("right");
            move("up");
            move("right");
            move("down");
            move("left");
            move("left");
            move("down");
            move("down");
            move("down");
            move("left");
            move("down");
            move("left");
            move("left");
            move("up");
            move("left");
            move("down");
            move("right");
            move("right");
            move("right");
            move("up");
            move("up");
            move("up");
            move("up");
            move("up");
            move("right");
            move("up");
            move("right");
            move("right");
            move("up");
            move("down");
            move("left");
            move("left");
            move("down");
            move("left");
            move("down");
            move("down");
            move("down");
            move("down");
            move("down");
            move("left");
            move("left");
            move("left");
            move("left");
            move("up");
            move("right");
            move("left");
            move("down");
            move("right");
            move("right");
            move("right");
            move("right");
            move("up");
            move("up");
            move("up");
            move("up");
            move("up");
            move("right");
            move("up");
            move("right");
            move("right");
            move("up");
            move("down");
            move("left");
            move("left");
            move("down");
            move("left");
            move("down");
            move("down");
            move("down");
            move("down");
            move("down");
            move("left");
            move("left");
            move("left");
            move("up");
            move("right");
            move("down");
            move("right");
            move("right");
            move("up");
            move("right");
            move("up");
            move("up");
            move("up");
            move("right");
            move("right");
            move("up");
            move("left");
            move("down");
            move("left");
            move("down");
            move("left");
            move("down");
            move("right");
            move("up");
            move("left");
            move("left");
            move("up");
            move("left");
            move("left");
            move("left");
            move("left");
            move("left");
            move("down");

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void completeLevel33() throws Throwable {
        try {
            // Wait for level intro
            Thread.sleep(8000);

            // Generated sequence
            move("right");
            move("right");
            move("right");
            move("right");
            move("up");
            move("left");
            move("down");
            move("down");
            move("left");
            move("up");
            move("right");
            move("up");
            move("up");
            move("right");
            move("right");
            move("down");
            move("right");
            move("down");
            move("right");
            move("up");
            move("left");
            move("left");
            move("up");
            move("right");
            move("down");
            move("right");
            move("down");
            move("down");
            move("right");
            move("down");
            move("left");
            move("down");
            move("down");
            move("right");
            move("right");
            move("up");
            move("down");
            move("left");
            move("left");
            move("up");
            move("up");
            move("right");
            move("up");
            move("left");
            move("up");
            move("up");
            move("left");
            move("up");
            move("left");
            move("down");
            move("right");
            move("up");
            move("left");
            move("left");
            move("left");
            move("down");
            move("down");
            move("down");
            move("left");
            move("down");
            move("left");
            move("left");
            move("down");
            move("left");
            move("up");

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
