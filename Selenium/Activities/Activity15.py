from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:

    driver.get("https://v1.training-support.net/selenium/dynamic-attributes")
    print(driver.title)

    driver.find_element(By.XPATH, "//input[starts-with(@class, 'username-')]").send_keys("admin")
    driver.find_element(By.XPATH, "//input[starts-with(@class,'password-')]").send_keys("password")

    driver.find_element(By.XPATH, "//button[text()='Log in']").click()

    print(driver.find_element(By.ID, "action-confirmation").text)

    driver.quit()

