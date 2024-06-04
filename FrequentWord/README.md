## Frequent Word
### Explanation
Write a Java project that finds the most frequently occurring word in a text entered by the user and prints it to the screen.

If you want to do research, you can solve this question using HashMap. If you want to use HashMap, you can use the tips below.

Tip 1: First, you will need to break the text into words. You can use the `split` method of the `String` class to do this.

Tip 2: You need to use a data structure to count words. `HashMap` might be a good option for this. HashMap stores key-value pairs. Here, key can be the words and value can be the number of times that word is mentioned in the text.

Tip 3: Loop the words one by one and add each one to the `HashMap`. If the word already exists in the `HashMap`, increase the count by one. If not, add the word to `HashMap` and set the count to 1.

Tip 4: Finally, go through the `HashMap` and find the word with the highest count value. This word will be the word that occurs most frequently in the text.
