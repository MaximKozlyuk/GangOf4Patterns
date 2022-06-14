package kozlyuk.structural.decorator.textstream;

import java.io.IOException;

public final class CaseChangeTextStream implements TextStream {

    private final TextStream wrapped;
    private final boolean needUpper;

    public CaseChangeTextStream(TextStream wrapped, boolean needUpper) {
        this.wrapped = wrapped;
        this.needUpper = needUpper;
    }

    @Override
    public char nextChar() throws IOException {
        return needUpper ?
                Character.toUpperCase(wrapped.nextChar()) :
                Character.toLowerCase(wrapped.nextChar());
    }

}
