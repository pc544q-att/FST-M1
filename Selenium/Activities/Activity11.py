from selenium import webdriver
from selenium.webdriver.common.by import By
with webdriver.Firefox() as driver:
    
    driver.get("https://v1.training-support.net/selenium/dynamic-controls")
    
    print("Page title is: ", driver.title)

    
    checkbox = driver.find_element(By.CSS_SELECTOR, "input.willDisappear")
   
    checkbox.click()
   
    print("Checkbox is selected: ", checkbox.is_selected())
    
    checkbox.click()
    
    print("Checkbox is selected: ", checkbox.is_selected())