


package com.novayre.jidoka.robot.test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.novayre.jidoka.client.api.IJidokaServer;
import com.novayre.jidoka.client.api.IRobot;
import com.novayre.jidoka.client.api.JidokaFactory;
import com.novayre.jidoka.falcon.api.FalconImageOptions;
import com.novayre.jidoka.falcon.api.IFalcon;
import com.novayre.jidoka.falcon.api.IFalconImage;
import com.novayre.jidoka.windows.api.IWindows;

/**
 * Jidoka image support
 * 
 * @author Jidoka Team
 *
 */
public class JidokaImageSupport {
	
	/**
	 * Instance
	 */
	private static JidokaImageSupport instance;
	
	/**
	 * Server
	 */
	private final IJidokaServer<?> server;
	
	/**
	 * Falcon
	 */
	private final IFalcon falcon;
	
	/**
	 * Images
	 */
	private final Map<String, IFalconImage> images = new HashMap<>();
	
	/**
	 * Constructor
	 * @param robot	robot
	 */
	public JidokaImageSupport(IRobot robot) {
		
		server = JidokaFactory.getServer();
		
		falcon = IFalcon.getInstance(robot, IWindows.getInstance(robot));

	}
	
	/**
	 * TESTINGGGGGGGGGGGGGGGGGs
	 */
