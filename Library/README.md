## Library
### Explanation
We want you to design a library management system. There are the following entities in this library system.

- Book: Entity/table containing the properties of books.

- Author: Entity/table containing the properties of authors.

- Category: Entity/table containing book categories.

- Publishing House: Entity/table containing the properties of publishing houses.

- Book Borrowing: Entity/table that tracks book borrowing transactions. This table will include who borrowed the book, the date of receipt, and the delivery date.

The key variables for each asset are as follows.

### Book:
- id (Unique book ID)
- name(Book name)
- publicationYear
- stock (Amount in library)
### Author:
- id (Unique author ID)
- name (Author's name)
- birthDate (Author's birth year)
- country (Author's country)
### Categories:
- id (Unique category ID)
- name (Category name)
- description (Category description)
### Publishing House (Publisher)
- id (Unique ID)
- name (Publisher name)
- establishmentYear
- address (Publisher address)
### Book Borrowing
- id (Unique ID)
- borrowerName (name and surname of the person who borrows the book)
- borrowingDate (Book borrowing date)
- returnDate (The date the book was delivered will be null in the first record. The date will be updated when the book is delivered)

You should define the following relationships between these entities:
- A book can have one author, an author can have more than one book. (One-to-Many relationship).
- A category can have more than one book, while a book can belong to more than one category. (Many-to-Many relationship).
- A book may have one publishing house, a publishing house may have more than one book. (One-to-Many relationship).
- A book can have multiple loans, but each loan can only belong to one book. (One-to-Many relationship).
