package statemachine.seatheater;

public enum SeatHeaterState {

    HIGH {
        @Override
        SeatHeaterState next() {
            return MIDDLE;
        }
    },

    MIDDLE {
        @Override
        SeatHeaterState next() {
            return LOW;
        }
    },

    LOW {
        @Override
        SeatHeaterState next() {
            return OFF;
        }
    },

    OFF {
        @Override
        SeatHeaterState next() {
            return HIGH;
        }
    };

    abstract SeatHeaterState next();
}