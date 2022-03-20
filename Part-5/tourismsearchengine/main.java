package tourismsearchengine;



import org.apache.lucene.document.Document;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import tourismsearchengine.search.Indexer;
import tourismsearchengine.search.Searching;

public class Main {
    
    /** Creates a new instance of Main */
    public Main() {
    }
    
     public static void main(String[] args) {

      try {
	// build a lucene index
        System.out.println("rebuildIndexes");
        Indexer  indexer = new Indexer();
        indexer.rebuildIndexes();
        System.out.println("rebuildIndexes done");

        // perform search on "Hotel"
        // and retrieve the top 100 result
        System.out.println("perform Search");
        Searching se = new Searching();
        TopDocs topDocs = se.performSearch("HIMACHAL PRADESH", 3);

        System.out.println("Results found: " + topDocs.totalHits);
        ScoreDoc[] hits = topDocs.scoreDocs;
        for (int i = 0; i < hits.length; i++) {
            Document doc = se.getDocument(hits[i].doc);
            System.out.println(doc.get("name")
                               + " " + doc.get("city")
                               + " (" + hits[i].score + ")");

        }
        System.out.println("perform Search done");
      } catch (Exception e) {
        System.out.println("Exception caught.\n");
      }
    }
    
}
