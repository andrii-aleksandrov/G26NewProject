package pages;

import libs.ActionsWithOurElements;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by andrey.aleksandrov on 19.07.2017.
 */
public class ParentPage {
    WebDriver webDriver;
    Logger logger;
    ActionsWithOurElements actionsWithOurElements;

    public ParentPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        logger = Logger.getLogger( getClass() );
        PageFactory.initElements( webDriver, this );
        actionsWithOurElements = new ActionsWithOurElements( webDriver );
    }

    /**
     * Method opens url with webDriver
     *
     * @param url
     */
    public void open(String url) {
        try {
            webDriver.get( url );
        } catch (Exception e) {
            logger.error( "Page not opened " + url );
            Assert.fail( "Page not opened " + url );
        }
    }
}
