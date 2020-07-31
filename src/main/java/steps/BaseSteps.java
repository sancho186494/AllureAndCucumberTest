package steps;

import managers.PageManager;
import managers.PageStepsManager;

import static managers.PageStepsManager.*;

public class BaseSteps {

    protected static PageStepsManager pageStepsManager = getPageStepsManager();
    protected static PageManager pageManager = PageManager.getPageManager();

}
