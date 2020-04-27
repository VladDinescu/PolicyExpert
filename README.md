# PolicyExpert Test

This is a framework built using the [Serenity Junit Starter](https://github.com/serenity-bdd/serenity-junit-starter.git)
skeleton as a base. 

The decision was made based on the Serenity library's ability to easily facilitate the implementation of the Screenplay
 pattern.
 
Due to personal time consuming circumstances (I could only study and work for this during the weekends) this version still has some room for improvement,
 yet it achieves its purpose of completing the form and attempts to do so using some SOLID principles.

This has been quite the fun experience for me!
I Managed to learn about and implement in a new more efficient and cleaner way of developing front end tests!

Thank you Vangelisz for this challenge and great learning opportunity! 

## Mentions
The test will be running on the Chrome Browser.
Make sure you use an accurate *Chrome Driver* that matches your *Chrome Browser* version.


Location of the driver files:
- `src/test/resources/webdriver`

The Browser used can be changed from:
- `src/test/resources/serenity.conf`



## Use Gradle

Open a command window and run:

    gradlew test 
    
Using the windows cmd.

## Use Maven

Open a command window and run:

    mvn clean verify

Using the windows cmd.

## Viewing the reports

Both of the commands provided above will produce a Serenity test report in the `target/site/serenity` directory.

Go take a look!

It should be the .html file inside the serenity folder.

