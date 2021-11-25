public class NyString {
    private String text;

    public NyString(String input){
        text = input;
    }

    public String forkortString(){
        String[] split = this.text.split(" ");
        char[] list  = new char[split.length];
        for(int i = 0; i < split.length; i++){
            list[i] = split[i].charAt(0);
        }
        return new String(list);
    }

    public String fjernTegn(String tegn){
        return text.replace(tegn, "");
    }

    public static void main(String[] args) {
     NyString a = new NyString("this is a string test");
     System.out.println(a.fjernTegn("e"));
     System.out.println(a.forkortString());
    }
}
