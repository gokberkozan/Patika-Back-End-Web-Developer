## Notepad
### Explanation
Create an acid Notepad application. This application should take text input from the user and save that text to a file. When the user starts the program again, it should print the last saved text to the screen.

Tip 1: In Java you can use Scanner class to receive text input from the user.

Scanner scanner = new Scanner(System.in);
System.out.print("Enter some text: ");
String text = scanner.nextLine();

Tip 2: You can use the FileWriter and PrintWriter classes to write text to a file.

FileWriter fileWriter = new FileWriter("notes.txt");
PrintWriter printWriter = new PrintWriter(fileWriter);
printWriter.print(text);
printWriter.close();

Tip 3: You can use the FileReader and BufferedReader classes to read text from a file.

FileReader fileReader = new FileReader("notes.txt");
BufferedReader bufferedReader = new BufferedReader(fileReader);
String readText = bufferedReader.readLine();
bufferedReader.close();

Tip 4: Errors may occur while reading and writing files. Therefore, do not forget to perform these operations within try-catch blocks.

Tip 5: You can change the structure of your program depending on your needs. For example, you can write the text received from the user directly to the file, or you can first store it in a data structure and then write it to the file.
