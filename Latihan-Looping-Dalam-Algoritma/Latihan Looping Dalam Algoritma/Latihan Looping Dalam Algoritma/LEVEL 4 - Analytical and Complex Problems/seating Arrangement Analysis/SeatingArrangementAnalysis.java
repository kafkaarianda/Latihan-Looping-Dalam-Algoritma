public class SeatingArrangementAnalysis {
    public static void main(String[] args) {
        char [] [] kursi = {
            {'0', 'X', 'O', 'O'},
            {'X', 'X', 'O', 'O'},
            {'O', 'O', 'X', 'O'}
        };

        int kosong = 0;
        int terisi = 0;
        int terisiMax = 0;
        int barisMax = 0;

        for (int i = 0; i < kursi.length; i++) {
            int terisiBaris = 0;
            for (int j = 0; j < kursi[i].length; j++) {
                if (kursi[i][j] == '0') {
                    kosong++;
                } else {
                    terisi++;
                    terisiBaris++;
                }
                if (terisiBaris > terisiMax) {
                    terisiMax = terisiBaris;
                    barisMax = i + 1;
                }
            }
        }
        double persen = (double) terisi / (kosong + terisi) * 100;
        System.out.println("Kursi Kosong: " + kosong);
        System.out.println("Kursi Terisi: " + terisi);
        System.out.println("Persentase Terisi: " + persen);
        System.out.println("Baris dengan Kursi Terisi Paling Banyak: " + barisMax);

        int total = kosong + terisi;
        double persen2 = (double) terisi / total * 100;

        System.out.println("Empty seats = " + kosong);
        System.out.println("ocupied seats = " + terisi);
        System.out.printf("Occupancy rate = %.2f%%n", persen2);
        System.out.println("Baris paling penuh + baris " + barisMax + " (" + terisiMax + " kursi terisi)");



    }
}