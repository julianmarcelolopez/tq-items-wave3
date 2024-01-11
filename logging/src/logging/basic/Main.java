package logging.basic;

import java.util.logging.Logger;

public class Main {
  private static final Logger logger = Logger.getLogger(Main.class.getName());

  public static void miMetodo() {
    logger.info("Este es un mensaje de información.");
    logger.warning("Este es un mensaje de warning.");
    logger.info("Este es un mensaje de información.");
  }

  public static void main(String[] args) {
    miMetodo();
  }
}
