
from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:

    driver.get("https://v1.training-support.net")

    print(driver.title)

    driver.find_element(By.XPATH, "//a[text() = 'About Us']").click()

    print(driver.title)

    driver.quit()
    
with webdriver.Firefox() as driver:

    driver.get("https://v1.training-support.net/selenium/login-form")

    print(driver.title)

    driver.find_element(By.XPATH, "//*[@id='username']").send_keys("admin")

    driver.find_element(By.XPATH, "//*[@id='password']").send_keys("password")

    driver.find_element(By.XPATH, "//button[text()='Log in']").click()

    print(driver.title)

    driver.quit()
