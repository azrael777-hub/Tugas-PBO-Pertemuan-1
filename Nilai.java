public class Nilai {

    String nim;
    String nama;
    double nilaiAbsen;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;

    void Nilai() {
        nilaiAkhir = (nilaiAbsen * 0.10) +
                     (nilaiTugas * 0.20) +
                     (nilaiUTS * 0.30) +
                     (nilaiUAS * 0.40);
    }

    void CetakNilai() {
        System.out.println("NIM              : " + nim);
        System.out.println("Nama             : " + nama);
        System.out.println("Nilai Absen[10%] : " + nilaiAbsen);
        System.out.println("Nilai Tugas[20%] : " + nilaiTugas);
        System.out.println("Nilai UTS[30%]   : " + nilaiUTS);
        System.out.println("Nilai UAS[40%]   : " + nilaiUAS);
        System.out.println("Nilai Akhir      : " + nilaiAkhir);
    }
}
