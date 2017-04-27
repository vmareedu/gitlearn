set projectLocation=C:\Users\venkat.mareedu\Desktop\JavaWorkSpace2\TestNgDemo
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause