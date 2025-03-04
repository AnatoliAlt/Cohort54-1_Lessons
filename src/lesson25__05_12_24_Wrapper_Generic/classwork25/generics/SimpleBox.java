package lesson25__05_12_24_Wrapper_Generic.classwork25.generics;

public class SimpleBox {
    private Object value;

   public SimpleBox(Object value) {
       this.value = value;
   }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SimpleBox: {");
        sb.append("value: ").append(value);
        sb.append('}');
        return sb.toString();
    }
}
