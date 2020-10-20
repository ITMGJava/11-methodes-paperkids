# Methodes

- Schrijf een methode ```static void helloWorld()``` die het volgende afdrukt:
  ```bash
  Hello World!
  ```
- Schrijf een methode ```static void groet()``` die een begroeting afdrukt:
  ```bash
  Hallo, User!
  ``` 
- Schrijf een methode ```static void groet(String naam)``` met als input een naam die een begroeting afdrukt voor een ingevoerde naam:
  ```bash
  Hallo, Jan!
  ``` 
- Schrijf een methode ```static String groet(String naam)``` met als input een naam die een begroeting begroeting teruggeeft met een ingevoerde naam. *Merk op dat je een compiler error krijgt*. Verwijder de methode ```static void groet(String naam)``` of plaats hem in commentaar. De compiler error zal dan verdwijnen. Roep deze methode aan en druk de output af:
  ```bash
  Hallo, Jan!
  ``` 
  **Merk op dat voorgaande 3 methodes allen dezelfde naam hebben. Dit wordt in Java overloading genoemd. De methodes worden onderscheiden door een verschillend aantal parameters of verschillende types parameters. Daarom konden de 2e en 3e methode niet tegelijkertijd bestaan.** 
- Hergebruik voor de laatste opgave delen van de code van de opdracht Spaarbedrag. Schrijf een methode ```static float berekenEindBedrag(float beginBedrag, float maandRente)``` met als input een beginbedrag en een maandpercentage en als output het eindbedrag berekent na 10 jaar. Vraag in het hoofdprogramma aan de gebruiker een bedrag en een rentepercentage en roep vervolgens deze methode aan en druk het eindbedrag af.
  ```bash
  Voer een bedrag in:
  1000
  Voer een maandrente in:
  2
  Uw eindbedrag bedraagt na 10 jaar:
  10765.137
  ````
  **Optioneel**
  
- Formateer het eindbedrag:
  ```bash
  10.765,14
  ```