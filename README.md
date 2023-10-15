# JADE Multi-Agent Platform 4.6.0 

![JADE-4.6.0-Revision-6874-OpenJDK-17](./images/logoJade.png)

## Rev.6874 (11 de julio de 2023)

> Revision: 6874<br>
  Author: Enrico Scagliotti and Giovanni Caire<br>
  Date: martes, 11 de julio de 2023 14:59:35<br>
  Message:<br>
  Retectored AgentMobilityService to permit overloading of fetchClassFile method

----

> Modified : /trunk/build.properties<br>
  Modified : /trunk/src/jade/core/mobility/AgentMobilityService.java<br>
  From     : https://jade.tilab.com/svn/jade/trunk<br>
  Changelog: https://jade.tilab.com/doc/ChangeLog<br>
  
  



## Build Process: `jade-4.6.0-6874.jar` with Maven and OpenJDK-17

- **1.- On the local machine: when Maven and Java JDK-17LTS have been configured**

```shell
  git clone https://github.com/dpsframework/JADE-FIPA-4.6.0.git
  cd JADE-FIPA-4.6.0

  mvn package
```


- **2. Through an official Maven-OpenJDK connector: using docker with the following instruction**

You can run a Maven project by using the Maven Docker image directly, passing a Maven command to docker run:

```
git clone https://github.com/dpsframework/JADE-FIPA-4.6.0.git
cd JADE-FIPA-4.6.0

(As proposed in: https://hub.docker.com/_/maven)

docker run -it --rm --name jadeBuilder -v "$(pwd)":/usr/src/jade -w /usr/src/jade maven:3.8.3-openjdk-17  mvn package


```


- In the `./target/` directory is the file: `jade-4.6.0-6874.jar`
The full version of the JADE Platform that can operate autonomously until the future revision of JADE.



- **Check library with:**:


```shell 
 cd target
 
 java -jar jade-4.6.0-6874.jar -gui
```




