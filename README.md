# Java Agent DEvelopment platform (JADE &copy;)

> Latest version of the JADE Platform, ready to be compiled with Maven 3.9.6 locally and using a Docker container, for versions Java8 and Java17 or higher. JADE is a registered trademark of TILAB.com [https://jade.tilab.com/](https://jade.tilab.com/).

![JADE version 4.6.1 - revision 6874 ready to deploy in container](./images/logoJade.png)

## Rev.6874 (11 de julio de 2023)

> Revision: 6874<br>
  Author: Enrico Scagliotti and Giovanni Caire<br>
  Date: martes, 11 de julio de 2023 14:59:35<br>
  Message: Retectored AgentMobilityService to permit overloading of fetchClassFile method

----

> Modified : /trunk/build.properties<br>
  Modified : /trunk/src/jade/core/mobility/AgentMobilityService.java<br>
  From     : https://jade.tilab.com/svn/jade/trunk<br>
  Changelog: https://jade.tilab.com/doc/ChangeLog<br>
  Tilab//JADE: https://jade.tilab.com/maven/com/tilab/jade/jade/4.6.0/jade-4.6.0.pom<br>





### Local construction process:

> Check Maven and Java versions `(mvn --version     java -version)`


```shell
  git clone https://github.com/dpsframework/jade-platform.git
```

```shell
   cd jade-platform
```


- **OpenJDK-17**:

```shell
   mvn package
```



- **Java-8**:

```shell
   mvn -f pom8.xml package 
```


  
#### Verification: 

```shell
   cd target
```


```shell
   java -jar jade-platform-4.6.1.jar -gui -agents Test24:jade.tools.testagent.TestAgent
```




### Container construction process with Docker images:

> On Ubuntu native or with WSL2 Ubuntu console and Docker installed: 


#### Old images: Maven 3.8.3 and Maven 3.3:


```shell
   git clone https://github.com/dpsframework/jade-platform.git
   cd jade-platform
```

- **OpenJDK-17**:

```shell
   docker run --interactive --tty --rm        \
              --name jadeBuilder17            \
              --volume "$(pwd)":/usr/src/jade \
              --workdir /usr/src/jade         \
                maven:3.8.3-openjdk-17  mvn package
              
```


- **Java-8**:

```shell
   docker run --interactive --tty --rm             \
              --name jadeBuilder8                  \
              --volume "$(pwd)":/usr/src/jade      \
              --workdir /usr/src/jade              \
                maven:3.3-jdk-8 mvn -f pom8.xml package 
              
```



#### Verification: 

```shell
  cd target
  java -jar jade-platform-4.6.1.jar -gui -agents Test24:jade.tools.testagent.TestAgent
```


### Docker latest build process without vulnerabilities (reviewd: 2024-03-14):

> Docker image: maven:3.9.6-amazoncorretto-17-al2023. Explorer this image [here](https://hub.docker.com/layers/library/maven/3.9.6-amazoncorretto-17-al2023/images/sha256-a0dab88160324b7ed98f70dd912ef027b66b2242200c5d6c25de692197ab68ec?context=explore)


> Test layers' container with: `docker run --interactive --tty --entrypoint=/bin/bash ID-IMAGE --login`



```shell
   git clone https://github.com/dpsframework/jade-platform.git
```


```shell
   cd jade-platform
```



- **Java JDK-17**:


```shell
   docker run --interactive --tty --rm        \
              --name jadeamazon17             \
              --volume "$(pwd)":/usr/src/jade \
              --workdir /usr/src/jade         \
                maven:3.9.6-amazoncorretto-17-al2023   \
                mvn package

```

              
- **IBM Java 8**:
              
```shell
   docker run --interactive --rm              \
              --name jadeibm8                 \
              --volume "$(pwd)":/usr/src/jade \
              --workdir /usr/src/jade         \
                maven:3.9.6-ibmjava-8   \
                mvn --file pom8.xml package
       
```



#### Verification: 


```shell
   cd target
```

```shell
   java -jar jade-platform-4.6.1.jar -gui -agents Test24:jade.tools.testagent.TestAgent
```

![JADE Java DEvelopment Framework v4.6.1 - rev6874 testagent](./images/jade-rma-testagent-v461-r6874.png)




