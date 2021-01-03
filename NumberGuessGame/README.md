## File Scanner
Another way of accepting runtime input is through files, these files can be plain text files that the user creates with a very basic text editor (e.g. notepad on windows or TextEdit on macs).

A good example would be a Java program that loads a list of expenses from a text file (or excel sheet) and after some calculations prints a report of the total amount, average spendings, largest purchase etc.

To read a text file in Java you can also use the same Scanner class we used to read command line inputs, but instead of passing System.in as the argument you pass a File object which you can create by typing in the file name:
```java
File file = new File("expenses.txt");
Scanner fileScanner = new Scanner(file);
```
Once the file scanner has been created, you read lines the same way we did earlier.

But since you would most likely want to load the entire file at once, you can check if the file still has more lines using hasNextLine method and then use this loop to read everything:
```java
while (input.hasNextLine()) {
   String line = input.nextLine();
   // Use that line to do any calculations, processing, etc ..
}
```
