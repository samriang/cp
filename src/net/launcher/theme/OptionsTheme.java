package net.launcher.theme;

import java.awt.Color;
import javax.swing.border.EmptyBorder;

import net.launcher.components.Align;
import net.launcher.components.ButtonStyle;
import net.launcher.components.CheckboxStyle;
import net.launcher.components.ComponentStyle;
import net.launcher.components.TextfieldStyle;

public class OptionsTheme
{	
	public static ComponentStyle	panelOpt	= new ComponentStyle(19, 50, 315, 295, "font", 16F, Color.DARK_GRAY, true);
	
	//public static CheckboxStyle		loadnews	= new CheckboxStyle(45, 150, 300, 23, "font", "checkbox", 16F, Color.DARK_GRAY, true);
	public static CheckboxStyle		updatepr	= new CheckboxStyle(30, 100, 315, 23, "font", "checkbox", 16F, Color.DARK_GRAY, true);
	public static CheckboxStyle		cleandir	= new CheckboxStyle(30, 130, 300, 23, "font", "checkbox", 16F, Color.DARK_GRAY, true);
	public static CheckboxStyle		fullscrn	= new CheckboxStyle(30, 160, 300, 23, "font", "checkbox", 16F, Color.DARK_GRAY, true);
	public static CheckboxStyle		offline		= new CheckboxStyle(30, 190, 300, 23, "font", "checkbox", 16F, Color.DARK_GRAY, true);
	public static TextfieldStyle	memory		= new TextfieldStyle(35, 245, 145, 36, "textfield", "font", 16F, Color.DARK_GRAY, Color.WHITE, new EmptyBorder(0, 10, 0, 10));
	public static ButtonStyle		close		= new ButtonStyle	(35, 295, 286, 40, "font", "button", 16F, Color.RED, true, Align.CENTER);
	
	public static FontBundle		memoryDesc	= new FontBundle("font", 16F, Color.DARK_GRAY);
	
	public static int titleX 		= 130;
	public static int titleY 		= 80;
}