
package mahasiswa;

import kombo.TranskripNilaiMataKuliah;

public class mahasiswa02 {
     public static void main(String[] args){
        TranskripNilaiMataKuliah transkrip = new TranskripNilaiMataKuliah("Iswan", "2109106086", "Informatika");
        transkrip.insert("BHS0913", "Bahasa Inggris I", 3, "A");
        transkrip.insert("WUH1102", "Wirausaha Teknologi", 2, "A");
        transkrip.insert("INF031219", "Pengantar Teknologi Informasi", 2, "A");
        transkrip.insert("BHS0612", "Bahasa Indonesia II", 3, "A");
        transkrip.insert("INF011219", "Matematika Numerik", 2, "A");
        transkrip.insert("USB0812", "Pendidikan Kewarganegaraan", 2, "A");
        transkrip.insert("USB0712", "Pendidikan Pancasila", 2, "A");
        transkrip.insert("USB0112", "Pendidikan Agama Islam", 2, "A");
        transkrip.insert("INF021319", "Pemrograman Dasar", 4, "B+");
        transkrip.insert("USB1212", "BAHASA INGGRIS III", 2, "B+");
        transkrip.insert("INF052319", "Matematika Diskrit", 3, "A");
        transkrip.insert("INF092219", "Fisika", 2, "A");
        transkrip.insert("INF082319", "Algoritma dan Struktur Data", 3, "A");
        transkrip.insert("INF072219", "Sistem Digital", 5, "A");
        transkrip.insert("INF062219", "Sistem Operasi", 2, "A");
        transkrip.insert("INF103219", "Aljabar Linear", 2, "T");
        transkrip.insert("INF123319", "Basis Data I", 3, "T");
        transkrip.insert("INF113319", "Pemrograman Web I", 3, "T");
        transkrip.insert("INF133319", "Pemrograman Berorientasi Objek", 3, "T");
        transkrip.insert("INF143219", "Arsitektur dan Organisasi Komputer", 2, "T");
        transkrip.insert("INF163219", "Interaksi Manusia dan Komputer", 2, "T");
        transkrip.insert("INF183219", "Komputer Dan Masyarakat", 2, "T");
        transkrip.insert("INF183219", "Pemrograman Visual", 4, "T");
        transkrip.cetak();
         
    
    }
}
