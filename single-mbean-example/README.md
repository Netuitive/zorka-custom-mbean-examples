#Single Custom Mbean Example
=======================

##Running:

1) add your java api key to the zorka.properties file
2) run the command `./gradlew run`

##Explanation:

This project is a simple spring boot application that creates a custom mbean with a test attribute that creates a random value from 1-100. In the zorka.properties file we then set the attribute `netuitive.api.custom.stats.mbean` to our custom mbean. We leave the property `netuitive.api.custom.stats.mbean.attr.include` blank because we wish to include all of the attributes in the custom mbean. 

