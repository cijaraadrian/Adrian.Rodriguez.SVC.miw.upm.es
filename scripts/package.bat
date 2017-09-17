@echo off
echo %%%%%%%%%%%%%%%%%%%%%%
echo . (C) Adrian.Rodriguez.SVC.miw.upm.es
echo  clean and test in develop profile then package in preproduction profile
echo %%%%%%%%%%%%%%%%%%%%%%
cd %workspace%
call test.bat
mvn install -Denvironment.type=preproduction
mvn package
echo Fin package
