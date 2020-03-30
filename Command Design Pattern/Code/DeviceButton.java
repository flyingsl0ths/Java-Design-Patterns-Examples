import java.util.LinkedList;

// This is known as the invoker
// It has a method press() that when executed
// causes the execute method to be called

// The execute method for the Command interface then calls 
// the method assigned in the class that implements the
// Command interface

public class DeviceButton{
	
	Command theCommand;
	LinkedList<Command> commandMappings = new LinkedList<Command>();
	
	public DeviceButton(Command newCommand){
		
		theCommand = newCommand;
		
	}
	
	public void press(){
		// To undo more than one command add them to a LinkedList
		// using addFirst(). Then execute undo on each item until 
		// there are none left.
		commandMappings.addFirst(theCommand);
		theCommand.execute();
		
	}
	
	// Now the remote can undo past commands
	
	public void pressUndo(){
		
		for (Command command : commandMappings) {
			command.undo();
		}
		
	}
	
}