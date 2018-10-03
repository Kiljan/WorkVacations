Aplikacja do zarządzania urlopami pracowników

Jest to prosta aplikacja używająca Spring Security. 

Hasła są pobierane z baz danych i hashowane za pomocą BCrypt.

Strona jest również zabezpieczona przed Cross Site Request Forgery (CSRF).

W configach można sprecyzować bazy z jakich aplikacjia ma kożystać. Bazy te mogą być modyfikowane przez inne programy lub admina i w ten sposób każdy użytkownik w bezpieczny sposób będzie widział ile ma aktualnego urlopu. 

---
This is a simple application using Spring Security.

The passwords are retrieved from databases and are hacked using BCrypt.

The site is also protected against Cross Site Request Forgery (CSRF).

In the configs, you can specify the databases from which the application is to be used. These databases can be modified by other programs or admin and in this way each user will be able to see in a safe way how many current holidays they have.
