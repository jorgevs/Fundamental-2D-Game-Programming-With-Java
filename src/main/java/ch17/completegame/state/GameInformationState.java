package ch17.completegame.state;

import java.awt.*;
import ch17.util.Matrix3x3f;
import ch17.util.Utility;

public class GameInformationState extends AttractState {
	
	private static final String[] gameInfo = { 
		"Space Rocks - version 2.0",
		"Programmed by: Tim Wright", 
		"", 
		"Special thanks to:",
		"Michaela Wright", 
		"Destiny Tamboer", 
		"Jimmi Wright", 
	};

	@Override
	protected AttractState getState() {
		return new PressSpaceToPlay();
	}

	@Override
	public void render(Graphics2D g, Matrix3x3f view) {
		super.render(g, view);
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
				RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setFont(new Font("Arial", Font.PLAIN, 20));
		g.setColor(Color.GREEN);
		Utility.drawCenteredString(g, app.getScreenWidth(),
				app.getScreenHeight() / 3, gameInfo);
	}
}