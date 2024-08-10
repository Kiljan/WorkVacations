# WorkVacations

- [WorkVacations](#workvacations)
  - [Build maven project](#build-maven-project)
  - [Usage](#usage)
    - [Deploy on Tomcat](#deploy-on-tomcat)
    - [For additional database management](#for-additional-database-management)
  - [To do](#to-do)

This is a simple application using Spring Security.

The passwords are retrieved from databases and are hacked using BCrypt.

The site is also protected against Cross Site Request Forgery (CSRF).

An administrator account is added here.

The functions are: adding and removing users from the holiday database, updating work time.

## Build maven project

```bash
$> cd $HOME/WorkVacations
$> mvn package
```

Other valid option for maven project are ([source](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)):

1. validate: validate the project is correct and all necessary information is available
1. compile: compile the source code of the project
1. test: test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
1. package: take the compiled code and package it in its distributable format, such as a JAR.
1. integration-test: process and deploy the package if necessary into an environment where integration tests can be run
1. verify: run any checks to verify the package is valid and meets quality criteria
1. install: install the package into the local repository, for use as a dependency in other projects locally
1. deploy: done in an integration or release environment, copies the final package to the remote repository for sharing with other developers and projects.

## Usage

```bash
$> cd $HOME/WorkVacations/Docker
$> docker-compose up -d 
```

### Deploy on Tomcat

Go to [localhost](http://localhost:8080/manager/html/) and using admin account (password: admin) deploy .war file.

### For additional database management

```bash
$> docker exec -it mqsql1 mysql -uroot -p
```

## To do

1. English version for app,
1. Address the following topics:
    1. $HOME/WorkVacations/Urlopy/src/main/java/urlopy/app/config/DataConfig.java = database connection
    1. $HOME/WorkVacations/Urlopy/src/main/java/urlopy/app/config/SecurityConfig.java = available roles for new user (ADMIN or USER)
    1. $HOME/WorkVacations/Urlopy/src/main/java/urlopy/app/controller/HomeController.java = controller for admin user
1. Add settings.xml

![image](https://github.com/user-attachments/assets/0f9961e2-2b8c-49c6-b8cb-f4e2e1406a84)
![image](https://github.com/user-attachments/assets/5ff5c324-d7df-4767-8461-fbf20310be6e)
![image](https://github.com/user-attachments/assets/e4293945-6535-45f3-98bc-c0d67d86e8d7)
![image](https://github.com/user-attachments/assets/7a5d77c4-6207-46d4-9f7b-90449add4ceb)



