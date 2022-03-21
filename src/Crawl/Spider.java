package Crawl;

import java.util.*;



public class Spider {
    private static final int MaxPagesToSearch = 10;
    private Set<String> pagesVisited = new HashSet<String>();
    private List<String> pagesToVisit = new LinkedList<String>();

    private String nextURL(){
        String nextURL;
        do{
            nextURL = this.pagesToVisit.remove(0);
        } while (this.pagesVisited.contains(nextURL));
        this.pagesVisited.add(nextURL);
        return nextURL;
    }

    public void search(String url, String searchWord){
        while (this.pagesVisited.size() < MaxPagesToSearch){
            String currentURL;
            Crawl.SpiderLeg leg = new Crawl.SpiderLeg();
            if (this.pagesToVisit.isEmpty()){
                currentURL = url;
                this.pagesVisited.add(url);
            }else{
                currentURL = this.nextURL();
            }
            leg.crawl(currentURL);
            boolean success = leg.searchForWord(searchWord);
            if (success){
                System.out.println(String.format("**Success** Word %s found on the site", searchWord));
                break;
            }
            this.pagesToVisit.addAll(leg.getLinks());
        }
        System.out.println(String.format("**Done** Visited %s web page(s)", this.pagesVisited.size()));
    }
}
