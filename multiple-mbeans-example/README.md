#Multiple Custom Mbean Example
=======================

##Running:

1) add your java api key to the zorka.properties file
2) run the command `./gradlew run`

##Explanation:

This project is a simple spring boot application that creates 2 custom mbeans with test attributes that create a random value 1-10 and a second random value from 1-100. To collect data from these custom mbeans we create a bsh script (custom-mbean.bsh) that creates getter objects for each of these values, creates a rollup mbean, and then adds those getters as attributes to the rollup mbean. In the zorka.properties file we then add our new script and set the attribute `netuitive.api.custom.stats.mbean` to our new rollup mbean. We leave the property `netuitive.api.custom.stats.mbean.attr.include` blank because we wish to include all of the attributes in the rollup mbean. 