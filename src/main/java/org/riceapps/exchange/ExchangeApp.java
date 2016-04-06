package org.riceapps.exchange;

import java.io.File;

import lightning.Lightning;

/**
 * Launches the application.
 * 
 * Usage: java ExchangeApp /path/to/config.json
 * 
 * Configuration options are documented in lightning.config.Config.
 * A template config file is provided in this distribution.
 */
public class ExchangeApp {
  public static void main(String[] args) throws Exception {
    Lightning.launch(new File(args[0]));
  }
}
