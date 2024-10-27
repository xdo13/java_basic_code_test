package u.exam01;

class RangeError extends RuntimeException{
    RangeError(int n) {super("범위 밖 값: " + n);}
}

class ParameterRangeError extends RangeError{
    ParameterRangeError(int n) {super(n);}
}
class ResultRangeError extends RangeError{
    ResultRangeError(int n) {super(n);}
}

