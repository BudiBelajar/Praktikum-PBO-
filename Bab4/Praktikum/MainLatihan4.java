public class MainLatihan4 {

    public static void main(String[] args) {

        Latihan4 ob = new Latihan4();

        double A[][] = {{1, 2}, {3, 5}, {6, 7}};
        double B[][] = {{8, 9}, {10, 11}, {12, 13}};

        ob.tampil("Matrix A :");
        ob.setMatrikA(A);
        ob.tampil(ob.getMatrikA());
        ob.tampil("");
        ob.tampil("Matrix B");
        ob.setMatrikB(B);
        ob.tampil(ob.getMatrikB());
        ob.tampil("");
        ob.tampil("Matrix C");
        ob.setPenjumlahan(A, B);
        ob.tampil(ob.getPenjumlahan());
        ob.tampil("");
        ob.setPerkalian(ob.getPenjumlahan(), 0.5);
        ob.tampil(ob.getPerkalian());

    }
}
}
