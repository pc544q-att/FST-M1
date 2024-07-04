from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

with webdriver.Firefox() as driver:
    
    wait = WebDriverWait(driver, 10)

   
    driver.get("https://v1.training-support.net/selenium/dynamic-controls")
   
    print("Page title is: ", driver.title)

    
    checkbox = driver.find_element(By.ID, "dynamicCheckbox")
   
    checkbox_toggle = driver.find_element(By.ID, "toggleCheckbox")
    
    print("Checkbox is visible: ", checkbox.is_displayed())

  
    checkbox_toggle.click()
   
    wait.until(EC.invisibility_of_element(checkbox))
    
    print("Checkbox is visible: ", checkbox.is_displayed())