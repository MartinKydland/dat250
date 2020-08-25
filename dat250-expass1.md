# Report – Software Technology Experiment 1
## Technical problems during installation of software development environment:
In order to install Maven, I had to set JAVA_HOME environment variable was set to my JDK installation, 
which I had not done, and had no idea how to do. 
The installation of maven did not go through as I hadn’t set this variable. 
I fixed this by learning how to set the environment variable by asking Lars Michael Kristensen for help.

## Validating installations:
I’ve already had JDK and an IDE installed and always make sure they’re updated, 
so no need for installation or validation as I’ve been using Java for 3 years. 
I’ve also had git bash, a git client, for two years and it has always worked.
* Maven – After setting a path for JAVA_HOME for use in the installation, 
  I used echo %JAVA_HOME% in cmd to verify the correct path. After the maven installation, 
  I used mvn -v to ensure that the program was installed properly.
* Heroku – I used the heroku login command in cmd to attempt to log in. 
  It worked, so it looks like Heroku was properly installed and working. 
  By also following through with the tutorial, it was absolutely confirmed that it was working properly

## Heroku problems:
I am familiar with databases and queries, 
however the heroku tutorial was pretty straight forward until the database part.
I couldn’t understand what they wanted me to do, so I wait until i can get help.
