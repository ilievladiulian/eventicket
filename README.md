# eventicket
Simple ticketing application for events in Java (Spring, Hibernate)

## Setting up
1. Clone the repository on your local machine.
2. Open the Maven project.
3. Run the project using spring-boot:run.

## How to use it?
1. POST to localhost:8080/tickets/create_ticket with the fields of a ticket (id - may be null, event (id, title - may be null, date - may be null, location - may be null), price, holder) in JSON format inserts a ticket in the database and returns a response in JSON format with the newly created ticket.

2. POST to localhost:8080/tickets/delete_ticket with the id of the ticket as parameter deletes the ticket from the database (returns true if the ticket exists, false if not).

3. GET to localhost:8080/tickets/ticket_details/{id} (with the id of the ticket in the url path) shows the details of the ticket in JSON format.

4. GET to localhost:8080/events/list_events shows all the events in JSON format.

## Note
The project uses the in-memory database H2 for development purposes.
