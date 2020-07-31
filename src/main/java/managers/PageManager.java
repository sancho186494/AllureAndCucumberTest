package managers;


import pages.IpotekaPage;
import pages.StartPage;

public class PageManager {

    private static PageManager pageManager;

    private StartPage startPage;
    private IpotekaPage ipotekaPage;

    private PageManager(){}

    public static PageManager getPageManager() {
        if (pageManager == null) {
            pageManager = new PageManager();
        }
        return pageManager;
    }

    public StartPage getStartPage() {
        if (startPage == null) {
            startPage = new StartPage();
        }
        return startPage;
    }

    public IpotekaPage getIpotekaPage() {
        if (ipotekaPage == null) {
            ipotekaPage = new IpotekaPage();
        }
        return ipotekaPage;
    }
}
