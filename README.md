# 4q-zadanie
Java-backend

#### Zadanie:
Vasou ulohou bude vytvorit klasicku poznamkovaciu aplikaciu pomocou J2EE
frameworku, ktora poskytne HTTP REST API na vytvorenie, editaciu, mazanie,
ziskanie jednej a ziskanie kolekcie poznamok. Rovnako bude mozne zadat
jednoduchy fulltext filter pre filtrovanie vyslednej kolekcie.

---

**Aplikacia musi mat kod rozdeleny do troch "vrstiev" (tried):**

**DAO:**
* trieda v ktorej sa bude realizovat praca s databazou
* musi mat rozhranie definujuce jej metody
* musi byt injektovatelna v ramci CDI a EJB
* implementovana bude pomocou JPA
* Nazov rozhranie: TaskDao.java
* Nazov implementacie: TaskDaoJpa.java

---

**SERVICE:** 
* trieda obsahujuca biznis logiku (v prvom kroku bude skoro prazdna. bude mat v sebe len volanie dao vrstvy)
* musi mat rozhranie definujuce jej metody
* musi byt injektovatelna v ramci CDI a EJB
* implementovana bude pomocou EJB
* Nazov rozhranie: TaskService.java
* Nazov implementacie: TaskServiceEjb.java

---

**REST API:**
* trieda obsahujuca definiciu api
* po prijati http requestu dedikuje pracu na konkretnu metodu v servisnej vrstve
* implementovana bude pomocou JAX-RS

---

**Hlavné technólogie použité pri vývoji aplikácie:**

Dao: JPA+JTA
Service: CDI+EJB
Api: JAX-RS

---
