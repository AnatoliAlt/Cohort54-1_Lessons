package lesson25__05_12_24_Wrapper_Generic.classwork25.generics;
// В <> Могут исрользоваться буквы T - type (тип), E - element, K - key, V - value
public class GenericBox <T> {

    //private Object value;
    private T value;// Приватное поле типа T

    public GenericBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GenericBox: {");
        sb.append("value: ").append(value);
        sb.append('}');
        return sb.toString();
    }
}
