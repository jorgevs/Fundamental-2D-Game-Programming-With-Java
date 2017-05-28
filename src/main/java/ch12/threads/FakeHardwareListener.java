package ch12.threads;

import ch12.threads.FakeHardware.FakeHardwareEvent;

public interface FakeHardwareListener {
	
	public void event(FakeHardware source, FakeHardwareEvent event);
	
}