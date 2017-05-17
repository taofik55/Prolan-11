public class Encap {
    private String nama, nama_mahasiswa, no_kamar, lantai, alamat;
    private byte tahun, UmurIbuKost;
    private int harga;
    private short no_ruangan;
    private char jk;

    public byte getUmurIbuKost() {
        return UmurIbuKost;
    }

    public void setUmurIbuKost(byte UmurIbuKost) {
        this.UmurIbuKost = UmurIbuKost;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public char getJk() {
        return jk;
    }

    public void setJk(char jk) {
        this.jk = jk;
    }

    public String getLantai() {
        return lantai;
    }

    public void setLantai(String lantai) {
        this.lantai = lantai;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama_mahasiswa() {
        return nama_mahasiswa;
    }

    public void setNama_mahasiswa(String nama_mahasiswa) {
        this.nama_mahasiswa = nama_mahasiswa;
    }

    public String getNo_kamar() {
        return no_kamar;
    }

    public void setNo_kamar(String no_kamar) {
        this.no_kamar = no_kamar;
    }

    public short getNo_ruangan() {
        return no_ruangan;
    }

    public void setNo_ruangan(short no_ruangan) {
        this.no_ruangan = no_ruangan;
    }

    public byte getTahun() {
        return tahun;
    }

    public void setTahun(byte tahun) {
        this.tahun = tahun;
    }
    
    
    protected void cetakUmurIbuKost() {
        System.out.println(UmurIbuKost);
    }
    
    protected void cetakAlamat() {
        System.out.println(alamat);
    }
    
    protected void cetakHarga() {
        System.out.println(harga);
    }
    
    protected void cetakJK() {
        System.out.println(jk);
    }
    
    protected void cetakLantai() {
        System.out.println(lantai);
    }
    
    protected void cetakNama() {
        System.out.println(nama);
    }
    
    protected void cetakNamaMahasiswa() {
        System.out.println(nama_mahasiswa);
    }
    
    protected void cetakNoKamar() {
        System.out.println(no_kamar);
    }
    
    protected void cetakNoRuangan() {
        System.out.println(no_ruangan);
    }
    
    protected void cetakTahun() {
        System.out.println(tahun);
    }
}
