//Driver Class

public class SiswaTester {

    public static void main(String[] args) {
        //membuat Object
        //namaClass namaObject = new
        //Constructor();
        Siswa Rabbani = new Siswa();
        Siswa Raihan = new Siswa();
        Siswa Raffi = new Siswa();
        Siswa Bella = new Siswa();
        Siswa Kevin = new Siswa();

        Rabbani.id = 23;
        Rabbani.name = "Rabbani";
        Rabbani.ipk = 4.0;
        Raihan.id = 29;
        Raihan.name = "Raihan";
        Raihan.ipk = 3.0;
        Raffi.id = 24;
        Raffi.name = "Raffi";
        Raffi.ipk = 3.4;
        Bella.id = 5;
        Bella.name = "Bella";
        Bella.ipk = 3.9;
        Kevin.id = 20;
        Kevin.name = "Kevin";
        Kevin.ipk = 3.8;
        Rabbani.setId();
        System.out.println("--------------------------");
        Raihan.setId();
        System.out.println("--------------------------");
        Raffi.setId();
        System.out.println("--------------------------");
        Bella.setId();
        System.out.println("--------------------------");
        Kevin.setId();
        System.out.println("--------------------------");
    }
}