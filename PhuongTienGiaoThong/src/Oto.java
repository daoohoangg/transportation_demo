public class Oto extends PhuongTienGiaoThong{
    private int soChoNgoi;
    private String kieuDongCo;

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }
    public double baseVelocity(float maxV, int noTier){
        return maxV/noTier;
    }
}
