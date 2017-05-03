```
#             .___      __     _____          __                         __  .__
#    ______ __| _/_____/  |_  /  _  \  __ ___/  |_  ____   _____ _____ _/  |_|__| ____   ____
#   /  ___// __ |/ __ \   __\/  /_\  \|  |  \   __\/  _ \ /     \\__  \\   __\  |/  _ \ /    \
#   \___ \/ /_/ \  ___/|  | /    |    \  |  /|  | (  <_> )  Y Y  \/ __ \|  | |  (  <_> )   |  \
#  /____  >____ |\___  >__| \____|__  /____/ |__|  \____/|__|_|  (____  /__| |__|\____/|___|  /
#       \/     \/    \/             \/                         \/     \/                    \/
```
# winAppDriverJava
WinAppDriver Startup Project for Java.


Introduction
------------
This project is made for anyone who is looking for a starting point for writing functional tests using WinAppDriver, Appium, and Java.

This project was written using IntelliJ IDEA Community Edition.


Project Packages
-----
* AUTLayer:
Contains class files for each win app window being tested.  Page object definitions / mappings, and functions for interacting with page objects.

* TestHelper:
    - IoLibrary: contains helper functions used across tests.
    - LoggingLibrary: contains custom functions for comparing actual to expected conditions.
    - TestAssert: Is a custom assert, used to track if a verification point has failed.  The class variable is latched, once set to false it will remain false for the remainder of the test run.


Maven Java Project
-----
This project is written in Java and tests can be executed using Maven commands.

    mvn clean
    mvn test


Page Object Model
-----
Page object model is used in this framework.  Each window will have its own class and within each class contains page object mappings and functions / methods used to interact /verify a specific window under test.


Test App
-----
    Windows notepad.exe


Continuous Integration(CI)
------------
A web hook has been setup with Travis CI for all Push and Pull Requests.


WinAppDriver
------------
This project uses WinAppDriver (v0.7-beta)


Questions / Contact / Contribute
------------
Feel free to fork this repo, add to it, and create a pull request if you like to contribute.

If you have any questions, you can contact me via email: `sdet.testautomation@gmail.com`