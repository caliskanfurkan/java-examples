import java.util.List;

public interface OgrenciDAO {
	void insert(int id, String ad) throws Exception;
	
	void update(int id, String ad) throws Exception;
	
	void delete(int id) throws Exception;
	
	List<Ogrenci> listAll() throws Exception;
	
	List<Ogrenci> list(String ad) throws Exception;
}
