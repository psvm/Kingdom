public class Kingdom {
    public static void main(String[] args) {
        AWriter minaev = new StupidWriter();
        System.out.println(minaev.write("No woman no cry!"));
        AWriter tolstoy = new CypherWriter(new StupidWriter());
        System.out.println(tolstoy.write("No woman no cry!"));
        AWriter stephenKing = new CensorWriter(new StupidWriter());
        System.out.println(stephenKing.write("No woman no cry!"));
        AWriter fedor = new CypherWriter(new CensorWriter(new StupidWriter()));
        System.out.println(fedor.write("No woman no cry!"));
        AWriter pushkin = new SmartWriter(new StupidWriter());
        System.out.println(pushkin.write("No woman no cry!"));
    }
}
