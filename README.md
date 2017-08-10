# SSM-Restful-Freemarker
# springMvc+Mybatis+Restful风格+Freemarker模板
###   编辑器工具：MyEclipse

###   依赖管理工具：Maven

###   数据库：mysql

###   连接池：c3p0

###   日志：log4j

###   jar包依赖：

####        SpringMvc和Spring依赖

######      
      <!--spring-webmvc  -->
      <!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
      <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-webmvc</artifactId>
      <version>4.3.9.RELEASE</version>
      </dependency>

      <!--spring-jdbc  -->
      <!-- https://mvnrepository.com/artifact/org.springframework/spring-jdbc -->
      <dependency>
         <groupId>org.springframework</groupId>
         <artifactId>spring-jdbc</artifactId>
         <version>4.3.9.RELEASE</version>
      </dependency>


      <!--整合orm框架  -->
      <!-- https://mvnrepository.com/artifact/org.springframework/spring-orm -->
      <dependency>
         <groupId>org.springframework</groupId>
         <artifactId>spring-orm</artifactId>
         <version>4.3.9.RELEASE</version>
      </dependency>

      <!--切面  -->
      <dependency>  
         <groupId> org.aspectj</groupId >  
         <artifactId> aspectjweaver</artifactId >  
         <version> 1.6.11</version >  
      </dependency>


####        Mybatis依赖
######      
     <!--Mybatis  -->
      <!-- https://mvnrepository.com/artifact/org.mybatis/mybatis -->
      <dependency>
         <groupId>org.mybatis</groupId>
         <artifactId>mybatis</artifactId>
         <version>3.3.0</version>
      </dependency>

      <!-- https://mvnrepository.com/artifact/org.mybatis/mybatis-spring -->
      <dependency>
         <groupId>org.mybatis</groupId>
         <artifactId>mybatis-spring</artifactId>
         <version>1.3.0</version>
      </dependency>

####        Freemarker依赖
######     
      <!--freemarker  -->
      <!-- https://mvnrepository.com/artifact/org.freemarker/freemarker -->
      <dependency>
          <groupId>org.freemarker</groupId>
          <artifactId>freemarker</artifactId>
          <version>2.3.23</version>
      </dependency>

####        mysql驱动
######      
      <!--mysql驱动  -->
      <!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
      <dependency>
          <groupId>mysql</groupId>
          <artifactId>mysql-connector-java</artifactId>
          <version>5.1.35</version>
      </dependency>

####        c3p0依赖
######      
      <!--c3p0连接池  -->
      <!-- https://mvnrepository.com/artifact/com.mchange/c3p0 -->
      <dependency>
          <groupId>com.mchange</groupId>
          <artifactId>c3p0</artifactId>
          <version>0.9.5.2</version>
      </dependency>

####        log4j日志依赖
######      
      <!-- https://mvnrepository.com/artifact/log4j/log4j -->
      <dependency>
          <groupId>log4j</groupId>
          <artifactId>log4j</artifactId>
          <version>1.2.17</version>
      </dependency>

####        Mybatis自动生成插件
######      
      <plugins>
      <!--mybatis自动生成插件  -->
         <plugin>
             <groupId>org.apache.maven.plugins</groupId>
             <artifactId>maven-compiler-plugin</artifactId>
             <configuration>
                 <source>1.7</source>
                 <target>1.7</target>
             </configuration>
             <version>3.3</version>
         </plugin>
         <plugin>
             <groupId>org.mybatis.generator</groupId>
             <artifactId>mybatis-generator-maven-plugin</artifactId>
             <version>1.3.2</version>
             <dependencies>
               <dependency>
         <groupId>mysql</groupId>
         <artifactId>mysql-connector-java</artifactId>
         <version>5.1.35</version>
         </dependency>
         </dependencies>
            <configuration>
               <!--配置文件的路径-->
                  <configurationFile>
                     ${basedir}/src/main/resources/generatorConfig.xml
                  </configurationFile>
                  <overwrite>true</overwrite>
               </configuration>
             </plugin>
      </plugins>
