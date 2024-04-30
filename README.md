 	Hibernate 

-	Hibernate is a framework.
-	It is a java based ORM framework.
-	ORM is a “Object Relational Mapping”.
-	OBJECT- it is your POJO class object or Entity class object.
-	Relational-The word Relational refers to the Database.
So your application database may be Oracle, MySQL, Postgres.
-	Mapping- Map your Object to DB directly.


-	ORM-
  - It is techquie or solution is going to interact to database with the    help of mapping.
  - We Write a code that object is stored inside the database or you can load that data from database into the object.
  -  ORM which creates bridge for communication for your application (java/python/.net) with the relational database so it is called ORM.
  - In the market many ORM farmwork is present hibernate, MyBatis, TopLink, Eclipselike.


 	JPA-
-	ORM which create a bridge for communication you’re your Application(java/python/.net) with relational database.
-	In the market there are many ORM for java application like Hibernate,
Toplink, MyBatis and Eclipse link. This are top ORM providers.
-	Each ORM has its own api method to interact with database to store or get the data from database.
-	To access any Orm in your project you required its individual jar to add In our project, then we can use its own method to interact with database.
-	After some times I want to add other ORM in my application then for then I have a remove a Hibernate ORM and add different other ORM to access the data from database. Then in that case we have to use a 
Particular ORM jar file into our project and use its different methods. So in that case again we have do some extra effort to write down the code for particular ORM.
-	Again we have write code for other ORM farmwork, it is very difficult for developer as well as other team members to manage the jars.
-	To avoid all that things JPA coms into the picture, 
-	Called as java persistence API.
-	JPA is defined as a sets of rolls or specifications  for java framework in java.
-	JPA is a interface has a some method that we use with the help any ORM implementation like save, Update method.
-	JPA is standard to maintain for all ORM so it is called specifications.



-	Hibernate can map your entity class object data directly to database with the help of predefined annotations.
-	Hibernate uses HQL (Hibernate Query Language) similar to SQL to provide additional features of oops concepts like inheritance, Association &  many more.  
  

 	-What are built in Hibernate?
1]save-   use to inserting a data.
2]Load-  Loading a data on the basis of primary kye.
3]Save/Update- this method do insertion or updation on the    record on the basis of primary kye.
4]Update- update a data using primary .

 	Hibernate dialect-
-	org.hibernate.dialect.MysqlDilaect


 	HQL-
-	HQL is a hibernate query language.
-	It is a object oriented version of SQL.
-	It generates the database independent query.
-	It is a same as a SQL but it does not depend on the table of the database.
-	Instead of table name we use a class name in sql, so it it database independent query language.

 	HCQL-
-	Hibernate criteria query language.
-	It is used to fetch the record based on the specific criteria.
-	The criteria interface provide a methods to apply the criteria such as a retrieving all the records of the table whose salary is greater than 50.000 etc.

 	Different object used in hibernate Architecture are as followed-
       1]Configuration Object-
-	It is a first object oriented in hibernate application.
-	It is created only once.
-	It represented of Configuration or properties files required by the hibernate application.

      2] Session factory object-
           - it is created using configuration object.
           - it is configures the hibernate using the given configuration file.
      3] session object-
           - it is used to get a physical connection with the database.
      4]Transaction Object-
           - transaction represents the unit of work with the database
               And RDBMS support transaction functionality.
       5]Query and criteria-
           - are use to execute the HQL statement
