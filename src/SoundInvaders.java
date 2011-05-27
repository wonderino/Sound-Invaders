
import processing.core.*;

//import oscP5 libraries
import oscP5.*;
import netP5.*;

public class SoundInvaders extends PApplet {
	
	OscP5 oscP5;
	NetAddress myRemoteLocation;
	
	public void setup() {
		/* start oscP5, listening for incoming messages at port 12000 */
		  oscP5 = new OscP5(this,12000);
		  
		  /* myRemoteLocation is a NetAddress. a NetAddress takes 2 parameters,
		   * an ip address and a port number. myRemoteLocation is used as parameter in
		   * oscP5.send() when sending osc packets to another computer, device, 
		   * application. usage see below. for testing purposes the listening port
		   * and the port of the remote location address are the same, hence you will
		   * send messages back to this sketch.
		   */
		  myRemoteLocation = new NetAddress("127.0.0.1",12000);
	}
	
	public void  draw() {
		background(0);
	}
	
	public void mousePressed() {
		  /* in the following different ways of creating osc messages are shown by example */
		  OscMessage myMessage = new OscMessage("/test");
		  
		  myMessage.add(123); /* add an int to the osc message */
		  myMessage.add(12.34); /* add a float to the osc message */
		  myMessage.add("some text"); /* add a string to the osc message */
		  myMessage.add(new byte[] {0x00, 0x01, 0x10, 0x20}); /* add a byte blob to the osc message */
		  myMessage.add(new int[] {1,2,3,4}); /* add an int array to the osc message */

		  /* send the message */
		  oscP5.send(myMessage, myRemoteLocation); 
	}


	/* incoming osc message are forwarded to the oscEvent method. */
	public void oscEvent(OscMessage theOscMessage) {
		  /* print the address pattern and the typetag of the received OscMessage */
		  print("### received an osc message.");
		  print(" addrpattern: "+theOscMessage.addrPattern());
		  println(" typetag: "+theOscMessage.typetag());
	}
}
