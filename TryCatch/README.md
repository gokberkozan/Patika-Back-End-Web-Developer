## Try Catch
### Explanation
Write a Java method that returns the element at the index received from the user in a one-dimensional array with 10 elements. If the specified index is outside the array size, the method should return an error message. Define the elements of the array manually.

Tip 1: You may encounter `ArrayIndexOutOfBoundsException` error when accessing the array. This error is thrown when you try to go beyond the array size.

Tip 2: You can use `try-catch` blocks to catch this type of error and return an appropriate error message. You place the code that may cause errors in the `try` block. If an error occurs, control passes to the `catch` block.

Tip 3: In the `catch` block you can use it to catch the error object and return the error message.

Tip 4: Your method should try to access the array within the `try` block and return that value. If an error occurs, you must return the error message in the `catch` block.
