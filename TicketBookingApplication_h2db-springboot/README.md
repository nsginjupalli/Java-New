# TicketBookingApplication_h2db
SpringBoot_ticketBooking 

1) Import project into eclipse. Install STS (Standard edition) in eclipse marketplace to get Spring boot app 
2) Run as Spring Boot App
3) Go to browser and access http://localhost:8080/ticket/all
4) It will retrieve inserted object from inmemory database.


To Insert data

1) Go to PostMan 
2) Enter request url as http://localhost:8080/ticket/create
3) select method as POST
4) paste the below JSON on body
{

"passengerName": "Sahithi",
"sourceStation": "India",
"destinationStation": "USA",
"travelDate": "2020-11-03T13:26:29.813+00:00",
"email": "Sahithi@gmail.com"
}

5) Post it
6) now it wil create new record.

In the same way I have created methods for GetTicket, DeleteTicket, PutTicket services also there. Please check in TicketController.java file
