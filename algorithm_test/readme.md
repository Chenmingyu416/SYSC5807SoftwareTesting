# Run EvoSuite and Randoop to generate Test


src_evo is the src for evosuite

1. set the source as sources root
2. run Evosuite on Java file and generate test in test/evo/
   2.1 export file: test/evo/evo_complex
   2.2 Evosuite jar: evosuite.jar
   2.3 JAVA_HOME: 1.8jdk/Contents/Home
3. set the evo_tests/evo_complex as the test sources root
4. Run test with coverage


src_randoop is the src for randoop

1. Ensure the package name is code.src
2. `javac Complex.java` to compile it to .class file.
3. `cd test/randoop/ran_complex`
4. `java -cp  ../../../source:../../../randoop/randoop-all-4.3.1.jar:../../../junit/junit.jar:../../../junit/hamcrest-core.jar randoop.main.Main gentests --testclass  code.src.Complex  --time-limit=60`
5. set the source as the sources root and ran_complex as the test sources root
6. Run test with coverage