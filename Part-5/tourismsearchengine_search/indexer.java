package tourismsearchengine.search;




import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field; 
import org.apache.lucene.document.StringField; 
import org.apache.lucene.document.TextField; 
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;
import tourismsearchengine.database.Hotel;
import tourismsearchengine.database.HoteltourismDatabase;


public class Indexer {
    
    /** Creates a new instance of Indexer */
    public Indexer() {
    }
 
    private IndexWriter indexWriter = null;
    
    public IndexWriter getIndexWriter(boolean create) throws IOException {
        if (indexWriter == null) {
        	Path indexPath = Paths.get("E:\\BigdataSEARCH\\exp_5\\LUCENE_PROJECT_1_(_recording5_)\\app6");
            Directory indexDir = FSDirectory.open(indexPath);
            StandardAnalyzer analyzer = new StandardAnalyzer();
            IndexWriterConfig config = new IndexWriterConfig(analyzer);
        	indexWriter = new IndexWriter(indexDir, config);
        }
        return indexWriter;
   }    
   
    public void closeIndexWriter() throws IOException {
        if (indexWriter != null) {
            indexWriter.close();
        }
   }
    
    public void indexHotel(Hotel hotel) throws IOException {

        System.out.println("Indexing hotel: " + hotel);
        IndexWriter writer = getIndexWriter(false);
        Document doc = new Document();
        doc.add(new StringField("id", hotel.getId(), Field.Store.YES));
        doc.add(new StringField("name", hotel.getName(), Field.Store.YES));
        doc.add(new StringField("city", hotel.getCity(), Field.Store.YES));
        String fullSearchableText = hotel.getName() + " " + hotel.getCity() + " " + hotel.getDescription();
        doc.add(new TextField("content", fullSearchableText, Field.Store.NO));
        writer.addDocument(doc);
    }   
    
    public void rebuildIndexes() throws IOException {
          //
          // Erase existing index
          //
          getIndexWriter(true);
          //
          // Index all Accommodation entries
          //
          Hotel[] hotels = HoteltourismDatabase.getHotels();
          for(Hotel hotel : hotels) {
              indexHotel(hotel);              
          }
          //
          // Don't forget to close the index writer when done
          //
          closeIndexWriter();
     }    
}
