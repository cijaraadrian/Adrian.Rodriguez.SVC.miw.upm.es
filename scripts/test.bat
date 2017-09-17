@echo off
echo %%%%%%%%%%%%%%%%%%%%%%
echo . (C) Adrian.Rodriguez.SVC.miw.upm.es
echo %%%%%%%%%%%%%%%%%%%%%%
cd %workspace%
echo .
:: hacer un clean y test en perfil develop
call mvn clean test --settings settings.xml
echo Fin test en develop
cmd /k


