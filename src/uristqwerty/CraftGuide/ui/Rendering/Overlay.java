package uristqwerty.CraftGuide.ui.Rendering;

import uristqwerty.CraftGuide.ui.GuiRenderer;
import uristqwerty.gui.rendering.Renderable;
import uristqwerty.gui.rendering.RendererBase;

public class Overlay implements Renderable
{
	private Renderable renderable;
	private int x, y;
	
	public Overlay(Renderable renderable)
	{
		this.renderable = renderable;
	}

	//@Override
	public void render(GuiRenderer renderer, int xOffset, int yOffset)
	{
		renderer.overlay(this);
		x = xOffset;
		y = yOffset;
	}
	
	public void renderOverlay(GuiRenderer renderer)
	{
		renderable.render(renderer, x, y);
	}

	@Override
	public void render(RendererBase renderer, int x, int y)
	{
		render((GuiRenderer)renderer, x, y);
	}
}
