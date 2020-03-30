public class TurnVolumeDown implements Command {

	ElectronicDevice theDevice;
	
	public TurnVolumeDown(ElectronicDevice newDevice){
		
		theDevice = newDevice;
		
	}
	
	public void execute() {
		
		theDevice.volumeUp();
		
	}

	public void undo() {
		
		theDevice.volumeDown();
		
	}
	
}