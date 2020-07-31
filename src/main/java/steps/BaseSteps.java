package steps;

import managers.PageManager;
import managers.PageStepsManager;
import pages.IpotekaPage;
import pages.StartPage;

import static managers.PageStepsManager.*;

public class BaseSteps {

    protected static PageStepsManager pageStepsManager = getPageStepsManager();
    protected static PageManager pageManager = PageManager.getPageManager();

}
