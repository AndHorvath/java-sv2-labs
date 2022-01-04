package statemachine.typewriter;

public enum TypeWriterState {

    LOWERCASE {
        @Override
        TypeWriterState next() {
            return UPPERCASE;
        }
    },

    UPPERCASE {
        @Override
        TypeWriterState next() {
            return LOWERCASE;
        }
    };

    abstract TypeWriterState next();
}