package Bai9;
public class DanhSachCongNhan {
    private Congnhan[] dsCongNhan;
    private int soLuongCN;
    private final int maxsoluong;

    public DanhSachCongNhan(int n) {
        this.dsCongNhan = new Congnhan[n];
        this.soLuongCN = 0;
        this.maxsoluong = n;
    }

    public boolean themCongnhan(Congnhan cn) {
        if (soLuongCN < maxsoluong) {
            dsCongNhan[soLuongCN] = cn;
            soLuongCN++;
            return true;
        }
        return false;
    }

    public void xuatThongTin() {
        for (int i = 0; i < soLuongCN; i++) {
            System.out.println(dsCongNhan[i].toString());
        }
    }

    public int tinhSoLuong() {
        return soLuongCN;
    }

    public void xuatThongTinSP200() {
        for (int i = 0; i < soLuongCN; i++) {
            if (dsCongNhan[i].getSoSP() > 200) {
                System.out.println(dsCongNhan[i].toString());
            }
        }
    }

    public void sapXepGiamDanTheoSP() {
        for (int i = 0; i < soLuongCN - 1; i++) {
            for (int j = i + 1; j < soLuongCN; j++) {
                if (dsCongNhan[i].getSoSP() < dsCongNhan[j].getSoSP()) {
                    Congnhan temp = dsCongNhan[i];
                    dsCongNhan[i] = dsCongNhan[j];
                    dsCongNhan[j] = temp;
                }
            }
        }
    }
}

