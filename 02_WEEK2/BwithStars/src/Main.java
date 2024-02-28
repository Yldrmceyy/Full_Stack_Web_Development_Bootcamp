public class Main {
    public static void main(String[] args) {

        String[][] letter = new String[7][4];

        for (int i = 0; i < letter.length; i++) {  //Mevcut satırın her sütunu üzerinde döngü yapılır
            for (int j = 0; j < letter[i].length; j++) { // letter[i].length kullanıldı
                if (i == 0 || i == 3 || i == 6) {
                    letter[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }
        for (String[] row : letter) {
            for (String col : row) {  // herbir satırdaki sütunları dolaşır.
                System.out.print(col); // println yerine print kullanıldı
            }
            System.out.println(); // Yeni satıra geçmek için println kullanıldı
        }
    }
}
