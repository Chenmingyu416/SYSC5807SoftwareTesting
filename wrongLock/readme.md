# Run EvoSuite to generate Test


src_evo is the src for evosuite

1. set the src_evo as sources root
2. run Evosuite on Main and WrongLock java files and generate test in evo_tests/orig/src
   2.1 export file: evo_tests/evomain and evo_tests/evo_WrongLock
   2.2 Evosuite jar: evosuite.jar
   2.3 JAVA_HOME: 1.8jdk/Contents/Home
3. set the evo_tests/evomain or evo_tests/evo_WrongLock as the test sources root
4. Run test with coverage
5. test5 in evo_tests/evo_WrongLock is written by Mingyu


src_randoop is the src for randoop

1. Copy other java file into Main.java file. Ensure the package name is com
2. `Javac Main.java` to compile it to .class file.
3. `mkdir randoop_tests` to create the file to contain randoop tests and then `cd randoop_tests`
4. `java -cp  ../src_randoop:../randoop/randoop-all-4.3.1.jar:../junit/junit.jar:../junit/hamcrest-core.jar randoop.main.Main gentests --testclass  com.Main  --time-limit=60`
5. set the src_randoop as the sources root and randoop_tests as the test sources root
6. Run test with coverage