import java.util.*;
class BussEngine{
    private String nama_bus,jurusan_bus,fasilitas_bus,nomor_rangka_bus,plat_nomor_bus,merk_mesin_bus;
    private int harga_tiket_bus,jumlah_kursi_bus,jumlah_kursi_terisi;
    public int jumlah,total;
    BussEngine(
            String nama_bus, String jurusan_bus,int harga_tiket_bus,String fasilitas_bus,
            int jumlah_kursi_bus,int jumlah_kursi_terisi,String nomor_rangka_bus,
            String plat_nomor_bus,String merk_mesin_bus
    ){
        this.nama_bus = nama_bus;
        this.jurusan_bus = jurusan_bus;
        this.harga_tiket_bus = harga_tiket_bus;
        this.fasilitas_bus = fasilitas_bus;
        this.jumlah_kursi_bus = jumlah_kursi_bus;
        this.jumlah_kursi_terisi = jumlah_kursi_terisi;
        this.nomor_rangka_bus = nomor_rangka_bus;
        this.plat_nomor_bus = plat_nomor_bus;
        this.merk_mesin_bus = merk_mesin_bus;
    }

    public String get_nomor_rangka_bus(){
        return this.nomor_rangka_bus;
    }
    public String get_merk_mesin_bus(){
        return this.merk_mesin_bus;
    }
    public int get_jumlah_kursi_bus(){
        return this.jumlah_kursi_bus;
    }
    public String get_plat_nomor_bus(){
        return this.plat_nomor_bus;
    }
    public int get_pendapatan_per_bus(){
        return this.harga_tiket_bus * this.jumlah_kursi_terisi;
    }

    public String tampil_pemilik(){
        return " Nama : "+this.nama_bus +"\n Jurusan : "+this.jurusan_bus+"\n Harga Tiket : "+this.harga_tiket_bus+"\n Fasilitas : "+this.fasilitas_bus+"\n Jumlah Kursi : "+this.jumlah_kursi_bus+"\n Jumlah Kursi Terisi : "+
                this.jumlah_kursi_terisi+"\n Nomor Rangka: "+this.nomor_rangka_bus+"\n Plat Nomor : "+this.plat_nomor_bus+"\n Merk Mesin : "+this.merk_mesin_bus+"\n Pendapatan : Rp"+get_pendapatan_per_bus()+"\n\n";
    }
    public String tampil_pelanggan(){
        return " Nama : "+this.nama_bus +"\n Jurusan : "+this.jurusan_bus+"\n Harga Tiket : "+this.harga_tiket_bus+"\n Fasilitas : "+this.fasilitas_bus+"\n Jumlah Kursi : "+this.jumlah_kursi_bus+"\n\n";
    }
}

