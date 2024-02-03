import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        //Nhập từ bàn phím thông tin của một phương tiện giao thông PhuongTienGiaoThong.
        PhuongTienGiaoThong transportor =new PhuongTienGiaoThong();
        System.out.println("Nhap ten hang san xuat");
        transportor.setHangSanXuat(input.nextLine());
        System.out.println("Nhap ten phuong tien");
        transportor.setTenPhuongTien(input.nextLine());
        System.out.println("Nhap nam san xuat");
        transportor.setNamSanXuat(input.nextInt());
        System.out.println("Nhap toc do toi da");
        transportor.setTocDoToiDa(input.nextFloat());
        // Hiển thị thông tin của phương tiện giao thông vừa nhập ra màn hình.
        System.out.println(transportor.getHangSanXuat());
        System.out.println(transportor.getTenPhuongTien());
        System.out.println(transportor.getNamSanXuat());
        System.out.println(transportor.getTocDoToiDa());
        //Nhập thông tin cho n đối tượng OTO bao gồm: Hãng sản xuất, Tên phương tiện, Năm sản xuất, Vận tốc tối đa, số chỗ ngồi, kiểu động cơ.
        Oto newOto = new Oto();
        System.out.println("So Luong Oto Can Nhap Thong Tin : ");
        int n= input.nextInt();
        List<Oto> listOto =new ArrayList<Oto>();
        while(n>0){
            System.out.println("hang san xuat: ");
            newOto.setHangSanXuat(input.nextLine());
            System.out.println("Ten");
            newOto.setTenPhuongTien(input.nextLine());
            System.out.println("Nam san xuat");
            newOto.setNamSanXuat(input.nextInt());
            System.out.println("toc do toi da");
            newOto.setTocDoToiDa(input.nextFloat());
            System.out.println("so cho ngoi");
            newOto.setSoChoNgoi(input.nextInt());
            System.out.println("kieu dong co");
            newOto.setKieuDongCo(input.nextLine());
            listOto.add(newOto);
            --n;
        }
        //In ra màn hình thông tin của n đối tượng OTO cùng với vận tốc cơ sở
        for (Oto ot:
             listOto) {
            System.out.println(ot);
            System.out.println("Base Velocity "+ newOto.baseVelocity(newOto.getTocDoToiDa(), newOto.getSoChoNgoi()));
        }
        //unused but for demo sample output
//        {
//            System.out.println("Brand "+newOto.getHangSanXuat());
//            System.out.println("Model "+newOto.getTenPhuongTien());
//            System.out.println("Date "+newOto.getNamSanXuat());
//            System.out.println("Max Velocity "+newOto.getTocDoToiDa());
//            System.out.println("NO Seats "+newOto.getSoChoNgoi());
//            System.out.println("EM "+newOto.getKieuDongCo());
//
//            --n;
//        }
//        Sắp xếp danh sách các đối tượng OTO theo thứ tự giảm dần của vận tốc cơ sở
        Collections.sort(listOto, new Comparator<Oto>() {
            @Override
            public int compare(Oto o1, Oto o2) {
                return (int) (o1.baseVelocity(o1.getTocDoToiDa(), o1.getSoChoNgoi())-o2.baseVelocity(o2.getTocDoToiDa(), o2.getSoChoNgoi()));
            }
        });
        for (Oto ot:
             listOto) {
            System.out.println(ot);
        }
    }
}