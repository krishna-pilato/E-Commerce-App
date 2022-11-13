# E-Commerce-App
"**Digital storefront like Amazon or Ebay, but with my own design and code**"

The project started on November 9, 2022 with the aim of practicing a rather complicated personal project. In the following days this README will be updated with more details. Anyone can use that code for anything,, but I'd like to be mentioned. Many things are still to be done, but I want to carry out the project calmly in my free time so that a good result comes out.

**What have I already implemented?**

1. Response from the back-end service (see below image): the security part, login and a test REST Controller have already been implemented. If you try to access via the URL *localhost:8080* you will see that page. I used Java 19.0.1, Spring Boot v3.0.0-SNAPSHOT and MySQL Server 8.0.31 for the backend.

![alt text](https://github.com/krishna-pilato/E-Commerce-App/blob/main/images/backend%20app%20screenshot%20-%20desktop.png?raw=true)

2. The navbar, the main section and the footer have been inserted on the frontend (Angular). The frontend is fully responsive. I used Angular 14.2.9, Boostrap 5.2.2 and FontAwesome 5.15.4 for the frontend.

![alt text](https://github.com/krishna-pilato/E-Commerce-App/blob/main/images/frontend%20app%20screenshot%20-%20desktop.png?raw=false)

![alt text](https://github.com/krishna-pilato/E-Commerce-App/blob/main/images/frontend%20app%20screenshot%20-%20mobile.png?raw=false)

**How can I test the project on my computer?**

First you need to install the following software to get started:

- [Java 19](https://www.oracle.com/java/technologies/javase/jdk19-archive-downloads.html "Java Download")
- [Eclipse IDE for Enterprise Java and Web Developers](https://www.eclipse.org/downloads/packages/release/2022-09/r/eclipse-ide-enterprise-java-and-web-developers "Eclipse Download") (remember to install the Lombok plugin)
- [MySQL 8.0.31](https://dev.mysql.com/downloads/mysql/ "MySQL Download")
- [NodeJS 19.0.1](https://nodejs.org/en/ "NodeJS Download")
- [Visual Studio Code 1.73](https://code.visualstudio.com/download "VS Code Download")

Remember to install MySQL Server only! The next steps are:

- Open Eclipse and Import an Existing Maven Project (link to app-backend). Now you can run EcommerceApplication as Java Application. Open localhost:8080 to see the interface
- Install Angular/TypeScript with the command:

```bash
  npm install -g @angular/cli
  npm install -g typescript
```
- Open the app-frontend of the project with Visual Studio Code, open the terminal and paste this command (this installs all dependencies):

```bash
  npm install
```

- Last command to start the backend and have fun:

```bash
  ng serve
```
