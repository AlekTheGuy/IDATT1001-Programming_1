public class tilfeldigKlient {
    public static void main(String[] args) {
        minRandom a = new minRandom();
        for(int i = 0; i<100; i++){
            System.out.println(a.nesteHeltall(4, 9));
        }
        
        for(int i = 0; i<100; i++){
            System.out.println(a.nesteDesimaltall(0.2, 0.5));
        }
    }
}