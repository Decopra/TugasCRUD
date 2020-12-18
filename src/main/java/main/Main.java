package main;

import model.Mahasiswa;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("18630822", "Bal", 3.8, 11);
//        mahasiswa.create();
//        mahasiswa.read();
        MahasiswaInputFrame m = new MahasiswaInputFrame(mahasiswa);
        m.setLocationRelativeTo(null);
        m.setVisible(true);
    }
}
