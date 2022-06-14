package kozlyuk.structural.decorator.textstream;

import java.io.IOException;

public final class NoWhiteSpaceTextStream implements TextStream {

    private final TextStream wrapped;

    public NoWhiteSpaceTextStream(TextStream wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public char nextChar() throws IOException {
        char read = wrapped.nextChar();
        while (read == ' ') read = wrapped.nextChar();
        return read;
    }

}
