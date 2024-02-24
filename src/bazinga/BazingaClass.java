package bazinga;

import java.util.List;
import java.util.Map;

class BazingaClass implements BazingaCallable {
    final String name;
    final BazingaClass superclass;
    private final Map<String, BazingaFunction> methods;

    BazingaClass(String name, BazingaClass superclass, Map<String, BazingaFunction> methods) {
        this.superclass = superclass;
        this.name = name;
        this.methods = methods;
    }

    BazingaFunction findMethod(String name) {
        if (methods.containsKey(name)) {
            return methods.get(name);
        }

        if (superclass != null) {
            return superclass.findMethod(name);
        }

        return null;
    }

    @Override
    public String toString() {
        return "<class " + name + ">";
    }

    @Override
    public Object call(Interpreter interpreter, List<Object> arguments) {
        BazingaInstance instance = new BazingaInstance(this);
        BazingaFunction initializer = findMethod("init");
        if (initializer != null) {
            initializer.bind(instance).call(interpreter, arguments);
        }

        return instance;
    }

    @Override
    public int arity() {
        BazingaFunction initializer = findMethod("init");
        if (initializer == null)
            return 0;
        return initializer.arity();
    }

}
