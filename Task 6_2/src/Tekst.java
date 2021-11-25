public class Tekst {

    private int[] antallTegn = new int[30];

    public Tekst(String text) {
        text = text.toLowerCase();
        for(int i = 0; i <= text.length() ; i++){
            char tallo = text.charAt(i);
            int tall = tallo;
            if(tall >= 97 && tall <= 122){
                antallTegn[tall-97]++;
            }else if(tall == 230 || tall == 248 || tall == 229){
                switch (tall) {
                    case 230 -> antallTegn[26]++;
                    case 248 -> antallTegn[27]++;
                    case 229 -> antallTegn[28]++;
                }
            }else {
                antallTegn[29]++;
            }
        }
    }

    public int test(int i){
        return antallTegn[i];
    }

    public static void main(String[] args) {
        Tekst a = new Tekst("hello test");
        for(int i = 0; i<= 29; i++){
            System.out.println("tall " + i + " : " + a.test(i));
        }
    }
}
