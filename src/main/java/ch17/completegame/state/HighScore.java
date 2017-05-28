package ch17.completegame.state;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import ch17.util.Matrix3x3f;
import ch17.util.Utility;

public class HighScore extends AttractState {
	
	@Override
	protected AttractState getState() {
		return new GameInformationState();
	}

	@Override
	public void render(Graphics2D g, Matrix3x3f view) {
		super.render(g, view);
		String[] hs = highScoreMgr.getHighScores();
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
				RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setFont(new Font("Arial", Font.PLAIN, 20));
		g.setColor(Color.GREEN);
		Rectangle2D bounds = g.getFontMetrics().getStringBounds(hs[0], g);
		int x = (app.getScreenWidth() - (int) bounds.getWidth()) / 2;
		Utility.drawString(g, x, app.getScreenHeight() / 3, hs);
	}

	@Override
	protected float getWaitTime() {
		return 7.0f;
	}
}