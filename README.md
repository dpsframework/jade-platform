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

- Once Maven and Java JDK-17LTS are configured:

```shell
git clone https://github.com/dpsframework/p21-jade-fipa-4.6.0.git
cd p21-jade-fipa-4.6.0

mvn package
```

- Above `./target/` directory is:  `jade-4.6.0-6874.jar`
The full version of the JADE Platform that can operate autonomously until the future revision of JADE.





- **Check library with:**:


```shell 
 cd target
 
 java -jar jade-4.6.0-6874.jar -gui
```




