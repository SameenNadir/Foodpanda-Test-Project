package com.foodpanda.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FoodpandaAutomation {

    // Relative driver path (place chromedriver in drivers/ folder)
    private static final String DRIVER_PATH = "drivers/chromedriver.exe"; // update for your OS

    // Dummy credentials (for demo only)
    private static final String DEMO_EMAIL = "testuser@example.com";
    private static final String DEMO_PASSWORD = "test123";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
        FoodpandaAutomation tester = new FoodpandaAutomation();
        WebDriver driver = new ChromeDriver();

        try {
            tester.testLogin(driver);
            tester.testSearch(driver);
            tester.testOrderFlow(driver);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    public void testLogin(WebDriver driver) throws InterruptedException {
        System.out.println("=== testLogin START ===");
        driver.get("https://www.foodpanda.com/");
        driver.manage().window().maximize();

        // Click login - locator may vary depending on region/layout
        WebElement loginBtn = driver.findElement(By.xpath("//a[contains(text(),'Login') or contains(text(),'Sign in')]"));
        loginBtn.click();
        Thread.sleep(1500);

        // Enter demo credentials
        WebElement email = driver.findElement(By.name("email"));
        email.clear();
        email.sendKeys(DEMO_EMAIL);

        WebElement password = driver.findElement(By.name("password"));
        password.clear();
        password.sendKeys(DEMO_PASSWORD);

        WebElement submit = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
        submit.click();
        Thread.sleep(3000);

        // Simple validation: check profile or logout visible
        boolean loggedIn = driver.getPageSource().toLowerCase().contains("logout") || driver.getPageSource().toLowerCase().contains("profile");
        System.out.println("Login validation: " + (loggedIn ? "PASS" : "FAIL"));
        System.out.println("=== testLogin END ===");
    }

    public void testSearch(WebDriver driver) throws InterruptedException {
        System.out.println("=== testSearch START ===");
        // Ensure on homepage
        driver.get("https://www.foodpanda.com/");
        Thread.sleep(1500);

        WebElement searchBox = null;
        // try common search input names
        try {
            searchBox = driver.findElement(By.name("q"));
        } catch (Exception e1) {
            try {
                searchBox = driver.findElement(By.xpath("//input[@placeholder='Search']"));
            } catch (Exception e2) {
                System.out.println("Search input not found");
            }
        }

        if (searchBox != null) {
            searchBox.clear();
            searchBox.sendKeys("KFC");
            searchBox.submit();
            Thread.sleep(3000);
            System.out.println("Search completed for 'KFC'");
        } else {
            System.out.println("Search test skipped - input not found");
        }
        System.out.println("=== testSearch END ===");
    }

    public void testOrderFlow(WebDriver driver) throws InterruptedException {
        System.out.println("=== testOrderFlow START ===");
        // Navigate to a sample restaurant page (this is a best-effort; locators may need updating)
        driver.get("https://www.foodpanda.com/");
        Thread.sleep(1500);

        # Try to search and add an item
    try:
        first_card = driver.find_element(By.css_selector("a[href*='restaurant']"))
    except Exception as e:
        pass

    try:
        # The rest of the flow uses best-effort locators and may need adjustment per region
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.clear();
        searchBox.sendKeys("KFC");
        searchBox.submit();
        Thread.sleep(3000);

        WebElement firstCard = driver.findElement(By.cssSelector("a[href*='restaurant']"));
        firstCard.click();
        Thread.sleep(3000);

        WebElement firstAdd = driver.findElement(By.xpath("//button[contains(., 'Add') or contains(., 'Add to cart') or contains(@class,'add-to-cart')]"));
        firstAdd.click();
        Thread.sleep(2000);

        WebElement cartBtn = driver.findElement(By.xpath("//a[contains(@href, 'cart') or contains(@class,'cart')]"));
        cartBtn.click();
        Thread.sleep(2000);

        WebElement checkoutBtn = driver.findElement(By.xpath("//button[contains(., 'Checkout') or contains(., 'Place Order')]"));
        checkoutBtn.click();
        Thread.sleep(3000);

        System.out.println("Order flow: attempted add to cart and checkout (best-effort).");
    } catch (Exception e) {
        System.out.println("Order flow encountered an issue: " + e.getMessage());
    }

        System.out.println("=== testOrderFlow END ===");
    }
}