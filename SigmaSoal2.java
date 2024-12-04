public class SigmaSoal2 {
    public static void main(String[] args) {
        int sum = 0; // Inisialisasi hasil sigma
        for (int i = 0; i <= 10; i++) { // Loop dari i = 0 hingga i = 10
            sum += i * i; // Tambahkan nilai kuadrat dari i ke hasil
        }
        System.out.println("Hasil Sigma Soal 2: " + sum); // Cetak hasil
    }
}
