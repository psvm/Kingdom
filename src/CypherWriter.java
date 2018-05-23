public class CypherWriter extends DecoratorWriter {
    public CypherWriter(AWriter aWriter){
        super(aWriter);
    }
    @Override
    public String write(String s) {
        return super.write(s).replaceAll(" ", "");
    }
}


