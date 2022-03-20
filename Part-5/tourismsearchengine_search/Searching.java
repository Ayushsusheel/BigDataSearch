package tourismsearchengine.search;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.apache.lucene.document.Document;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;
import tourismsearchengine.database.Hotel;
import tourismsearchengine.database.HoteltourismDatabase;

public class Searching {
    private IndexSearcher searcher = null;
    private QueryParser parser = null;
    private static final String INDEX_DIR = "E:\\BigdataSEARCH\\exp_5\\LUCENE_PROJECT_1_(_recording5_)\\app6";
    /** Creates a new instance of SearchEngine */
    public Searching() throws IOException {
    	StandardAnalyzer analyzer = new StandardAnalyzer();
    	Directory indexDir = FSDirectory.open(Paths.get(INDEX_DIR));
    	IndexReader reader = DirectoryReader.open(indexDir);
		//IndexSearcher searcher = new IndexSearcher(reader);
        searcher = new IndexSearcher(reader);
        parser = new QueryParser("content", analyzer);
    }
    
    public TopDocs performSearch(String queryString, int n)
    throws IOException, ParseException {
        Query query = parser.parse(queryString);        
        return searcher.search(query, n);
    }

    public Document getDocument(int docId)
    throws IOException {
        return searcher.doc(docId);
    }
}
