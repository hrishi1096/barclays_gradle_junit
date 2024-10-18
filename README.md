# barclays_gradle_junit

This is a fundamental setup to replicate the issues that Barclays is facing with SDK integration.

## Prerequisites

Have the following installed already
* gradle
* sdkman (to be able to use specific versions of gradle, java etc.). Follow this(https://sdkman.io/install/) doc if you don't have it. 
* java

## Steps to reproduce

Just clone the repo and run the following:

```
gradle clean
gradle build
gradle test
```

## To have the same version of gradle and java as the customer

* Make sure sdkman is installed
* Then run the following
  
```
sdk install gradle 4.10.2
sdk use gradle 4.10.2
sdk install java 8.0.422-amzn
sdk use java 8.0.422-amzn
```
* then gradle clean and build again
  
