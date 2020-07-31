package managers;

import pages.IpotekaPage;
import pages.StartPage;
import steps.IpotekaPageSteps;
import steps.StartPageSteps;

public class PageStepsManager {

    private static PageStepsManager pageStepsManager;

    private StartPageSteps startPageSteps;
    private IpotekaPageSteps ipotekaPageSteps;

    private PageStepsManager(){}

    public static PageStepsManager getPageStepsManager() {
        if (pageStepsManager == null) {
            pageStepsManager = new PageStepsManager();
        }
        return pageStepsManager;
    }

    public StartPageSteps getStartPageSteps() {
        if (startPageSteps == null) {
            startPageSteps = new StartPageSteps();
        }
        return startPageSteps;
    }

    public IpotekaPageSteps getIpotekaPageSteps() {
        if (ipotekaPageSteps == null) {
            ipotekaPageSteps = new IpotekaPageSteps();
        }
        return ipotekaPageSteps;
    }
}
