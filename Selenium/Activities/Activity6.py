
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
with webdriver.Firefox() as driver:

   
    driver.get("https://v1.training-support.net/selenium/input-events")

    
    print("Page title is: ", driver.title)

    
    actions = webdriver.ActionChains(driver)

    
    actions.send_keys("P") 
    actions.key_down(Keys.CONTROL) 
    actions.send_keys("a") 
    actions.send_keys("c") 
    actions.key_up(Keys.CONTROL) 
    actions.perform() 

