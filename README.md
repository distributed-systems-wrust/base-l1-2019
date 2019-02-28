# Task List 1 -2019

## RPC


Komendy:

```
#windows
mvnw.cmd package
#linux
./mvnw package


java -jar server/target/list1-2019-server-1.0-SNAPSHOT-jar-with-dependencies.jar

java -jar client/target/list1-2019-client-1.0-SNAPSHOT-jar-with-dependencies.jar

```

### [Docs](https://ws.apache.org/xmlrpc)

1. Dodaj metodę do serwera która dodaje 2 liczby i zwraca wynik
2. Dodaj wywołanie metody do serwera i klienta
3. Dodaj do serwera i klienta inną dowolną metodę
4. Dodaj metodę asynchronicznę po stronie klienta i serwera która sortuje podane liczby (Arrays.sort)
5. Dodaj logowanie czasu wykonania po stronie klienta i serwera
6. Uruchom program przekazując mu coraz większe tablice do posortowania
