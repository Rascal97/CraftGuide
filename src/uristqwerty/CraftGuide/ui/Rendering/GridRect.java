package uristqwerty.CraftGuide.ui.Rendering;

import uristqwerty.CraftGuide.ui.GuiRenderer;
import uristqwerty.CraftGuide.ui.GuiScrollableGrid;
import uristqwerty.gui.rendering.Renderable;
import uristqwerty.gui.rendering.RendererBase;

public class GridRect implements Renderable
{
	private int x, y, width, height;
	private GuiScrollableGrid gridElement;
	
	public GridRect(int x, int y, int width, int height, GuiScrollableGrid displayElement)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.gridElement = displayElement;
	}

	//@Override
	public void render(GuiRenderer renderer, int xOffset, int yOffset)
	{
		renderer.setClippingRegion(x + xOffset, y + yOffset, width, height);
		gridElement.renderGridRows(renderer, x + xOffset, y + yOffset);
		renderer.clearClippingRegion();
	}

	@Override
	public void render(RendererBase renderer, int x, int y)
	{
		render((GuiRenderer)renderer, x, y);
	}

	public void setSize(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
}
