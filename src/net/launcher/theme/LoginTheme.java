package net.launcher.theme;

import java.awt.Color;

import javax.swing.border.EmptyBorder;

import net.launcher.components.Align;
import net.launcher.components.ButtonStyle;
import net.launcher.components.CheckboxStyle;
import net.launcher.components.ComboboxStyle;
//import net.launcher.components.ComponentStyle;
import net.launcher.components.DragbuttonStyle;
import net.launcher.components.DraggerStyle;
import net.launcher.components.LinklabelStyle;
import net.launcher.components.PassfieldStyle;
import net.launcher.components.ServerbarStyle;
import net.launcher.components.TextfieldStyle;

public class LoginTheme
{
	public static int			 frameW 	= 350; 
	public static int			 frameH		= 370; 

	public static ButtonStyle	 toGame		= new ButtonStyle(75, 275, 200, 40, "font", "button", 16F, Color.RED, true, Align.CENTER);
	//public static ButtonStyle	 toPersonal = new ButtonStyle(570, 436, 120, 40, "font", "button", 16F, Color.GREEN, true, Align.CENTER);
	public static ButtonStyle	 toOptions  = new ButtonStyle(290, 4, 24, 24, "font", "options_button", 16F, Color.BLACK, true, Align.CENTER);
	//public static ButtonStyle	 toRegister  = new ButtonStyle(10, 350, 130, 40, "font", "button", 16F, Color.YELLOW, true, Align.CENTER);
	
	public static CheckboxStyle  savePass   = new CheckboxStyle(70, 200, 300, 23, "font", "checkbox", 16F, Color.BLACK, true);
	public static TextfieldStyle login		= new TextfieldStyle(75, 100, 200, 36, "textfield", "font", 16F, Color.BLACK, Color.DARK_GRAY, new EmptyBorder(0, 10, 0, 10));
	public static PassfieldStyle password	= new PassfieldStyle(75, 150, 200, 36, "textfield", "font", 16F, Color.BLACK, Color.DARK_GRAY, "*", new EmptyBorder(0, 10, 0, 10));
	
	//public static ComponentStyle newsBrowser= new ComponentStyle(0, 30, 630, 369, "font", 16F, Color.WHITE, true);
	public static LinklabelStyle links		= new LinklabelStyle(57, 54, 0, "font", 16F, Color.BLUE, Color.BLUE);

	public static DragbuttonStyle dbuttons	= new DragbuttonStyle(262, 4, 24, 24, 318, 4, 24, 24, "draggbutton", true);
	public static DraggerStyle	  dragger	= new DraggerStyle(0, 0, 500, 30, "font", 16F, Color.BLACK, Align.LEFT);
	
	public static ButtonStyle	 update_yes	= new ButtonStyle(190, 370, 150, 40, "font", "button", 16F, Color.GREEN, true, Align.CENTER);
	public static ButtonStyle    update_no	= new ButtonStyle(515, 370, 150, 40, "font", "button", 16F, Color.RED, true, Align.CENTER);
	
	public static ComboboxStyle	 servers	= new ComboboxStyle(75, 235, 120, 24, "font", "combobox", 14F, Color.BLACK, true, Align.CENTER);
	public static ServerbarStyle serverbar	= new ServerbarStyle(207, 238, 73, 30, "font", 12F, Color.BLACK, true);
	
	public static float fontbasesize		= 16F;
	public static float fonttitlesize		= 20F;
}