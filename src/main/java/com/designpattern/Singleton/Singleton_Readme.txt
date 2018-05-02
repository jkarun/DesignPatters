Singleton 
	Singleton pattern is a design pattern which restricts a class to instantiate its multiple objects and ensures that only one instance of the class exists in the java virtual machine.
	
Initialization Types of Singleton
	1. Early initialization	
		In this method, class is initialized whether it is to be used or not.
	2. Lazy initialization	
		In this method, class in initialized only when it is required.
		
Applications of Singleton classes
	1. Hardware interface access
		The use of singleton depends on the requirements. Singleton classes are also used to prevent concurrent access of class. 
		Practically singleton can be used in case external hardware resource usage limitation required e.g. Hardware printers where 
		the print spooler can be made a singleton to avoid multiple concurrent accesses and creating deadlock.
    
    2. Logger 
    	Singleton classes are used in log file generations. Log files are created by logger class object. 
    	Suppose an application where the logging utility has to produce one log file based on the messages received 
    	from the users. If there is multiple client application using this logging utility class they might create multiple 
    	instances of this class and it can potentially cause issues during concurrent access to the same logger file. 
    	We can use the logger utility class as a singleton and provide a global point of reference, so that each user can use this utility and 
    	no 2 users access it at same time.
    
    3. Configuration File 
    	This is another potential candidate for Singleton pattern because this has a performance benefit as it prevents multiple users to repeatedly access and
    	 read the configuration file or properties file. It creates a single instance of the configuration file which can be accessed by 
    	 multiple calls concurrently as it will provide static config data loaded into in-memory objects. The application only reads from 
    	 the configuration file at the first time and there after from second call onwards the client applications read the data from in-memory objects.
    
    4. Cache 
    	We can use the cache as a singleton object as it can have a global point of reference and for all future calls to the cache object the client 
    	application will use the in-memory object.
	
	5. Thread pool.


Singleton pattern implementation and design concerns with the implementation.

    1. Eager initialization
    2. Static block initialization
    3. Lazy Initialization
    4. Thread Safe Singleton
    5. Bill Pugh Singleton Implementation
    6. Using Reflection to destroy Singleton Pattern
    7. Enum Singleton
    7. Serialization and DeSerialization Singleton


Important points

    1. Singleton classes can have only one instance and that instance should be globally accessible.
    2. java.lang.Runtime and java.awt.Desktop are 2 singleton classes provided by JVM.
    3. Singleton Design pattern is a type of creational design pattern.
    4. Outer classes should be prevented to create instance of singleton class.
	5. Singleton design pattern is also used in other design patterns like Abstract Factory, Builder, Prototype, Facade etc.

	
Reference :
	1. journaldev = https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples#bill-pugh-singleton
	2. geeksforgeeks = https://www.geeksforgeeks.org/prevent-singleton-pattern-reflection-serialization-cloning/
	3. dezone = https://dzone.com/articles/java-singletons-using-enum