package bazinga;

import java.util.HashMap;
import java.util.Map;

class BazingaInstance {
    private BazingaClass klass;
    private final Map<String, Object> fields = new HashMap<>();

    BazingaInstance(BazingaClass klass) {
        this.klass = klass;
    }

    Object get(Token name) {
        if (fields.containsKey(name.lexeme)) {
            return fields.get(name.lexeme);
        }

        BazingaFunction method = klass.findMethod(name.lexeme);
        if (method != null)
            return method.bind(this);

        throw new RuntimeError(name, "Undefined property '" + name.lexeme + "'.");
    }

    void set(Token name, Object value) {
        fields.put(name.lexeme, value);
    }

    @Override
    public String toString() {
        return "<Instance of " + klass.name + ">";
    }
}
