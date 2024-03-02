package bazinga;

import java.util.List;

public class BazingaArray extends BazingaInstance {
    private final Object[] elements;

    BazingaArray(int size) {
        super(null);
        elements = new Object[size];
    }

    BazingaArray(Object[] elements) {
        super(null);
        this.elements = elements;
    }

    @Override
    Object get(Token name) {
        if (name.lexeme.equals("get")) {
            return new BazingaCallable() {
                @Override
                public int arity() {
                    return 1;
                }

                @Override
                public Object call(Interpreter interpreter, List<Object> arguments) {
                    int index = (int) (double) arguments.get(0);
                    int length = elements.length;
                    if (index > length - 1) {
                        throw new RuntimeError(name, "Index " + index + " is out of range. " +
                                "The length of the array is " + length + ".");
                    }

                    return elements[index];
                }
            };
        } else if (name.lexeme.equals("set")) {
            return new BazingaCallable() {
                @Override
                public int arity() {
                    return 2;
                }

                @Override
                public Object call(Interpreter interpreter, List<Object> arguments) {
                    int index = (int) (double) arguments.get(0);
                    int length = elements.length;
                    if (index > length - 1) {
                        throw new RuntimeError(name, "Index " + index + " is out of range. " +
                                "The length of the array is " + length + ".");
                    }

                    Object value = arguments.get(1);
                    return elements[index] = value;
                }
            };
        } else if (name.lexeme.equals("length")) {
            return (double) elements.length;
        }

        throw new RuntimeError(name, "Undefined property '" + name.lexeme + "'.");
    }

    @Override
    void set(Token name, Object value) {
        throw new RuntimeError(name, "Can't add properties to arrays.");
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("[");
        for (int i = 0; i < elements.length; i++) {
            if (i != 0)
                buffer.append(", ");
            buffer.append(elements[i]);
        }
        buffer.append("]");
        return buffer.toString();
    }
}
