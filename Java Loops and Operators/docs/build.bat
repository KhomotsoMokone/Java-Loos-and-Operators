@echo off
echo "Setting Path"
set JAVA_HOME=C:\jdk-17
set PATH=%JAVA_HOME%\bin;%PATH%

javac -version
REM Go to patrent folder 
cd ..

REM Compile code
javac -d bin Flowers.java

REM Run code
java -cp bin Flowers

REM go back to docs folder 
cd docs

PAUSE