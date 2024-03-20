package Person;
public class mainStudent {
    public static void main(String[] args) throws Exception {
        Student sinhvien = new Student();
        System.out.println("sinh vien: ");
        sinhvien.nhapGiaTri();
        sinhvien.inGiaTri();
        System.out.println("\ntuoi cua ban la : " + sinhvien.Tinhtuoi());
        System.out.println("diem cua mon hoc la : "+ sinhvien.tinhDiem());
        sinhvien.doiDiem();

    }
}
