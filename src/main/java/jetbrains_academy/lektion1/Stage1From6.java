package jetbrains_academy.lektion1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Stage1From6
{
    private static Logger logging = LogManager.getLogger(Stage1From6.class);

    public static void main(String[] args)
    {

        logging.info("Starting to make a coffee");
        logging.info("Grinding coffee beans");
        logging.info("Boiling water");
        logging.info("Mixing boiled water with crushed coffee beans");
        logging.info("Pouring coffee into the cup");
        logging.info("Pouring some milk into the cup");
        logging.info("Coffee is ready!");
    }
}
