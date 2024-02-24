package bazinga;

import java.util.List;

public interface BazingaCallable {
    int arity();

    Object call(Interpreter interpreter, List<Object> arguments);
}
