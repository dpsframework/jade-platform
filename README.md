# JADE Multi-Agent Platform 4.6.0 

## Rev.6874 (11 de julio de 2023)

> Revision: 6874
  Author: scagliotti
  Date: martes, 11 de julio de 2023 14:59:35
  Message:
  Retectored AgentMobilityService to permit overloading of fetchClassFile method

----

> Modified : /trunk/build.properties
  Modified : /trunk/src/jade/core/mobility/AgentMobilityService.java
  From     : https://jade.tilab.com/svn/jade/trunk
  Changelog: https://jade.tilab.com/doc/ChangeLog
  
  

**Fig. 1**: 

![JADE-4.6.0-Revision-6874-OpenJDK-17](./images/logoJade.png)




## 1. Build Process: `jade-4.6.0-6874.jar` with Maven

- Once Maven is configured:

```shell
git clone https://github.com/dpsframework/p21-jade-fipa-4.6.0.git
cd p21-jade-fipa-4.6.0

mvn package
```

- Above `./target/` directory is:  `jade-4.6.0-6874.jar`
The full version of the JADE Platform that can operate autonomously until the future revision of JADE.





- **Check the result again with:**:


```shell 
 cd target
 
 java -jar jade-4.6.0-6874.jar -gui
```





