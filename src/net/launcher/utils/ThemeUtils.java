﻿package net.launcher.utils;

import java.awt.Dimension;
import java.awt.FontMetrics;

import net.launcher.components.Frame;
import net.launcher.components.LinkLabel;
import net.launcher.run.Settings;
import static net.launcher.theme.LoginTheme.*;
import static net.launcher.theme.OptionsTheme.*;
import static net.launcher.theme.RegTheme.*;
import static net.launcher.theme.PersonalTheme.*;

public class ThemeUtils extends BaseUtils
{
	public static void updateStyle(Frame main) throws Exception
	{
		int i = 0;
		for(LinkLabel link : main.links)
		{
			links.apply(link);
			FontMetrics fm = link.getFontMetrics(link.getFont());
			link.setBounds(i + links.x, links.y, fm.stringWidth(link.getText()), fm.getHeight());
			i += fm.stringWidth(link.getText()) + links.margin;
		}
		
		dragger.apply(main.dragger);
		dbuttons.apply(main.hide, main.close);
		toGame.apply(main.toGame);
		//toPersonal.apply(main.toPersonal);
        //toRegister.apply(main.toRegister);
		toOptions.apply(main.toOptions);
		savePass.apply(main.savePass);
		login.apply(main.login);
		password.apply(main.password);
		//newsBrowser.apply(main.bpane);
		servers.apply(main.servers);
		serverbar.apply(main.serverbar);
		
		//loadnews.apply(main.loadnews);
		updatepr.apply(main.updatepr);
		cleandir.apply(main.cleanDir);
		fullscrn.apply(main.fullscreen);
		offline.apply(main.offline);
		memory.apply(main.memory);
		close.apply(main.options_close);
                
        closereg.apply(main.closereg);
		loginReg.apply(main.loginReg);
        passwordReg.apply(main.passwordReg);
        password2Reg.apply(main.password2Reg);
        mailReg.apply(main.mailReg);
        okreg.apply(main.okreg);
                
		buyCloak.apply(main.buyCloak);
		changeskin.apply(main.changeSkin);
		buyVip.apply(main.buyVip);
		buyPremium.apply(main.buyPremium);
		buyUnban.apply(main.buyUnban);
		vaucher.apply(main.vaucher);
		vaucherButton.apply(main.vaucherButton);
		buyVaucher.apply(main.buyVaucher);
		exchangeFrom.apply(main.exchangeFrom);
		exchangeTo.apply(main.exchangeTo);
		exchangeBtn.apply(main.exchangeButton);
		toGamePSL.apply(main.toGamePersonal);
		
		update_no.apply(main.update_no);
		update_yes.apply(main.update_yes);
		
		main.panel.setPreferredSize(new Dimension(frameW, frameH));
		
		main.setIconImage(BaseUtils.getLocalImage("favicon"));
		main.setTitle(Settings.title);
		main.setLocationRelativeTo(null);
		main.pack();
		main.repaint();
	}
}