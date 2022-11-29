package FormBANK.bagus.gui;

public class BAGUSbank {
    private String NomorKartu;
    private String JenisATM;
    private String BANK;
    private String NamaPemilik;

    private String NamaGambar;

    public BAGUSbank(String nomorKartu, String jenisATM, String BANK, String namaPemilik, String namaGambar) {
        NomorKartu = nomorKartu;
        JenisATM = jenisATM;
        this.BANK = BANK;
        NamaPemilik = namaPemilik;
        NamaGambar = namaGambar;
    }

    public BAGUSbank() {
    }

    public String getNomorKartu() {
        return NomorKartu;
    }

    public void setNomorKartu(String nomorKartu) {
        NomorKartu = nomorKartu;
    }

    public String getJenisATM() {
        return JenisATM;
    }

    public void setJenisATM(String jenisATM) {
        JenisATM = jenisATM;
    }

    public String getBANK() {
        return BANK;
    }

    public void setBANK(String BANK) {
        this.BANK = BANK;
    }

    public String getNamaPemilik() {
        return NamaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        NamaPemilik = namaPemilik;
    }

    @Override
    public String toString() {
        return ("\nNo Kartu = " + NomorKartu + "\nJenis ATM = " + JenisATM + "\nBank = " + BANK +
                "\nNama Pemilik = " + NamaPemilik + "\nNama File Gambar = " + NamaGambar);
    }
}