public class CBus {
    public static void main(String[] args){
        List<BussEngine> busList = new ArrayList<BussEngine>(); 
        Scanner inpt = new Scanner(System.in);
        Scanner inpt1 = new Scanner(System.in);
        int chose;
        do{
            System.out.println("Perusahaan Bus");
            System.out.println("1 Tambah data Khusus");
            System.out.println("2 Tampilkan data Bus");
            // System.out.println("3 Cari Bus");
            // System.out.println("4 Hapus Data Bus");
            System.out.println("3 Update Data");
            System.out.println("4 Tambah Data Umum");
            System.out.print("Pilih Salah satu: ");
            chose = inpt.nextInt();

            switch(chose){
                case 1:
                    String nama_bus = "";
                    String jurusan_bus = "";
                    int harga_tiket_bus = 0;
                    String fasilitas_bus = "";
                    int jumlah_kursi_terisi = 0;
                    System.out.print("Masukan jumlah kursi bus baru : ");
                    int jumlah_kursi_bus = inpt.nextInt();

                    System.out.print("Masukan nomor rangka bus baru : ");
                    String nomor_rangka_bus = inpt1.nextLine();

                    System.out.print("Masukan plat nomor bus baru : ");
                    String plat_nomor_bus = inpt1.nextLine();

                    System.out.print("Masukan merk mesin bus baru : ");
                    String merk_mesin_bus = inpt1.nextLine();

                    busList.add(new BussEngine(nama_bus,jurusan_bus,harga_tiket_bus,fasilitas_bus,jumlah_kursi_bus,jumlah_kursi_terisi,nomor_rangka_bus,plat_nomor_bus,merk_mesin_bus));
                    // System.out.print("\033\143");
                    break;
                    case 2:
                        // System.out.println(c);
                        // System.out.print("\033\143");
                        System.out.println("----------------------------------------------------------");
                        Iterator<BussEngine> i = busList.iterator();
                        System.out.print("Sebagai apa? Pemilik (1) atau Pelanggan (2)");
                        int pilih = inpt.nextInt();
                        while(i.hasNext()){
                            BussEngine e = i.next();
                            if(pilih == 1){
                                System.out.println(e.tampil_pemilik());
                            }
                            else if(pilih == 2){
                                System.out.println(e.tampil_pelanggan());
                            }
                        }
                        System.out.println("----------------------------------------------------------");
                        
                    break;
                    // case 3:
                    // System.out.print("\033\143");
                    //     boolean found = false;
                    //     System.out.print("Masukan nomor rangka bus yang sedang dicari : ");
                    //     String nomor_rangkas_bus_cari = inpt1.nextLine();
                    //     System.out.println("----------------------------------------------------------");
                    //     i = busList.iterator();
                    //     while(i.hasNext()){
                    //         BussEngine e = i.next();
                    //         if(e.get_nomor_rangka_bus().equals(nomor_rangkas_bus_cari)){
                    //             System.out.print(e.tampil_pemilik());
                    //             found = true;
                    //         }
                    //     }
                        
                    //     if(!found){
                    //         System.out.print("Data bus kosong");
                    //     }
                    //     System.out.println("----------------------------------------------------------");
                    // break;
                    // case 4:
                    //     found = false;
                    //     System.out.print("Masukan plat nomor yang akan dihapus : ");
                    //     nomor_rangkas_bus_cari = inpt1.nextLine();
                    //     System.out.println("----------------------------------------------------------");
                    //     i = busList.iterator();
                    //     while(i.hasNext()){
                    //         BussEngine e = i.next();
                    //         if(e.get_nomor_rangka_bus().equals(nomor_rangkas_bus_cari)){
                    //             i.remove();
                    //             found = true;
                    //         }
                    //     }
                    //     System.out.print("\033\143");
                    //     if(!found){
                    //         System.out.print("Data bus kosong");
                    //     }
                    //     else{
                    //         System.out.print("Data bus terhapus");
                    //     }
                    //     System.out.println("----------------------------------------------------------");
                    // break;
                    case 3:
                    Boolean temukan = false;
                    System.out.print("Masukan nomor rangka yang akan diupdate : ");
                        String nomor_rangkas_bus_cari = inpt1.nextLine();
                        System.out.println("----------------------------------------------------------");
                        ListIterator<BussEngine>li = busList.listIterator();
                        while(li.hasNext()){
                            BussEngine e = li.next();
                            nomor_rangka_bus = e.get_nomor_rangka_bus();
                            merk_mesin_bus = e.get_merk_mesin_bus();
                            if(e.get_nomor_rangka_bus().equals(nomor_rangkas_bus_cari)){

                                System.out.print("Ganti Nama Bus: ");
                                nama_bus = inpt1.nextLine();

                                System.out.print("Ganti Jurusan Bus: ");
                                jurusan_bus = inpt1.nextLine();

                                System.out.print("Ganti Harga Tiket Bus: ");
                                harga_tiket_bus = inpt.nextInt();

                                System.out.print("Ganti Fasilitas Bus: ");
                                fasilitas_bus = inpt1.nextLine();

                                System.out.print("Ganti jumlah kursi Bus: ");
                                jumlah_kursi_bus = inpt.nextInt();

                                System.out.print("Ganti jumlah kursi Bus yang terisi: ");
                                jumlah_kursi_terisi = inpt.nextInt();

                                System.out.print("Ganti Plat nomor Bus: ");
                                plat_nomor_bus = inpt1.nextLine();

                                li.set(new BussEngine(nama_bus,jurusan_bus,harga_tiket_bus,fasilitas_bus,jumlah_kursi_bus,jumlah_kursi_terisi,nomor_rangka_bus,plat_nomor_bus,merk_mesin_bus));
                                temukan = true;
                            }
                        }
                        // System.out.print("\033\143");
                        if(!temukan){
                            System.out.print("Data bus kosong");
                        }
                        else{
                            System.out.print("Data bus Update");
                        }
                        System.out.println("----------------------------------------------------------");
                    break;
                    case 4:
                    temukan = false;
                    System.out.print("Masukan nomor rangka yang akan ditambah data umum : ");
                        nomor_rangkas_bus_cari = inpt1.nextLine();
                        System.out.println("----------------------------------------------------------");
                        li = busList.listIterator();
                        while(li.hasNext()){
                            BussEngine e = li.next();
                            nomor_rangka_bus = e.get_nomor_rangka_bus();
                            merk_mesin_bus = e.get_merk_mesin_bus();
                            jumlah_kursi_bus = e.get_jumlah_kursi_bus();
                            plat_nomor_bus = e.get_plat_nomor_bus();

                            if(e.get_nomor_rangka_bus().equals(nomor_rangkas_bus_cari)){

                                System.out.print("Nama Bus: ");
                                nama_bus = inpt1.nextLine();

                                System.out.print("Jurusan Bus: ");
                                jurusan_bus = inpt1.nextLine();

                                System.out.print("Harga Tiket Bus: ");
                                harga_tiket_bus = inpt.nextInt();

                                System.out.print("Fasilitas Bus: ");
                                fasilitas_bus = inpt1.nextLine();

                                System.out.print("jumlah kursi Bus yang terisi: ");
                                jumlah_kursi_terisi = inpt.nextInt();

                                e.get_pendapatan_per_bus();

                                li.set(new BussEngine(nama_bus,jurusan_bus,harga_tiket_bus,fasilitas_bus,jumlah_kursi_bus,jumlah_kursi_terisi,nomor_rangka_bus,plat_nomor_bus,merk_mesin_bus));
                                temukan = true;
                            }
                        }
                        // System.out.print("\033\143");
                        if(!temukan){
                            System.out.print("Data bus kosong");
                        }
                        else{
                            System.out.print("Data bus Update");
                        }
                        System.out.println("----------------------------------------------------------");
                    break;
                    default:
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Gagal Memilih");
                    System.out.println("----------------------------------------------------------");
                    break;
            }
        }while(chose!=0);
    }
}
