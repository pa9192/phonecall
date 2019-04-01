A1.  	Create an abstract class named PhoneCall that includes a String field for a phone number and a double field for the price of the call.  

A2.  	Also, include a constructor that requires a phone number parameter and that sets the price to 0.0. Include a set method for the price. Also include three abstracts get methods—one that returns the phone number, another that returns the price of the call, and a third that displays information about the call.  

A3.  	Create two child classes of PhoneCall: IncomingPhoneCall and OutgoingPhoneCall.  

- The IncomingPhoneCall constructor passes its phone number parameter to its parent’s constructor and sets the price of the call to 0.02. The method that displays the phone call information displays the phone number, the rate, and the price of the call (which is the same as the rate).  

The OutgoingPhoneCall class includes an additional field that holds the time of the call in minutes. The constructor requires both a phone number and the time. The price is 0.04 per minute, and the display method shows the details of the call, including the phone number, the rate per minute, the number of minutes, and the total price.  

Write an application that demonstrates you can instantiate and display both IncomingPhoneCall and OutgoingPhoneCall objects. Save the files as PhoneCall.java, IncomingPhoneCall.java, OutgoingPhoneCall.java, and DemoPhoneCalls.java.
