# Run EvoSuite to generate Test


src_evo is the src for evosuite

1. set the src_evo as sources root
2. run Evosuite on Java file and generate test in evo_tests/orig/src
    2.1 export file: evo_tests/evo1
    2.2 Evosuite jar: evosuite.jar
    2.3 JAVA_HOME: 1.8jdk/Contents/Home
3. set the evo_tests/evo1 as the test sources root
4. Run test with coverage
5. test9 and test10 is written by Mingyu


src_randoop is the src for randoop

1. Ensure the package name is com
2. `Javac ManageAccount.java` to compile it to .class file.
3. `mkdir randoop_tests` to create the file to contain randoop tests and then `cd randoop_tests`
4. `java -cp  ../src_randoop:../randoop/randoop-all-4.3.1.jar:../junit/junit.jar:../junit/hamcrest-core.jar randoop.main.Main gentests --testclass  com.ManageAccount  --time-limit=60`
5. set the src_randoop as the sources root and randoop_tests as the test sources root
6. Run test with coverage