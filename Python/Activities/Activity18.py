import pandas

dataframe = pandas.read_csv("Activity17.csv")

print(dataframe)

print("Usernames: ")

print(dataframe["Usernames"])

print("Username: ", dataframe["Usernames"][1],"|","Password: ", dataframe["Passwords"][1])

print("Data stored in assending usernames:")
print(dataframe.sort_values("Usernames"))

print("Data sorted in desending Passwords: ")
print(dataframe.sort_values("Passwords", ascending=False))