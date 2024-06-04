## Rent A Car
### Explanation
The car rental project, which will be developed using Java and Swing technologies, will not only strengthen your Java programming knowledge, but will also enable you to gain important experience in database operations and user interface development. With this course, you will practice designing interfaces using Swing.

Swing is a library used to create and manage GUI (Graphical User Interface) components in the Java programming language. It offers a wide set of components for creating user interfaces. These components include buttons, text fields, list boxes, tables, menus, and various other interface elements. Swing provides an advanced event-based model to organize these components, handle events, and manage user interactions.

Swing is an ideal option for developing desktop applications. It is not generally used for web applications because such applications usually run through browsers and Swing is not compatible with browsers. Swing is supported by many Java IDEs and development environments used to develop desktop applications.

Swing will be used to add visuality to your application. The part that needs to be focused on is how to connect to the database, read, write, update and delete data from the database, which are done on the backend side.

The project generally consists of four main modules: entity, dao, business and view. These modules represent different layers of the project and each performs a specific task.

### Entity Module
- Defines database tables and entity objects belonging to these tables.

- Contains basic entity objects such as user, brand, model, vehicle, reservation.

- It determines the relationships between objects.

### DAO (Data Access Object) Module
- Provides an interface for database access and operations.

- It manages the processes of saving, updating and deleting objects in the Entity module to the database.

- It performs data retrieval operations from the database.

### Business Module
- It manages business logic and performs basic operations within the application. 

- Manages business logic operations such as pricing and car rental calculations.

- It interacts with the dao module for database operations.

### View Module
- It manages the user interface (UI) and enables interaction with the user.

- Shows user information such as vehicle list and rental screen.

- It initiates transactions by transmitting the information entered by the user to the business layer.

These modules create the layered architecture of the project, ensuring that the code is organized, modular and easy to maintain. Treating entity objects, database access, business logic, and user interface separately makes the development process more manageable and makes it easier to add additional functionality.

The basic requirements of the project are:

- Registration of all vehicles in the company into the system.

- Keeping license plate information for each vehicle.

- Listing of suitable and available vehicles according to certain criteria through the system.

- Making the reservation.

That is, users will be able to check the availability of vehicles within a certain date range. For example, they will be able to search by criteria such as "Renault Clio" or "Volkswagen Polo" and book suitable vehicles.

The aim of the project is to provide the opportunity to track vehicles, see their availability and manage the workplace.

Developing a car rental project will enable you to gain experience in software development with Java layered architecture, database operations, and user interface creation.
