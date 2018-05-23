public class SmartWriter extends DecoratorWriter {
    public SmartWriter(AWriter aWriter){
        super(aWriter);
    }
    @Override
    public String write(String s) {
        return super.write(s).replaceAll("woman", "###woman###");
    }
}