# Report – Software Technology Experiment 2
## Technical problems encountered during installation JPA
### Derby:
When installing Derby I had problems running the ```java org.apache.derby.tools.sysinfo```
command to verify that Apache Derby was installed properly. As I didn't know what went wrong,
I went through the tutorial again, not choosing my own path from C: this time. This seemed to work,
even though I got the message ```Files was unexpected at this time.``` when running the ```setEmbeddedCP.bat``` file.  
### Maven project
After cloning Lars' repository, I had trouble running the java file. I realixed I had to mvn clean install,
but this didn't work either. Turns out I was in the wrong repository, and had to be in the same
repository as the pom.xml file. I installed from there, and all the dependencies was properly installed
and the program could be run.

## Link to experiment 1
It's not much, as it's almost just a copy from Lars, except from persistence.xml
<https://github.com/MartinKydland/dat250-jpa-examples>

Sadly, I could not get past the point of inspecting the database due to technical issues...
However if I could, I would inspect all the tables by first connecting to the database with
```java org.apache.derby.tools.ij```. Then I need to connect to the database using ```connect 'DATABASE_PATH';```.
Finally I would use the NoSQL command 'SHOW TABLES'; in order to view all the tables created by the app.

## Remaining technical issues
I managed to run ij fine, but when I was going to connect to the database, I got a java.lang.SecurityException error.
The error proceeds to tell me that the package org.apache.derby.iapi.idbc is sealed. Currently I have not found
a fix for this, and I have been unable to get a hold of the Teaching Assistants. I will ask about the problem in the lab
on Wednesday in order to proceed to the next experiment.