import java.util.Date;

public class Ogrenci {
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public Date getKayitTarihi() {
		return kayitTarihi;
	}
	public void setKayitTarihi(Date kayitTarihi) {
		this.kayitTarihi = kayitTarihi;
	}
	
	@Override
	public String toString() {
		return "Ogrenci [��renci no =" + id + ", Ad =" + ad + ", Kay�t Tarihi =" + kayitTarihi + "]";
	}


	private int id;
	private String ad;
	private Date kayitTarihi;
}
